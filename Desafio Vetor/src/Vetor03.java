import java.util.*;

class Vetor03 {
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

        double vetorFiltrado[] = filtrarSequencia(sequencia, tamanhoVetor, vetorInicial);

        for (double vet : vetorFiltrado) {
            System.out.print(vet + " ");
        }

        System.out.printf("%n%n");

        int quebrasDeSequencia = quebras(sequencia, tamanhoVetor, vetorInicial);

        System.out.println(quebrasDeSequencia + "\n");

        double vetorComQuebras[] = adicionandoQuebras(sequencia, tamanhoVetor, vetorInicial, quebrasDeSequencia);

        for (double sys : vetorComQuebras) {
            System.out.print(sys + " ");
        }

        System.out.println("\n");

        int posicaoQuebras[] = posicaoQuebraNoVetor(sequencia, quebrasDeSequencia,vetorComQuebras);

        for (int pos : posicaoQuebras) {
            System.out.print(pos + " ");
        }


        int ultimoIndiceMaiorSequencia = posicaoUltimoIndiceMaiorSeq(posicaoQuebras, quebrasDeSequencia);

        int tamanhoMaiorSequencia = tamanhoMaiorSeq(posicaoQuebras, quebrasDeSequencia);

        System.out.println("\n\n"+ultimoIndiceMaiorSequencia);

        System.out.println("\n"+tamanhoMaiorSequencia+"\n");


        if (vetorComQuebras[ultimoIndiceMaiorSequencia] == posicaoQuebras[0] ){
            for (int i = 0; i <= ultimoIndiceMaiorSequencia; i++){
                System.out.print((int) vetorComQuebras[i] + " ");
            }


        } else {

            for (int i = ultimoIndiceMaiorSequencia - (tamanhoMaiorSequencia - 1); i <= ultimoIndiceMaiorSequencia; i++){
                System.out.print((int) vetorComQuebras[i] + " ");
            }

        }
        
        in.close();
    }

    public static int tamanhoMaiorSeq(int posicaoQuebras[], int quebrasDeSequencia){

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < quebrasDeSequencia; i++) {

            if (i < 1) {

                a = posicaoQuebras[i] - 1;

            } else {

                a = (posicaoQuebras[i] - posicaoQuebras[i-1]) - 1;
            }

            if (a > b){
                c = a;
                b = a;
                d = posicaoQuebras[i];
            }

        }
        return c;
    }

    public static int posicaoUltimoIndiceMaiorSeq (int posicaoQuebras[], int quebrasDeSequencia){

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < quebrasDeSequencia; i++) {

            if (i < 1) {

                a = posicaoQuebras[i] - 1;

            } else {

                a = (posicaoQuebras[i] - posicaoQuebras[i-1]) - 1;
            }

            if (a > b){
                c = a;
                b = a;
                d = posicaoQuebras[i];
            }

        }
        return d-1;
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

    public static double[] filtrarSequencia(int tamanhoSeq, int tamanhoVetor, int[] array) {

        double vetorArmazenar[] = new double[tamanhoSeq];
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

    public static double[] adicionandoQuebras(int tamanhoSeq, int tamanhoVetor, int[] array, int quebras) {

        double vetorArmazenar[] = new double[tamanhoSeq + quebras];
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
                        vetorArmazenar[posicao] = 1.5;
                        posicao++;
                    }

                } else if (array[newContador] - array[i] == -1) {

                    vetorArmazenar[posicao] = array[newContador + 1];
                    posicao++;
                    vetorArmazenar[posicao] = 1.5;
                    posicao++;
                }
            }
            newContador++;
        }
        return vetorArmazenar;
    }

    public static int[] posicaoQuebraNoVetor(int sequencia, int quebrasDeSequencia, double vetorComQuebras[]) {

        int posicoes[] = new int[quebrasDeSequencia];
        int cont = 0;

        for (int i = 0; i < (sequencia + quebrasDeSequencia); i++) {

            if (vetorComQuebras[i] == 1.5) {
                posicoes[cont] = i;
                cont++;
            }

        }

        return posicoes;

    }
}