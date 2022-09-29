import java.util.*;

class pg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa para descobrir o valor em uma posição de uma progressão geométrica");

    System.out.println("Insira o primeiro termo");
    double a1 = in.nextDouble();

    System.out.println("Insira sua razão");
    double q = in.nextDouble();

    System.out.println("Insira o indice do termo");
    double n = in.nextDouble();

    double pg = (a1 * Math.pow(q, n-1));

    System.out.println("O valor do termo na posição "+n +" é "+(long)pg);
    }
}
