import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese tres numeros");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float media = (num1 + num2 + num3)/3;
        System.out.print("la media de los numeros ingresados es: " + media);
        scanner.close();
    }
}
