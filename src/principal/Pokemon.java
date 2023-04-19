package principal;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import principal.MovimientoPokemon.Estado;



//Javafx/Scene Builder y conexion bbdd

// Metodo para aplicar objeto

//ENUMERADOS o INTRODUCIR VALORES NUEVOS EN BBDD

//hashmap en aprender ataque/movimiento

public class Pokemon {

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
	private MovimientoPokemon Movimiento;
	private MovimientoPokemon Movimiento2;
	private MovimientoPokemon Movimiento3;
	private MovimientoPokemon Movimiento4;
	private Estado estado;
	private Objeto objeto; // Objeto de tipo Objeto

	public Pokemon(int experiencia, String nombre, String mote, int vitalidad, int ataque, int defensa,
			int ataqueEspecial, int defensaEspecial, int velocidad, int estamina, int nivel, int fertilidad, char sexo,
			TipoPokemon tipo, MovimientoPokemon movimiento, MovimientoPokemon movimiento2,
			MovimientoPokemon movimiento3, MovimientoPokemon movimiento4, Estado estado, Objeto objeto) {
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
		Movimiento = movimiento;
		Movimiento2 = movimiento2;
		Movimiento3 = movimiento3;
		Movimiento4 = movimiento4;
		this.estado = estado;
		this.objeto = objeto;
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

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public MovimientoPokemon getMovimiento() {
		return Movimiento;
	}

	public void setMovimiento(MovimientoPokemon movimiento) {
		Movimiento = movimiento;
	}

	public MovimientoPokemon getMovimiento2() {
		return Movimiento2;
	}

	public void setMovimiento2(MovimientoPokemon movimiento2) {
		Movimiento2 = movimiento2;
	}

	public MovimientoPokemon getMovimiento3() {
		return Movimiento3;
	}

	public void setMovimiento3(MovimientoPokemon movimiento3) {
		Movimiento3 = movimiento3;
	}

	public MovimientoPokemon getMovimiento4() {
		return Movimiento4;
	}

	public void setMovimiento4(MovimientoPokemon movimiento4) {
		Movimiento4 = movimiento4;
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
		int contNivel = 0;
		if (experiencia >= (10 * (this.nivel)) || contNivel % 3 == 0) {
			upgradeStatsNivel();

		}
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


	//Selecciona el ataque y verifica si puede usarlo o no
	public boolean atacar(Pokemon objetivo, int ataqueSeleccionado) {
		System.out.println("Seleccionaste el ataque " + ataqueSeleccionado);
	
		// Verificar si el ataque seleccionado es válido (1, 2, 3 o 4)
		if (ataqueSeleccionado >= 1 && ataqueSeleccionado <= 4) {
			MovimientoPokemon movimiento = null;
	
			// Obtener el movimiento correspondiente al ataque seleccionado
			switch (ataqueSeleccionado) {
				case 1:
					movimiento = Movimiento;
					break;
				case 2:
					movimiento = Movimiento2;
					break;
				case 3:
					movimiento = Movimiento3;
					break;
				case 4:
					movimiento = Movimiento4;
					break;
			}
	
			// Verificar si el Pokémon tiene suficiente estamina para usar el movimiento
			if (this.estamina >= movimiento.costoMovimiento()) {
				System.out.println("Realizando ataque con " + movimiento.getNombre());
				
				// Restar el costo de estamina del movimiento del medidor de estamina del Pokémon
				this.estamina -= this.Movimiento.getPotencia();
				
				// Realizar el ataque en el Pokémon objetivo
				objetivo.recibirAtaque(movimiento);
				
				return true;
			} else {
				System.out.println("No tienes suficiente estamina para usar este ataque.");
				return false;
			}
	
		} else {
			System.out.println("Ataque seleccionado inválido.");
			return false;
		}
	}
	
	public void recibirAtaque(MovimientoPokemon movimiento) {
		this.vitalidad-=movimiento.getPotencia();
	}
	

	public void descansar() {
		setEstamina(100);

	}

	

	/*
	 * public void aprenderAtaque(ataque,posicion) {
	 * 
	 * }
	 */

	public boolean puedeUsarObjeto(Objeto objeto2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void entrenar(int[] aumentosEstadisticas) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Pokemon [experiencia=" + experiencia + ", nombre=" + nombre + ", mote=" + mote + ", vitalidad="
				+ vitalidad + ", ataque=" + ataque + ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial
				+ ", defensaEspecial=" + defensaEspecial + ", velocidad=" + velocidad + ", estamina=" + estamina
				+ ", nivel=" + nivel + ", fertilidad=" + fertilidad + ", sexo=" + sexo + ", tipo=" + tipo
				+ ", Movimiento=" + Movimiento + ", Movimiento2=" + Movimiento2 + ", Movimiento3=" + Movimiento3
				+ ", Movimiento4=" + Movimiento4 + ", estado=" + estado + ", objeto=" + objeto + "]";
	}

}
