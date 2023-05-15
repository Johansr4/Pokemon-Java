package controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Entrenador;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;

public class CajaController {
	@FXML
	private Button btnSalirCaja;
	@FXML
	private TableColumn<?, ?> TableV1;
	
	
	Entrenador en1 = new Entrenador();
	
	
	
	@FXML
	private TableView<Entrenador> TblCaja;
	
	
	



	// Event Listener on Button[#btnSalirCaja].onAction
	@FXML
	public void btnSalirCaja(ActionEvent event) {
		try {
			Node sourceNode = (Node) event.getSource();
			Stage currentStage = (Stage) sourceNode.getScene().getWindow();
			currentStage.close();

			// Abrir la ventana
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/menu.fxml"));
			AnchorPane root = loader.load();
			Stage menuStage = new Stage();
			menuStage.setScene(new Scene(root));
			menuStage.setTitle("Menu");
			menuStage.show();
		} catch (IOException e) {

		}
	}
}