package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
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
	 
	 @Test
	    public void testCriarPokemon_nombreCorrecto() {
	        Pokemon padre = new Pokemon();
	        padre.setMote("Pikachu");
	        
	        Pokemon madre = new Pokemon();
	        madre.setMote("Jigglypuff");
	        
	        Pokemon criado = new Pokemon();
	        criado.setMote("Pikachufluff");
	        
	       
	        Assert.assertEquals("Pikachufluff", criado.getMote());
	    }
	 
	 @Test
	    public void testComprar() {
	        Entrenador e1 = new Entrenador();
	        e1.setDinero(100);
	        
	        Objeto objeto = new Objeto(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	        objeto.setNombre("Poción");
	        objeto.setCosto(50);  
	        
	        e1.comprar(objeto);
	       
	        Assert.assertTrue(e1.getMochila().contains(objeto));
	    }
	 
	 @Test
	    public void testUsarObjeto() {
	        Entrenador e1 = new Entrenador();
	        e1.setDinero(100);
	        
	        Objeto objeto = new Objeto(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	        Pokemon pokemon = new Pokemon();
	        pokemon.setNombre("Charizard");
	        
	        objeto.setNombre("Poción");
	        
	        e1.getMochila().add(objeto);
	        
	       
	        e1.usarObjeto(pokemon, objeto);
	        
	        
	        Assert.assertEquals(objeto, pokemon.getObjeto());
	       
	        Assert.assertFalse(e1.getMochila().contains(objeto));
	    }
	 
	 
	 @Test
	 public void testMostrarEquipo_cantidadPokemonCorrecta() {
	     Entrenador e1 = new Entrenador();
	     e1.setNombre("Ash");

	     Pokemon pokemon1 = new Pokemon();
	     pokemon1.setNombre("Pikachu");
	     pokemon1.setNivel(80);

	     Pokemon pokemon2 = new Pokemon();
	     pokemon2.setNombre("Charizard");
	     pokemon2.setNivel(85);

	     ArrayList<Pokemon> equipo = new ArrayList<>();
	     equipo.add(pokemon1);
	     equipo.add(pokemon2);

	     e1.setEquipo(equipo);

	     // Redirigir la salida estándar para capturarla en un ByteArrayOutputStream
	     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	     System.setOut(new PrintStream(outputStream));

	     // Llamar al método mostrarEquipo
	     e1.mostrarEquipo();

	     // Restaurar la salida estándar
	     System.setOut(System.out);

	     // Obtener la salida capturada
	     String output = outputStream.toString().trim();

	     // Dividir la salida en líneas y contar la cantidad de líneas
	     String[] lines = output.split(System.lineSeparator());
	     int cantidadPokemon = lines.length - 1; // Restar 1 para excluir la línea inicial del encabezado

	     // Asegurarse de que la cantidad de Pokémon en el equipo sea correcta
	     int expectedCantidadPokemon = 2;
	     Assert.assertEquals(expectedCantidadPokemon, cantidadPokemon);
	 }


	 @Test
	 public void testMostrarCaja() {
	     Entrenador e1 = new Entrenador();
	     e1.setNombre("Ash");

	     Pokemon pokemon1 = new Pokemon();
	     pokemon1.setNombre("Bulbasaur");
	     pokemon1.setNivel(20);

	     Pokemon pokemon2 = new Pokemon();
	     pokemon2.setNombre("Squirtle");
	     pokemon2.setNivel(25);

	     ArrayList<Pokemon> caja = new ArrayList<>();
	     caja.add(pokemon1);
	     caja.add(pokemon2);

	     e1.setCaja(caja);

	     // Redirigir la salida estándar para capturarla en un ByteArrayOutputStream
	     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	     System.setOut(new PrintStream(outputStream));

	     // Llamar al método mostrarCaja
	     e1.mostrarCaja();

	     // Restaurar la salida estándar
	     System.setOut(System.out);

	     // Obtener la salida capturada
	     String output = outputStream.toString().trim();

	     // Dividir la salida en líneas y contar la cantidad de líneas
	     String[] lines = output.split(System.lineSeparator());
	     int cantidadPokemon = lines.length - 1; // Restar 1 para excluir la línea inicial del encabezado

	     // Asegurarse de que la cantidad de Pokémon en la caja de reserva sea correcta
	     int expectedCantidadPokemon = 2;
	     Assert.assertEquals(expectedCantidadPokemon, cantidadPokemon);
	 }
	 
	 
	 @Test
	 public void testMostrarMochila() {
	     Entrenador e1 = new Entrenador();
	     e1.setNombre("Ash");

	     Objeto objeto1 = new Objeto(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	     objeto1.setNombre("Poción");

	     Objeto objeto2 = new Objeto(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	     objeto2.setNombre("Superpoción");

	     ArrayList<Objeto> mochila = new ArrayList<>();
	     mochila.add(objeto1);
	     mochila.add(objeto2);

	     e1.setMochila(mochila);

	     // Redirigir la salida estándar para capturarla en un ByteArrayOutputStream
	     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	     System.setOut(new PrintStream(outputStream));

	     // Llamar al método mostrarMochila
	     e1.mostrarMochila();

	     // Restaurar la salida estándar
	     System.setOut(System.out);

	     // Obtener la salida capturada
	     String output = outputStream.toString().trim();

	     // Dividir la salida en líneas y contar la cantidad de líneas
	     String[] lines = output.split(System.lineSeparator());
	     int cantidadObjetos = lines.length - 1; // Restar 1 para excluir la línea inicial del encabezado

	     // Asegurarse de que la cantidad de objetos en la mochila sea correcta
	     int expectedCantidadObjetos = 2;
	     Assert.assertEquals(expectedCantidadObjetos, cantidadObjetos);
	 }
	 
	 
	 

	 
	 
	 
	 	

	 
	    
	}




