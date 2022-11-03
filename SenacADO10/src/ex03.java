import java.util.*;

class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 3 =====");

        System.out.println("Digite seu número para calcular a soma dos números naturais pares");
        int num = ler.nextInt();

        System.out.println(); // pular linha

        int calculoSoma = somarParesAte(num);

        System.out.printf("A soma dos números pares de 1 a %d é %d%n", num, calculoSoma);

        ler.close();
    }

    public static int somarParesAte(int numero) {
        int soma = 0;

        for (int contador = 1; contador <= numero; contador++) {
            if (contador % 2 == 0) {
                soma = soma + contador;
            }
        }
        return soma;
    }
}
