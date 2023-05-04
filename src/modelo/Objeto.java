package modelo;

public class Objeto {

	private String nombre;
	private int estadisticaPrueba;
	private String tipo;
	private int aumentoAtaque;
	private int aumentoDefensa;
	private int aumentoDefensaEspecial;
	private int aumentoVelocidad;
	private int aumentoEstamina;
	private int disminucionAtaque;
	private int disminucionDefensa;
	private int disminucionDefensaEspecial;
	private int disminucionVelocidad;
	private int disminucionEstamina;

	public Objeto(String nombre, String tipo, int aumentoAtaque, int aumentoDefensa, int aumentoDefensaEspecial,

			int aumentoVelocidad, int aumentoEstamina, int disminucionAtaque, int disminucionDefensa,

			int disminucionDefensaEspecial, int disminucionVelocidad, int disminucionEstamina) {

		this.nombre = nombre;

		this.tipo = tipo;

		this.aumentoAtaque = aumentoAtaque;

		this.aumentoDefensa = aumentoDefensa;

		this.aumentoDefensaEspecial = aumentoDefensaEspecial;

		this.aumentoVelocidad = aumentoVelocidad;

		this.aumentoEstamina = aumentoEstamina;

		this.disminucionAtaque = disminucionAtaque;

		this.disminucionDefensa = disminucionDefensa;

		this.disminucionDefensaEspecial = disminucionDefensaEspecial;

		this.disminucionVelocidad = disminucionVelocidad;

		this.disminucionEstamina = disminucionEstamina;

	}


	

	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEstadisticaPrueba() {
		return estadisticaPrueba;
	}




	public void setEstadisticaPrueba(int estadisticaPrueba) {
		this.estadisticaPrueba = estadisticaPrueba;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public int getAumentoAtaque() {
		return aumentoAtaque;
	}




	public void setAumentoAtaque(int aumentoAtaque) {
		this.aumentoAtaque = aumentoAtaque;
	}




	public int getAumentoDefensa() {
		return aumentoDefensa;
	}




	public void setAumentoDefensa(int aumentoDefensa) {
		this.aumentoDefensa = aumentoDefensa;
	}




	public int getAumentoDefensaEspecial() {
		return aumentoDefensaEspecial;
	}




	public void setAumentoDefensaEspecial(int aumentoDefensaEspecial) {
		this.aumentoDefensaEspecial = aumentoDefensaEspecial;
	}




	public int getAumentoVelocidad() {
		return aumentoVelocidad;
	}




	public void setAumentoVelocidad(int aumentoVelocidad) {
		this.aumentoVelocidad = aumentoVelocidad;
	}




	public int getAumentoEstamina() {
		return aumentoEstamina;
	}




	public void setAumentoEstamina(int aumentoEstamina) {
		this.aumentoEstamina = aumentoEstamina;
	}




	public int getDisminucionAtaque() {
		return disminucionAtaque;
	}




	public void setDisminucionAtaque(int disminucionAtaque) {
		this.disminucionAtaque = disminucionAtaque;
	}




	public int getDisminucionDefensa() {
		return disminucionDefensa;
	}




	public void setDisminucionDefensa(int disminucionDefensa) {
		this.disminucionDefensa = disminucionDefensa;
	}




	public int getDisminucionDefensaEspecial() {
		return disminucionDefensaEspecial;
	}




	public void setDisminucionDefensaEspecial(int disminucionDefensaEspecial) {
		this.disminucionDefensaEspecial = disminucionDefensaEspecial;
	}




	public int getDisminucionVelocidad() {
		return disminucionVelocidad;
	}




	public void setDisminucionVelocidad(int disminucionVelocidad) {
		this.disminucionVelocidad = disminucionVelocidad;
	}




	public int getDisminucionEstamina() {
		return disminucionEstamina;
	}




	public void setDisminucionEstamina(int disminucionEstamina) {
		this.disminucionEstamina = disminucionEstamina;
	}




	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", estadisticaPrueba=" + estadisticaPrueba + ", tipo=" + tipo
				+ ", aumentoAtaque=" + aumentoAtaque + ", aumentoDefensa=" + aumentoDefensa
				+ ", aumentoDefensaEspecial=" + aumentoDefensaEspecial + ", aumentoVelocidad=" + aumentoVelocidad
				+ ", aumentoEstamina=" + aumentoEstamina + ", disminucionAtaque=" + disminucionAtaque
				+ ", disminucionDefensa=" + disminucionDefensa + ", disminucionDefensaEspecial="
				+ disminucionDefensaEspecial + ", disminucionVelocidad=" + disminucionVelocidad
				+ ", disminucionEstamina=" + disminucionEstamina + "]";
	}




	public int getCosto() {
		return 0;
	}




	

}
