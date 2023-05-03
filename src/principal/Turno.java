package principal;

//Texto de lo ocurrido en dicho turno

public class Turno {
	private int numeroTurno;
	private String accionEntrenador;
	private String accionRival;
	private Pokemon pokemon;

	public Turno(int numeroTurno, String accionEntrenador, Pokemon pokemon) {
		this.numeroTurno = numeroTurno;
		this.accionEntrenador = accionEntrenador;
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

	public void setAccionEntrenador(String accionEntrenador) {
		this.accionEntrenador = accionEntrenador;
	}

	public void setAccionRival(String accionRival) {
		this.accionRival = accionRival;
	}

	public String resumenTurno() {
		StringBuilder sb = new StringBuilder();
		sb.append("Turno ").append(numeroTurno).append(": ");
		sb.append("Entrenador: ").append(accionEntrenador);
		if (accionRival != null) {
			sb.append(". Rival: ").append(accionRival);
		}
		if (pokemon != null) {
			sb.append(" ").append(pokemon.getNombre()).append(" ");
		}
		return sb.toString();
	}

	public enum Accion {
		ATACAR, CAMBIAR, USAR_OBJETO, RENDIRSE
	}
}
