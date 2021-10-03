package CompañiaPunto6;

public class EmpleadosAsalariados extends Empleado {

    private double salario = 500.000;

    public EmpleadosAsalariados(String n, int id, double sal) {
        super(n, id);
        this.salario = sal;

    }

    @Override
    public void pagar() {
        System.out.println("Su salario es de: " + salario);

    }

}
