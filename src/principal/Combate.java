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

    //Crea dos entrenadores para tener dinero 

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

       //dinero
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

