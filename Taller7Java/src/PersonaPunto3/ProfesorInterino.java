
package PersonaPunto3;

public class ProfesorInterino extends Profesor{
    private String Fecha;
    
    
    public ProfesorInterino(String nombre, String apellido, String id,String Fecha){
        super(nombre, apellido, id);
        this.Fecha=Fecha;
    }
    public ProfesorInterino(String nombre, String apellido, String id){
        super(nombre, apellido, id);
    }

   

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    @Override
    public String retornarDatos(){
        return  "El profesor interino 1 se incorporo en la fecha: "+ this.Fecha;
    }
    
}
