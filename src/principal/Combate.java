package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.management.ConstructorParameters;

public class Combate {
	private Entrenador entrenador;
	private Entrenador entrenador2;
	private int turno;
	private int koJugador;
	private int koRival;
	private boolean retirado;
	private int dinero;

	/**
	 * 
	 * @param entrenador
	 * @param entrenador2
	 */

	public void Combates(Entrenador entrenador, Entrenador entrenador2) {

	}

	public void iniciarCombate() {
		System.out.println("¡Empieza el combate!");
		turno = 1;
		koJugador = 0;
		koRival = 0;
		retirado = false;

		while (!combateTerminado() && !retirado) {
			if (turno == 1) {
				getJugador();
				siguienteTurno();
			} else {
				getRival();
				siguienteTurno();
			}
		}

		terminarCombate();
	}

	public void sumarDinero(int cantidad) {
		this.dinero += cantidad;
	}

	public void restarDinero(int cantidad) {
		this.dinero -= cantidad;
	}

	private void terminarCombate() {
		// No tengo ni idea de como quitar este error
		if (entrenador.getEquipoPokemon().getKoRival()) {
			// El jugador pierde el combate
			System.out.println("El jugador ha perdido el combate.");
			entrenador2.sumarDinero(100); // El rival gana 100 de dinero
			entrenador.restarDinero(50); // El jugador pierde 50 de dinero
		} else {
			// El jugador gana el combate
			System.out.println("El jugador ha ganado el combate.");
			entrenador.sumarDinero(100); // El jugador gana 100 de dinero
			entrenador2.restarDinero(50); // El rival pierde 50 de dinero
		}

	}

	
	private void siguienteTurno() {

	}

	private boolean combateTerminado() {
		return false;
	}

	public Combate(Entrenador jugador, Entrenador rival) {
		this.entrenador = jugador;
		this.entrenador2 = rival;
		this.turno = 1;
		this.koJugador = 0;
		this.koRival = 0;
		this.retirado = false;
	}

	public Entrenador getGanador() {
		if (this.koJugador == 6) {
			return this.entrenador2;
		} else if (this.koRival == 6 || this.retirado) {
			return this.entrenador;
		} else {
			return null;
		}
	}

	public Entrenador getJugador() {
		return this.entrenador;
	}

	public Entrenador getRival() {
		return this.entrenador2;
	}

	public int getTurno() {
		return this.turno;
	}

	public int getKoJugador() {
		return this.koJugador;
	}

	public int getKoRival() {
		return this.koRival;
	}

	public boolean isRetirado() {
		return this.retirado;
	}

	public void setRetirado(boolean retirado) {
		this.retirado = retirado;
	}

	@Override
	public String toString() {
		return "Combate [jugador=" + entrenador + ", rival=" + entrenador2 + ", turno=" + turno + ", koJugador="
				+ koJugador + ", koRival=" + koRival + ", retirado=" + retirado + "]";
	}

}
