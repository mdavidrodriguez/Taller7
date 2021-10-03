package OrdenadoresPunto4;

public class Ordenadores {

    private String codigo;
    private double precio;

    public Ordenadores(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String retornarDatos() {
        return "Codigo: " + this.codigo + "\n" +"Precio: " + this.precio + " Dolares";
    }

}
