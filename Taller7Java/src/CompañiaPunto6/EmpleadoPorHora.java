package CompañiaPunto6;

public class EmpleadoPorHora extends Empleado {

    private double salario;
    private int hora;

    public EmpleadoPorHora(String n, int id, double sal, int h) {
        super(n, id);
        salario = sal;
        hora = h;

    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void pagar() {

        if (hora <= 39) {
            salario = getHora() * 2500;
            System.out.println("Su salario es de: " + salario);
        }

        if (hora >= 40) {
            salario = getHora() * 3750;
            System.out.println("Su salario es: " + salario);
        }

    }

}
