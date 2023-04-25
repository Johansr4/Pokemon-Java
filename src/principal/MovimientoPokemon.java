package principal;

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




    public MovimientoPokemon () {
        this.tipoPokemon = null;
        this.tipo = null;
        this.nombre = "";
        this.potencia = 0;
        this.estado = null;
        this.duracionEstado = 0;
        this.mejora = null;
        this.duracionMejora = 0;
    }





    // Constructor para movimientos de tipo ATAQUE

    /**
     * @param nombre
     * @param potencia
     * @param tipoMovimiento
     * @param tipoPokemon
     */
    public MovimientoPokemon(String nombre, int potencia, TipoMovimiento tipoMovimiento,TipoPokemon tipoPokemon) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.tipo = tipoMovimiento;
        this.tipoPokemon= tipoPokemon;

    }

    // Constructor para movimientos de tipo ESTADO

    

    /**
     * @param nombre
     * @param estado
     * @param duracion
     * @param tipo
     * @param tipoPokemon
     */
    public MovimientoPokemon(String nombre, Estado estado, int duracion, TipoMovimiento tipo,TipoPokemon tipoPokemon) {
        this.nombre = nombre;
        this.estado = estado;
        this.duracionEstado = duracion;
        this.tipo = tipo;
        this.tipoPokemon= tipoPokemon;
    }

    // Constructor para movimientos de tipo MEJORA

    

    /**
     * @param nombre
     * @param mejora
     * @param duracion
     * @param tipo
     * @param tipoPokemon
     */
    public MovimientoPokemon(String nombre, Mejora mejora, int duracion, TipoMovimiento tipo,TipoPokemon tipoPokemon) {
        this.nombre = nombre;
        this.mejora = mejora;
        this.duracionMejora = duracion;
        this.tipo = tipo;
        this.tipoPokemon= tipoPokemon;
    }

    // Método que calcula el costo de estamina del movimiento
    public int costoMovimiento() {
        switch (tipo) {
            case ATAQUE:
                return potencia / 2;
            case ESTADO:
                return duracionEstado * 10;
            case MEJORA:
                return duracionMejora * 10;
            default:
                return 0;
        }
    }

    // Métodos getters
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

    @Override
    public String toString() {
        return "MovimientoPokemon [tipoPokemon=" + tipoPokemon + ", tipo=" + tipo + ", nombre=" + nombre + ", potencia="
                + potencia + ", estado=" + estado + ", duracionEstado=" + duracionEstado + ", mejora=" + mejora
                + ", duracionMejora=" + duracionMejora + "]";
    }

   

}
