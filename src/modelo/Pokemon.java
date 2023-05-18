package modelo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.Doc;

import modelo.MovimientoPokemon.Estado;
import modelo.MovimientoPokemon.TipoMovimiento;

//Javafx/Scene Builder y conexion bbdd

// Metodo para aplicar objeto

//ENUMERADOS o INTRODUCIR VALORES NUEVOS EN BBDD

//hashmap en aprender ataque/movimiento

public class Pokemon {
	
	private int IdPokemon;
	private int NumPokedex;
	private int IdEntrenador;
	private int experiencia;
	private String nombre;
	private String mote;
	private int vitalidad;
	private int ataque;
	private int defensa;
	private int ataqueEspecial;
	private int defensaEspecial;
	private int velocidad;
	private int estamina;
	private int nivel;
	private int fertilidad = 5;
	private char sexo;
	private TipoPokemon tipo;
	private TipoPokemon tipo2;
	private MovimientoPokemon Movimiento1;
	private MovimientoPokemon Movimiento2;
	private MovimientoPokemon Movimiento3;
	private MovimientoPokemon Movimiento4;
	private Estado estado;
	private Objeto objeto; // Objeto de tipo Objeto
	private String img;

	public Pokemon() {
		this.experiencia = (int) (Math.random() * 10) + 1;
		this.nombre = "TESTEO";
		this.mote = mote;
		this.vitalidad = (int) (Math.random() * 10) + 1;
		this.ataque = 0;
		this.defensa = (int) (Math.random() * 10) + 1;
		this.ataqueEspecial = (int) (Math.random() * 10) + 1;
		this.defensaEspecial = (int) (Math.random() * 10) + 1;
		this.velocidad = (int) (Math.random() * 10) + 1;
		this.estamina = (int) (Math.random() * 10) + 1;
		this.nivel = 0;
		this.fertilidad = 0;
		this.sexo = ' ';
		this.tipo = tipo;
		this.Movimiento1 = Movimiento1;
		this.Movimiento2 = Movimiento2;
		this.Movimiento3 = Movimiento3;
		this.Movimiento4 = Movimiento4;
		this.estado = estado;
		this.objeto = objeto;
		this.IdEntrenador = IdEntrenador;
		this.NumPokedex = NumPokedex;
		this.IdPokemon = IdPokemon;
		this.tipo2 = tipo2;
		this.img=img;
	}

	public Pokemon(int idPokemon, int numPokedex, int idEntrenador, int experiencia, String nombre, String mote,
			int vitalidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad,
			int estamina, int nivel, int fertilidad, char sexo, TipoPokemon tipo, TipoPokemon tipo2,
			MovimientoPokemon movimiento1, MovimientoPokemon movimiento2, MovimientoPokemon movimiento3,
			MovimientoPokemon movimiento4, Estado estado, Objeto objeto, String img) {
		super();
		this.experiencia = (int) (Math.random() * 10) + 1;
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = (int) (Math.random() * 10) + 1;
		this.ataque = 0;
		this.defensa = (int) (Math.random() * 10) + 1;
		this.ataqueEspecial = (int) (Math.random() * 10) + 1;
		this.defensaEspecial = (int) (Math.random() * 10) + 1;
		this.velocidad = (int) (Math.random() * 10) + 1;
		this.estamina = (int) (Math.random() * 10) + 1;
		this.nivel = 0;
		this.fertilidad = 0;
		this.sexo = ' ';
		this.tipo = tipo;
		this.Movimiento1 = Movimiento1;
		this.Movimiento2 = Movimiento2;
		this.Movimiento3 = Movimiento3;
		this.Movimiento4 = Movimiento4;
		this.estado = estado;
		this.objeto = objeto;
		this.IdEntrenador = IdEntrenador;
		this.NumPokedex = NumPokedex;
		this.IdPokemon = IdPokemon;
		this.tipo2 = tipo2;
		this.img=img;
	}
	

	public int getIdPokemon() {
		return IdPokemon;
	}

	public void setIdPokemon(int idPokemon) {
		IdPokemon = idPokemon;
	}

	public int getNumPokedex() {
		return NumPokedex;
	}

	public void setNumPokedex(int numPokedex) {
		NumPokedex = numPokedex;
	}

	public int getIdEntrenador() {
		return IdEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		IdEntrenador = idEntrenador;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getFertilidad() {
		return fertilidad;
	}

	public void setFertilidad(int fertilidad) {
		this.fertilidad = fertilidad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	public TipoPokemon setTipo(TipoPokemon tipo) {
		return this.tipo = tipo;
	}

	public TipoPokemon getTipo2() {
		return this.tipo2;
	}

	public TipoPokemon setTipo2(TipoPokemon tipo2) {
		return this.tipo2 = tipo2;
	}

	public MovimientoPokemon getMovimiento1() {
		return Movimiento1;
	}

	public void setMovimiento1(MovimientoPokemon movimiento1) {
		this.Movimiento1 = movimiento1;
	}

	public MovimientoPokemon getMovimiento2() {
		return Movimiento2;
	}

	public void setMovimiento2(MovimientoPokemon movimiento2) {
		this.Movimiento2 = movimiento2;
	}

	public MovimientoPokemon getMovimiento3() {
		return Movimiento3;
	}

	public void setMovimiento3(MovimientoPokemon movimiento3) {
		this.Movimiento3 = movimiento3;
	}

	public MovimientoPokemon getMovimiento4() {
		return Movimiento4;
	}

	public void setMovimiento4(MovimientoPokemon movimiento4) {
		this.Movimiento4 = movimiento4;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}
	
	

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void subirNivel() {

		if (experiencia >= (10 * (this.nivel))) {
			upgradeStatsNivel();
			// aprenderAtaque(MovimientoPokemon, ataque);

		}
	}
	
	/**
	 * 
	 * 
	 * Este metodo recopila la informacion en texto de base de datos y lo 
	 * transforma en un objeto de tipo pokemon .
	 * 
	 * @param String del tipo del pokemon
	 * @return tipo
	 */

	public TipoPokemon setTipoPokemon(String str) {
        switch(str) {
            case "AGUA":
			return setTipo(TipoPokemon.AGUA);    
			case "FUEGO":
			return setTipo(TipoPokemon.FUEGO);
			case "PLANTA":
				return setTipo(TipoPokemon.PLANTA);
			case "VOLADOR":
				return setTipo(TipoPokemon.VOLADOR);
			case "TIERRA":
				return setTipo(TipoPokemon.TIERRA);
			case "ELÉCTRICO":
				return setTipo(TipoPokemon.ELÉCTRICO);
			case "BICHO":
				return setTipo(TipoPokemon.BICHO);
			case "LUCHA":
				return setTipo(TipoPokemon.LUCHA);
			case "NORMAL":
				return setTipo(TipoPokemon.NORMAL);
			case "PSÍQUICO":
				return setTipo(TipoPokemon.PSÍQUICO);
			case "ROCA":
				return setTipo(TipoPokemon.ROCA);
			case "HIELO":
				return setTipo(TipoPokemon.HIELO);
			case "VENENO":
				return setTipo(TipoPokemon.VENENO);
			case "FANTASMA":
				return setTipo(TipoPokemon.FANTASMA);
			case "DRAGÓN":
				return setTipo(TipoPokemon.DRAGÓN);
			default:
				// Si el valor de str no coincide con ninguna de las opciones anteriores, se asigna un valor nulo al objeto.
				break;
		}
		return null;
	}
	
	/**
	 * 
	 * 
	 * Este metodo recopila la informacion en texto de base de datos y lo 
	 * transforma en un objeto de tipo pokemon .
	 * 
	 * @param String del tipo del pokemon
	 * @return tipo
	 */

	public TipoPokemon setTipoPokemon2(String str) {
        switch(str) {
            case "AGUA":
			return setTipo(TipoPokemon.AGUA);    
			case "FUEGO":
			return setTipo(TipoPokemon.FUEGO);
			case "PLANTA":
				return setTipo(TipoPokemon.PLANTA);
			case "VOLADOR":
				return setTipo(TipoPokemon.VOLADOR);
			case "TIERRA":
				return setTipo(TipoPokemon.TIERRA);
			case "ELÉCTRICO":
				return setTipo(TipoPokemon.ELÉCTRICO);
			case "BICHO":
				return setTipo(TipoPokemon.BICHO);
			case "LUCHA":
				return setTipo(TipoPokemon.LUCHA);
			case "NORMAL":
				return setTipo(TipoPokemon.NORMAL);
			case "PSÍQUICO":
				return setTipo(TipoPokemon.PSÍQUICO);
			case "ROCA":
				return setTipo(TipoPokemon.ROCA);
			case "HIELO":
				return setTipo(TipoPokemon.HIELO);
			case "VENENO":
				return setTipo(TipoPokemon.VENENO);
			case "FANTASMA":
				return setTipo(TipoPokemon.FANTASMA);
			case "DRAGÓN":
				return setTipo(TipoPokemon.DRAGÓN);
			default:
				// Si el valor de str no coincide con ninguna de las opciones anteriores, se asigna un valor nulo al objeto.
				break;
		}
		return null;
	}
	
	
	/**
	 * Realiza una mejora de las estadísticas al subir de nivel.
	 * Incrementa el nivel en 1 y actualiza las estadísticas del objeto según valores aleatorios.
	 * Las estadísticas actualizadas incluyen vitalidad, ataque, defensa, ataque especial,
	 * defensa especial y velocidad.
	 */		

	public void upgradeStatsNivel() {
		nivel += 1;

		this.vitalidad += (int) (Math.random() * 5) + 1;
		this.ataque += (int) (Math.random() * 5) + 1;
		this.defensa += (int) (Math.random() * 5) + 1;
		this.ataqueEspecial += (int) (Math.random() * 5) + 1;
		this.defensaEspecial += (int) (Math.random() * 5) + 1;
		this.velocidad += (int) (Math.random() * 5) + 1;

	}

	/**
	 * Permite al Pokémon aprender un nuevo ataque en función de su nivel y la selección de ataque.
	 * Si el nivel del Pokémon es divisible por 3, se le permite aprender un nuevo ataque.
	 * El ataque seleccionado se asigna al Pokémon en una de las cuatro posiciones de movimiento disponibles.
	 * 
	 * @param pkEvolucion El Pokémon al que se le permite aprender el nuevo ataque.
	 * @param ataqueSeleccionado El número del ataque seleccionado (1, 2, 3 o 4).
	 */
	
	public void aprenderAtaque(Pokemon pkEvolucion, int ataqueSeleccionado) {

		if (nivel % 3 == 0) {
			System.out.println("¡El Pokémon ha aprendido un nuevo ataque!");

			if (ataqueSeleccionado >= 1 && ataqueSeleccionado <= 4) {

				// LLAMADA A BBDD PARA INSERTAR EL MOVIMIENTO A APRENDER

				MovimientoPokemon movimiento = new MovimientoPokemon();

				// Obtener el a sobreponer

				switch (ataqueSeleccionado) {
					case 1:
						pkEvolucion.setMovimiento1(movimiento);
						break;
					case 2:
						pkEvolucion.setMovimiento2(movimiento);
						break;
					case 3:
						pkEvolucion.setMovimiento3(movimiento);
						break;
					case 4:
						pkEvolucion.setMovimiento4(movimiento);
						break;
					default:
						System.out.println("Opción inválida. No se realizó ningún cambio.");
						break;
				}
			} else {
				System.out.println("Opción inválida. No se realizó ningún cambio.");
			}
		} else {
			System.out.println("El Pokémon no puede aprender un nuevo ataque en este momento.");
		}
	}

	

	/**
	 * Realiza un ataque utilizando un movimiento seleccionado en un Pokémon objetivo.
	 * Verifica si el Pokémon tiene suficiente estamina para usar el movimiento antes de realizar el ataque.
	 * 
	 * @param objetivo El Pokémon objetivo del ataque.
	 * @param movimiento El movimiento que se utilizará en el ataque.
	 */
	
	public void atacar(Pokemon objetivo, MovimientoPokemon movimiento) {
		System.out.println("Seleccionaste el ataque " + movimiento);

		// Verificar si el Pokémon tiene suficiente estamina para usar el movimiento
		if (getEstamina() >= movimiento.costoMovimiento()) {

			System.out.println("Realizando ataque con " + movimiento.getNombre());

			// Restar el costo de estamina del movimiento del medidor de estamina del
			// Pokémon
			this.estamina -= movimiento.costoMovimiento();

			// Realizar el ataque en el Pokémon objetivo

			objetivo.recibirAtaque(movimiento);

		} else {
			System.out.println("No tienes suficiente estamina para usar este ataque.");
		}
	}

	public void recibirAtaque(MovimientoPokemon movimiento) {

		this.vitalidad -= movimiento.getPotencia();
	}

	//Metodo para usarlo cuando se necesite recuperar la estamina del pokemon
	public void descansar() {
		setEstamina(100);

	}

	@Override
	public String toString() {
		return "Pokemon [IdPokemon=" + IdPokemon + ", NumPokedex=" + NumPokedex + ", IdEntrenador=" + IdEntrenador
				+ ", experiencia=" + experiencia + ", nombre=" + nombre + ", mote=" + mote + ", vitalidad=" + vitalidad
				+ ", ataque=" + ataque + ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial
				+ ", defensaEspecial=" + defensaEspecial + ", velocidad=" + velocidad + ", estamina=" + estamina
				+ ", nivel=" + nivel + ", fertilidad=" + fertilidad + ", sexo=" + sexo + ", tipo=" + tipo + ", tipo2="
				+ tipo2 + ", Movimiento1=" + Movimiento1 + ", Movimiento2=" + Movimiento2 + ", Movimiento3="
				+ Movimiento3 + ", Movimiento4=" + Movimiento4 + ", estado=" + estado + ", objeto=" + objeto + ", img="
				+ img + "]";
	}

	
}
