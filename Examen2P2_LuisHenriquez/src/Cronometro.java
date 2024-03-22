
import javax.swing.JLabel;

public class Cronometro extends Thread{
    private JLabel label;
    private boolean vive;

    public Cronometro(JLabel label) {
        this.label = label;
        vive = true;
    }
    
    @Override
    public void run(){
        while (vive) {
            
            
        }
    }

}
