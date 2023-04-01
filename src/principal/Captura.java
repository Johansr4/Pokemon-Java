package principal;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Captura {
    private static final String[] PALABRAS_PROHIBIDAS = {"palabra1", "palabra2", "palabra3"}; // lista de palabras prohibidas
    private static final Pattern PATRON_MOTE = Pattern.compile("^[a-zA-Z]+$"); // expresión regular para el mote
    
    private static Pokemon nuevoPokemon;
    private static int pokeballs = 5;
    private static Pokemon[] caja = new Pokemon[10];
    private static int indiceCaja = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    
    public static void main(String[] args) {
        generarNuevoPokemon();
        boolean capturado = false;
        while (!capturado) {
            mostrarPokemon();
            System.out.println("1. Randomizar Pokemon");
            System.out.println("2. Capturar Pokemon");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                generarNuevoPokemon();
            } else if (opcion == 2) {
                if (pokeballs > 0) {
                    capturado = capturarPokemon();
                } else {
                    System.out.println("No tienes pokéballs.");
                }
            } else {
                System.out.println("Opción inválida.");
            }
        }
        agregarACaja();
    }
    
    private static void generarNuevoPokemon() {
        nuevoPokemon = new Pokemon("Pokemon " + (random.nextInt(150) + 1), 1);
    }
    
    private static void mostrarPokemon() {
        System.out.println("A wild " + nuevoPokemon.getNombre() + " appears!");
        System.out.println("Level: " + nuevoPokemon.getNivel());
    }
    
    private static boolean capturarPokemon() {
        pokeballs--;
        boolean capturado = random.nextInt(3) < 2;
        if (capturado) {
            System.out.println(nuevoPokemon.getNombre() + " capturado!");
        } else {
            System.out.println(nuevoPokemon.getNombre() + " escapó!");
        }
        return capturado;
    }
    
    private static void agregarACaja() {
        System.out.println("¿Quieres ponerle un mote al nuevo Pokemon? (s/n)");
        String opcion = scanner.next().toLowerCase();
        if (opcion.equals("s")) {
            boolean moteValido = false;
            String mote = "";
            while (!moteValido) {
                System.out.println("Introduce el mote:");
                mote = scanner.next();
                if (!PATRON_MOTE.matcher(mote).matches()) {
                    System.out.println("El mote no puede contener números o espacios.");
                } else if (contienePalabraProhibida(mote)) {
                    System.out.println("El mote contiene una palabra prohibida.");
                } else {
                    moteValido = true;
                }
            }
            nuevoPokemon.setMote(mote);
        }
        caja[indiceCaja] = nuevoPokemon;
        indiceCaja++;
        System.out.println("Pokemon añadido a la caja.");
    }
    
    private static boolean contienePalabraProhibida(String mote) {
        for (String palabraProhibida : PALABRAS_PROHIBIDAS) {
            if (mote.toLowerCase().contains(palabraProhibida)) {
                return true;
            }
        }
        return false;
    }
    
    private static class Pokemon {
        private String nombre;
        private int nivel;
        private String mote;

        public Pokemon(String nombre, int nivel) {
            this.nombre = nombre;
            this.nivel = nivel;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNivel() {
            return nivel;
        }

        public String getMote() {
            return mote;
        }

        public void setMote(String mote) {
            this.mote = mote;
        }
    }
}

		
	

