
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Arbitro arbitro = new Arbitro();
        arbitro.setNombre("Arbitro 1");

        Partido partido = new Partido();
        partido.setFechaPartido(new Date());
        partido.declararEmpate("2-2");

        System.out.println("Resultado del partido: " + partido.getResultado());
        System.out.println("Marcador del partido: " + partido.getMarcador());


        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Jugador 1");

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Jugador 2");

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Jugador 3");

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Jugador 4");


        Equipo equipo = new Equipo();
        equipo.setNombre("Equipo 1");

        InscripcionEquipo inscripcion1 = new InscripcionEquipo();
        inscripcion1.setEquipo(equipo);
        inscripcion1.registrarParticipante(jugador1);
        inscripcion1.registrarParticipante(jugador2);

        InscripcionEquipo inscripcion2 = new InscripcionEquipo();
        inscripcion2.setEquipo(equipo);
        inscripcion2.registrarParticipante(jugador3);
        inscripcion2.registrarParticipante(jugador4);

        CampeonatoFutbol campeonato1 = new CampeonatoFutbol();
        campeonato1.setNombre("Campeonato 1");
        campeonato1.setFechaInicio(new Date());
        campeonato1.setFechaFin(new Date());
        campeonato1.añadirEquipo(inscripcion1);

        CampeonatoFutbol campeonato2 = new CampeonatoFutbol();
        campeonato2.setNombre("Campeonato 2");
        campeonato2.setFechaInicio(new Date());
        campeonato2.setFechaFin(new Date());
        campeonato2.añadirEquipo(inscripcion2);

   
        System.out.println("Campeonato 1 - Equipos:");
        for (InscripcionEquipo inscripcion : campeonato1.getInscripciones()) {
            System.out.println("Equipo: " + inscripcion.getEquipo().getNombre());
            System.out.println("Jugadores:");
            for (Jugador jugador : inscripcion.getJugadores()) {
                System.out.println(jugador.getNombre());
            }
        }

        System.out.println("Campeonato 2 - Equipos:");
        for (InscripcionEquipo inscripcion : campeonato2.getInscripciones()) {
            System.out.println("Equipo: " + inscripcion.getEquipo().getNombre());
            System.out.println("Jugadores:");
            for (Jugador jugador : inscripcion.getJugadores()) {
                System.out.println(jugador.getNombre());
            }
        }
    

        campeonato1.getTablaPosiciones().actualizarPuntos(equipo, 3); 
        campeonato2.getTablaPosiciones().actualizarPuntos(equipo, 1); 


        System.out.println("Tabla de Posiciones - Campeonato 1:");
        for (Map.Entry<Equipo, Integer> entry : campeonato1.getTablaPosiciones().getPuntos().entrySet()) {
            System.out.println("Equipo: " + entry.getKey().getNombre() + ", Puntos: " + entry.getValue());
        }


        System.out.println("Tabla de Posiciones - Campeonato 2:");
        for (Map.Entry<Equipo, Integer> entry : campeonato2.getTablaPosiciones().getPuntos().entrySet()) {
            System.out.println("Equipo: " + entry.getKey().getNombre() + ", Puntos: " + entry.getValue());
        }
    }
}

