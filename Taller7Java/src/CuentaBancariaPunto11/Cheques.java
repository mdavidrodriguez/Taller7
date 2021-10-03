package CuentaBancariaPunto11;

public class Cheques extends Cuenta {

    private int comisionUso;
    private int comisionSaldoInsuficiente;

    public Cheques(int numCuenta, String nombreCliente, double saldo, int comisionUso, int comisionSaldoInsuficiente) {
        super(numCuenta, nombreCliente, saldo);
        this.comisionUso = comisionUso;
        this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;

    }

    public Cheques(int numCuenta, String nombreCliente, double saldo) {
        super(numCuenta, nombreCliente, saldo);
    }

    /**
     * @return the comisionUso
     */
    public int getComisionUso() {
        return comisionUso;
    }

    /**
     * @param comisionUso the comisionUso to set
     */
    public void setComisionUso(int comisionUso) {
        this.comisionUso = comisionUso;
    }

    /**
     * @return the comisionSaldoInsuficiente
     */
    public int getComisionSaldoInsuficiente() {
        return comisionSaldoInsuficiente;
    }

    /**
     * @param comisionSaldoInsuficiente the comisionSaldoInsuficiente to set
     */
    public void setComisionSaldoInsuficiente(int comisionSaldoInsuficiente) {
        this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
    }

    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
}
