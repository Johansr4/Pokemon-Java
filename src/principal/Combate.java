package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Combate {
	private Entrenador jugador;
	private Entrenador rival;
	private int turno;
	private int koJugador;
	private int koRival;
	private boolean retirado;
	private int dinero;

	public Combate() {
		jugador = new Entrenador("jugador");
		rival = new Entrenador("rival");
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
		if (jugador.getEquipoPokemon().getKoRival()) {
			// El jugador pierde el combate
			System.out.println("El jugador ha perdido el combate.");
			rival.sumarDinero(100); // El rival gana 100 de dinero
			jugador.restarDinero(50); // El jugador pierde 50 de dinero
		} else {
			// El jugador gana el combate
			System.out.println("El jugador ha ganado el combate.");
			jugador.sumarDinero(100); // El jugador gana 100 de dinero
			rival.restarDinero(50); // El rival pierde 50 de dinero
		}

	}

	private void siguienteTurno() {
		// TODO Auto-generated method stub

	}

	private boolean combateTerminado() {
		// TODO Auto-generated method stub
		return false;
	}

	public Combate(Entrenador jugador, Entrenador rival) {
		this.jugador = jugador;
		this.rival = rival;
		this.turno = 1;
		this.koJugador = 0;
		this.koRival = 0;
		this.retirado = false;
	}

	public Entrenador getGanador() {
		if (this.koJugador == 6) {
			return this.rival;
		} else if (this.koRival == 6 || this.retirado) {
			return this.jugador;
		} else {
			return null;
		}
	}

	public Entrenador getJugador() {
		return this.jugador;
	}

	public Entrenador getRival() {
		return this.rival;
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
		return "Combate [jugador=" + jugador + ", rival=" + rival + ", turno=" + turno + ", koJugador=" + koJugador
				+ ", koRival=" + koRival + ", retirado=" + retirado + "]";
	}

}
