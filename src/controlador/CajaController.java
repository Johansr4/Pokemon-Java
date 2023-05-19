package controlador;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Entrenador;
import modelo.Pokemon;
import carga.PokemonCRUD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import com.mysql.cj.xdevapi.Statement;




public class CajaController  {
	@FXML
    private Button btnSalirCaja;

    @FXML
    private TableView<Pokemon> tblCaja;

    @FXML
    private TableColumn<Pokemon, String> CajaPokemon;

    @FXML
    private TableColumn<Pokemon, Integer> EquipoPokemon;

    private PokemonCRUD pokemonCRUD = new PokemonCRUD();

    @FXML
    public void initialize() throws SQLException {
        CajaPokemon.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        EquipoPokemon.setCellValueFactory(new PropertyValueFactory<>("idPokemon"));

        cargarDatos();
    }

    private void cargarDatos() throws SQLException {
        List<Pokemon> listaPokemon = pokemonCRUD.readPokemonByIdEntrenador();
		ObservableList<Pokemon> data = FXCollections.observableArrayList(listaPokemon);
		tblCaja.setItems(data);
    }
    
    

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
            e.printStackTrace();
        }
    }

   
}
