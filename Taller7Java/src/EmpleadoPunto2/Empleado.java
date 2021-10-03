
package EmpleadoPunto2;


public class Empleado {
    String nombre;
    
    
    public Empleado(){
        
    }
    public Empleado(String nombre){
        this.nombre=nombre;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String retornarNombre(){
        return "Empleado "  + this.nombre;
    }

  
    
}
