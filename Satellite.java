import java.util.ArrayList;
import java.util.Scanner;
public class Satellite extends astros {
    private Planeta planeta_principal;
    private String nombre;



    public Satellite(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia, Planeta planeta_principal, String nombre) {
        super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.planeta_principal = planeta_principal;
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Planeta getPlaneta_principal() {
        return planeta_principal;
    }

    public void setPlaneta_principal(Planeta planeta_principal) {
        this.planeta_principal = planeta_principal;
    }

    public void mostrarInformacion() {
        System.out.println("----Información Satelite----");
        super.mostrarInformacion();
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Planeta principal: " + this.planeta_principal);

    }
}
