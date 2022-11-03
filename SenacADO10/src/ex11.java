import java.util.*;

class ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 11 =====");

        System.out.println("Digite a posição desejada de fibonacci");
        int posicao = ler.nextInt();

        System.out.println(); // pular linha

        int calculoFibonacci = fibonacci(posicao);

        System.out.printf("O valor na posição %d da sequência de fibonacci é %d", posicao, calculoFibonacci);

        ler.close();
    }

    public static int fibonacci(int posicao) {
        int primeiroIndice = 0;
        int segundoIndice = 1;
        int valorFinal = 0;

        for (int contador = 1; contador <= posicao; contador++) {
            valorFinal = primeiroIndice + segundoIndice;
            segundoIndice = primeiroIndice;
            primeiroIndice = valorFinal;
        }
        return valorFinal;
    }
}