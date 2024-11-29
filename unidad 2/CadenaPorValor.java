public class CadenaPorValor {
    public static void modificarCadena(String texto) {
        texto = "Buenasss Modificado";
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String mensaje = "Buenasss";
        System.out.println("Antes de llamar al método: " + mensaje);

        modificarCadena(mensaje);
        System.out.println("Después de llamar al método: " + mensaje);
    }
}
