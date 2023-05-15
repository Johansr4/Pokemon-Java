package carga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Pokemon;
import modelo.TipoPokemon;

public class App {

	public static void main(String[] args) {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("Conexión establecida");
			mostrarPokemon(connection);

			Pokemon pikachu = new Pokemon();
			pikachu.setNumPokedex(26);
			pikachu.setNombre("RAICHU");
			pikachu.setTipo(TipoPokemon.ELÉCTRICO);
			
			insertarPokemon(connection, pikachu);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void mostrarPokemon(Connection con) throws SQLException {
		String pok = "Charizard";
		// String consulta = "SELECT * FROM POKEDEX";
		String consulta = "SELECT\r\n" + "	PX.NUM_POKEDEX,\r\n" + "	PX.NOM_POKEMON,\r\n" + "	PX.TIPO1,\r\n"
				+ "	PX.TIPO2,\r\n" + "	PX.IMG,\r\n" + "	PX.SONIDO,\r\n" + "	PK.ID_ENTRENADOR,\r\n"
				+ "	PK.ID_POKEMON,\r\n" + "	PK.MOTE,\r\n" + "	PK.SEXO,\r\n" + "	PK.NIVEL,\r\n"
				+ "	PK.VITALIDAD,\r\n" + "	PK.ATAQUE,\r\n" + "	PK.DEFENSA,\r\n" + "	PK.ATA_ESPECIAL,\r\n"
				+ "	PK.DEF_ESPECIAL,\r\n" + "	PK.VELOCIDAD,\r\n" + "	PK.ESTAMINA,\r\n" + "	PK.FERTILIDAD\r\n"
				+ "FROM POKEMON PK\r\n" + "INNER JOIN POKEDEX PX\r\n" + "ON PX.NUM_POKEDEX = PK.NUM_POKEDEX\r\n"
				+ "WHERE NOM_POKEMON='" + pok + "' " + ";";
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(consulta);

		// LinkedList<Pokemon> lista = null;

		Pokemon e;
		while (rs.next()) {
			e = new Pokemon();
			e.setNumPokedex(rs.getInt("num_pokedex"));
			e.setNombre(rs.getString("nom_pokemon"));
			e.setTipoPokemon(rs.getString("tipo1"));
			e.setTipoPokemon2(rs.getString("tipo2"));
			e.setIdEntrenador(rs.getInt("ID_ENTRENADOR"));
			e.setIdPokemon(rs.getInt("ID_POKEMON"));
			e.setMote(rs.getString("MOTE"));
			e.setSexo(rs.getString("SEXO").charAt(0));
			e.setNivel(rs.getInt("NIVEL"));
			e.setVitalidad(rs.getInt("VITALIDAD"));
			e.setAtaque(rs.getInt("ATAQUE"));
			e.setDefensa(rs.getInt("DEFENSA"));
			e.setAtaqueEspecial(rs.getInt("ATA_ESPECIAL"));
			e.setDefensaEspecial(rs.getInt("DEF_ESPECIAL"));
			e.setVelocidad(rs.getInt("VELOCIDAD"));
			e.setEstamina(rs.getInt("ESTAMINA"));
			e.setFertilidad(rs.getInt("FERTILIDAD"));

			// lista.add(e);
			System.out.println(e.toString());
		}
		statement.close();
	}

	/**
	 * 
	 * @param con
	 * @param p
	 * @throws SQLException
	 */
	public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
		String sentencia = "INSERT INTO POKEDEX(NUM_POKEDEX,NOM_POKEMON, TIPO1, TIPO2) VALUES(" + p.getNumPokedex()
				+ ",'" + p.getIdPokemon() + "','" + p.getTipo() + "','" + p.getTipo2() + "')";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(sentencia);

			System.out.println("Nuevo pokemon insertado. " + p.getIdPokemon());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
		}

	}
}
