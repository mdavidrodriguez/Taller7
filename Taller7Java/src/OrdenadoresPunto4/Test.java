package OrdenadoresPunto4;

public class Test {

    public static void main(String[] args) {
        System.out.println("-------Portatil-------");
        Portatil P = new Portatil("FF0234VM", 1200, 2, "Ideal para sus viajes");
        System.out.println(P.retornarDatos());

        System.out.println("\n------Sobremesa-------");
        Sobremesa SM = new Sobremesa("FRT4632", 1000, "Small Form Factor (Mini-ITX)", "El que mas pesa,pero el que menos cuesta");
        System.out.println(SM.retornarDatos());
    }

}
