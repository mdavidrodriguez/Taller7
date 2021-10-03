package VehiculosPunto13;

public class VehiculoMotorizado {

    private String fabricante;
    private String modelo;
    private int AñoFabricacion;
    private int kilometraje;

    public VehiculoMotorizado(String fabricante, String modelo, int AñoFabricacion, int kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.AñoFabricacion = AñoFabricacion;
        this.kilometraje = kilometraje;

    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the AñoFabricacion
     */
    public int getAñoFabricacion() {
        return AñoFabricacion;
    }

    /**
     * @param AñoFabricacion the AñoFabricacion to set
     */
    public void setAñoFabricacion(int AñoFabricacion) {
        this.AñoFabricacion = AñoFabricacion;
    }

    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "\nFabricante: " + this.fabricante + "\nModelo: " + this.modelo
                + "\nAño de Fabricacion: " + this.AñoFabricacion + "\nKilometraje: " + this.kilometraje + " Km";
    }
}
