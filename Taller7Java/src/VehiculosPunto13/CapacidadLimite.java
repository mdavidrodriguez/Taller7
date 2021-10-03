package VehiculosPunto13;

import java.util.Scanner;

public class CapacidadLimite {

    Scanner entrada = new Scanner(System.in);
    private int PasajerosM;
    private int PasajerosA;
    private int limPmotocicleta = 1;
    private int limpAutomovil = 4;

    public CapacidadLimite(int limPmotocicleta, int limPautomovil) {
        this.limPmotocicleta = limPmotocicleta;
        this.limpAutomovil = limPautomovil;
    }

    /**
     * @return the limPmotocicleta
     */
    public int getLimPmotocicleta() {
        return limPmotocicleta;
    }

    /**
     * @param limPmotocicleta the limPmotocicleta to set
     */
    public void setLimPmotocicleta(int limPmotocicleta) {
        this.limPmotocicleta = limPmotocicleta;
    }

    /**
     * @return the limpAutomovil
     */
    public int getLimpAutomovil() {
        return limpAutomovil;
    }

    /**
     * @param limpAutomovil the limpAutomovil to set
     */
    public void setLimpAutomovil(int limpAutomovil) {
        this.limpAutomovil = limpAutomovil;
    }

    public void limPasajerosMotocicleta() {
        System.out.println("Digite los pasajeros de la motocicleta: ");
        PasajerosM = entrada.nextInt();
        if (PasajerosM > limPmotocicleta) {
            System.out.println("Excede el numero de pasajeros permitidos");
        } else {
            System.out.println("No se excede el numero de pasajeros");
        }
    }

    public void limPasajerosAutomovil() {
        System.out.println("\nDigite los pasajeros del automovil");
        if (PasajerosA > limpAutomovil) {
            System.out.println("Excede el numero de pasajeros permitidos");
        } else {
            System.out.println("No se excede el numero de pasajeros");

        }

    }

}
