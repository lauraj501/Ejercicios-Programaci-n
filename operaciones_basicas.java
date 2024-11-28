import java.util.Scanner;
public class operaciones_basicas 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese dos numeros");
        float numero1 = scanner.nextInt();
        float numero2 = scanner.nextInt();
        
        float suma = numero1 + numero2;
        System.out.println("el resultado de la suma es: " + suma);
        float resta = numero1 - numero2;
        System.out.println("el resultado de la resta es: " + resta);
        float multiplicacion = numero1 * numero2;
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
        float division = numero1 / numero2;
        System.out.println("el resultado de la division es: " + division);
        float modulo = numero1 % numero2;
        System.out.println("el resultado del modulo es: " + modulo);
        scanner.close();
    }
}
