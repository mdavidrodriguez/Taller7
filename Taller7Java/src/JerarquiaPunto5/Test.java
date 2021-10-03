package JerarquiaPunto5;

public class Test {

    public static void main(String[] args) {

        Trapecio F1 = new Trapecio(6.2, 4, 5, 4.0, 3.9);
        System.out.println("El Area del Trapecio es = " + F1.CalcularArea());

        Rectangulo F2 = new Rectangulo(6.2, 8.3, 5, 6);
        System.out.println("El Area del Rectangulo es = " + F2.CalcularArea());

        Cuadrado F3 = new Cuadrado(7.8, 7.3, 3);
        System.out.println("El Area del Cuadrado es = " + F3.CalcularArea());

    }

}
