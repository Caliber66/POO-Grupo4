import java.util.Scanner;

public class ej_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer lado del triangulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado del triangulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado del triangulo: ");
        double lado3 = scanner.nextDouble();


        double perimetro = lado1 + lado2 + lado3;


        double semiperimetro = perimetro / 2;


        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));


        System.out.println("\nInformacion del triangulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
