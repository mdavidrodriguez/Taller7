package BancoPunto8;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String nif;
    private int numCuenta;
    private int saldo;
    //protected Fondo fondo;

    public Cliente() {
        this.nif = "";
        this.numCuenta = 0;
        this.saldo = 0;
    }

    public Cliente(String nif, String nombre, String apellido, int numCuenta, int saldo) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    public Cliente(String nif, int numCuenta, int saldo) {
        this.nif = nif;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    public String toString() {
        return  "NIF: " + nif + "  NOMBRE: " + nombre + "  APELLIDO: " + apellido +
                "\nnumCuenta: " + numCuenta + ", saldo: " + saldo ;
    }
    
}

