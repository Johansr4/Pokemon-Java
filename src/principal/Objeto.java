package principal;

public class Objeto {

	private String nombre;
    private int estadisticaPrueba;

    

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

    

}
