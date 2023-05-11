package controlador;

import java.util.ArrayList;
import java.util.List;

public class PokemonCRUD {
    private int id;
    private String nombre;
    private String correo;

    // Constructor
    public PokemonCRUD(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para obtener todos los usuarios (Read)
    public static List<PokemonCRUD> obtenerUsuarios() {
        List<PokemonCRUD> usuarios = new ArrayList<>();

        // Simulación de datos de la base de datos
        usuarios.add(new PokemonCRUD(1, "Juan", "juan@example.com"));
        usuarios.add(new PokemonCRUD(2, "María", "maria@example.com"));
        usuarios.add(new PokemonCRUD(3, "Carlos", "carlos@example.com"));

        return usuarios;
    }

    // Método para agregar un nuevo usuario (Create)
    public static void agregarUsuario(PokemonCRUD usuario) {
        // Lógica para agregar el usuario a la base de datos
        // En este ejemplo, simplemente lo agregamos a la lista de usuarios
        List<PokemonCRUD> usuarios = obtenerUsuarios();
        usuarios.add(usuario);
    }

    // Método para actualizar un usuario existente (Update)
    public static void actualizarUsuario(PokemonCRUD usuarioActualizado) {
        // Lógica para actualizar el usuario en la base de datos
        // En este ejemplo, buscamos el usuario por su ID y actualizamos sus datos
        List<PokemonCRUD> usuarios = obtenerUsuarios();
        for (PokemonCRUD usuario : usuarios) {
            if (usuario.getId() == usuarioActualizado.getId()) {
                usuario.setNombre(usuarioActualizado.getNombre());
                usuario.setCorreo(usuarioActualizado.getCorreo());
                break;
            }
        }
    }

    // Método para eliminar un usuario existente (Delete)
    public static void eliminarUsuario(int idUsuario) {
        // Lógica para eliminar el usuario de la base de datos
        // En este ejemplo, buscamos el usuario por su ID y lo eliminamos de la lista
        List<PokemonCRUD> usuarios = obtenerUsuarios();
        for (PokemonCRUD usuario : usuarios) {
            if (usuario.getId() == idUsuario) {
                usuarios.remove(usuario);
                break;
            }
        }
    }

    // Método para mostrar los usuarios
    public static void mostrarUsuarios() {
        List<PokemonCRUD> usuarios = obtenerUsuarios();
        for (PokemonCRUD usuario : usuarios) {
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Correo: " + usuario.getCorreo());
            System.out.println("---------------------");
        }
    }

}