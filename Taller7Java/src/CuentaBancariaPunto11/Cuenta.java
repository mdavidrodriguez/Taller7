package CuentaBancariaPunto11;

public class Cuenta {

    private int numCuenta;
    private String nombreCliente;
    double saldo = 2000;

    public Cuenta(int numCuenta, String nombreCliente, double saldo) {
        this.numCuenta = numCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;

    }

    /**
     * @return the numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nNumero de cuenta: " + this.numCuenta
                + "\nNombre del cliente: " + this.nombreCliente
                + "\nSaldo: " + this.saldo;
    }

}
