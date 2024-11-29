public class ModificarArray {
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3; // Duplicar cada elemento del array
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Contenido del array antes de modificar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        modificarArray(numeros);

        System.out.println("Contenido del array después de modificar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

