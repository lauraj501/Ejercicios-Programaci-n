import java.util.Scanner;

public class DivisionPorCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        try {
            double resultado = dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            scanner.close();
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
