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
        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_basedatos", "usuario", "contraseña");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create
    public void createPokemon(Pokemon pokemon) {
        try {
            String query = "INSERT INTO pokemon (IdPokemon, Nombre, Vitalidad, Ataque) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, pokemon.getIdPokemon());
            statement.setString(2, pokemon.getNombre());
            statement.setInt(3, pokemon.getVitalidad());
            statement.setInt(4, pokemon.getAtaque());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read
    public Pokemon getPokemonById(int id) {
        try {
            String query = "SELECT * FROM pokemon WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setIdPokemon(resultSet.getInt("id"));
                pokemon.setNombre(resultSet.getString("nombre"));
                pokemon.setVitalidad(resultSet.getInt("vitalidad"));
                pokemon.setAtaque(resultSet.getInt("ataque"));
                return pokemon;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Pokemon not found
    }

    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokemonList = new ArrayList<>();
        try {
            String query = "SELECT * FROM pokemon";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setIdPokemon(resultSet.getInt("id"));
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

    // Update
    public void updatePokemon(Pokemon updatedPokemon) {
        try {
            String query = "UPDATE pokemon SET nombre = ?, vitalidad = ?, ataque = ? WHERE id = ?";
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

    // Delete
    public void deletePokemon(int id) {
        try {
            String query = "DELETE FROM pokemon WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}