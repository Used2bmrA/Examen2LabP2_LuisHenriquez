
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HiloBarra extends Thread{
    private JProgressBar barra;
    private Carro carro;
    private boolean avanzar;
    private boolean vive;

    public HiloBarra(JProgressBar barra, Carro carro) {
        this.barra = barra;
        this.carro = carro;
        this.vive = true;
        this.avanzar = true;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue() + carro.getVelocidad()/25);
                if(barra.getValue() ==100){
                    JOptionPane.showMessageDialog(barra, "Ganó el " + carro.getMarca() + " " + carro.getModelo() + "!");
                    vive =false;
                }                
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
