package controlador;

import carga.PokemonCRUD;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			// Parent root = FXMLLoader.load(getClass().getResource("/vista/CapturaPokemon.fxml"));
			 
			 Parent root = FXMLLoader.load(getClass().getResource("/vista/crearusuario.fxml"));
			
			//Parent root = FXMLLoader.load(getClass().getResource("/vista/menu.fxml"));
			
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("Bienvenido");

			// Agregar ícono

			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icono/iconPk.png")));

			primaryStage.setScene(scene);
			primaryStage.show();
			
			PokemonCRUD pokeprueba = new PokemonCRUD();
			
			//System.out.println(pokeprueba.readPokemonByPokedex(1));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
