import java.util.Random;

public abstract class Combatiente {
    protected String alias;
    protected int vitalidad;
    protected Arma arma;
    protected EstrategiaAtaque estrategiaAtaque;
    protected final int DANIO_MAX = 35;
    protected final int DANIO_MIN = 8;

    public Combatiente(String alias) {
        this.alias = alias;
        this.vitalidad = 100;
    }

    public void ejecutarAtaque(Combatiente rival) {
        estrategiaAtaque.ejecutar(this, rival);
    }

    public void absorberDanio(int cantidad) {
        this.vitalidad = Math.max(0, this.vitalidad - cantidad);
    }

    public boolean sigueEnPie() { return this.vitalidad > 0; }
    public String obtenerAlias() { return this.alias; }
    public int obtenerVitalidad() { return this.vitalidad; }
    public void asignarArma(Arma arma) { this.arma = arma; }
    public int calcularImpactoBase() {
        return new Random().nextInt(DANIO_MAX - DANIO_MIN + 1) + DANIO_MIN;
    }
}