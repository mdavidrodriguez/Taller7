
package PersonaPunto3;

public class Profesor extends Persona {
    private String id;
    
    
    public Profesor(String nombre, String apellido, String id){
        super(nombre,apellido);
        this.id=id;
    }
    public Profesor(String nombre, String apellido){
        super(nombre,apellido);
          
    }


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String retornarDatos(){
        return super.retornarDatos()+ " con id de profesor: " + "Pro" + this.id; 
    }
    
    
    
    
    
}
