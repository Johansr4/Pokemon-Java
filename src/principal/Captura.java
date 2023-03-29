package principal;

import java.util.Random;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Captura extends JFrame {

	private ArrayList<String> palabrasProhibidas;
	private Pokemon nuevoPokemon;
	private ArrayList<Pokemon> cajaPokemon;
	private JPanel panel;
	private JLabel imagenPokemon;
	private JButton botonRandom;
	private JButton botonCapturar;
	private JTextField campoMote;

	public Captura() {
		super("Captura de Pokemon");

		palabrasProhibidas = new ArrayList<String>();
		palabrasProhibidas.add("Pene");
		// Agrega aquí todas las palabras prohibidas

		cajaPokemon = new ArrayList<Pokemon>();

		panel = new JPanel();
		imagenPokemon = new JLabel();
		botonRandom = new JButton("Random");
		botonRandom.addActionListener(e -> generarPokemonAleatorio());
		botonCapturar = new JButton("Capturar");
		botonCapturar.addActionListener(e -> capturarPokemon());
		campoMote = new JTextField(15);

		panel.add(imagenPokemon);
		panel.add(botonRandom);
		panel.add(botonCapturar);
		panel.add(campoMote);

		add(panel);

		setSize(400, 300);
		setVisible(true);
	}

	private void generarPokemonAleatorio() {
		Random random = new Random();
		String[] nombresPokemon = { "Pikachu" };
		String nombre = nombresPokemon[random.nextInt(nombresPokemon.length)];
		int nivel = 1;
		nuevoPokemon = new Pokemon(nombre, nivel);
		actualizarImagenPokemon();
	}

	private void actualizarImagenPokemon() {
		imagenPokemon.setText(nuevoPokemon.getNombre());
	}

	private void capturarPokemon() {
		if (nuevoPokemon == null) {
			return;
		}
		
	}
		
	

