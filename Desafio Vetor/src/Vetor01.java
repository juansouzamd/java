import java.util.*;

class Vetor01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tamanhoVetor = in.nextInt();

        int[] vetorInicial = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite o número");
            vetorInicial[i] = in.nextInt();
        }

        System.out.println();

        int sequencia = tamanhoSequencias(tamanhoVetor, vetorInicial);

        int vetorFiltrado[] = filtrarSequencia(sequencia, tamanhoVetor, vetorInicial);

        for (int vet : vetorFiltrado) {
            System.out.print(vet + " ");
        }

        System.out.printf("%n%n");

        int quebrasDeSequencia = quebras(sequencia, tamanhoVetor, vetorInicial);

        System.out.println(quebrasDeSequencia);










        in.close();
    }

    public static int tamanhoSequencias(int tamanhoVetor, int[] array) {
        int contador = 0;
        int seq = 0;

        for (int i = 1; i < tamanhoVetor; i++) {
            if (array[i] - array[contador] == 1) {
                seq++;

                if (i != tamanhoVetor - 1) {
                    if (array[i + 1] - array[contador + 1] != 1) {
                        seq++;
                    }
                } else if (array[contador] - array[i] == -1) {
                    seq++;
                }
            }
            contador++;
        }
        return seq;
    }

    public static int[] filtrarSequencia(int tamanhoSeq, int tamanhoVetor, int[] array) {

        int vetorArmazenar[] = new int[tamanhoSeq];
        int newContador = 0;
        int posicao = 0;

        for (int i = 1; i < tamanhoVetor; i++) {
            if (array[i] - array[newContador] == 1) {

                vetorArmazenar[posicao] = array[newContador];
                posicao++;

                if (i != tamanhoVetor - 1) {

                    if (array[i + 1] - array[newContador + 1] != 1) {

                        vetorArmazenar[posicao] = array[newContador + 1];
                        posicao++;
                    }

                } else if (array[newContador] - array[i] == -1) {

                    vetorArmazenar[posicao] = array[newContador + 1];
                    posicao++;
                }
            }
            newContador++;
        }
        return vetorArmazenar;
    }

    public static int quebras(int tamanhoSeq, int tamanhoVetor, int[] array) {

        int vetorArmazenar[] = new int[tamanhoSeq];
        int newContador = 0;
        int posicao = 0;
        int quebras = 0;

        for (int i = 1; i < tamanhoVetor; i++) {
            if (array[i] - array[newContador] == 1) {

                vetorArmazenar[posicao] = array[newContador];
                posicao++;

                if (i != tamanhoVetor - 1) {

                    if (array[i + 1] - array[newContador + 1] != 1) {

                        vetorArmazenar[posicao] = array[newContador + 1];
                        posicao++;
                        quebras++;
                    }

                } else if (array[newContador] - array[i] == -1) {

                    vetorArmazenar[posicao] = array[newContador + 1];
                    posicao++;
                    quebras++;
                }
            }
            newContador++;
        }
        return quebras;
    }
}
