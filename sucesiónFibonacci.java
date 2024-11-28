public class sucesiónFibonacci {
    public static void fibonacci(int numero) {
        int numero1 = 0, numero2 = 1; 
        System.out.print("Sucesión de Fibonacci: " + numero1);

        for (int i = 1; i < numero; i++) {
            System.out.print(", " + numero2);
            numero2 = numero1 + numero2; 
            numero1 = numero2 - numero1; 
        }
    }

    public static void main(String[] args) {
        fibonacci(50); 
    }
}

