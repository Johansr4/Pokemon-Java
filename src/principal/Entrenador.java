package principal;

import java.util.ArrayList;
import java.util.Random;

public class Entrenador {
	private String nombre;
	private ArrayList<Pokemon> equipo;
	private ArrayList<Pokemon> caja;
	private ArrayList<Objeto> mochila;
	private int dinero;
	private Random rand;

	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<Pokemon>();
		this.caja = new ArrayList<Pokemon>();
		this.mochila = new ArrayList<Objeto>();
		this.rand = new Random();
		this.dinero = rand.nextInt(201) + 800; 
	}

	public void moverAPrincipal(Pokemon pokemon) {
		if (equipo.size() < 6) {
			equipo.add(pokemon);
			caja.remove(pokemon);
			System.out.println(
					nombre + " ha movido a " + pokemon.getNombre() + " del equipo de reserva al equipo principal.");
		} else {
			System.out.println(nombre + ", ya tienes un equipo principal completo.");
		}
	}

	public void moverACaja(Pokemon pokemon) {
		if (equipo.size() > 1) {
			equipo.remove(pokemon);
			caja.add(pokemon);
			System.out.println(
					nombre + " ha movido a " + pokemon.getNombre() + " del equipo principal al equipo de reserva.");
		} else {
			System.out.println(nombre + ", no puedes tener un equipo principal vacío.");
		}
	}

	public void entrenar(Pokemon pokemon, String tipoEntrenamiento) {
        int nivel = pokemon.getNivel();
        int costoEntrenamiento = 0;
        int[] aumentosEstadisticas = new int[4];
        
        switch (tipoEntrenamiento) {
            case "pesado":
                costoEntrenamiento = 20 * nivel;
                aumentosEstadisticas[0] = 5; 
                aumentosEstadisticas[1] = 5; 
                aumentosEstadisticas[3] = 5; 
                break;
            case "furioso":
                costoEntrenamiento = 30 * nivel;
                aumentosEstadisticas[2] = 5; 
                aumentosEstadisticas[3] = 5; 
                aumentosEstadisticas[4] = 5; 
                break;
            case "funcional":
                costoEntrenamiento = 40 * nivel;
                for (int i = 0; i < 4; i++) {
                    aumentosEstadisticas[i] = 5;
                }
                break;
            case "onirico":
                costoEntrenamiento = 40 * nivel;
                aumentosEstadisticas[2] = 5; 
                aumentosEstadisticas[3] = 5; 
                aumentosEstadisticas[4] = 5; 
                aumentosEstadisticas[5] = 5; 
                break;
            default:
                System.out.println("No se reconoce el tipo de entrenamiento.");
                return;
        }
        
        if (dinero < costoEntrenamiento) {
            System.out.println("No tienes suficiente dinero para entrenar a " + pokemon.getNombre() + ".");
            return;
        }

	public void comprarObjeto(Objeto objeto) {
		if (pokéDollars >= objeto.getPrecio()) {
			
			pokéDollars -= objeto.getPrecio();
			
			mochila.put(objeto, mochila.getOrDefault(objeto, 0) + 1);
			System.out.println(nombre + " ha comprado un " + objeto.getNombre() + ".");
		} else {
			System.out
					.println(nombre + " no tiene suficientes pokéDollars para comprar un " + objeto.getNombre() + ".");
		}
	}

	public void moverPokemonAlEquipoPrincipal(Pokemon pokemon) {
		if (equipoPrincipal.size() >= 4) {
			System.out.println("El equipo principal ya tiene 4 Pokémon. No se puede mover más.");
		} else {
			if (caja.contains(pokemon)) {
				caja.remove(pokemon);
				equipoPrincipal.add(pokemon);
				System.out.println(
						nombre + " ha movido a " + pokemon.getNombre() + " del grupo secundario al equipo principal.");
			} else {
				System.out.println(pokemon.getNombre() + " no está en el grupo secundario.");
			}
		}
	}

	public void moverPokemonALaCaja(Pokemon pokemon) {
            if (equipoPrincipal.size() <= 1) {
                System.out.println("El equipo principal solo tiene 1 Pokémon. No se puede mover más.");
            } else {
                if (equipoPrincipal.contains(pokemon)) {
                    equipoPrincipal.remove(pokemon);
                    caja.add(pokemon);
                    System.out.println(nombre + " ha movido a " + pokemon.getNombre() + " del equipo principal al grupo secundario.");
                } else {
                    System.out.println(pokemon.getNombre() + " no está en el equipo principal.");
                }
            }
        }

	public void entrenarPokemon(Pokemon pokemon, String tipoDeEntrenamiento) {
            int costoDeEntrenamiento = pokemon.getNivel() * COSTO_POR_NIVEL_DE_ENTRENAMIENTO;
            switch (tipoDeEntrenamiento) {
                case "pesado":
                    if (pokéDollars >= costoDeEntrenamiento * 20) {
                        pokemon.aumentarDefensa(5);
                        pokemon.aumentarDefensaEspecial(5);
                        pokemon.aumentarVitalidad(5);
                        System.out.println(nombre + " ha entrenado a " + pokemon.getNombre() + " con un entrenamiento pesado.");
                    } else {
                        System.out.println(nombre + " no tiene suficientes pokéDollars para entrenar a " + pokemon.getNombre() + " con un entrenamiento pesado.");
                    }
                    break;
                case "furioso":
                    if (pokéDollars >= costoDeEntrenamiento * 30) {
                        pokemon.aumentarAtaque(5);
                        pokemon.aumentarAtaqueEspecial(5);
                        pokemon.aumentarVelocidad(5);
                        System.out.println(nombre + " ha entrenado a " + pokemon.getNombre() + " con un entrenamiento furioso.");
                    } else {
                        System.out.println(nombre + " no tiene suficientes pokéDollars para entrenar a " + pokemon.getNombre() + " con un entrenamiento furioso.");
                    }
