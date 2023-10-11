package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBanos;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion); /* Invoca al constructor de la clase padre */
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de Habitaciones = " + numeroHabitaciones);
        System.out.println("Número de Baños = " + numeroBanos);
    }
}
