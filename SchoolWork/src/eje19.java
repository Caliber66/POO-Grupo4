import java.util.Scanner;

public class eje19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el codigo del empleado: ");
        int codigoEmpleado = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion en la fuente (%): ");
        double retencionFuente = scanner.nextDouble();


        double salarioBruto = horasTrabajadas * valorHora;


        double retencion = (retencionFuente / 100) * salarioBruto;
        double salarioNeto = salarioBruto - retencion;

        System.out.println("\nInformacion del empleado:");
        System.out.println("Codigo del empleado: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);

        scanner.close();
    }
}
