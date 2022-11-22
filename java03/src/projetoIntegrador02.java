import java.util.*;

public class projetoIntegrador02 {
    public static void main(String[] args) {

        System.out.println("\nInforme as 10 matrículas do curso de Algoritmos");

        int vetorAlgoritmos[] = preencherVetor();

        System.out.println("\nInforme as 10 matrículas do curso de Linguagem de Programação");

        int vetorLinguagens[] = preencherVetor();

        int quantidadeDeMatriculasRepetidas = matriculasRepetidasQuantidade(vetorAlgoritmos, vetorLinguagens);

        int veotrMatriculasRepetidas[] = matriculasRepetidas(quantidadeDeMatriculasRepetidas, vetorAlgoritmos,
                vetorLinguagens);

        System.out.println("\nMatrículas do curso de Algoritmos:");
        exibir(vetorAlgoritmos);

        System.out.println("\n\nMatrículas do curso de Linguagem de Programação:");
        exibir(vetorLinguagens);

        System.out.println("\n\nMatrículas repetidas nos dois cursos:");
        exibir(veotrMatriculasRepetidas);

    }

    public static int[] preencherVetor() {
        Scanner in = new Scanner(System.in);
        int vetorMatriculas[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a " + (i + 1) + " matrícula");
            vetorMatriculas[i] = in.nextInt();
        }
        return vetorMatriculas;

    }

    public static int matriculasRepetidasQuantidade(int vetorAlgoritmos[], int vetorLinguagens[]) {
        int quantidade = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (vetorAlgoritmos[i] == vetorLinguagens[j]) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int[] matriculasRepetidas(int quantidadeDeMatriculasRepetidas, int vetorAlgoritmos[],
            int vetorLinguagens[]) {
        int vetorRepetidas[] = new int[quantidadeDeMatriculasRepetidas];
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (vetorAlgoritmos[i] == vetorLinguagens[j]) {
                    vetorRepetidas[cont] = vetorAlgoritmos[i];
                    cont++;
                }
            }
        }
        return vetorRepetidas;
    }

    public static void exibir(int vetor[]) {

        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
