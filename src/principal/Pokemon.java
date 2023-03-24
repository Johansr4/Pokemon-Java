package principal;

import java.util.ArrayList;
import java.util.Arrays;

// metodo para aplicar objeto

//enumerados

public class Pokemon {
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
	private int fertilidad;
	private char sexo; 
	private Tipo[] tipos; // Array de objetos de tipo Tipo
	private Estado estado;
	private Objeto objeto; // Objeto de tipo Objeto

	public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina, int nivel, int fertilidad, char sexo, Tipo[] tipos,
			Estado estado, Objeto objeto) {
		super();

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
		this.tipos = tipos;
		this.estado = estado;
		this.objeto = objeto;
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

	public Tipo[] getTipos() {
		return tipos;
	}

	public void setTipos(Tipo[] tipos) {
		this.tipos = tipos;
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

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", mote=" + mote + ", vitalidad=" + vitalidad + ", ataque=" + ataque
				+ ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial
				+ ", velocidad=" + velocidad + ", estamina=" + estamina + ", nivel=" + nivel + ", fertilidad="
				+ fertilidad + ", sexo=" + sexo + ", tipos=" + Arrays.toString(tipos) + ", estado=" + estado
				+ ", objeto=" + objeto + "]";
	}

}


