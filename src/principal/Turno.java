package principal;

//Texto de lo ocurrido en dicho turno

public class Turno {
    private int numeroTurno;
    private String accionEntrenador;
    private String accionRival;
    private Pokemon pokemon;

    public Turno(int numeroTurno, String accionEntrenador, String accionRival, Pokemon pokemon) {
        this.numeroTurno = numeroTurno;
        this.accionEntrenador = accionEntrenador;
        this.accionRival = accionRival;
        this.pokemon = pokemon;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public String getAccionEntrenador() {
        return accionEntrenador;
    }

    public String getAccionRival() {
        return accionRival;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public String resumenTurno() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turno ").append(numeroTurno).append(": ");
        if (pokemon != null) {
            sb.append(pokemon.getNombre()).append(" ");
        }
        sb.append("Entrenador: ").append(accionEntrenador).append(", ");
        sb.append("Rival: ").append(accionRival);
        return sb.toString();
    }

    public enum Accion {
        ATACAR, CAMBIAR, USAR_OBJETO, RENDIRSE
    }
}

