
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<InscripcionEquipo> inscripciones = new ArrayList<>();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<InscripcionEquipo> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<InscripcionEquipo> inscripciones) {
        this.inscripciones = inscripciones;
    }
}