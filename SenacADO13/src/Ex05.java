import java.util.*;

class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 5 =====\n");

        System.out.println("Digite quantos números deseja da sequência de números primos:");
        int tamanho = ler.nextInt();

        int numerosPrimos[] = sequenciaPrimos(tamanho);

        System.out.println("\nSequência dos "+ tamanho+ " primeiros primos:");

        exibir(numerosPrimos, tamanho);

    }

    public static int[] sequenciaPrimos(int tamanho) {
        int vetorPrimos[] = new int[tamanho];
        int primo = 0, divisoes = 0, numero = 2;

        while (primo != tamanho) {

            for (int i = 1; i <= numero; i++) {

                if (numero % i == 0) {
                    divisoes++;
                }
            }

            if (divisoes == 2) {
                vetorPrimos[primo] = numero;
                primo++;
            }

            numero++;
            divisoes = 0;
        }
        return vetorPrimos;
    }

    public static void exibir(int numeros[], int tamanho){

        for (int i : numeros) {
            System.out.print(i+" ");
        }
    }
}