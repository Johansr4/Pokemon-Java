package modelo;

import java.util.ArrayList;
import java.util.List;

public class MovimientoPokemon {

	// Tipos de movimiento
	public enum TipoMovimiento {
		ATAQUE, ESTADO, MEJORA
	}

	// Estados posibles
	public enum Estado {
		ENVENENADO, QUEMADO, PARALIZADO, DORMIDO, CONGELADO
	}

	// Mejoras posibles
	public enum Mejora {
		ATAQUE, DEFENSA, ATAQUE_ESPECIAL, DEFENSA_ESPECIAL, VELOCIDAD
	}

	private TipoPokemon tipoPokemon;
	private TipoMovimiento tipo;
	private String nombre;
	private int potencia; // para movimientos de tipo ATAQUE
	private Estado estado; // para movimientos de tipo ESTADO
	private int duracionEstado; // para movimientos de tipo ESTADO
	private Mejora mejora; // para movimientos de tipo MEJORA
	private int duracionMejora; // para movimientos de tipo MEJORA

	private int estamina; // Estamina requerida para usar el movimiento

	private List<MovimientoPokemon> movimientosDisponibles; // Movimientos disponibles del Pokémon
	private List<MovimientoPokemon> movimientosPosibles; // Movimientos posibles para intercambiar

	public MovimientoPokemon() {
		this.tipoPokemon = null;
		this.tipo = null;
		this.nombre = "";
		this.potencia = 1;
		this.estado = null;
		this.duracionEstado = 0;
		this.mejora = null;
		this.duracionMejora = 0;
		this.estamina = 0;
		this.movimientosDisponibles = new ArrayList<>();
		this.movimientosPosibles = new ArrayList<>();
	}

	// Constructor para movimientos de tipo ATAQUE
	public MovimientoPokemon(String nombre, int potencia, TipoMovimiento tipoMovimiento, TipoPokemon tipoPokemon) {
		this.nombre = nombre;
		this.potencia = potencia;
		this.tipo = tipoMovimiento;
		this.tipoPokemon = tipoPokemon;
		this.movimientosDisponibles = new ArrayList<>();
		this.movimientosPosibles = new ArrayList<>();
	}

	// Constructor para movimientos de tipo ESTADO
	public MovimientoPokemon(String nombre, Estado estado, int duracion, TipoMovimiento tipo, TipoPokemon tipoPokemon) {
		this.nombre = nombre;
		this.estado = estado;
		this.duracionEstado = duracion;
		this.tipo = tipo;
		this.tipoPokemon = tipoPokemon;
		this.movimientosDisponibles = new ArrayList<>();
		this.movimientosPosibles = new ArrayList<>();
	}

	// Constructor para movimientos de tipo MEJORA
	public MovimientoPokemon(String nombre, Mejora mejora, int duracion, TipoMovimiento tipo, TipoPokemon tipoPokemon) {
		this.nombre = nombre;
		this.mejora = mejora;
		this.duracionMejora = duracion;
		this.tipo = tipo;
		this.tipoPokemon = tipoPokemon;
		this.movimientosDisponibles = new ArrayList<>();
		this.movimientosPosibles = new ArrayList<>();
	}

	public TipoMovimiento getTipo() {
		return tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPotencia() {
		return potencia;
	}

	public Estado getEstado() {
		return estado;
	}

	public int getDuracionEstado() {
		return duracionEstado;
	}

	public Mejora getMejora() {
		return mejora;
	}

	public int getDuracionMejora() {
		return duracionMejora;
	}

	public int getEstamina() {
		return estamina;
	}

	public List<MovimientoPokemon> getMovimientosDisponibles() {
		return movimientosDisponibles;
	}

	public List<MovimientoPokemon> getMovimientosPosibles() {
		return movimientosPosibles;
	}

	public void agregarMovimientoDisponible(MovimientoPokemon movimiento) {
		movimientosDisponibles.add(movimiento);
	}

	public void agregarMovimientoPosible(MovimientoPokemon movimiento) {
		movimientosPosibles.add(movimiento);
	}

	@Override
	public String toString() {
		return "MovimientoPokemon [tipoPokemon=" + tipoPokemon + ", tipo=" + tipo + ", nombre=" + nombre + ", potencia="
				+ potencia + ", estado=" + estado + ", duracionEstado=" + duracionEstado + ", mejora=" + mejora
				+ ", duracionMejora=" + duracionMejora + ", estamina=" + estamina + ", movimientosDisponibles="
				+ movimientosDisponibles + ", movimientosPosibles=" + movimientosPosibles + "]";
	}

	public static void main(String[] args) {
		MovimientoPokemon movimiento1 = new MovimientoPokemon("Ataque1", 50, TipoMovimiento.ATAQUE, TipoPokemon.AGUA);
		MovimientoPokemon movimiento2 = new MovimientoPokemon("Estado1", Estado.ENVENENADO, 3, TipoMovimiento.ESTADO,
				TipoPokemon.FUEGO);
		MovimientoPokemon movimiento3 = new MovimientoPokemon("Mejora1", Mejora.ATAQUE, 2, TipoMovimiento.MEJORA,
				TipoPokemon.PLANTA);

		movimiento1.agregarMovimientoDisponible(movimiento2);
		movimiento1.agregarMovimientoDisponible(movimiento3);
	}

	public int costoMovimiento() {
		return 0;
	}
}
