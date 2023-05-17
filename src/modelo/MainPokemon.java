package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import modelo.MovimientoPokemon.Estado;
import modelo.MovimientoPokemon.Mejora;
import modelo.MovimientoPokemon.TipoMovimiento;

public class MainPokemon {

	public static void main(String[] args) {

		Objeto pesa = new Objeto("Pesa", "Ataque/Defensa", 20, 20, 0, -20, 0, -20, -20, 0, 20, 0);
		Objeto pluma = new Objeto("Pluma", "Velocidad", 0, -20, -20, 30, 0, 0, -20, -20, -30, 0);
		Objeto chaleco = new Objeto("Chaleco", "Defensa/Defensa Especial", 0, -15, 20, 0, 0, -15, 20, 20, 0, 0);
		Objeto baston = new Objeto("Baston", "Estamina", 0, 0, 0, -15, 20, 0, 0, 0, 15, 0);
		Objeto pilas = new Objeto("Pilas", "Recuperación de estamina", 0, 0, -30, 0, 50, 0, 0, -30, 0, 0);

		
		TablaTipoPokemon tablaTipoPokemon = new TablaTipoPokemon();
		// Movimientos de prueba pre-establecidos

		MovimientoPokemon movimientoPokemon1 = new MovimientoPokemon("ATAQUE1", 50, TipoMovimiento.ATAQUE,TipoPokemon.AGUA);

		MovimientoPokemon movimientoPokemon2 = new MovimientoPokemon("ATAQUE2", Mejora.DEFENSA, 4,
				TipoMovimiento.ATAQUE,TipoPokemon.AGUA);

		MovimientoPokemon movimientoPokemon3 = new MovimientoPokemon("ATAQUE3", 5, TipoMovimiento.ATAQUE,TipoPokemon.AGUA);

		MovimientoPokemon movimientoPokemon4 = new MovimientoPokemon("ATAQUE4", Estado.CONGELADO, 0,
				TipoMovimiento.ATAQUE,TipoPokemon.AGUA);
		MovimientoPokemon movimientoPokemon5 = new MovimientoPokemon("ATAQUE5", Mejora.VELOCIDAD, 4,
				TipoMovimiento.ATAQUE,TipoPokemon.AGUA);

		// TU POKEMON

		Pokemon pokemon = new Pokemon(0,0,0,60, "charmander", "charrrr", 400, 30, 60, 1, 1, 1, 100, 100, 0, 'h',
				TipoPokemon.PLANTA, null, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4,
				movimientoPokemon5, Estado.CONGELADO, baston, null);

				

		pokemon.setMovimiento1(movimientoPokemon1);
		pokemon.setMovimiento2(movimientoPokemon2);
		pokemon.setMovimiento3(movimientoPokemon3);
		pokemon.setMovimiento4(movimientoPokemon4);

		// POKEMON RIVAL
		Pokemon pokemon2 = new Pokemon(0,0,0, 30, "squirtle", "sssql", 100, 60, 20, 0, 0, 0, 100, 60, 0, 'h',
				TipoPokemon.AGUA, null, movimientoPokemon1, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4, null,
				baston, null);

		pokemon2.setMovimiento1(movimientoPokemon1);
		pokemon2.setMovimiento2(movimientoPokemon2);
		pokemon2.setMovimiento3(movimientoPokemon3);
		pokemon2.setMovimiento4(movimientoPokemon4);

		
		  pokemon.atacar(pokemon2, movimientoPokemon1);
		  
		  pokemon.getTipo();
		  System.out.println("El pokemon del rival tiene estos puntos de vitalidad:");
		  System.out.println(pokemon2.getVitalidad());
		  System.out.println(tablaTipoPokemon.mostrarEficaciaTipo(pokemon.getTipo(),
		  pokemon2.getTipo()));
		  System.out.println(pokemon.getEstamina());
		  
		  System.out.println(pokemon);
		 

		Entrenador entrenador = new Entrenador(1,"Ash", new ArrayList<>(6), new ArrayList<>(),
				new ArrayList<>(), 100);

				Entrenador entrenador2 = new Entrenador(2,"PEPE", new ArrayList<>(6), new ArrayList<>(),
				new ArrayList<>(), 100);

		
		  Pokemon nuevopokemon;
		  entrenador.getEquipo().add(0, pokemon2);
		  
		  System.out.println(entrenador);
		  
		  pokemon.aprenderAtaque(pokemon, 5);
		  
		  System.out.println(pokemon);

		  entrenador.getMochila().add(0, pluma);

		  entrenador.usarObjeto(pokemon2, pluma);

		  System.out.println(entrenador);
		 
		System.out.println("AQUI ESTA LA CRIA");

		entrenador.criarPokemon(pokemon2, pokemon);

		entrenador.capturarPokemon();

		System.out.println(entrenador);

		

		

		
		

		


	}
}
