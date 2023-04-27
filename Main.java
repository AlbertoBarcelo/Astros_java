
import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);

    Planeta tierra = new Planeta(1000,1d,2d,20,3d,4d,true,"tierra");
    Satellite luna = new Satellite(4.5d,5d,2d,3,45,tierra,"luna");

    public int leerOpcion(){
        return scanner.nextInt();
    }
    public void menu(){
        System.out.println("1. Mostrar informacion del astro");
        System.out.println("2. Mostrar el nombre del astro");
        System.out.println("3. Mostrar distancia al sol");
        System.out.println("4. Mostrar masa");
        System.out.println("5. ¿Tiene satelites?");
        System.out.println("6. Salir");
    }
    public void iniciarPrograma(){
        int opcion = 1;
        boolean salir=false;
        while(!salir){
            menu();
            opcion=leerOpcion();
            switch (opcion){
                case 1: tierra.mostrarInformacion(); break;
                case 2: System.out.println(tierra.getNombre());break;
                case 3: System.out.println(tierra.getDistanciaSol());break;
                case 4: System.out.println(tierra.getMasa());break;
                case 5: System.out.println("tiene satelites: " +tierra.isTienesatellites());break;
                case 6: salir = true;break;
                default: System.out.println("no es una opcion correcta");break;
            }
        }
    }


    public static void main(String[] args) {
        Main start = new Main();
        start.iniciarPrograma();
    }
}

