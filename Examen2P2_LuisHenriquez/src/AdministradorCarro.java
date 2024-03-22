
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministradorCarro {
     private ArrayList<Carro> carros = new ArrayList();
    private File archivo = null;

    public AdministradorCarro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }
       
    public void cargarArchivo() {
        try {
            carros = new ArrayList();
            Carro temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carro) objeto.readObject()) != null) {
                        carros.add(temp);
                    }
                } catch (EOFException e) {
                    //Final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            for (Carro u : carros) {
                oos.writeObject(u);
            }
            oos.flush();
        } catch (Exception ex) {
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception ex) {
            }
        }
    }
}
