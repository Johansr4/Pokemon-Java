package controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import modelo.Entrenador;
import modelo.Captura;

public class TiendaController {
	
	@FXML
	private Button btnTienda;
	
	
	@FXML
	private Label lblCompra;
	
	@FXML
	private Button btnSalirTien;
	
	@FXML
	public void btnSalir(ActionEvent event) {
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
	

	// Event Listener on Button[#btnTienda].onAction
	@FXML
	public void btnTiendaComprar(ActionEvent event) {
	Captura cap = new Captura();
	Entrenador en1= new Entrenador();
	cap.setPokeballs(cap.getPokeballs()+5);
	en1.setDinero(en1.getDinero()-10);
	lblCompra.setText("Has comprado pokeballs, ahora tienes "+ cap.getPokeballs());
	
	}
}
