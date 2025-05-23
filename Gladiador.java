public class Gladiador extends Combatiente {
    public Gladiador(String alias) {
        super(alias);
        this.estrategiaAtaque = new EstrategiaAtaqueGladiador();
    }
}