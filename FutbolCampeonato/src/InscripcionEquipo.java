
import java.util.ArrayList;
import java.util.List;

public class InscripcionEquipo {
    private Equipo equipo;
    private List<Jugador> jugadores = new ArrayList<>();
    private CampeonatoFutbol campeonato;

    public void registrarParticipante(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarParticipante(Jugador jugador) {
        jugadores.remove(jugador);
    }

    // Getters y Setters
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public CampeonatoFutbol getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(CampeonatoFutbol campeonato) {
        this.campeonato = campeonato;
    }
}