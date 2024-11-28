import java.util.Scanner;
public class factorial_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("ingrese un numero");
        int numero = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
     System.out.println("el factorial de " + numero + " es " + factorial);
     scanner.close();
    }
}
