import java.util.Scanner;

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes para realizar el retiro.");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}

public class simulacionBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(55000.0); 

        System.out.println("Saldo disponible: " + cuenta.getSaldo());
        System.out.print("Ingresa la cantidad que deseas retirar: ");
        double cantidadRetiro = scanner.nextDouble();

        try {
            cuenta.retirar(cantidadRetiro);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
