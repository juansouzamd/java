import java.util.*;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 8 =====");

        System.out.println("Deseja gerar quantos números");
        int quantidade = ler.nextInt();

        System.out.println("Informe o número que deseja verificar se existe no vetor");
        int numero = ler.nextInt();

        int vetorAleatorio[] = criarArray(quantidade);

        int posicaoNumero = buscar(vetorAleatorio, numero);

        if (posicaoNumero > -1) {
            System.out.println("\nO número " + numero + " encontra-se na posição " + posicaoNumero + ".\n");
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado.\n");
        }

        exibir(vetorAleatorio);

    }

    public static int[] criarArray(int tamanho) {
        Random rnd = new Random();
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rnd.nextInt(11);
        }

        return vetor;
    }

    public static int buscar(int numeros[], int num) {
        int posicao = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                posicao = i;

                if (posicao > -1) {
                    i = numeros.length;
                }
            }
        }
        return posicao;
    }

    public static void exibir(int numeros[]) {

        System.out.println("Números gerados:");

        for (int vet : numeros) {
            System.out.print(vet + " ");
        }
        System.out.println();
    }
}
