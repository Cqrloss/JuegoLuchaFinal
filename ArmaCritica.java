import java.util.Random;

public class ArmaCritica implements Arma {
    private String nombre;
    private double potencia;
    private double probabilidadCritico;

    public ArmaCritica(String nombre, double potencia, double probabilidadCritico) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.probabilidadCritico = probabilidadCritico;
    }

    @Override public String getNombre() { return nombre; }
    @Override public double getPotencia() { return potencia; }
    @Override public int efectoEspecial() {
        return new Random().nextDouble() < probabilidadCritico ? 2 : 1;
    }
}