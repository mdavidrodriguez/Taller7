package JerarquiaPunto5;

public class Trapecio extends Cuadrilatero {

    private double BaseMy;
    private double BaseMn;
    private double Altura;

    public Trapecio() {
        super();
    }

    public Trapecio(double BaseMy, double BaseMn, double Altura, double x, double y) {
        super(x, y);
        this.BaseMy = BaseMy;
        this.BaseMn = BaseMn;
        this.Altura = Altura;
    }

    public double getBaseMy() {
        return BaseMy;
    }

    public double getBaseMn() {
        return BaseMn;
    }

    public double getAltura() {
        return Altura;
    }

    public void setBaseMy(double BaseMy) {
        this.BaseMy = BaseMy;
    }

    public void setBaseMn(double BaseMn) {
        this.BaseMn = BaseMn;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public double CalcularArea() {

        return ((this.BaseMy + this.BaseMn) * this.Altura) / 2;

    }
}
