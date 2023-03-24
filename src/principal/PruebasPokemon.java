package principal;


public class PruebasPokemon  {


	    public static void main(String[] args) {
	        
	        Tipo tipo1 = new Tipo("Fuego");
	        Tipo tipo2 = new Tipo("Volador");
	        Tipo[] tipos = {tipo1, tipo2};
	        Objeto objeto = new Objeto("Poción");
	        Pokemon pokemon = new Pokemon("Charmander", "Exterminador", 39, 52, 43, 60, 50, 65, 60, 5, 70, 'M', tipos, Estado.NORMAL, objeto);
	        System.out.println(pokemon.toString());

	    }

	}

	
	
	

