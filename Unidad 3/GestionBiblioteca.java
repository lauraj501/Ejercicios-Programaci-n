import java.io.*;
import java.util.*;

public class GestionBiblioteca {

    private static final String FILE_NAME = "libros.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nGestión de Libros");
            System.out.println("1. Añadir libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Listar libros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            //Opciones
            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    searchBook(scanner);
                    break;
                case 3:
                    listBooks();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Función para añadir un libro
    private static void addBook(Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        String title = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String author = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(title + "," + author);
            writer.newLine();
            System.out.println("Libro añadido exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el libro: " + e.getMessage());
        }
    }

    // Función para buscar un libro por su título
    private static void searchBook(Scanner scanner) {
        System.out.print("Ingrese el título del libro a buscar: ");
        String title = scanner.nextLine();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equalsIgnoreCase(title)) {
                    System.out.println("Libro encontrado: Título: " + parts[0] + ", Autor: " + parts[1]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Libro no encontrado.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Función para listar todos los libros
    private static void listBooks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Título: " + parts[0] + ", Autor: " + parts[1]);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
