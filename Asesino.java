public class Asesino extends Combatiente {
    public Asesino(String alias) {
        super(alias);
        this.estrategiaAtaque = new EstrategiaAtaqueAsesino();
    }
}