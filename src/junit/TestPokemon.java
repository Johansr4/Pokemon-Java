package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import modelo.MovimientoPokemon;
import modelo.MovimientoPokemon.TipoMovimiento;
import modelo.Pokemon;
import modelo.TipoPokemon;

class TestPokemon {

	@Test
	 public void testSubirNivel() {
        // Crear una instancia de la clase que contiene el método subirNivel
        Pokemon p = new Pokemon();

        // Establecer el nivel y la experiencia adecuados para la prueba
        p.setNivel(2);
        p.setExperiencia(20);

        // Llamar al método subirNivel
        p.subirNivel();

        // Verificar si el nivel ha sido actualizado correctamente
        int nuevoNivel = p.getNivel();
        Assert.assertEquals(3, nuevoNivel);

        
    }
	
	@Test
    public void testSetTipoPokemon() {
        Pokemon p = new Pokemon();

        // Prueba para un tipo de Pokemon válido
        TipoPokemon tipoAgua = p.setTipoPokemon("AGUA");
        assertEquals(TipoPokemon.AGUA, tipoAgua);

        // Prueba para otro tipo de Pokemon válido
        TipoPokemon tipoFuego = p.setTipoPokemon("FUEGO");
        assertEquals(TipoPokemon.FUEGO, tipoFuego);

        // Prueba para un tipo de Pokemon no válido
        TipoPokemon tipoInvalido = p.setTipoPokemon("INVALIDO");
        assertEquals(null, tipoInvalido);
    }
	
	 @Test
	    public void testAprenderAtaque() {
	        Pokemon pokemonEvolucion = new Pokemon();
	        int ataqueSeleccionado = 1;

	        // Prueba cuando el nivel del Pokemon es divisible por 3
	        pokemonEvolucion.setNivel(6);
	        pokemonEvolucion.aprenderAtaque(pokemonEvolucion, ataqueSeleccionado);
	        assertNotNull(pokemonEvolucion.getMovimiento1());
	        assertNull(pokemonEvolucion.getMovimiento2());
	        assertNull(pokemonEvolucion.getMovimiento3());
	        assertNull(pokemonEvolucion.getMovimiento4());
        
	    }
	 
	 @Test
		public void testConstructor() {
			// Crea un objeto MovimientoPokemon utilizando el constructor
			MovimientoPokemon movimiento = new MovimientoPokemon("Ataque 1", 50, TipoMovimiento.ATAQUE, TipoPokemon.FUEGO);

			// Verifica que los atributos se han asignado correctamente
			assertEquals("Ataque 1", movimiento.getNombre());
			assertEquals(50, movimiento.getPotencia());
			assertEquals(TipoMovimiento.ATAQUE, movimiento.getTipo());
			assertEquals(TipoPokemon.FUEGO, movimiento.getTipoPokemon());
			
			
			Pokemon pokemon1 = new Pokemon();
			Pokemon pokemon2 = new Pokemon();

			// Valores iniciales de vitalidad de los Pokémon
			pokemon1.setVitalidad(100);
			pokemon2.setVitalidad(100);
			
			pokemon1.setEstamina(100);
			pokemon2.setEstamina(100);

			
			MovimientoPokemon movimiento2 = new MovimientoPokemon("Ataque 1", 50, TipoMovimiento.ATAQUE, TipoPokemon.FUEGO);
			
			pokemon1.setMovimiento1(movimiento2);

			// Realizar el ataque del pokemon1 al pokemon2
			pokemon1.atacar(pokemon2, movimiento2);

			// Verifica que la vitalidad 
			assertEquals(50, pokemon2.getVitalidad());
			
		}
	 
	 @Test
		public void testDescansar() {
			
			Pokemon pokemon = new Pokemon();

			// Estamina inicial en 50
			pokemon.setEstamina(50);

			// Llamar a descansar
			pokemon.descansar();

			// Verificar 100
			assertEquals(100, pokemon.getEstamina());
		}
	 
	 
	 
	 
	 
	 
}
	
	

	
	
