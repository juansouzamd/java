import java.util.*;

class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 1 =====");

        System.out.println("Digite seu número para calcular a soma");
        int num = ler.nextInt();

        System.out.println(); // pular linha

        int calculoSoma = somarAte(num);

        System.out.printf("A soma dos números de 1 a %d é %d%n", num, calculoSoma);

        ler.close();
    }

    public static int somarAte(int numero) {
        int soma = 0;

        for (int contador = 1; contador <= numero; contador++) {
            soma = soma + contador;
        }

        return soma;
    }
}
