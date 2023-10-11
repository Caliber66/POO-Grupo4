package Inmuebles;

public class CasaRural extends Casa{
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int distanciaCabecera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCabera = distanciaCabecera;
        this.altitud = altitud;
    }

     void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la Cabecera municipal = " + distanciaCabera + "km");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + "metros");
        System.out.println();
    }
}
