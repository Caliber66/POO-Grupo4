import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        double a = input.nextDouble();

        System.out.println("Ingrese el valor de B:");
        double b = input.nextDouble();

        System.out.println("Ingrese el valor de C:");
        double c = input.nextDouble();

        input.close();

        // Calculamos el discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);

        } else if (discriminante == 0) {

            double x = -b / (2 * a);
            System.out.println("La solución única es x = " + x);

        } else {

            System.out.println("No hay soluciones reales.");
        }
    }
}
