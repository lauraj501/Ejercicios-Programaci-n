import java.util.Scanner;

public class Area {

    public static double calcularArea(String tipoPoligono, double... dimensiones) {
        double area;

        switch (tipoPoligono.toLowerCase()) {
            case "triangulo":
                if (dimensiones.length != 2) {
                    throw new IllegalArgumentException("El triángulo requiere base y altura como parámetros.");
                }
                area = (dimensiones[0] * dimensiones[1]) / 2;
                break;
            case "cuadrado":
                if (dimensiones.length != 1) {
                    throw new IllegalArgumentException("El cuadrado requiere un solo parámetro (lado).");
                }
                area = dimensiones[0] * dimensiones[0];
                break;
            case "rectangulo":
                if (dimensiones.length != 2) {
                    throw new IllegalArgumentException("El rectángulo requiere base y altura como parámetros.");
                }
                area = dimensiones[0] * dimensiones[1];
                break;
            default:
                throw new IllegalArgumentException("Tipo de polígono no válido.");
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Qué tipo de polígono desea calcular? (Triángulo, Cuadrado, Rectángulo): ");
        String tipoPoligono = scanner.nextLine();

        double[] dimensiones = new double[2];

        switch (tipoPoligono.toLowerCase()) {
            case "triangulo":
                System.out.print("Ingrese la base del triángulo: ");
                dimensiones[0] = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                dimensiones[1] = scanner.nextDouble();
                break;
            case "cuadrado":
                System.out.print("Ingrese el lado del cuadrado: ");
                dimensiones[0] = scanner.nextDouble();
                break;
            case "rectangulo":
                System.out.print("Ingrese la base del rectángulo: ");
                dimensiones[0] = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                dimensiones[1] = scanner.nextDouble();
                break;
            default:
                System.out.println("Tipo de polígono no válido.");
                scanner.close();
                return;
        }

        try {
            double area = calcularArea(tipoPoligono, dimensiones);
            System.out.println("El área del " + tipoPoligono.toLowerCase() + " es: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
