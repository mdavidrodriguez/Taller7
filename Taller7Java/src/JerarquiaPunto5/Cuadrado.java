package JerarquiaPunto5;

public class Cuadrado extends Cuadrilatero {

    private double Lado;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double x, double y, double Lado) {
        super(x, y);
        this.Lado = Lado;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    @Override
    public double CalcularArea() {
        return this.Lado * this.Lado;
    }

}
