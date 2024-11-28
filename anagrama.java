import java.util.Arrays;
import java.util.Scanner;
public class anagrama {

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Ignorar mayúsculas y minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Si las palabras son exactamente iguales, no son anagramas
        if (palabra1.equals(palabra2)) {
            return false;
        }

        // Convertir las palabras a arreglos de caracteres
        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();

        // Ordenar los arreglos
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparar los arreglos ordenados
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la primera palabra");
        String palabra1 = scanner.nextLine();
        System.out.println("ingresa la segunda palabra");
        String palabra2 = scanner.nextLine();

        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");
        }
        scanner.close();
    }
}
