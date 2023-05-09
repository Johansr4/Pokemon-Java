package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import modelo.Captura;

public class CapturaPokemonController {
	@FXML
	private Button btnCapturar;
	@FXML
	private Button btnBuscar;
	@FXML
	private Label lblPokemonCapturar;
	@FXML
	private Label lblPokemonEncontrado;

	private Captura cap = new Captura();

	private boolean buscarRealizado = false;

	@FXML
	public void buscar(ActionEvent event) {
		lblPokemonCapturar.setText(null);
		lblPokemonEncontrado.setText(cap.mostrarPokemon() + " apareció !!!");
		buscarRealizado = true;
	}

	@FXML
	public void capturar(ActionEvent event) {
		lblPokemonEncontrado.setText(null);

		if (cap.comprobarPokeball()) {

			if (buscarRealizado) {
				if (cap.capturarPokemon()) {
					lblPokemonCapturar.setText(cap.mostrarPokemon() + " fue capturado!");
					buscarRealizado = false;

				} else {

					lblPokemonCapturar.setText(cap.mostrarPokemon() + " se ha escapado!");
					buscarRealizado = true;
				}
			} else {
				// Acción cuando se intenta capturar sin haber buscado primero
				lblPokemonCapturar.setText(" Debes buscar un Pokémon antes de capturar!");
			}
		}else {
			lblPokemonCapturar.setText("No tienes pokeballs, compra mas en la tienda");
			buscarRealizado = false;
		}
	}
}
