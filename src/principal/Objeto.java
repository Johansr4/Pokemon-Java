package principal;

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

	public Objeto(String nombre, int estadisticaPrueba) {

		this.nombre = nombre;

		this.estadisticaPrueba = estadisticaPrueba;

	}

	public String getNombre() {

		return nombre;

	}

	public int getEstadisticaPrueba() {

		return estadisticaPrueba;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public void setEstadisticaPrueba(int estadisticaPrueba) {

		this.estadisticaPrueba = estadisticaPrueba;

	}

	@Override

	public String toString() {

		return "Objeto [nombre=" + nombre + ", estadisticaPrueba=" + estadisticaPrueba + "]";

	}

	public int getCosto() {

		return 0;

	}

	public String getCantidad() {

		return null;

	}

}
