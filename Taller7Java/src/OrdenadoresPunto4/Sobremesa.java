package OrdenadoresPunto4;

public class Sobremesa extends Ordenadores {

    private String TipoTorre;
    private String eslogan;

    public Sobremesa(String codigo, double precio, String TipoTorre, String eslogan) {
        super(codigo, precio);
        this.TipoTorre = TipoTorre;
        this.eslogan = eslogan;
    }

    public Sobremesa(String codigo, double precio) {
        super(codigo, precio);

    }

    /**
     * @return the TipoTorre
     */
    public String getTipoTorre() {
        return TipoTorre;
    }

    /**
     * @param TipoTorre the TipoTorre to set
     */
    public void setTipoTorre(String TipoTorre) {
        this.TipoTorre = TipoTorre;
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
        return super.retornarDatos() + "\n" + "Tipo Torre: " + this.TipoTorre
                + "\n" + "Eslogan: " + this.eslogan;

    }
}
