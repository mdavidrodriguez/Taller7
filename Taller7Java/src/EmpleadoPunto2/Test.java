
package EmpleadoPunto2;
public class Test {
    public static void main(String[] args) {
        
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario(" Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");
        System.out.println(E1.retornarNombre());
        System.out.println(D1.retornarNombre());
        System.out.println(OP1.retornarNombre());
        System.out.println(OF1.retornarNombre());
        System.out.println(T1.retornarNombre());
    }
    
}
