public class Pares
{
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
          if (i % 2 ==0) {
              contador++;
            }
        }
    System.out.print("los numeros pares entre 1 y 100 son: " + contador);
    }
}
