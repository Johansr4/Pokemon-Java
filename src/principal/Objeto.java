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
	Objeto pesa = new Objeto("Pesa", "Ataque/Defensa", 20, 20, 0, -20, 0, -20, -20, 0, 20, 0);
	Objeto pluma = new Objeto("Pluma", "Velocidad", 0, -20, -20, 30, 0, 0, -20, -20, -30, 0);
	Objeto chaleco = new Objeto("Chaleco", "Defensa/Defensa Especial", 0, -15, 20, 0, 0, -15, 20, 20, 0, 0);
	Objeto baston = new Objeto("Baston", "Estamina", 0, 0, 0, -15, 20, 0, 0, 0, 15, 0);
	Objeto pilas = new Objeto("Pilas", "Recuperación de estamina", 0, 0, -30, 0, 50, 0, 0, -30, 0, 0);

}
