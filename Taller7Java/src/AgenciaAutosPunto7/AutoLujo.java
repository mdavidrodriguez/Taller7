package AgenciaAutosPunto7;

public class AutoLujo extends Auto {

    public AutoLujo(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }

    @Override
    public String toString() {
        return "AutoLujo [pasajeros=" + pasajeros + ", numSerieMotor=" + numSerieMotor + ", year=" + year
                + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
