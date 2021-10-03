
package EmpleadoPunto2;

public class Directivo extends Empleado {
    public Directivo(){
        super();
    }
    
    public Directivo(String nombre){
        super(nombre);
        
    }
    @Override
    public String retornarNombre(){
        return super.retornarNombre() + " ->" + " Directivo";
        
        

    }
}
