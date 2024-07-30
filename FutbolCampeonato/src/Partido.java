import java.util.Date;


public class Partido {
    private String resultado;
    private Date fechaPartido;
    private String marcador;

    public void cambiarMarcador(int golMarcado, Arbitro arbitro) {
        // Implementación
    }

    public void declararGanador(String marcador) {
        // Implementación
    }

    public void declararEmpate(String marcador) {
        this.resultado = "Empate";
        this.marcador = marcador;
    }

    // Getters y Setters
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
}