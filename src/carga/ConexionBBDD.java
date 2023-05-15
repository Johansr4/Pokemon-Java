package carga;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConexionBBDD {

    public static void main(String[] args) {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/pokemon";
        String username = "root";
        String password = "";

        // Consulta SQL para comprobar el usuario
        String query = "SELECT * FROM usuario WHERE nombre_usuario = ? AND contraseña = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            // Datos del usuario a comprobar
            String usuario = "root";
            String contraseña = "";

            // Configurar los parámetros de la consulta
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Comprobar si se encontró algún resultado
            if (rs.next()) {
                System.out.println("El usuario y contraseña son correctos.");
            } else {
                System.out.println("El usuario y/o contraseña son incorrectos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
