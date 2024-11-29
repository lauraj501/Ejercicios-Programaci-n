public class descuento
{
    public static void main(String[] args) {
     double Precio_camisa = 25;
     double Precio_pantalon = 30;
     double DescuentoInicial = 0.15;
     double DescuentoAdicional = 0.05;
     double  precioCamisaDescuento = Precio_camisa - (Precio_camisa * DescuentoInicial);
     double  precioPantalonDescuento = Precio_pantalon - (Precio_pantalon * DescuentoInicial);
     double Precio_Total1 = precioCamisaDescuento + precioPantalonDescuento;
     double precio_SegundaCamisa = precioCamisaDescuento - (precioCamisaDescuento * DescuentoAdicional);
     double Precio_Total2 = (Precio_Total1 + precio_SegundaCamisa); 
     System.out.println("precio total de un pantalon y una camisa es: $ " + Precio_Total1);
     System.out.println("precio total de un pantalon y dos camisas es: $ " + Precio_Total2);
        
    }
}
