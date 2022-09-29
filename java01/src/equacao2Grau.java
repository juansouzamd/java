import java.util.*;

class equacao2Grau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa para calcular uma equação de segundo grau");

    System.out.println("Insira o coeficiente A");
    double coeficienteA = in.nextDouble();

    System.out.println("Insira o coeficiente B");
    double coeficienteB = in.nextDouble();

    System.out.println("Insira o coeficiente C");
    double coeficienteC = in.nextDouble();

    double delta = (Math.pow(coeficienteB, 2) -4 * coeficienteA * coeficienteC);

    double x1 = (-coeficienteB + Math.sqrt(delta) / (2 * coeficienteA));
    double x2 = (-coeficienteB - Math.sqrt(delta) / (2 * coeficienteA));

    System.out.println("Os valores para x são "+x1 +" e "+x2);

    }
}
