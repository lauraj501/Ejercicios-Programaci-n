import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionLista {
    public static void main(String[] args) {
        List<String> listaElementos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        listaElementos.add("Harry potter");
        listaElementos.add("Divergente");
        listaElementos.add("Los juegos del hambre");

        do {
            System.out.println("\nGestión de Lista de Elementos");
            System.out.println("1. Mostrar elementos");
            System.out.println("2. Acceder a un elemento por índice");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elementos en la lista:");
                    for (int i = 0; i < listaElementos.size(); i++) {
                        System.out.println(i + ": " + listaElementos.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Ingresa el índice del elemento que deseas acceder: ");
                    int indice = scanner.nextInt();
                    try {
                        String elemento = listaElementos.get(indice);
                        System.out.println("Elemento en el índice " + indice + ": " + elemento);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: Índice fuera de los límites de la lista.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
