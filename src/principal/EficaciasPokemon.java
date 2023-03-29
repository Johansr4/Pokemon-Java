package principal;

public enum EficaciasPokemon {
    DESVENTAJA("NO ES MUY EFICAZ", 0.5),
    NEUTRO("NEUTRO", 1),
    VENTAJA("ES MUY EFICAZ", 2),
    NO_AFECTA("NO AFECTA", 0),
    DOBLE_VENTAJA("DOBLEMENTE EFICAZ", 4),
    DOBLE_DESVENTAJA("DOBLEMENTE NO MUY EFICAZ", 0.25);
    
    private String mensaje;
    private double eficacia;
    
    private EficaciasPokemon(String mensaje, double eficacia){
        this.mensaje = mensaje;
        this.eficacia = eficacia;
    }

    public String getMensaje() {
        return mensaje;
    }

    public double getEficacia() {
        return eficacia;
    }

    
    
}