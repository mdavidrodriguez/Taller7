
package CompañiaPunto6;


public class EmpleadosAsalariadosporComision extends Empleado{
    private double salario = 68000;
    private double porcentaje;
    
    public EmpleadosAsalariadosporComision(String n, int id, double sal, double por){
        super(n,id);
        this.salario=sal;
        this.porcentaje=por;
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
     * @return the porcentaje
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void pagar(){
        double sal=salario*01;
        double salt=salario+sal;
        double salu =getPorcentaje()*0.3;
        double salariototal=salario+salu+salt;
        System.out.println("Su salario es " + salariototal);
    }
    
    
}
