public class Intercambiar {
    public static void intercambiar(int x, int y) {
        System.out.println("Antes del intercambio: x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Después del intercambio: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 19;

        System.out.println("Antes de llamar al método intercambiar: a = " + a + ", b = " + b);

        intercambiar(a, b);

        System.out.println("Después de llamar al método intercambiar: a = " + a + ", b = " + b);
    }
}
