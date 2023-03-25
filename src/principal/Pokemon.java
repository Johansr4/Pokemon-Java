package principal;

import java.util.ArrayList;
import java.util.Arrays;

// metodo para aplicar objeto

//enumerados

public class Pokemon {

	int experiencia;
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
	private ArrayList<String> Tipo = new ArrayList<String>();
	private ArrayList<String> Movimiento = new ArrayList<String>();
	private Estado estado;
	private Objeto objeto; // Objeto de tipo Objeto

	public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina, int nivel, int fertilidad, char sexo, ArrayList<String> tipos,
			ArrayList<String> movimientos, Estado estado, Objeto objeto) {
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
		this.Tipo = tipos;
		this.Movimiento = movimientos;
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
		return getTipos();
	}

	public void setTipos(ArrayList<String> tipos) {
		this.Tipo = tipos;
	}

	public ArrayList<String> getMovimientos() {
		return Movimiento;
	}

	public void setMovimientos(ArrayList<String> movimientos) {
		this.Movimiento = movimientos;
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

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public void subirNivel() {
		if (experiencia >= 10 * nivel) {
			upgradestatsNivel();
		}
	}

	public void upgradestatsNivel() {
		nivel += 1;

		vitalidad += (int) (Math.random() * 5) + 1;
		ataque += (int) (Math.random() * 5) + 1;
		defensa += (int) (Math.random() * 5) + 1;
		ataqueEspecial += (int) (Math.random() * 5) + 1;
		defensaEspecial += (int) (Math.random() * 5) + 1;
		velocidad += (int) (Math.random() * 5) + 1;

	}
	
	public void atacar() {
		
		//comprobar si tiene suficiente estamina 
		
		//Se necesitan algunos elementos que no tenemos actualmente
		if(estamina>1) {
			
			
		}
	}

	@Override
	public String toString() {
		return "Pokemon [experiencia=" + experiencia + ", nombre=" + nombre + ", mote=" + mote + ", vitalidad="
				+ vitalidad + ", ataque=" + ataque + ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial
				+ ", defensaEspecial=" + defensaEspecial + ", velocidad=" + velocidad + ", estamina=" + estamina
				+ ", nivel=" + nivel + ", fertilidad=" + fertilidad + ", sexo=" + sexo + ", Tipo=" + Tipo
				+ ", Movimiento=" + Movimiento + ", estado=" + estado + ", objeto=" + objeto + "]";
	}

	

}
