import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CampeonatoFutbol {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroJugadoresPorEquipo;
    private int numeroPartidos;
    private int numeroEquipos;
    private List<InscripcionEquipo> inscripciones = new ArrayList<>();
    private TablaPosiciones tablaPosiciones = new TablaPosiciones();

    public void añadirEquipo(InscripcionEquipo inscripcion) {
        inscripciones.add(inscripcion);
    }

    public void eliminarEquipo(InscripcionEquipo inscripcion) {
        inscripciones.remove(inscripcion);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroJugadoresPorEquipo() {
        return numeroJugadoresPorEquipo;
    }

    public void setNumeroJugadoresPorEquipo(int numeroJugadoresPorEquipo) {
        this.numeroJugadoresPorEquipo = numeroJugadoresPorEquipo;
    }

    public int getNumeroPartidos() {
        return numeroPartidos;
    }

    public void setNumeroPartidos(int numeroPartidos) {
        this.numeroPartidos = numeroPartidos;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    public List<InscripcionEquipo> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<InscripcionEquipo> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public TablaPosiciones getTablaPosiciones() {
        return tablaPosiciones;
    }

    public void setTablaPosiciones(TablaPosiciones tablaPosiciones) {
        this.tablaPosiciones = tablaPosiciones;
    }
}

