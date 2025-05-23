public class EstrategiaAtaqueGladiador implements EstrategiaAtaque {
    @Override
    public void ejecutar(Combatiente atacante, Combatiente rival) {
        int impacto = (int)(atacante.calcularImpactoBase() * 1.25);
        if (atacante.arma != null) impacto *= atacante.arma.getPotencia();
        rival.absorberDanio(impacto);
        System.out.printf("%s asesta un golpe contundente a %s (%d puntos)%n", 
                         atacante.obtenerAlias(), rival.obtenerAlias(), impacto);
    }
}