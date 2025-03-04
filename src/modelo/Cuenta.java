package modelo;

public class Cuenta {
    private String idCuenta;
    private Cliente cliente;
    private double saldo;

    public Cuenta(String idCuenta, Cliente cliente) {
        this.idCuenta = idCuenta;
        this.cliente = cliente;
        this.saldo = 0.0; // Saldo inicial es 0
    }

    // Getters y Setters
    public String getIdCuenta() {
        return idCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }
}