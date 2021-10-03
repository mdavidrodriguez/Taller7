package VehiculosPunto13;

import java.util.Scanner;

public class Motocicleta extends VehiculoMotorizado {

    Scanner entrada = new Scanner(System.in);
    private int numPasajeros;

    public Motocicleta(String fabricante, String modelo, int AñoFabricacion, int kilometraje, int numpasajeros) {
        super(fabricante, modelo, AñoFabricacion, kilometraje);
        this.numPasajeros = numpasajeros;
    }

    public Motocicleta(String fabricante, String modelo, int AñoFabricacion, int kilometraje) {
        super(fabricante, modelo, AñoFabricacion, kilometraje);

    }

    /**
     * @return the numPasajeros
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }

    /**
     * @param numPasajeros the numPasajeros to set
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void MaximoPasajeros() {
        System.out.println("Digite el maximo de pasajeros permitidos");
        numPasajeros = entrada.nextInt();

        if (numPasajeros > 12) {
            System.out.println("Incumple las medidas de seguridad");
        } else {
            System.out.println("Cumple las medidas de seguridad");
        }
    }

    @Override
    public String toString() {
        System.out.println("Digite el numero de pasajeros: ");
        numPasajeros = entrada.nextInt();
        if (numPasajeros > 1) {
            System.out.println("Incumple las medidas de seguridad");
        } else {
            System.out.println("Cumple las medidas de seguridad");
        }
        return super.toString() + "\nNumero de pasajeros: " + this.numPasajeros;
    }
}
