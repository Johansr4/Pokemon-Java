package modelo;

import java.util.Random;



public class Combate {
	private Entrenador ganador;
	private Entrenador jugador;
	private Entrenador rival;
	private int turno;
	private int numKoJugador;
	private int numKoRival;
	private Random rand;
	private int numKOPokemonRival;
	private int numKOPokemonJugador;

	public Combate(Entrenador jugador, Entrenador rival) {
		this.jugador = jugador;
		this.rival = rival;
		this.turno = 1;
		this.numKoJugador = 0;
		this.numKoRival = 0;
		this.rand = new Random();

		
	}

	MovimientoPokemon movimientoPokemonPruebaCombate= new MovimientoPokemon();

	public void empezarCombate() {
		while (numKoJugador < 6 && numKoRival < 6) {
			System.out.println("Turno " + turno + ":");
	
			
			Pokemon pokemonJugador = jugador.elegirPokemonActivo(1);
			Pokemon pokemonRival = rival.elegirPokemonActivo(1);
			if (pokemonJugador == null || pokemonRival == null) {
				System.out.println("Alguno de los entrenadores no tiene Pokemon disponibles, fin del combate.");
				return;
			}
			System.out.println(jugador.getNombre() + " envía a " + pokemonJugador.getNombre() + "!");
			System.out.println(rival.getNombre() + " envía a " + pokemonRival.getNombre() + "!");
			pokemonJugador.atacar(pokemonRival,movimientoPokemonPruebaCombate);
			
 // Determinar el Pokémon que ataca primero (basado en su velocidad)
			  Pokemon atacante, defensor;

    if (pokemonJugador.getVelocidad() >= pokemonRival.getVelocidad()) {
        atacante = pokemonJugador;
        defensor = pokemonRival;
    } else {
        atacante = pokemonRival;
        defensor = pokemonJugador;
    }
    
    // Realizar el ataque del Pokémon atacante
    atacante.atacar(defensor,movimientoPokemonPruebaCombate);
    
    // Comprobar si el Pokémon defensor ha sido derrotado
    if (defensor.getVitalidad() == 0) {
        if (defensor.getEntrenador() == jugador) {
			numKOPokemonJugador++;
        } else {
            numKOPokemonRival++;
        }
        defensor = defensor.getIdEntrenador().elegirPokemonActivo();
    }
    
    // Actualizar los Pokémon activos de cada entrenador
    jugador.setPokemonActivo(pokemonJugador);
    rival.setPokemonActivo(pokemonRival);
			turno++;
		}
		if (numKoJugador >= 6) {
			ganador = rival;
			System.out.println(jugador.getNombre() + " ha sido derrotado!");
			int pokédollarsPerdidos = (int) Math.ceil(jugador.getPokédollars() / 3.0);
			ganador.incrementarPokédollars(pokédollarsPerdidos);
		} else {
			ganador = jugador;
			System.out.println(rival.getNombre() + " ha sido derrotado!");
			int pokédollarsGanados = (int) Math.ceil(rival.getPokédollars() / 3.0);
			ganador.incrementarPokédollars(pokédollarsGanados);
		}
		System.out.println("El ganador del combate es: " + ganador.getNombre() + "!");
		System.out.println("¡Fin del combate!");
		}
}
