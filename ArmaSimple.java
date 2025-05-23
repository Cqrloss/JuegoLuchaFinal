public class ArmaSimple implements Arma {
    private String nombre;
    private double potencia;

    public ArmaSimple(String nombre, double potencia) {
        this.nombre = nombre;
        this.potencia = potencia;
    }

    @Override public String getNombre() { return nombre; }
    @Override public double getPotencia() { return potencia; }
    @Override public int efectoEspecial() { return 0; }
}