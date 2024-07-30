public class Arbitro extends Persona {
    private int numeroFaltasPitadas;
    private int numeroGolesPitados;
    private int numeroSancionesPitadas;

    public void pitarFalta() {
        // Implementación
    }

    public void pitarGol() {
        // Implementación
    }

    public void sancionarJugador() {
        // Implementación
    }

    // Getters y Setters
    public int getNumeroFaltasPitadas() {
        return numeroFaltasPitadas;
    }

    public void setNumeroFaltasPitadas(int numeroFaltasPitadas) {
        this.numeroFaltasPitadas = numeroFaltasPitadas;
    }

    public int getNumeroGolesPitados() {
        return numeroGolesPitados;
    }

    public void setNumeroGolesPitados(int numeroGolesPitados) {
        this.numeroGolesPitados = numeroGolesPitados;
    }

    public int getNumeroSancionesPitadas() {
        return numeroSancionesPitadas;
    }

    public void setNumeroSancionesPitadas(int numeroSancionesPitadas) {
        this.numeroSancionesPitadas = numeroSancionesPitadas;
    }
}
