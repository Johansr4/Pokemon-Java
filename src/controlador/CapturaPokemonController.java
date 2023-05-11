package controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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

	@FXML
	private Button btnsalir;

	private Captura cap = new Captura();

	private boolean buscarRealizado = false;

	@FXML
	public void SalirCaptura(ActionEvent event) {
		try {
			Node sourceNode = (Node) event.getSource();
			Stage currentStage = (Stage) sourceNode.getScene().getWindow();
			currentStage.close();

			// Abrir la ventana
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/menu.fxml"));
			AnchorPane root = loader.load();
			Stage menuStage = new Stage();
			menuStage.setScene(new Scene(root));
			menuStage.setTitle("Menú");
			menuStage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

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
		} else {
			lblPokemonCapturar.setText("No tienes pokeballs, compra mas en la tienda");
			buscarRealizado = false;
		}
	}
}
