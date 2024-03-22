public class Carro {
    private String marca, modelo;
    private int velocidad;

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
