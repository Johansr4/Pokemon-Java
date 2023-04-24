package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Combate {
    private Entrenador jugador;
    private Entrenador rival;
    private int turno;
    private int numKojugador;
    private int numKorival;
    private Entrenador ganador;
    
    public Combate(Entrenador jugador, Entrenador rival) {
        this.jugador = jugador;
        this.rival = rival;
        this.turno = 1;
        this.numKojugador = 0;
        this.numKorival = 0;
    }
    
    public Combate(Pokemon pokemonJugador, Pokemon pokemonRival) {
		// TODO Auto-generated constructor stub
	}

	public void comenzar() {
        ArrayList<Pokemon> equipoJugador = jugador.getEquipo();
        ArrayList<Pokemon> equipoRival = rival.getEquipo();
        
        // Ordenar aleatoriamente los equipos
        Collections.shuffle(equipoJugador);
        Collections.shuffle(equipoRival);
        
        // Establecer el nivel máximo de los Pokémon del rival
        int nivelMaxRival = jugador.getNivelMaximoEquipo();
        
        while (numKojugador < 6 && numKorival < 6) {
            System.out.println("Turno " + turno + ":");
            
            // Elegir los Pokémon que van a luchar en este turno
            Pokemon pokemonJugador = equipoJugador.get(turno-1);
            Pokemon pokemonRival = equipoRival.get(turno-1);
            
            // Mostrar los Pokémon que van a luchar
            System.out.println("Jugador: " + jugador.getNombre() + " envía a " + pokemonJugador.getNombre() + " (Nivel " + pokemonJugador.getNivel() + ")");
            System.out.println("Rival: " + rival.getNombre() + " envía a " + pokemonRival.getNombre() + " (Nivel " + pokemonRival.getNivel() + ")");
            
            // Realizar el combate
            Combate combate = new Combate(pokemonJugador, pokemonRival);
            Combate batalla = null;
			batalla.comenzar();
            
            // Actualizar los contadores de KO
            if (combate.getGanador() == pokemonJugador) {
                numKorival++;
            } else {
                numKojugador++;
            }
            
            // Incrementar el turno
            turno++;
        }
        
        // Determinar el ganador
        if (numKojugador >= 6 || jugador.seRetira()) {
            ganador = rival;
            jugador.setDinero(Math.floorDiv(rival.getDinero(), 3));
        } else {
            ganador = jugador;
            rival.setDinero(Math.floorDiv(jugador.getDinero(), 3));
        }
        
        // Calcular la experiencia obtenida
        for (Pokemon pokemon : jugador.getEquipo()) {
            int experiencia = (int) Math.round((pokemon.getNivel() + rival.getNivelMaximoEquipo()*10) / 4.0);
            pokemon.setExperiencia(experiencia);
        }
        
        // Mostrar el resultado
        System.out.println("El ganador es " + ganador.getNombre() + "!");
        System.out.println("Número de Pokémon KO para " + jugador.getNombre() + ": " + numKojugador);
        System.out.println("Número de Pokémon KO para " + rival.getNombre() + ": " + numKorival);
    }

	private Pokemon getGanador() {
		// TODO Auto-generated method stub
		return null;
	}
}
