import java.util.Scanner;

public class ejer_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese las ventas del departamento 1: ");
        double ventasDepartamento1 = scanner.nextDouble();


        System.out.print("Ingrese las ventas del departamento 2: ");
        double ventasDepartamento2 = scanner.nextDouble();


        System.out.print("Ingrese las ventas del departamento 3: ");
        double ventasDepartamento3 = scanner.nextDouble();


        System.out.print("Ingrese el salario mensual de los vendedores de cada departamento: ");
        double salarioMensual = scanner.nextDouble();


        double ventasTotales = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;


        double incentivo = 0.0;

        if (ventasDepartamento1 > 0.33 * ventasTotales) {
            incentivo = 0.2 * salarioMensual;
        }


        System.out.println("Monto adicional para el departamento 1: $" + incentivo);

        if (ventasDepartamento2 > 0.33 * ventasTotales) {
            incentivo = 0.2 * salarioMensual;
        }


        System.out.println("Monto adicional para el departamento 2: $" + incentivo);

        if (ventasDepartamento3 > 0.33 * ventasTotales) {
            incentivo = 0.2 * salarioMensual;
        }


        System.out.println("Monto adicional para el departamento 3: $" + incentivo);

        scanner.close();
    }
}
