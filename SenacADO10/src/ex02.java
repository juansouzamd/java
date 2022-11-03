import java.util.*;

class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 2 =====");

        System.out.println("Digite seu número para calcular o fatorial");
        int num = ler.nextInt();

        int calculoFatorial = fatorial(num);

        System.out.printf("O fatorial de %d é %d%n", num, calculoFatorial);

        ler.close();
    }

    public static int fatorial(int numero) {
        int soma = 1;
        for (int contador = 1; contador <= numero; numero--) {
            soma = soma * numero;
        }
        return soma;
    }
}