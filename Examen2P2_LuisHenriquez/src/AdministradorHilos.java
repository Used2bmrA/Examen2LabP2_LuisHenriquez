
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class AdministradorHilos extends Thread{
    private HiloBarra barra1, barra2;
    private JDialog dialogo;
    private boolean avanzar;

    public AdministradorHilos(HiloBarra barra1, HiloBarra barra2, JDialog dialogo) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.dialogo = dialogo;
        this.avanzar = avanzar;
    }
    
    @Override
    public void run(){
        barra1.start();
        barra2.start();
        
        while (avanzar) {
            
            if(barra1.getBarra().getValue() == 100){
                barra2.setAvanzar(false);
                JOptionPane.showMessageDialog(dialogo, "Ganó el " + barra1.getCarro().getMarca() + " " + barra1.getCarro().getModelo() + "!");
                avanzar = false;
            }else if(barra2.getBarra().getValue() == 100){
                barra1.setAvanzar(false);
                JOptionPane.showMessageDialog(dialogo, "Ganó el " + barra2.getCarro().getMarca() + " " + barra2.getCarro().getModelo() + "!");
                avanzar = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            
        }
    }
    
}
