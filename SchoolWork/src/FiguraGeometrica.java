public class FiguraGeometrica {
    int radio;
    int base;
    int altura;
    int lado;

    public FiguraGeometrica(int radio, int base, int altura, int lado) {
        this.radio = radio;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
}

public class Circulo extends FiguraGeometrica {
    public Circulo(int radio) {
        super(radio, 0, 0, 0);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(int base, int altura) {
        super(0, base, altura, 0);
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

public class Cuadrado extends FiguraGeometrica {
    public Cuadrado(int lado) {
        super(0, 0, 0, lado);
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

public class TrianguloRectangulo extends FiguraGeometrica {
    public TrianguloRectangulo(int base, int altura) {
        super(0, base, altura, 0);
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public void determinarTipoTriangulo() {
        if (base == altura && base == calcularHipotenusa()) {
            System.out.println("Es un triangulo equilatero");
        } else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
    }
}

public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);

        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
