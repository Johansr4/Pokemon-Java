package principal;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import principal.MovimientoPokemon.Estado;
import principal.MovimientoPokemon.TipoMovimiento;

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

	public Pokemon() {
		this.experiencia = (int) (Math.random() * 10) + 1;
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = (int) (Math.random() * 10) + 1;
		this.ataque = (int) (Math.random() * 10) + 1;
		this.defensa = (int) (Math.random() * 10) + 1;
		this.ataqueEspecial = (int) (Math.random() * 10) + 1;
		this.defensaEspecial = (int) (Math.random() * 10) + 1;
		this.velocidad = (int) (Math.random() * 10) + 1;
		this.estamina = (int) (Math.random() * 10) + 1;
		this.nivel = 1;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
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
	}

	public Pokemon( int experiencia, String nombre, String mote,
			int vitalidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad,
			int estamina, int nivel, int fertilidad, char sexo, TipoPokemon tipo, TipoPokemon tipo2,
			MovimientoPokemon movimiento1, MovimientoPokemon movimiento2, MovimientoPokemon movimiento3,
			MovimientoPokemon movimiento4, Estado estado, Objeto objeto ,int idPokemon, int numPokedex, int idEntrenador) {
		this.IdPokemon = this.IdPokemon;
		this.NumPokedex = this.NumPokedex;
		this.IdEntrenador = this.IdEntrenador;
		this.experiencia = experiencia;
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = vitalidad;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;
		this.estamina = estamina;
		this.nivel = nivel;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.tipo2 = tipo2;
		this.Movimiento1 = this.Movimiento1;
		this.Movimiento2 = this.Movimiento2;
		this.Movimiento3 = this.Movimiento3;
		this.Movimiento4 = this.Movimiento4;
		this.estado = estado;
		this.objeto = objeto;
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

	public void subirNivel() {

		if (experiencia >= (10 * (this.nivel))) {
			upgradeStatsNivel();
			// aprenderAtaque(MovimientoPokemon, ataque);

		}
	}

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
	

	public void upgradeStatsNivel() {
		nivel += 1;

		this.vitalidad += (int) (Math.random() * 5) + 1;
		this.ataque += (int) (Math.random() * 5) + 1;
		this.defensa += (int) (Math.random() * 5) + 1;
		this.ataqueEspecial += (int) (Math.random() * 5) + 1;
		this.defensaEspecial += (int) (Math.random() * 5) + 1;
		this.velocidad += (int) (Math.random() * 5) + 1;

	}

	public void aprenderAtaque(Pokemon pkEvolucion, int ataqueSeleccionado) {

		if (nivel % 3 == 0) {
			System.out.println("¡El Pokémon ha aprendido un nuevo ataque!");

			if (ataqueSeleccionado >= 1 && ataqueSeleccionado <= 4) {

				// LLAMADA A BBDD PARA INSERTAR EL MOVIMIENTO A APRENDER?

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

	// Selecciona el ataque y verifica si puede usarlo o no

	/**
	 * 
	 * @param objetivo
	 * @param movimiento
	 * @param ataqueSeleccionado
	 * @return
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

		/*
		 * TablaTipoPokemon tablaTipoPokemon= new TablaTipoPokemon();
		 * 
		 * tablaTipoPokemon.mostrarEficaciaTipo(tipo, tipo, tipo)
		 * 
		 * tablaTipoPokemon.mostrarEficaciaTipo(tipo, tipo)
		 */

		this.vitalidad -= movimiento.getPotencia();
	}

	public void descansar() {
		setEstamina(100);

	}

	public boolean puedeUsarObjeto(Objeto objeto2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Pokemon [experiencia=" + experiencia + ", nombre=" + nombre + ", mote=" + mote + ", vitalidad="
				+ vitalidad + ", ataque=" + ataque + ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial
				+ ", defensaEspecial=" + defensaEspecial + ", velocidad=" + velocidad + ", estamina=" + estamina
				+ ", nivel=" + nivel + ", fertilidad=" + fertilidad + ", sexo=" + sexo + ", tipo=" + tipo
				+ ", Movimiento=" + Movimiento1 + ", Movimiento2=" + Movimiento2 + ", Movimiento3=" + Movimiento3
				+ ", Movimiento4=" + Movimiento4 + ", estado=" + estado + ", objeto=" + objeto + "]";
	}

	public int getSalud() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int atacar(Pokemon pokemonRival) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void confundir() {
		// TODO Auto-generated method stub
		
	}

	public boolean estaKO() {
		// TODO Auto-generated method stub
		return false;
	}

}
