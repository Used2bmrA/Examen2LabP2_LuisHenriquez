
import java.io.Serializable;

public class Carro implements Serializable {
    private String marca, modelo;
    private int velocidad;
    
    
    private static final long serialVersionUID = 444L;
    
    public Carro(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return  marca + " " + modelo;
    }
    
    
}
