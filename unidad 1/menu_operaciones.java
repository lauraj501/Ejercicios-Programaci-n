import java.util.Scanner;
public class menu_operaciones 
{
    public static void main(String[] args) {
        System.out.println("CODIGO  OPERACION");
        System.out.println("  1       SUMA");
        System.out.println("  2       RESTA");
        System.out.println("  3       MULTIPLICACION");
        System.out.println("  4       DIVISION");
        Scanner scanner = new Scanner (System.in);
        System.out.print("ingrese el codigo");
        int codigo = scanner.nextInt();
        System.out.println("ingrese dos numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        switch (codigo) {
            case 1:
                int suma = num1 + num2;
                System.out.println("el resultado de la suma es:" + suma);
                break;
            case 2: 
                int resta = num1 - num2;
                System.out.println("el resultado de la resta es: " + resta);
                break;
            case 3:
                int multiplicacion = num1 * num2;
                System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
                break;
            case 4:
                if (num2 !=0) {
                    int division = num1 / num2;
                    System.out.println("el resultado de la division es: " + division);
                } else {
                    System.out.println("no es posible dividir por cero");
                }
                break;
            default:
            System.out.println("codigo no valido");
            break;
        }
        scanner.close();
    }
}
