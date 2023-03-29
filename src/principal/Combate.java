package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Combate {
	private Entrenador ganador;
	private Entrenador jugador;
	private Entrenador rival;
	private int turno;
	private int numKOsJugador;
	private int numKOsRival;

	public Combate(Entrenador jugador, Entrenador rival) {
		this.jugador = jugador;
		this.rival = rival;
		this.turno = 1;
		this.numKOsJugador = 0;
		this.numKOsRival = 0;
		
		
	}

}
