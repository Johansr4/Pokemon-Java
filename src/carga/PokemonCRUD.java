package carga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pokemon;

public class PokemonCRUD {
    private Connection connection;

    public PokemonCRUD() {
        ConexionBBDD conexionBBDD = new ConexionBBDD();
		connection = conexionBBDD.getConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public void createPokemon(Pokemon pokemon) {
        try {
            String query = "INSERT INTO pokemon (IdPokemon, Nombre, Vitalidad, mote) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, pokemon.getIdPokemon());
            statement.setString(2, pokemon.getNombre());
            statement.setInt(3, pokemon.getVitalidad());
            statement.setString(4, pokemon.getMote());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Pokemon readPokemonByPokedex(int id) {
        try {
            String query = "SELECT * FROM pokedex WHERE NumPokedex = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setNumPokedex(resultSet.getInt("NumPokedex"));
                pokemon.setNombre(resultSet.getString("nombre"));

                return pokemon;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Pokemon> readPokemonByIdEntrenador() {
        List<Pokemon> listaPokemon = new ArrayList<>();
        try {
            String query = "SELECT * FROM pokemon";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setNumPokedex(resultSet.getInt("NumPokedex"));
                pokemon.setNombre(resultSet.getString("nombre"));
                listaPokemon.add(pokemon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPokemon;
    }

    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokemonList = new ArrayList<>();
        try {
            String query = "SELECT * FROM pokemon";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setIdPokemon(resultSet.getInt("idPokemon"));
                pokemon.setNombre(resultSet.getString("nombre"));
                pokemon.setVitalidad(resultSet.getInt("vitalidad"));
                pokemon.setAtaque(resultSet.getInt("ataque"));
                pokemonList.add(pokemon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pokemonList;
    }

    public void updatePokemon(Pokemon updatedPokemon) {
        try {
            String query = "UPDATE pokemon SET nombre = ?, vitalidad = ?, ataque = ? WHERE idPokemon = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, updatedPokemon.getNombre());
            statement.setInt(2, updatedPokemon.getVitalidad());
            statement.setInt(3, updatedPokemon.getAtaque());
            statement.setInt(4, updatedPokemon.getIdPokemon());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePokemon(int id) {
        try {
            String query = "DELETE FROM pokemon WHERE idPokemon = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
