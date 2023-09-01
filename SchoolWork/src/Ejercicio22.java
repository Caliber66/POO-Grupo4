import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
//Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
//número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
//de $450.000, de lo contrario escriba sólo el nombre.
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Salario basico por hora: ");
        Float salario = scanner.nextFloat();
        System.out.println("Numero de horas trabajadas en el mes: ");
        int horas = scanner.nextInt();
        float salariom = (salario * horas);

        if (salariom >= 450000) {
            System.out.println("Nombre: "+nombre);
            System.out.println("Salario mensual: " + salariom);
        } else {
            System.out.println("Nombre: "+nombre);
        }
    }
}
