import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        //24. Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
        //la esfera de mayor peso.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso esfera A");
        int esfA = scanner.nextInt();

        System.out.println("Peso esfera B");
        int esfB = scanner.nextInt();

        System.out.println("Peso esfera C");
        int esfC = scanner.nextInt();

        if (esfA > esfB && esfA > esfC) {
            System.out.println("La esfera A tiene el mayor peso.");
        } else if (esfB > esfA && esfB > esfC) {
            System.out.println("La esfera B tiene el mayor peso.");
        } else {
            System.out.println("La esfera C tiene el mayor peso.");
        }
    }
}
