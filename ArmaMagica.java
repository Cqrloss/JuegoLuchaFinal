import java.util.Random;

public class ArmaMagica implements Arma {
    private String nombre;
    private double potencia;
    private int variacion;

    public ArmaMagica(String nombre, double potencia, int variacion) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.variacion = variacion;
    }

    @Override public String getNombre() { return nombre; }
    @Override public double getPotencia() { return potencia; }
    @Override public int efectoEspecial() {
        return new Random().nextInt(variacion) + 1;
    }
}