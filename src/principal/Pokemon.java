package principal;



import java.util.ArrayList;


public class Pokemon {

private String nombre;

private String mote;

private int vitalidad;

private int ataque;

private int defensa;

private int ataqueEspecial;

private int defensaEspecial;

private int velocidad;

private int estamina;

private int nivel;

private int fertilidad;

private char sexo;




private ArrayList<String> movimientos;

private ArrayList<String> tipos;





public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial,

int velocidad, int estamina, char sexo, ArrayList<String> movimientos, ArrayList<String> tipos) {

this.nombre = nombre;

this.mote = mote;

this.vitalidad = vitalidad;

this.ataque = ataque;

this.defensa = defensa;

this.ataqueEspecial = ataqueEspecial;

this.defensaEspecial = defensaEspecial;

this.velocidad = velocidad;

this.estamina = estamina;

this.nivel = 1;

this.fertilidad = 5;

this.sexo = sexo;

this.movimientos = movimientos;

this.tipos = tipos;

}



public String getNombre() {

return nombre;

}



public void setNombre(String nombre) {

this.nombre = nombre;

}



public String getMote() {

return mote;

}



public void setMote(String mote) {

this.mote = mote;

}



public int getVitalidad() {

return vitalidad;

}



public void setVitalidad(int vitalidad) {

this.vitalidad = vitalidad;

}



public int getAtaque() {

return ataque;

}



public void setAtaque(int ataque) {

this.ataque = ataque;

}



public int getDefensa() {

return defensa;

}



public void setDefensa(int defensa) {

this.defensa = defensa;

}



public int getAtaqueEspecial() {

return ataqueEspecial;

}



public void setAtaqueEspecial(int ataqueEspecial) {

this.ataqueEspecial = ataqueEspecial;

}



public int getDefensaEspecial() {

return defensaEspecial;

}


public void setDefensaEspecial(int defensaEspecial) {

this.defensaEspecial = defensaEspecial;

}



public int getVelocidad() {

return velocidad;

}



public void setVelocidad(int velocidad) {

this.velocidad = velocidad;

}



public int getEstamina() {

return estamina;

}



public void setEstamina(int estamina) {

this.estamina = estamina;

}



public int getNivel() {

return nivel;

}



public void setNivel(int nivel) {

this.nivel = nivel;

}


public int getFertilidad() {

return fertilidad;

}



public void setFertilidad(int fertilidad) {

this.fertilidad = fertilidad;

}



public char getSexo() {

return sexo;

}



public void setSexo(char sexo) {

this.sexo = sexo;

}



public ArrayList<Movimiento> getMovimientos;



public void setMovimientos(ArrayList<String> movimientos) {

this.movimientos = movimientos;

}



public ArrayList<String> getTipos() {

return tipos;

}



public void setTipos(ArrayList<String> tipos) {

this.tipos = tipos;

}



public void incrementarNivel() {

nivel++;

}



public int resultadoFertilidad() {

 {

 return fertilidad+= (int)(Math.random() * 5) + 1;

}
}



public void atacar(Pokemon enemigo, Movimiento movimiento) {

// Aquí implementar la lógica de combate entre dos Pokemones usando el movimiento indicado

// y actualizando sus respectivas estadísticas

}



public void reproducirse(Pokemon pareja) {

if (fertilidad > 0 && pareja.getFertilidad() > 0) {

fertilidad--;



// Aquí implementar la lógica de cría entre dos Pokemones, generando un huevo

}

}



public boolean esMasRapidoQue(Pokemon otroPokemon) {

return velocidad > otroPokemon.getVelocidad();

}

}










