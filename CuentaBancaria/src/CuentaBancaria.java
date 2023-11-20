import java.util.Scanner;


public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private String email;
    private String numeroTelefono;

    public CuentaBancaria(String numeroCuenta, double saldo, String nombreCliente, String email, String numeroTelefono) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    // Métodos getters y setters

    public String mostrarNumeroCuenta() {
        return numeroCuenta;
    }
    public void cambiarNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double mostrarSaldo() {
        return saldo;
    }
    public void cambiarSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String mostrarNombreCliente() {
        return nombreCliente;
    }
    public void cambiarNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String mostrarEmail() {
        return email;
    }
    public void cambiarEmail(String email) {
        this.email = email;
    }
    public String mostrarNumeroTelefono() {
        return numeroTelefono;
    }
    public void cambiarNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    // metodos adicionales
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            
            System.out.println("Depósito realizado: C$" + monto);
            System.out.println("Su saldo es: C$"  +saldo);
        } else {
            System.out.println("Monto de depósito no válido.");
        }
    }
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
           
            System.out.println("Retiro realizado: C$" + monto);
            System.out.println("Su saldo es: C$"  +saldo);
        } else {
            System.out.println("Monto de retiro no válido por fondos insuficientes.");
        }
    }
}
