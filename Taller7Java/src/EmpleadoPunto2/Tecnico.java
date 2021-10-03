/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpleadoPunto2;

public class Tecnico extends Operario{
    public Tecnico(){
        super();
    }
    
    public Tecnico(String nombre){
        super(nombre);
        
    }
    
    @Override
    public String retornarNombre(){
        return super.retornarNombre() +" ->" + " Tecnico";
    }
    
    
}
