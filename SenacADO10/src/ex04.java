import java.util.*;

class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 4 =====");

        System.out.println("Digite o primeiro número");
        int numero01 = ler.nextInt();

        System.out.println("Digite o segundo número");
        int numero02 = ler.nextInt();

        System.out.println(); // pular linha

        int calculoSoma = somarParesAte(numero01, numero02);

        System.out.printf("A soma dos números pares de %d a %d é %d%n", numero01, numero02, calculoSoma);

        ler.close();
    }

    public static int somarParesAte(int inicio, int fim) {
        int soma = 0;
        for (int contador = inicio; contador <= fim; contador++) {
            if (contador % 2 == 0) {
                soma = soma + contador;
            }
        }
        return soma;
    }
}