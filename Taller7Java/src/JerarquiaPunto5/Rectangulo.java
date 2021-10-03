package JerarquiaPunto5;

public class Rectangulo extends Cuadrilatero {

    private double Base;
    private double Altura;

    public Rectangulo() {
        super();
    }

    public Rectangulo(double x, double y, double Base, double Altura) {

        super(x, y);
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public double CalcularArea() {

        return this.Base * this.Altura;
    }

}
