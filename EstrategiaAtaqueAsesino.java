import java.util.Random;

public class EstrategiaAtaqueAsesino implements EstrategiaAtaque {
    @Override
    public void ejecutar(Combatiente atacante, Combatiente rival) {
        int impacto = atacante.calcularImpactoBase();
        if (atacante.arma != null) {
            int multiplicador = atacante.arma.efectoEspecial();
            if (multiplicador > 1) System.out.println("¡Ataque preciso BOFF!");
            impacto *= atacante.arma.getPotencia() * multiplicador;
        } else if (new Random().nextDouble() < 0.25) {
            impacto *= 1.8;
            System.out.println("¡Ataque preciso BOFF!");
        }
        rival.absorberDanio(impacto);
        System.out.printf("%s ataca sigilosamente a %s (%d puntos)%n", 
                         atacante.obtenerAlias(), rival.obtenerAlias(), impacto);
    }
}