
public class NewClass {
    
//    public static void main(String[] args) {
//        String direccion = "./sunflower.wav";
//        Play(direccion);
//        JOptionPane.showMessageDialog(null, "Presiona ok para detener la canción");
//        
//    }
//    
//    public static void Play(String direccion){
//        try {
//            File direccionMusica = new File (direccion);
//            
//            if (direccionMusica.exists()) {
//                AudioInputStream audio = AudioSystem.getAudioInputStream(direccionMusica);
//                Clip clip = AudioSystem.getClip();
//                clip.open(audio);
//                clip.start();
//                
//            }else{
//                System.out.println("No se encuentra el archivo");
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    
//    public void cargarArchivo() {
//        try {
//            usuarios = new ArrayList();
//            Usuario temp;
//            if (archivo.exists()) {
//                FileInputStream entrada = new FileInputStream(archivo);
//                ObjectInputStream objeto = new ObjectInputStream(entrada);
//                try {
//                    while ((temp = (Usuario) objeto.readObject()) != null) {
//                        usuarios.add(temp);
//                    }
//                } catch (EOFException e) {
//                    //Final del archivo
//                }
//                objeto.close();
//                entrada.close();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void escribirArchivo() {
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream(archivo);
//            oos = new ObjectOutputStream(fos);
//            for (Usuario u : usuarios) {
//                oos.writeObject(u);
//            }
//            oos.flush();
//        } catch (Exception ex) {
//        } finally {
//            try {
//                oos.close();
//                fos.close();
//            } catch (Exception ex) {
//            }
//        }
//    }
//    
//    public class AdminColor extends Thread {
//    private JPanel panel;
//    private Color A,B;
//    private int time;
//    private boolean vive;
//    
//        @Override
//    public void run(){
//        int n = 1;
//        try {
//            while (vive) {
//                if (n == 1) {
//                    panel.setBackground(A);
//                    n = 2;
//                } else {
//                    panel.setBackground(B);
//                    n = 1;
//                }
//            }
//        } catch (Exception e) {
//            try {
//                Thread.sleep(time);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//    
//    import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JLabel;
//
//public class HiloHora implements Runnable {
//    private JLabel hora;
//    
//    public HiloHora(JLabel hora) {
//        this.hora = hora;
//    }        
//
//    @Override
//    public void run() {
//        while(true){
//            Date h=new Date();
//            DateFormat f=new SimpleDateFormat("hh:mm:ss");
//            hora.setText( f.format(h) );
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException ex) {
//                
//            }
//        }        
//    }
//    
//    import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JProgressBar;
//
//
//public class administrarBarra extends Thread{
//    private JProgressBar barra;
//    private boolean avanzar;
//    private boolean vive;
//
//    public administrarBarra(JProgressBar barra) {
//        this.barra = barra;
//        avanzar=true;
//        vive=true;
//    }
//    
//    
//    
//
//    public boolean isVive() {
//        return vive;
//    }
//
//    public void setVive(boolean vive) {
//        this.vive = vive;
//    }
//
//
//    public boolean isAvanzar() {
//        return avanzar;
//    }
//
//    public void setAvanzar(boolean avanzar) {
//        this.avanzar = avanzar;
//    }
//
//
//    public JProgressBar getBarra() {
//        return barra;
//    }
//
//    public void setBarra(JProgressBar barra) {
//        this.barra = barra;
//    }
//    
//    @Override
//    public void run(){
//        while(vive){
//            if(avanzar){
//                barra.setValue(barra.getValue()+1);
//                if(barra.getValue()==100000000){
//                    vive=false;
//                }                
//            } //FIN IF
//            
//            try {
//                Thread.sleep(0);
//            } catch (InterruptedException ex) {
//            }
//        }
//    }
//
//    
//}

}
