import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("🏟️-- TORNEO DE COMBATE --🏟️");
        
        Combatiente luchador1 = registrarParticipante(entrada, 1);
        Combatiente luchador2 = registrarParticipante(entrada, 2);

        new TorneoCombate(luchador1, luchador2).comenzarEnfrentamiento();
        entrada.close();
    }

    private static Combatiente registrarParticipante(Scanner entrada, int numero) {
        System.out.printf("\nRegistro del combatiente %d:%n", numero);
        System.out.print("Nombre del USUARIO/Combatiente: ");
        String nombre = entrada.nextLine();
        
        System.out.println("\n----- PERSONAJES DISPONIBLES -----:");
        System.out.println("1. Gladiador de Fuego (Fuerza bruta del fuego)");
        System.out.println("2. Asesino sigiloso (Ataques precisos)");
        System.out.println("3. Satanista Poderoso (Poder arcano)");
        System.out.print("Selección: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        Combatiente nuevo = CombatienteFactory.crearCombatiente(opcion, nombre);
        
        System.out.println("\n------------PANEL DE EQUIPAMIENTO------------");
        System.out.print("¿Equipar arma? (s/n): ");
        if (entrada.nextLine().equalsIgnoreCase("s")) {
            nuevo.asignarArma(crearArma(entrada));
        }
        
        return nuevo;
    }

    private static Arma crearArma(Scanner entrada) {
        System.out.println("\n----- TIPOS DE ARMAS DISPONIBLES -----:");
        System.out.println("1. Arma simple (daño constante)");
        System.out.println("2. Arma crítica (posibilidad de golpe crítico)");
        System.out.println("3. Arma mágica (daño variable)");
        System.out.print("Selección: ");
        int tipoArma = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Nombre del arma: ");
        String nombre = entrada.nextLine();
        System.out.print("Potencia base: ");
        double potencia = entrada.nextDouble();
        entrada.nextLine();
        
        switch(tipoArma) {
            case 1: return new ArmaSimple(nombre, potencia);
            case 2: return new ArmaCritica(nombre, potencia, 0.25);
            case 3: 
                System.out.print("Variación de daño: ");
                int variacion = entrada.nextInt();
                entrada.nextLine();
                return new ArmaMagica(nombre, potencia, variacion);
            default: return new ArmaSimple(nombre, potencia);
        }
    }
}