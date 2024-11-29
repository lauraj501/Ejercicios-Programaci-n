public class ValorModificado {
    public static int incrementar(int x) {
        x++;
        return x;
    }

    public static void main(String[] args) {
        int numero = 17;
        System.out.println("Valor de 'numero' antes de llamar al método: " + numero);

        int nuevoNumero = incrementar(numero);
        System.out.println("Valor de 'numero' después de llamar al método: " + numero);
        System.out.println("Valor de 'nuevoNumero' después de llamar al método: " + nuevoNumero);
    }
}
