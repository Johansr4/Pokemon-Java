package modelo;

import java.util.Random;

public class Combate {
	private static final int NUM_MAX_POKEMON = 6;

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
		this.numKOPokemonRival = 0;
		this.numKOPokemonJugador = 0;
	}

	public void empezarCombate() {
		while (numKoJugador < NUM_MAX_POKEMON && numKoRival < NUM_MAX_POKEMON) {
			System.out.println("Turno " + turno + ":");

			Pokemon pokemonJugador = jugador.elegirPokemonActivo(1);
			Pokemon pokemonRival = rival.elegirPokemonActivo(1);
			if (pokemonJugador == null || pokemonRival == null) {
				System.out.println("Alguno de los entrenadores no tiene Pokémon disponibles, fin del combate.");
				return;
			}
			System.out.println(jugador.getNombre() + " envía a " + pokemonJugador.getNombre() + "!");
			System.out.println(rival.getNombre() + " envía a " + pokemonRival.getNombre() + "!");

			// Determinar el Pokémon que ataca primero
			Pokemon atacante, defensor;

			if (pokemonJugador.getVelocidad() >= pokemonRival.getVelocidad()) {
				atacante = pokemonJugador;
				defensor = pokemonRival;
			} else {
				atacante = pokemonRival;
				defensor = pokemonJugador;
			}

			// Realizar el ataque del Pokémon atacante
			realizarAtaque(atacante, defensor);

			// Comprobar si el Pokémon defensor ha sido derrotado
			if (defensor.getVitalidad() == 0) {
				if (defensor.getIdEntrenador() == jugador) {
					numKOPokemonJugador++;
				} else {
					numKOPokemonRival++;
				}

				Entrenador entrenadorDefensor = defensor.getIdEntrenador();
				Pokemon nuevoDefensor = null;
				int intentos = 0;

				while (nuevoDefensor == null && intentos < NUM_MAX_POKEMON) {
					nuevoDefensor = entrenadorDefensor.elegirPokemonActivo(intentos + 1);
					intentos++;
				}

				if (nuevoDefensor == null) {
					System.out.println(
							"El entrenador " + entrenadorDefensor.getNombre() + " no tiene más Pokémon disponibles.");
					return;
				}

				defensor = nuevoDefensor;
			}

			// Actualizar los Pokémon activos de cada entrenador
			jugador.setPokemonActivo(pokemonJugador);
			rival.setPokemonActivo(pokemonRival);

			turno++;
		}

		ResultadoCombate resultado = determinarResultadoCombate();
		mostrarResultadoCombate(resultado);
	}

	private void realizarAtaque(Pokemon atacante, Pokemon defensor) {
		atacante.atacar(defensor, new MovimientoPokemon());
	}

	private ResultadoCombate determinarResultadoCombate() {
		if (numKOPokemonJugador >= NUM_MAX_POKEMON) {
			return ResultadoCombate.DERROTA;
		} else if (numKOPokemonRival >= NUM_MAX_POKEMON) {
			return ResultadoCombate.VICTORIA;
		} else {
			return ResultadoCombate.EMPATE;
		}
	}

	private void mostrarResultadoCombate(ResultadoCombate resultado) {
		if (resultado == ResultadoCombate.VICTORIA) {
			ganador = jugador;
			System.out.println(rival.getNombre() + " ha sido derrotado!");
			int pokédollarsGanados = rival.getPokédollars() / 3;
			ganador.incrementarPokédollars(pokédollarsGanados);
		} else if (resultado == ResultadoCombate.DERROTA) {
			ganador = rival;
			System.out.println(jugador.getNombre() + " ha sido derrotado!");
			int pokédollarsPerdidos = jugador.getPokédollars() / 3;
			ganador.incrementarPokédollars(pokédollarsPerdidos);
		} else {
			System.out.println("El combate ha terminado en empate.");
		}

		System.out.println("El ganador del combate es: " + ganador.getNombre() + "!");
		System.out.println("¡Fin del combate!");
	}

	private enum ResultadoCombate {
		VICTORIA, DERROTA, EMPATE
	}
}
