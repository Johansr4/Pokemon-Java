package controlador;

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
			Parent root = FXMLLoader.load(getClass().getResource("/vista/CapturaPokemon.fxml"));
			// Parent root =
			// FXMLLoader.load(getClass().getResource("/vista/CrearUsuario.fxml"));
			
			
			Scene scene = new Scene(root);
			primaryStage.setTitle("Captura Pokemon");
			// Agregar ícono

			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icono/iconPk.png")));

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
