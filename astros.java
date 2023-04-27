import java.util.ArrayList;
import java.util.Scanner;
public abstract class astros {
        private double masa;
        private double diametroMedio;
        private double periodoRotacion;
        private double periodoTraslacion;
        private double distanciaMedia;



    public astros(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public double getMasa() {
            return masa;
        }

        public void setMasa(double masa) {
            this.masa = masa;
        }

        public double getDiametroMedio() {
            return diametroMedio;
        }

        public void setDiametroMedio(double diametroMedio) {
            this.diametroMedio = diametroMedio;
        }

        public double getPeriodoRotacion() {
            return periodoRotacion;
        }

        public void setPeriodoRotacion(double periodoRotacion) {
            this.periodoRotacion = periodoRotacion;
        }

        public double getPeriodoTraslacion() {
            return periodoTraslacion;
        }

        public void setPeriodoTraslacion(double periodoTraslacion) {
            this.periodoTraslacion = periodoTraslacion;
        }

        public double getDistanciaMedia() {
            return distanciaMedia;
        }

        public void setDistanciaMedia(double distanciaMedia) {
            this.distanciaMedia = distanciaMedia;
        }

        public void mostrarInformacion() {
            System.out.println("Masa: " + this.masa);
            System.out.println("Diámetro medio: " + this.diametroMedio);
            System.out.println("Período de rotación: " + this.periodoRotacion);
            System.out.println("Período de traslación: " + this.periodoTraslacion);
            System.out.println("Distancia media: " + this.distanciaMedia);
        }
    }