public class EquipoCombate implements Arma {
    private String denominacion;
    private double potenciaAtaque;

    public EquipoCombate(String denominacion, double potenciaAtaque) {
        this.denominacion = denominacion;
        this.potenciaAtaque = potenciaAtaque;
    }

    @Override public String getNombre() { return denominacion; }
    @Override public double getPotencia() { return potenciaAtaque; }
    @Override public int efectoEspecial() { return 0; }
}