import java.util.*;

class Ex08While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== Exercício 8 =====");

        System.out.println("Digite a base do retângulo");
        int base = in.nextInt();

        System.out.println("Digite a altura do retângulo");
        int altura = in.nextInt();

        System.out.println(); // pular linha

        retangulo(base, altura);

        in.close();

    }

    public static void retangulo(int base, int altura) {
        int contador01 = 1;
        int contador02 = 1;
        String asterisco = "* ";

        while (contador01 <= altura) {

            while (contador02 <= base) {
                System.out.print(asterisco);
                contador02++;
            }

            System.out.println();
            contador01++;
            contador02 = 1;
        }

    }
}
