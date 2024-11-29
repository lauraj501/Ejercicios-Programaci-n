public class ModificarObjeto {
    private int ancho;
    private int alto;

    public ModificarObjeto(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void modificarRectangulo(ModificarObjeto r) {
        r.ancho = 50;
        r.alto = 25;
    }

    public void mostrarDimensiones() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }

    public static void main(String[] args) {
        ModificarObjeto r = new ModificarObjeto(15, 20);
        System.out.println("Dimensiones antes de modificar:");
        r.mostrarDimensiones();

        r.modificarRectangulo(r);
        System.out.println("Dimensiones después de modificar:");
        r.mostrarDimensiones();
    }
}
