import java.util.*;

class Ex08For {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 8 =====");

    System.out.println("Digite a base do retângulo");
        int base = in.nextInt();

    System.out.println("Digite a altura do retângulo");
        int altura = in.nextInt();

    System.out.println(); //pular linha

    retangulo(base, altura);

    in.close();

    }

    public static void retangulo(int baseRetangulo, int alturaRetangulo){

        String asterisco = "* ";

        for (int i = 1; i <= alturaRetangulo; i++){

            for (int j = 1; j <= baseRetangulo; j++){
                System.out.print(asterisco);
            }

            System.out.println();
        }
}
}
