package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Entrenador;
import modelo.Objeto;
import modelo.Pokemon;

class TestEntrenador {

	 @Test
	    public void testAgregarPokemonACaja() {
	        

	        // Crear un Pokemon para agregar a la caja
	        Pokemon pokemon = new Pokemon();

	        Entrenador e1 = new Entrenador();
	        // Agregar el Pokemon a la caja
	        e1.agregarPokemonACaja(pokemon);

	        // Verificar si el Pokemon se agregó correctamente
	        assertTrue(e1.getCaja().contains(pokemon));
	    }
	 
	 
	 @Test
	    public void testMoverAPrincipal() {
	        Pokemon pokemon = new Pokemon();
	        Entrenador entrenador = new Entrenador();
	        entrenador.agregarPokemonACaja(pokemon);

	        entrenador.moverAPrincipal(pokemon);

	        assertTrue(entrenador.getEquipo().contains(pokemon));
	        assertFalse(entrenador.getCaja().contains(pokemon));
	    }
	 
	 
	 @Test
	    public void testEntrenar() {
	        Pokemon pokemon = new Pokemon();
	        Entrenador entrenador = new Entrenador();
	        entrenador.setDinero(1000); // Establecer dinero suficiente
	        int tipoEntrenamiento = 1; // Entrenamiento pesado

	        entrenador.entrenar(pokemon, tipoEntrenamiento);

	        assertEquals(pokemon.getAtaque(), 5); // El ataque debe haber aumentado en 5
	        assertEquals(entrenador.getDinero(), 1000); // El dinero debe haber disminuido en 20 * nivel
	    }



}
