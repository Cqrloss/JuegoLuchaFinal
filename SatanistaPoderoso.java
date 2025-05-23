public class SatanistaPoderoso extends Combatiente {
    public SatanistaPoderoso(String alias) {
        super(alias);
        this.estrategiaAtaque = new EstrategiaAtaqueSatanista();
    }
}