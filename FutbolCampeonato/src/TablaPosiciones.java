import java.util.HashMap;

import java.util.Map;

public class TablaPosiciones {
    private Map<Equipo, Integer> puntos = new HashMap<>();

    public void cambiarOrden() {
        // Implementar lógica para ordenar la tabla de posiciones
    }

    public void actualizarPuntos(Equipo equipo, int puntosNuevos) {
        puntos.put(equipo, puntos.getOrDefault(equipo, 0) + puntosNuevos);
    }

    public Map<Equipo, Integer> getPuntos() {
        return puntos;
    }
}
