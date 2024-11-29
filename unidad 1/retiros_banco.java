public class retiros_banco
{
    public static void main(String[] args) {
        int saldoInicial = 1000;
        int retiroSemanal = 200;
        final int SemanasDelMes = 4; 
        int SaldoFinal = saldoInicial - (retiroSemanal * SemanasDelMes);
        System.out.println("El saldo final en la cuenta es: $" + SaldoFinal);
        
    }
}
