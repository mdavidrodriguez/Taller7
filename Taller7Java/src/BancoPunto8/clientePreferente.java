package BancoPunto8;

public class clientePreferente extends Cliente{

    private int numFondos;
    private Fondo fondo;

    public clientePreferente() {
        super();
        this.numFondos = 0;
        this.fondo = new Fondo();
    }

    public clientePreferente(int numFondos, String nif, String nombre, String apellido, int numCuenta, int saldo) {
        super(nif, nombre, apellido, numCuenta, saldo);
        this.numFondos = numFondos;
    }

    public clientePreferente( String nif, String nombre, String apellido, int numCuenta, int saldo) {
        super(nif, nombre, apellido, numCuenta, saldo);
        //this.numFondos = numFondos;
        //this.fondo = fondo;
    }

    public Fondo getFondo() {
        return fondo;
    }

    public void setFondo(Fondo fondo) {
        this.fondo = fondo;
    }

    public int getNumFondos() {
        return numFondos;
    }

    public void setNumFondos(int numFondos) {
        this.numFondos = numFondos;
    }

    public String toString() {
        return  super.toString() ;
    }
    public String toString1() {
        return  super.toString() +
                "\nnumFondos:" + numFondos;
    }
   
    
}