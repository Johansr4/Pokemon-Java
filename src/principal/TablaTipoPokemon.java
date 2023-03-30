package principal;

import java.util.ArrayList;

public class TablaTipoPokemon {

    public double[][] efectividadesPokemon;

    public TablaTipoPokemon() {
        this.rellenarDatosEfectividades();
    }

    private void rellenarDatosEfectividades() {
        //
        double[][] efectividadesPokemon = {
                /*
                 * ACERO AGUA BICHO DRAGON ELÉC FANT FUEGO HADA HIELO LUCHA NORMAL PLANTA PSI
                 * ROCA SINIE TIERRA VENENO VOLADOR
                 */
                { 0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 }, // ACERO
                { 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1 }, // AGUA
                { 0.5, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.5 }, // BICHO
                { 0.5, 1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // DRAGÓN
                { 1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2 }, // ELÉCTRICO
                { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1 }, // FANTASMA
                { 2, 0.5, 2, 0.5, 1, 1, 0.5, 1, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1 }, // FUEGO
                { 0.5, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0.5, 1 }, // HADA
                { 0.5, 0.5, 1, 2, 1, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2 }, // HIELO
                { 2, 1, 0.5, 1, 1, 0, 1, 0.5, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5 }, // LUCHA
                { 0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1 }, // NORMAL
                { 0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5 }, // PLANTA
                { 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1 }, // PSÍQUICO
                { 0.5, 1, 2, 1, 1, 1, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2 }, // ROCA
                { 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1 }, // SINIESTRO
                { 2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0 }, // TIERRA
                { 0, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1 }, // VENENO
                { 0.5, 1, 2, 1, 0.5, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1 } // VOLADOR
        };

        this.efectividadesPokemon = efectividadesPokemon;
    }

    private TipoPokemon getTipoPokemonAt(int index) {
        if (index >= 0 && index < TipoPokemon.values().length) {
            return TipoPokemon.values()[index];
        }
        return null;
    }

    /**
     * Debilidades del tipo pasado
     *
     * @param tipo
     * @return
     */
    public ArrayList<TipoPokemon> debilidades(TipoPokemon tipo) {

        ArrayList<TipoPokemon> debilidades = new ArrayList<>();

        for (int i = 0; i < efectividadesPokemon.length; i++) {

            if (efectividadesPokemon[i][tipo.getIndice()] == EficaciasPokemon.VENTAJA.getEficacia()) {
                debilidades.add(this.getTipoPokemonAt(i));
            }

        }

        return debilidades;

    }

    /**
     * Debilidades comunes de los tipos pasados
     *
     * @param tipo1
     * @param tipo2
     */
    public ArrayList<TipoPokemon> debilidades(TipoPokemon tipo1, TipoPokemon tipo2) {

        double efectividadFinal = 0;
        ArrayList<TipoPokemon> debilidades = new ArrayList<>();

        for (int i = 0; i < efectividadesPokemon.length; i++) {

            efectividadFinal = efectividadesPokemon[i][tipo1.getIndice()]
                    * efectividadesPokemon[i][tipo2.getIndice()];

            if (efectividadFinal >= EficaciasPokemon.VENTAJA.getEficacia()) {
                debilidades.add(this.getTipoPokemonAt(i));
            }
        }

        return debilidades;

    }

    /**
     * Eficacias del tipo pasado
     *
     * @param tipo
     */
    public ArrayList<TipoPokemon> eficacias(TipoPokemon tipo) {

        ArrayList<TipoPokemon> eficacias = new ArrayList<>();

        for (int j = 0; j < efectividadesPokemon.length; j++) {

            if (efectividadesPokemon[tipo.getIndice()][j] == EficaciasPokemon.VENTAJA.getEficacia()) {
                eficacias.add(this.getTipoPokemonAt(j));
            }

        }

        return eficacias;

    }

    /**
     * Informacion del tipo pasado
     *
     * @param tipo
     */
    public String infoTipo(TipoPokemon tipo) {

        String resultado = "";
        for (int j = 0; j < efectividadesPokemon.length; j++) {
            resultado += this.getTipoPokemonAt(j) + " " + mostrarEficacia(efectividadesPokemon[tipo.getIndice()][j]);
        }
        return resultado;

    }

    /**
     * Mensaje Eficacia
     *
     * @param eficacia
     * @return
     */
    private String mostrarEficacia(double eficacia) {

        for (EficaciasPokemon eficaciaPokemon : EficaciasPokemon.values()) {
            if (eficaciaPokemon.getEficacia() == eficacia) {
                return eficaciaPokemon.getMensaje();
            }
        }

        return null;

    }

    /**
     * Muestra la eficacia de un tipo a otro tipo
     *
     * @param tipoAtacante
     * @param tipoOponente
     */
    public String mostrarEficaciaTipo(TipoPokemon tipoAtacante, TipoPokemon tipoOponente) {
        return mostrarEficacia(efectividadesPokemon[tipoAtacante.getIndice()][tipoOponente.getIndice()]);
        
    }

    /**
     * Muestra la eficacia de un tipo a un pokemon con dos tipos
     *
     * @param tipoAtacante
     * @param tipo1ponente
     * @param tipo2ponente
     */
    public String mostrarEficaciaTipo(TipoPokemon tipoAtacante, TipoPokemon tipo1ponente, TipoPokemon tipo2ponente) {
        // multiplico las efectivadades
        double efectividad = efectividadesPokemon[tipoAtacante.getIndice()][tipo1ponente.getIndice()]
                * efectividadesPokemon[tipoAtacante.getIndice()][tipo2ponente.getIndice()];
        return mostrarEficacia(efectividad);
    }

    public double[][] getEfectividadesPokemon() {
        return efectividadesPokemon;
    }

}