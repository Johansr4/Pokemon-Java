package carga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBBDD {

    public Connection getConnection() {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/pokemon";
        String username = "root";
        String password = "";

        Connection connection = null;
        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void main(String[] args) {
        // Datos del usuario a comprobar
        String usuario = "root";
        String contraseña = "";

        // Consulta SQL para comprobar el usuario
        String query = "SELECT * FROM entrenador WHERE nombre = ? AND pass = ?";

        ConexionBBDD conexionBBDD = new ConexionBBDD();
        Connection connection = conexionBBDD.getConnection();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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
