import java.util.Scanner;
public class Primo {
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
