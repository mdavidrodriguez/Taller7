
package CompañiaPunto6;

public class EmpleadosporComision extends Empleado {
    private double salario = 2500000;
    private double porcentaje;
    
    public EmpleadosporComision(String n, int id,double sal, double por){
        super(n,id);
        this.porcentaje=salario;
        this.salario=salario;
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
        salario = getPorcentaje()*0.3;
        double sal = getPorcentaje()-salario;
        System.out.println("Salario" + sal);
    }
    
}
