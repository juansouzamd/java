import java.util.*;

class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 5 =====");

        System.out.println("Digite seu número múltiplo");
        int multiplo = ler.nextInt();

        System.out.println("Digite o número de ínicio");
        int numeroInicio = ler.nextInt();

        System.out.println("Digite o número final");
        int numeroFim = ler.nextInt();

        System.out.println(); // pular linha

        int calculoMultiplos = somarMultiplos(multiplo, numeroInicio, numeroFim);

        System.out.printf("A soma dos números múltiplos de %d, de %d a %d é %d", multiplo, numeroInicio, numeroFim,
                calculoMultiplos);

        ler.close();

    }

    public static int somarMultiplos(int numero, int inicio, int fim) {
        int soma = 0;
        for (int contador = inicio; contador <= fim; contador++) {
            if (contador % numero == 0) {
                soma = soma + contador;
            }
        }
        return soma;
    }
}