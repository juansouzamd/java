import java.util.*;

class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 2 =====\n");

        System.out.println("Digite o tamanho do vetor");
        int tamanho = ler.nextInt();

        int vetor[] = new int[tamanho];

        vetor = preencherVetor(tamanho);

        verificarOrdem(tamanho, vetor);

    }

    public static int[] preencherVetor(int tamanho) {
        Scanner ler = new Scanner(System.in);

        int array[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o %d número:%n", i + 1);
            array[i] = ler.nextInt();
        }

        System.out.println();

        return array;
    }

    public static void verificarOrdem(int tamanho, int vetorCompleto[]) {

        int cont01 = 0, cont02 = 0;

        for (int i = 0; i < tamanho; i++) {

            for (int j = 1; j < tamanho; j++) {
                if (vetorCompleto[i] + 1 == vetorCompleto[j]) {
                    cont01++;
                }
            }
        }
        cont01++;

        for (int i = tamanho - 1; i != -1; i--) {

            for (int j = tamanho - 2; j != -1; j--) {
                if (vetorCompleto[i] + 1 == vetorCompleto[j]) {
                    cont02++;
                }
            }
        }
        cont02++;

        if (cont01 == tamanho) {
            System.out.println("Ordem Crescente");
        } else if (cont02 == tamanho) {
            System.out.println("Ordem Decrescente");
        } else {
            System.out.println("Desordenados");
        }
    }
}