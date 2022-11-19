import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 5 =====");

        System.out.println("Digite o tamanho do vetor");
        int tamanho = ler.nextInt();

        int array[] = criarArray(tamanho);

        System.out.println("\nArray inicial:");

        exibir(array);

        int arrayDobros[] = calcularDobros(array, tamanho);

        System.out.println("\nArray com dobros:");

        exibir(arrayDobros);
    }

    public static int[] criarArray(int tamanho) {
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número:");
            vetor[i] = ler.nextInt();
        }
        return vetor;
    }

    public static void exibir(int vetor[]) {

        for (int vet : vetor) {
            System.out.print(vet+" ");
        }
    }

    public static int[] calcularDobros(int vetor[], int tamanho) {
        int vetorDobro[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetor[i] * 2;
        }

        return vetorDobro;
    }
}
