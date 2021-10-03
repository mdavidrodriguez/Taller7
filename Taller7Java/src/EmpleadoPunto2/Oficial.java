
package EmpleadoPunto2;

public class Oficial extends Operario{
    public Oficial(){
        super();
    }
    
    public Oficial(String nombre){
        super(nombre);
        
    }
    
    @Override
    public String retornarNombre(){
        return super.retornarNombre() + " ->" + " Oficial";
    }
}
