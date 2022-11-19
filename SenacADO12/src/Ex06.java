import java.util.*;

public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 6 =====");

        System.out.println("\nDigite o número para calcular a tabuada");
        int numeroTabuada = ler.nextInt();

        int vetorTabuada[] = tabuada(numeroTabuada);

        System.out.println("\nA tabuada no " + numeroTabuada + " é:");

        exibir(vetorTabuada);

    }

    public static int[] tabuada(int numero) {
        int vetor[] = new int[11];

        for (int i = 0; i < 11; i++) {
            vetor[i] = i * numero;
        }

        return vetor;
    }

    public static void exibir(int vetor[]) {
        for (int vet : vetor) {
            System.out.println(vet);
        }
    }
}
