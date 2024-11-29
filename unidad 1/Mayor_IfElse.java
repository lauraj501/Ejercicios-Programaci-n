import java.util.Scanner;
public class Mayor_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese tres numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.print("el numero mayor es "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("el numero mayor es "+ num2);
        } else { 
            System.out.print("el numero mayor es "+ num3);
        }
        scanner.close();
    }
}
