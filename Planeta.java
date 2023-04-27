import java.util.ArrayList;
import java.util.Scanner;
public class Planeta extends astros {

    private double distanciaSol;
    private boolean tienesatellites;
    private String nombre;
    private ArrayList<Satellite> satellites;

    public Planeta(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia, double distanciaSol, boolean tienesatellites, String nombre) {
        super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.setDistanciaSol(distanciaSol);
        this.setNombre(nombre);
        this.setTienesatellites(tienesatellites);
        this.satellites= new ArrayList<>();
    }


    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public boolean isTienesatellites() {
        return tienesatellites;
    }

    public void setTienesatellites(boolean tienesatellites) {
        this.tienesatellites = tienesatellites;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(Satellite satellites) {
        this.satellites.add(satellites);
        this.tienesatellites=true;
    }

    public void mostrarInformacion() {
        System.out.println("----Información Planeta----");
        super.mostrarInformacion();
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Distancia Sol: " + this.distanciaSol);
        System.out.println("Tiene satelites: " + this.tienesatellites);
        System.out.println("Satelites: " + this.satellites);
    }
}

