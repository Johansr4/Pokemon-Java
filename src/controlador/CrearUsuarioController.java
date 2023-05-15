package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrearUsuarioController {

	
	
    @FXML
    private TextField TxtUsuario;
    @FXML
    private TextField TxtUsuario1;

    // Event Listener on Button[#BtnUsuario].onAction
    @FXML
    public void pulsarBtnUsuario(ActionEvent event) {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/pokemon";
        String username = "root";
        String password = "";

        // Consulta SQL para comprobar el usuario
        String query = "SELECT * FROM entrenador WHERE nombre = ? AND pass = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            // Obtener los datos del usuario y contraseña ingresados
            String usuario = TxtUsuario1.getText();
            String contraseña = TxtUsuario.getText();

            // Configurar los parámetros de la consulta
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Comprobar si se encontró algún resultado
            if (rs.next()) {
           // CORRECTO

                // Cerrar la ventana actual
                Node sourceNode = (Node) event.getSource();
                Stage currentStage = (Stage) sourceNode.getScene().getWindow();
                currentStage.close();

                // Abrir la ventana del menú
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Menu.fxml"));
                AnchorPane root = loader.load();
                Stage menuStage = new Stage();
                menuStage.setScene(new Scene(root));
                menuStage.setTitle("Menú");
                menuStage.show();
            } else {
                //INCORRECTO
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
