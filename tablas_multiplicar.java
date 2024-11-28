import java.util.Scanner;
public class tablas_multiplicar 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("ingrese un numero");
        int numero = scanner.nextInt();
        for (int i = 1; i<=10; i++) {
            int tablas = numero * i; 
            System.out.println(numero + " x " + i + " = " + tablas);
        }
        scanner.close();
    }
}
