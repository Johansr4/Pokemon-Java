package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Combate {
	private Entrenador ganador;
	private Entrenador jugador;
	private Entrenador rival;
	private int turno;
	private int numPokemonsKojugador;
	private int numPokemonsKorival;

	public Combate(Entrenador jugador, Entrenador rival) {
		this.jugador = jugador;
		this.rival = rival;
		this.turno = 1;
		this.numPokemonsKojugador = 0;
		this.numPokemonsKorival = 0;
	}

	public void iniciar() {
		// Ordenar los equipos de cada entrenador por nivel
		List<Pokemon> equipoJugador = new ArrayList<>(jugador.getEquipo());
		List<Pokemon> equipoRival = new ArrayList<>(rival.getEquipo());
		Collections.shuffle(equipoJugador);
		Collections.shuffle(equipoRival);
		equipoJugador.sort((p1, p2) -> p2.getNivel() - p1.getNivel());
		equipoRival.sort((p1, p2) -> p2.getNivel() - p1.getNivel());
		// Escoger el nivel máximo de los Pokémon del rival
		int nivelMaximoRival = equipoJugador.get(0).getNivel();
		// Iniciar el combate
		System.out.println("¡El combate ha comenzado!");
		while (numPokemonsKojugador < 6 && numPokemonsKorival < 6) {
			// Turno del jugador
			System.out.println("Turno " + turno);
			Pokemon pokemonJugador = jugador.escogerPokemon();
			if (pokemonJugador == null) {
				// El jugador se retira
				System.out.println(jugador.getNombre() + " se ha retirado del combate");
				ganador = rival;
				break;
			}
			Pokemon pokemonRival = rival.escogerPokemon(nivelMaximoRival);
			System.out.println(jugador.getNombre() + " ha escogido a " + pokemonJugador.getNombre());
			System.out.println(rival.getNombre() + " ha escogido a " + pokemonRival.getNombre());
			// Simular el combate entre los Pokémon
			simularCombate(pokemonJugador, pokemonRival);
			// Actualizar el número de Pokémon KO de cada entrenador
			numPokemonsKojugador = jugador.getNumPokemonsKO();
			numPokemonsKorival = rival.getNumPokemonsKO();
			turno++;
		}
		// Final del combate
		if (ganador == null) {
			// No se ha retirado ninguno de los dos entrenadores
			if (numPokemonsKojugador >= 6) {
				ganador = rival;
			} else if (numPokemonsKorival >= 6) {
				ganador = jugador;
			}
		}
		System.out.println("¡Fin del combate!");
		if (ganador != null) {
			System.out.println(ganador.getNombre() + " ha ganado el combate");
			// Obtener la proporción de experiencia y pokédollars
			double proporcionExp = calcularProporcionExp(ganador, numPokemonsKojugador, numPokemonsKorival);
			int pokédollarsPerdedor = (int) Math.ceil((double) ganador.getDinero() / 3);
			int pokédollarsGanador = 2 * pokédollarsPerdedor;
			// Actualizar la experiencia y los pokédollars de cada entrenador
			ganador.añadirExperiencia(proporcionExp * rival.getExperienciaTotal());
			ganador.añadirDinero(pokédollarsGanador);
			rival.quitarDinero(pokédollarsPerdedor);
			// Mostrar los resultados
			System.out.println(ganador.getNombre() + " ha ganado " + pokédollarsGanador + " pokédollars");
			System.out.println(rival.getNombre() + " ha perdido " + pokédollarsPerdedor + " pokédollars");
			System.out.println(
					ganador.getNombre() + " ha obtenido " + (int) (proporcionExp * 100) + "% de la experiencia total");
		}
	}

	private void simularCombate(Pokemon pokemonJugador, Pokemon pokemonRival) {
		Random random = new Random();
		while (pokemonJugador.getSalud() > 0 && pokemonRival.getSalud() > 0) {
			// Turno del jugador
			System.out.println(pokemonJugador.getNombre() + " ataca a " + pokemonRival.getNombre());
			int danioJugador = pokemonJugador.atacar(pokemonRival);
			System.out.println(pokemonRival.getNombre() + " recibe " + danioJugador + " puntos de daño");
			if (pokemonRival.getSalud() == 0) {
				System.out.println(pokemonRival.getNombre() + " se ha debilitado");
				jugador.incrementarNumPokemonsKO();
				rival.incrementarExperienciaTotal(pokemonRival.getNivel() * 10);
				break;
			}
			// Turno del rival
			System.out.println(pokemonRival.getNombre() + " ataca a " + pokemonJugador.getNombre());
			int danioRival = pokemonRival.atacar(pokemonJugador);
			System.out.println(pokemonJugador.getNombre() + " recibe " + danioRival + " puntos de daño");
			if (pokemonJugador.getSalud() == 0) {
				System.out.println(pokemonJugador.getNombre() + " se ha debilitado");
				rival.incrementarNumPokemonsKO();
				jugador.incrementarExperienciaTotal(pokemonJugador.getNivel() * 10);
				break;
			}
			// Probabilidad de que uno de los Pokémon se confunda
			if (random.nextDouble() < 0.1) {
				System.out.println(pokemonJugador.getNombre() + " se ha confundido");
				pokemonJugador.confundir();
			}
			if (random.nextDouble() < 0.1) {
				System.out.println(pokemonRival.getNombre() + " se ha confundido");
				pokemonRival.confundir();
			}
		}
	}

	private double calcularProporcionExp(Entrenador ganador, int numPokemonsKojugador, int numPokemonsKorival) {
		double nivelTotalJugador = 0;
		double nivelTotalRival = 0;
		for (Pokemon pokemon : ganador.getEquipo()) {
			if (!pokemon.estaKO()) {
				nivelTotalJugador += pokemon.getNivel();
			}
		}
		for (Pokemon pokemon : rival.getEquipo()) {
			if (!pokemon.estaKO()) {
				nivelTotalRival += pokemon.getNivel();
			}
		}
		double factorGanador = 1 + 0.2 * (numPokemonsKorival - numPokemonsKojugador);
		double factorPerdedor = 0.5 * factorGanador;
		return factorGanador * (nivelTotalRival / (nivelTotalJugador + nivelTotalRival)) + factorPerdedor;
	}
}
