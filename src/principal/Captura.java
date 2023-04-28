package principal;


import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Captura {
    private static final String[] PALABRAS_PROHIBIDAS = { "palabra1", "palabra2", "palabra3" }; // lista de palabras prohibidas
    private static final Pattern PATRON_MOTE = Pattern.compile("^[a-zA-Z]+$"); // expresión regular para el mote

    private static Pokemon nuevoPokemon;
    private static int pokeballs = 5;
    private static Pokemon[] caja = new Pokemon[10];
    private static int indiceCaja = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public Captura() {
        nuevoPokemon = new Pokemon();
    }

    public void capturarPokemonWhile() {
        boolean capturado = false;
        while (!capturado) {
            Captura.nuevoPokemon = new Pokemon();
            mostrarPokemon();
            System.out.println("1. Randomizar Pokemon");
            System.out.println("2. Capturar Pokemon");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                nuevoPokemon = new Pokemon();
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

    public void mostrarPokemon() {
        System.out.println("A wild " + nuevoPokemon.getNombre() + " appears!");
        System.out.println("Level: " + nuevoPokemon.getNivel());
    }

    public boolean capturarPokemon() {
        pokeballs--;
        boolean capturado = random.nextInt(3) < 2;
        if (capturado) {
            System.out.println(nuevoPokemon.getNombre() + " capturado!");
        } else {
            System.out.println(nuevoPokemon.getNombre() + " escapó!");
        }
        return capturado;
    }

    public void agregarACaja() {
        System.out.println("¿Quieres ponerle un mote al nuevo Pokemon? (s/n)");
        String opcion = scanner.next().toLowerCase();
        if (opcion.equals("s")) {
            boolean moteValido = false;
            String mote = "";
            while (!moteValido) {
                System.out.println("Ingresa el mote del Pokemon (sólo letras):");
                mote = scanner.next();
                moteValido = PATRON_MOTE.matcher(mote).matches();
                if (!moteValido) {
                    System.out.println("Mote inválido. El mote debe contener sólo letras.");
                }
            }
            nuevoPokemon.setMote(mote);
        }
        if (indiceCaja < caja.length) {
            caja[indiceCaja] = nuevoPokemon;
            indiceCaja++;
            System.out.println("El Pokemon ha sido añadido a la caja.");
        } else {
            System.out.println("La caja está llena. No se pudo añadir el Pokemon.");
        }
    }

    public void mostrarCaja() {
        for (int i = 0; i < indiceCaja; i++) {
            Pokemon pokemon = caja[i];
            String mote = pokemon.getMote();
            String nombre = pokemon.getNombre();
            String mensaje = i + 1 + ". " + nombre;
            if (mote != null) {
                mensaje += " (" + mote + ")";
            }
            System.out.println(mensaje);
        }
    }

    public void liberarPokemon() {
        mostrarCaja();
        System.out.println("Ingresa el número del Pokemon que quieres liberar:");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= indiceCaja) {
            Pokemon pokemon = caja[opcion - 1];
            System.out.println("¿Estás seguro de que quieres liberar a " + pokemon.getNombre() + "? (s/n)");
            String confirmacion = scanner.next().toLowerCase();
            if (confirmacion.equals("s")) {
                for (int i = opcion - 1; i < indiceCaja - 1; i++) {
                    caja[i] = caja[i + 1];
                }
                indiceCaja--;
                System.out.println(pokemon.getNombre() + " ha sido liberado.");
            } else {
                System.out.println(pokemon.getNombre() + " no ha sido liberado.");
            }
        } else {
            System.out.println("Opción inválida.");
        }
    }
    public Pokemon getNuevoPokemon() {
        return this.nuevoPokemon;
    }
}

