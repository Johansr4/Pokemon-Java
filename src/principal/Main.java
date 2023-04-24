package principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import principal.MovimientoPokemon.Estado;
import principal.MovimientoPokemon.Mejora;
import principal.MovimientoPokemon.TipoMovimiento;

public class Main {

	public static void main(String[] args) {

		Objeto objeto1 = new Objeto("palo pokemon", 1);
		TablaTipoPokemon tablaTipoPokemon = new TablaTipoPokemon();
		// Movimientos de prueba pre-establecidos

		MovimientoPokemon movimientoPokemon1 = new MovimientoPokemon("ATAQUE1", 50, TipoMovimiento.ATAQUE); 
		
		MovimientoPokemon movimientoPokemon2 = new MovimientoPokemon("ATAQUE2", Mejora.DEFENSA, 4,
				TipoMovimiento.ATAQUE);

		MovimientoPokemon movimientoPokemon3 = new MovimientoPokemon("ATAQUE3", 5, TipoMovimiento.ATAQUE);
		
		MovimientoPokemon movimientoPokemon4 = new MovimientoPokemon("ATAQUE4", Estado.CONGELADO, 0,
				TipoMovimiento.ATAQUE);
		MovimientoPokemon movimientoPokemon5 = new MovimientoPokemon("ATAQUE5", Mejora.VELOCIDAD, 4,
				TipoMovimiento.ATAQUE);

		// TU POKEMON

		Pokemon pokemon = new Pokemon(60, "charmander", "charrrr", 400, 30, 20, 0, 0, 0, 100, 60, 0, 'h',
				TipoPokemon.PLANTA, movimientoPokemon1, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4,
				Estado.CONGELADO, objeto1);

				pokemon.setMovimiento1(movimientoPokemon1);
				pokemon.setMovimiento2(movimientoPokemon2);
				pokemon.setMovimiento3(movimientoPokemon3);
				pokemon.setMovimiento4(movimientoPokemon4);


				Pokemon pokemontest = new Pokemon(60, "charmander", "charrrr", 400, 30, 20, 0, 0, 0, 100, 60, 0, 'h',
				TipoPokemon.PLANTA, movimientoPokemon1, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4,
				Estado.CONGELADO, objeto1);

		// POKEMON RIVAL
		Pokemon pokemon2 = new Pokemon(60, "squirtle", "sssql", 400, 30, 20, 0, 0, 0, 100, 60, 0, 'h',
				TipoPokemon.AGUA, movimientoPokemon1, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4, null,
				objeto1);

		pokemon.atacar(pokemon2, movimientoPokemon1);

		
		  pokemon.getTipo();
		  System.out.println("El pokemon del rival tiene estos puntos de vitalidad:");
		  System.out.println(pokemon2.getVitalidad());
		  System.out.println(tablaTipoPokemon.mostrarEficaciaTipo(pokemon.getTipo(),
		  pokemon2.getTipo()));
		  System.out.println(pokemon.getEstamina());
		 
		 System.out.println(pokemon);


		 
		Entrenador entrenador = new Entrenador("Ash", new ArrayList<>(), new ArrayList<>(),
				new ArrayList<>(), 100);

		Pokemon nuevopokemon;
		entrenador.getEquipo().add(0, pokemon2);

		System.out.println(entrenador);

		pokemon.aprenderAtaque(pokemon, 5);

		System.out.println(pokemon);

	}
}
