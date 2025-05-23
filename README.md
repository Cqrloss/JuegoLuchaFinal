Este es un programa sencillo de Luchas, se utilizaron los siguientes patrones de diseño en este programa:
1. Strategy (Estrategia)
Propósito: Encapsular algoritmos/intercambiar comportamientos en tiempo de ejecución.
Aplicación:
La interfaz EstrategiaAtaque y sus implementaciones (Asesino, Gladiador, Satanista, etc.).
El Combatiente delega el ataque a su estrategia actual (ejecutarAtaque() llama a estrategia.ejecutar()).
Ventaja: Permite cambiar dinámicamente el estilo de ataque sin modificar la clase Combatiente.

2. Factory Method (Método Fábrica)
Propósito: Centralizar la creación de objetos.
Aplicación:
La clase CombatienteFactory con el método crearCombatiente().
Decide qué implementación de EstrategiaAtaque usar según la opción seleccionada.
Ventaja: Oculta la lógica de creación y facilita la extensión (ej.: añadir nuevos tipos de combatientes).

3. Decorator (Decorador)
Propósito: Añadir funcionalidad a objetos dinámicamente.
Aplicación:
Las armas (ArmaSimple, ArmaCritica, ArmaMagica) extienden la interfaz Arma y agregan efectos especiales.
El método calcularImpacto() en Combatiente usa el patrón implícitamente al combinar potencia base + efecto especial.
Ventaja: Permite combinar múltiples comportamientos (ej.: un arma con daño base + crítico + variable).

4. Singleton (Opcional, implícito)
Propósito: Garantizar una única instancia de una clase.
Aplicación:
CombatienteFactory podría implementarse como Singleton (aunque en el código actual no lo es).
Ventaja: Centraliza el acceso a la creación de objetos.

5. State (Estado)
Propósito: Gestionar cambios de comportamiento según el estado interno.
Aplicación:
El atributo vitalidad en Combatiente afecta a sigueEnPie(), cambiando el estado del combate.
Ventaja: Simplifica transiciones entre estados (ej.: de "activo" a "derrotado").
