package controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MenuController {
	@FXML
	private Button btnMmochila;
	@FXML
	private Button btnMcaptura;
	@FXML
	private Button btnMentrenar;
	@FXML
	private Button btnMtienda;
	@FXML
	private Button btnMcaja;
	@FXML
	private Button btnMcombate;

	// Event Listener on Button[#btnMcaptura].onAction
	@FXML
	public void btnMcapturar(ActionEvent event) {
		try {
			Node sourceNode = (Node) event.getSource();
			Stage currentStage = (Stage) sourceNode.getScene().getWindow();
			currentStage.close();

			// Abrir la ventana 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/capturapokemon.fxml"));
			AnchorPane root = loader.load();
			Stage menuStage = new Stage();
			menuStage.setScene(new Scene(root));
			menuStage.setTitle("Captura");
			menuStage.show();
		} catch (IOException e) {

		}
	}
	
	
	@FXML
	public void btnAbrirCaja(ActionEvent event) {
		try {
			Node sourceNode = (Node) event.getSource();
			Stage currentStage = (Stage) sourceNode.getScene().getWindow();
			currentStage.close();

			// Abrir la ventana 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Caja.fxml"));
			AnchorPane root = loader.load();
			Stage menuStage = new Stage();
			menuStage.setScene(new Scene(root));
			menuStage.setTitle("Caja");
			menuStage.show();
		} catch (IOException e) {

		}
	}
}
