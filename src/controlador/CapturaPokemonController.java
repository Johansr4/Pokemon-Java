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
import modelo.Pokemon;


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

	  private int seleccionAleatoria; // Variable de instancia para mantener el mismo número

	private boolean buscarRealizado = false;
	
	private void guardarPokemonCapturado() {
	    Pokemon pokemonCapturado = cap.getNuevoPokemon(); // Obtener el Pokémon capturado
	    PokemonCRUD pkCRUD = new PokemonCRUD();
	    pkCRUD.createPokemon(pokemonCapturado); // Guardar el Pokémon capturado en la base de datos
	}


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
	    cap.asignarPokemon(pk.readPokemonByPokedex(seleccionAleatoria));
	    lblPokemonCapturar.setText(null);
	    lblPokemonEncontrado.setText(cap.mostrarPokemon() + " apareció !!!");
	    buscarRealizado = true;

	    // Cargar imagen 
	    try {
	        
	        int randomIndex = seleccionAleatoria;
	        String imagePath = "img151/" + randomIndex + ".png";
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
	                txtmote.setVisible(true);
	                btnMote.setVisible(true);
	                Logger.write(cap.mostrarPokemon() + " fue capturado !!!");
	                
	                guardarPokemonCapturado(); // Guardar el Pokémon capturado en la base de datos
	            } else {
	                lblPokemonCapturar.setText(cap.mostrarPokemon() + " se ha escapado!");
	                buscarRealizado = true;
	            }
	        } else {
	            lblPokemonCapturar.setText("Debes buscar un Pokémon antes de capturar!");
	        }
	    } else {
	        lblPokemonCapturar.setText("No tienes pokeballs, compra más en la tienda");
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
	    	 seleccionAleatoria = (int) (Math.random() * 151) + 1; // Generar número aleatorio
	        txtmote.setVisible(false); // Hacer invisible el campo
	        btnMote.setVisible(false);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
