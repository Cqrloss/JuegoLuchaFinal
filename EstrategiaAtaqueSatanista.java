import java.util.Random;

public class EstrategiaAtaqueSatanista implements EstrategiaAtaque {
    @Override
    public void ejecutar(Combatiente atacante, Combatiente rival) {
        int variacion = atacante.arma != null ? 
                       atacante.arma.efectoEspecial() : 
                       new Random().nextInt(25);
        int impacto = atacante.calcularImpactoBase() + variacion;
        if (atacante.arma != null) impacto *= atacante.arma.getPotencia();
        rival.absorberDanio(impacto);
        System.out.printf("%s invoca poder arcano contra %s (%d puntos)%n", 
                         atacante.obtenerAlias(), rival.obtenerAlias(), impacto);
    }
}