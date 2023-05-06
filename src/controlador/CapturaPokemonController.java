package controlador;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import modelo.Pokemon;

public class CapturaPokemonController {
	@FXML
	private Button btnCapturar;
	@FXML
	private Button btnBuscar;
	@FXML
	private Label lblPokemonCapturar;

	// Event Listener on Button[#btnCapturar].onAction
	@FXML
	public void capturar(ActionEvent event) {
		
	}
	// Event Listener on Button[#btnBuscar].onAction
	@FXML
	public void buscar(ActionEvent event) {
		
		Pokemon pokemon= new Pokemon();
		lblPokemonCapturar.setText("Acabas de cruzarte con un "+pokemon.getNombre()+" salvaje, capturalo!!!");
	
	}
}
