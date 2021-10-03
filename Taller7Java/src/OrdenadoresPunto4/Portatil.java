package OrdenadoresPunto4;

public class Portatil extends Ordenadores {

    private double peso;
    private String eslogan;

    public Portatil(String codigo, double precio, double peso, String eslogan) {
        super(codigo, precio);
        this.peso = peso;
        this.eslogan = eslogan;
    }

    public Portatil(String codigo, double precio) {
        super(codigo, precio);
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the eslogan
     */
    public String getEslogan() {
        return eslogan;
    }

    /**
     * @param eslogan the eslogan to set
     */
    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    @Override
    public String retornarDatos() {
        return super.retornarDatos()
                + "\n" + "Peso: " + this.peso + "Kg"
                + "\n" + "Eslogan: " + this.eslogan;

    }

}
