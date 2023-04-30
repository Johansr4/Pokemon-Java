package principal;

import java.util.ArrayList;
import java.util.Random;

public class Entrenador {
	private String nombre;
	ArrayList<Pokemon> equipo;
	private ArrayList<Pokemon> caja;
	private ArrayList<Objeto> mochila;
	private int dinero;
	private static final int COSTO_POR_NIVEL_DE_ENTRENAMIENTO = 20;

	public Entrenador(String nombre, ArrayList<Pokemon> equipo, ArrayList<Pokemon> caja, ArrayList<Objeto> mochila,
			int dinero) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.caja = caja;
		this.mochila = mochila;
		this.dinero = (int) (Math.random() * 200) + 800;
	}

	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<Pokemon>();
		this.caja = new ArrayList<Pokemon>();
		this.mochila = new ArrayList<Objeto>();
		this.dinero = (int) (Math.random() * 200) + 800;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pokemon> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Pokemon> equipo) {
		this.equipo = equipo;
	}

	public ArrayList<Pokemon> getCaja() {
		return caja;
	}

	public void setCaja(ArrayList<Pokemon> caja) {
		this.caja = caja;
	}

	public ArrayList<Objeto> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<Objeto> mochila) {
		this.mochila = mochila;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public static int getCostoPorNivelDeEntrenamiento() {
		return COSTO_POR_NIVEL_DE_ENTRENAMIENTO;
	}

	public void capturarPokemon() {
		Captura captura = new Captura();
		captura.capturarPokemonWhile();
		Pokemon pokemonCapturado = captura.getNuevoPokemon();
		agregarPokemonACaja(pokemonCapturado);
	}

	public void agregarPokemonACaja(Pokemon pokemon) {
		if (caja.size() < 10) {
			caja.add(pokemon);
			System.out.println("Pokemon añadido a la caja.");
		} else {
			System.out.println("La caja está llena, no se puede agregar el pokemon.");
		}
	}

	public void moverAPrincipal(Pokemon pokemon) {
		if (this.equipo.size() < 6) {
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

	public void entrenar(Pokemon pokemon, int tipoEntrenamiento) {

		int nivel = pokemon.getNivel();

		switch (tipoEntrenamiento) {
			// PESADO
			case 1:
				System.out.println("Entrenamiento pesado");
				if (this.dinero > (20 * nivel)) {
					this.dinero -= (20 * nivel);
					pokemon.setAtaque(pokemon.getAtaque() + 5);
				} else {
					System.out.println("No tienes suficiente dinero para entrenar a " + pokemon.getNombre());
				}
				break;
			// FURIOSO
			case 2:
				System.out.println("Entrenamiento furioso");
				if (this.dinero > (30 * nivel)) {
					this.dinero -= (30 * nivel);
					pokemon.setAtaque(pokemon.getAtaque() + 5);
				} else {
					System.out.println("No tienes suficiente dinero para entrenar a " + pokemon.getNombre());
				}
				break;
			// FUNCIONAL
			case 3:
				System.out.println("Entrenamiento funcional");
				if (this.dinero > (40 * nivel)) {
					this.dinero -= (40 * nivel);
					pokemon.setAtaque(pokemon.getAtaque() + 5);
				} else {
					System.out.println("No tienes suficiente dinero para entrenar a " + pokemon.getNombre());
				}
				break;
			// ONIRICO
			case 4:
				System.out.println("Entrenamiento onírico");
				if (this.dinero > (40 * nivel)) {
					this.dinero -= (40 * nivel);
					pokemon.setAtaque(pokemon.getAtaque() + 5);
				} else {
					System.out.println("No tienes suficiente dinero para entrenar a " + pokemon.getNombre());
				}
			default:
				System.out.println("Tipo de entrenamiento no válido");
				return;
		}

		System.out.println(nombre + " ha entrenado a " + pokemon.getNombre() + " en el tipo de entrenamiento "
				+ tipoEntrenamiento);
	}

	/**
	 * Metodo para criar un pokemon con todos los paramentros requeridos
	 * 
	 * @param padre
	 * @param madre
	 */
	public void criarPokemon(Pokemon padre, Pokemon madre) {

		Pokemon pokemonCria = new Pokemon();

		// Obtener el mote mezclado
		String moteMezclado = padre.getMote().substring(0, padre.getMote().length() / 2)
				+ madre.getMote().substring(madre.getMote().length() / 2);

		pokemonCria.setMote(moteMezclado);
		// Obtener los ataques mezclados

		pokemonCria.setMovimiento1(padre.getMovimiento1());
		pokemonCria.setMovimiento2(padre.getMovimiento2());
		pokemonCria.setMovimiento3(madre.getMovimiento1());
		pokemonCria.setMovimiento4(madre.getMovimiento4());

		// Obtener los tipos mezclados

		Random random = new Random();

		// Generar un número aleatorio entre 1 y 2
		int numeroAleatorio = random.nextInt(2) + 1;

		if (numeroAleatorio == 1) {
			pokemonCria.setTipo(padre.getTipo());
		} else {
			pokemonCria.setTipo(madre.getTipo());
		}

		// Obtener las mejores características
		if (padre.getAtaqueEspecial() > madre.getAtaqueEspecial()) {
			pokemonCria.setAtaqueEspecial(padre.getAtaqueEspecial());
		} else if (padre.getAtaqueEspecial() < madre.getAtaqueEspecial()) {
			pokemonCria.setAtaqueEspecial(madre.getAtaqueEspecial());
		} else {
			// En caso de empate en todas las estadísticas, elegir al azar
			if (Math.random() < 0.5) {
				pokemonCria.setAtaqueEspecial(padre.getAtaqueEspecial());
			} else {
				pokemonCria.setAtaqueEspecial(madre.getAtaqueEspecial());
			}
		}

		if (padre.getDefensaEspecial() > madre.getDefensaEspecial()) {
			pokemonCria.setDefensaEspecial(padre.getDefensaEspecial());
		} else if (padre.getDefensaEspecial() < madre.getDefensaEspecial()) {
			pokemonCria.setDefensaEspecial(madre.getDefensaEspecial());
		} else {
			// En caso de empate en todas las estadísticas, elegir al azar
			if (Math.random() < 0.5) {
				pokemonCria.setDefensaEspecial(padre.getDefensaEspecial());
			} else {
				pokemonCria.setDefensaEspecial(madre.getDefensaEspecial());
			}
		}

		if (padre.getDefensa() > madre.getDefensa()) {
			pokemonCria.setDefensa(padre.getDefensa());
		} else if (padre.getDefensa() < madre.getDefensa()) {
			pokemonCria.setDefensa(madre.getDefensa());
		} else {
			// En caso de empate en todas las estadísticas, elegir al azar
			if (Math.random() < 0.5) {
				pokemonCria.setDefensa(padre.getDefensa());
			} else {
				pokemonCria.setDefensa(madre.getDefensa());
			}
		}

		if (padre.getVelocidad() > madre.getVelocidad()) {
			pokemonCria.setVelocidad(padre.getVelocidad());
		} else if (padre.getVelocidad() < madre.getVelocidad()) {
			pokemonCria.setVelocidad(madre.getVelocidad());
		} else {
			// En caso de empate en todas las estadísticas, elegir al azar
			if (Math.random() < 0.5) {
				pokemonCria.setVelocidad(padre.getVelocidad());
			} else {
				pokemonCria.setVelocidad(madre.getVelocidad());
			}
		}

		if (padre.getAtaque() > madre.getAtaque()) {
			pokemonCria.setAtaque(padre.getAtaque());
		} else if (padre.getAtaque() < madre.getAtaque()) {
			pokemonCria.setAtaque(madre.getAtaque());
		} else {
			// En caso de empate en todas las estadísticas, elegir al azar
			if (Math.random() < 0.5) {
				pokemonCria.setAtaque(padre.getAtaque());
			} else {
				pokemonCria.setAtaque(madre.getAtaque());
			}
		}

		caja.add(pokemonCria);
		System.out.println(pokemonCria);

	}

	public void comprar(Objeto objeto) {
		int costo = objeto.getCosto();
		if (dinero < costo) {
			System.out.println("No tienes suficiente dinero para comprar " + objeto.getNombre());
			return;
		}

		dinero -= costo;
		mochila.add(objeto);
		System.out.println(nombre + " ha comprado " + objeto.getNombre());
	}

	public void usarObjeto(Pokemon pokemon, Objeto objeto) {
		if (mochila.contains(objeto)) {

			if (pokemon.getObjeto() != null) {
				pokemon.setObjeto(null);
				pokemon.setObjeto(objeto);

			} else {
				pokemon.setObjeto(objeto);
			}

			mochila.remove(objeto);
			System.out.println(nombre + " ha usado " + objeto.getNombre() + " en " + pokemon.getNombre());
			
		} else {
			System.out.println(nombre + " no tiene " + objeto.getNombre() + " en su mochila.");
		}
	}

	public void mostrarEquipo() {
		System.out.println(nombre + " tiene " + equipo.size() + " pokemon en su equipo principal:");
		for (Pokemon pokemon : equipo) {
			System.out.println("- " + pokemon.getNombre() + " (Nivel " + pokemon.getNivel() + ")");
		}
	}

	public void mostrarCaja() {
		System.out.println(nombre + " tiene " + caja.size() + " pokemon en su equipo de reserva:");
		for (Pokemon pokemon : caja) {
			System.out.println("- " + pokemon.getNombre() + " (Nivel " + pokemon.getNivel() + ")");
		}
	}

	public void mostrarMochila() {
		System.out.println(nombre + " tiene los siguientes objetos en su mochila:");
		for (Objeto objeto : mochila) {
			System.out.println("- " + objeto.getNombre());
		}
	}

	public void mostrarDinero() {
		System.out.println(nombre + " tiene " + dinero + " monedas.");
	}

	public void sumarDinero(Entrenador entrenador) {
		entrenador.setDinero(entrenador.getDinero() + (entrenador.getDinero() / 3));

	}

	public void restarDinero(Entrenador entrenador) {
		entrenador.setDinero(entrenador.getDinero() - (entrenador.getDinero() / 3));

	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", equipo=" + equipo + ", caja=" + caja + ", mochila=" + mochila
				+ ", dinero=" + dinero + "]";
	}

}
