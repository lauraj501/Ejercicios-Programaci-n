import java.util.Scanner;
public class operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese tres numeros");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        boolean resultado = (num1 > num2) && (num1 < num3);
        System.out.println("¿el primer numero es mayor que el segundo y menor que el tercero? " + resultado);
        scanner.close();
    }
}
