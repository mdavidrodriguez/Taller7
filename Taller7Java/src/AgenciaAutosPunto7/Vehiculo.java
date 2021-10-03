package AgenciaAutosPunto7;

public abstract class Vehiculo {

    public int numSerieMotor;
    public int year;
    public String marca;
    public double precio;

    public Vehiculo(int numSerieMotor, int year, String marca, double precio) {
        super();
        this.numSerieMotor = numSerieMotor;
        this.year = year;
        this.marca = marca;
        this.precio = precio;
    }

}


