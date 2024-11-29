import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Email: " + email;
    }
}

public class GestionUsuarios {
    private static final List<Usuario> usuarios = new ArrayList<>();
    private static int contadorId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gestión de Usuarios ---");
            System.out.println("1. Añadir Usuario");
            System.out.println("2. Eliminar Usuario");
            System.out.println("3. Actualizar Usuario");
            System.out.println("4. Mostrar Usuarios");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> agregarUsuario(scanner);
                case 2 -> eliminarUsuario(scanner);
                case 3 -> actualizarUsuario(scanner);
                case 4 -> mostrarUsuarios();
                case 5 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static void agregarUsuario(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(contadorId++, nombre, email);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario añadido con éxito.");
    }

    private static void eliminarUsuario(Scanner scanner) {
        System.out.print("ID del usuario a eliminar: ");
        int id = scanner.nextInt();

        Usuario usuarioAEliminar = buscarUsuarioPorId(id);
        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar);
            System.out.println("Usuario eliminado con éxito.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private static void actualizarUsuario(Scanner scanner) {
        System.out.print("ID del usuario a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        Usuario usuarioAActualizar = buscarUsuarioPorId(id);
        if (usuarioAActualizar != null) {
            System.out.print("Nuevo Nombre: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Nuevo Email: ");
            String nuevoEmail = scanner.nextLine();

            usuarioAActualizar.setNombre(nuevoNombre);
            usuarioAActualizar.setEmail(nuevoEmail);

            System.out.println("Usuario actualizado con éxito.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private static void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("\n--- Lista de Usuarios ---");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    private static Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}