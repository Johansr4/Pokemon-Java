package controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import carga.PokemonCRUD;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Captura;

import java.io.File;

import carga.*;
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
	private TextField txtmote;

	@FXML
	private Button btnsalir;

	@FXML
	private Button btnMote;
	
	@FXML
	private ImageView imgCap;
	

	private Captura cap = new Captura();
	
	PokemonCRUD pk = new PokemonCRUD();

	int seleccionAleatoria = (int) (Math.random() * 151) + 1;

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
	    cap.asignarPokemon(pk.readPokemonById(seleccionAleatoria));
	    lblPokemonCapturar.setText(null);
	    lblPokemonEncontrado.setText(cap.mostrarPokemon() + " apareció !!!");
	    buscarRealizado = true;

	    // Cargar imagen 
	    try {
	        
	        int randomIndex = seleccionAleatoria;
	        String imagePath = "img151/1.png";
	        File file = new File (imagePath);


	        Image image = new Image(file.toURI().toString());
	        imgCap.setImage(image);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	

	
	
	@FXML
	public void capturar(ActionEvent event) {
		lblPokemonEncontrado.setText(null);

		if (cap.comprobarPokeball()) {

			if (buscarRealizado) {
				if (cap.capturarPokemon()) {
					
					lblPokemonCapturar.setText(cap.mostrarPokemon() + " fue capturado!");
					buscarRealizado = false;
					txtmote.setDisable(false);
					btnBuscar.setDisable(true);

					txtmote.setVisible(true); // Hacer visible el campo
					btnMote.setVisible(true);
					
					 Logger.write(cap.mostrarPokemon()+" fue capturado !!!");
					 
					

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

	public void btnPonerMote(ActionEvent event) {
		  String mote = txtmote.getText(); // Obtener el texto del TextField
          boolean resultado = cap.agregarCajaMote(mote); // Llamar a agregarCajaMote() con el mote obtenido
          btnMote.setVisible(false);
	}

	public void initialize() {
	    try {

	        txtmote.setVisible(false); // Hacer invisible el campo
	        btnMote.setVisible(false);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
