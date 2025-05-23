public class CombatienteFactory {
    public static Combatiente crearCombatiente(int tipo, String alias) {
        switch(tipo) {
            case 1: return new Gladiador(alias);
            case 2: return new Asesino(alias);
            case 3: return new SatanistaPoderoso(alias);
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}