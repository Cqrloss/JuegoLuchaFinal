public class TorneoCombate {
    private Combatiente participanteA;
    private Combatiente participanteB;

    public TorneoCombate(Combatiente participanteA, Combatiente participanteB) {
        this.participanteA = participanteA;
        this.participanteB = participanteB;
    }

    public void comenzarEnfrentamiento() {
        System.out.printf("\n⚔️ Combate entre %s y %s ⚔️%n", 
                        participanteA.obtenerAlias(), 
                        participanteB.obtenerAlias());
        System.out.println("-----------------------------");

        while (participanteA.sigueEnPie() && participanteB.sigueEnPie()) {
            realizarTurno(participanteA, participanteB);
            if (participanteB.sigueEnPie()) realizarTurno(participanteB, participanteA);
        }

        System.out.println("\n-----------------------------");
        if (participanteA.sigueEnPie()) {
            System.out.printf("¡%s es el vencedor!%n", participanteA.obtenerAlias());
        } else {
            System.out.printf("¡%s ha triunfado!%n", participanteB.obtenerAlias());
        }
    }

    private void realizarTurno(Combatiente atacante, Combatiente defensor) {
        System.out.printf("\nTurno de %s (Vida de %s: %d)%n",
                         atacante.obtenerAlias(),
                         defensor.obtenerAlias(),
                         defensor.obtenerVitalidad());
        atacante.ejecutarAtaque(defensor);
    }
}