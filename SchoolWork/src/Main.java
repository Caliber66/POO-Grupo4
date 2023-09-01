import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso esfera A");
        int esferaA = scanner.nextInt();
        System.out.println("Peso esfera B");
        int esferaB = scanner.nextInt();
        System.out.println("Peso esfera C");
        int esferaC = scanner.nextInt();
        System.out.println("Peso esfera D");
        int esferaD = scanner.nextInt();

        //Condicionales
        if (esferaA == esferaB && esferaB == esferaC && esferaC != esferaD) {
            if (esferaC < esferaD) {
                System.out.println("Esfera D es diferente y es mas pesada");
            } else {
                System.out.println("Esfera D es diferente y es mas liviana");
            }
        } else if (esferaA == esferaB && esferaB != esferaC && esferaB == esferaD) {
            if (esferaA < esferaC) {
                System.out.println("Esfera C es diferente y es mas pesada");
            } else {
                System.out.println("Esfera C es diferente y es mas liviana");
            }
        } else if (esferaA != esferaB && esferaA == esferaC && esferaA == esferaD) {
            if (esferaA < esferaB) {
                System.out.println("Esfera B es diferente y es mas pesada");
            } else {
                System.out.println("Esfera B es diferente y es mas liviana");
            }
        } else if (esferaA != esferaB && esferaB == esferaC && esferaC == esferaD) {
            if (esferaB < esferaA) {
                System.out.println("Esfera A es diferente y es mas pesada");
            } else {
                System.out.println("Esfera A es diferente y es mas liviana");
            }
        }

    }
}

