import java.util.Scanner;
public class datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.print("ingrese su edad");
        int edad = scanner.nextInt();
        System.out.print("ingrese su estatura");
        float estatura = scanner.nextFloat();
        System.out.println("hola, " + nombre + " tu edad es " + edad + " años y mides "+ estatura + " metros");
        scanner.close();
    }
}
