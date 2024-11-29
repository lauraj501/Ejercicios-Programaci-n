import java.io.*;
import java.util.Scanner;

public class notas {
    private static final String NOMBRE_ARCHIVO = "notas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Ingrese una nota (o 'salir' para terminar): ");
            String nota = scanner.nextLine();

            if (nota.equalsIgnoreCase("salir")) {
                break;
            }

            guardarNota(nota);
            mostrarNotas();

            System.out.println("¿Desea ingresar otra nota? (si/no): ");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("si"));

        scanner.close();
    }

    private static void guardarNota(String nota) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            writer.write(nota);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la nota: " + e.getMessage());
        }
    }

    private static void mostrarNotas() {
        System.out.println("Notas guardadas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer las notas: " + e.getMessage());
        }
    }
}