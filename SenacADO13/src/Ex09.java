import java.util.*;

class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n===== Exercício 9 =====\n");

        System.out.println("Informe a quantidade de figurinhas:");
        int quantidade = ler.nextInt();

        System.out.println("\nInforme as figurinhas da primeira pessoa");
        int figurinhasPessoa01[] = criarArray(quantidade);

        System.out.println("\nInforme as figurinhas da segunda pessoa");
        int figurinhasPessoa02[] = criarArray(quantidade);

        int qtdFigurinhasRepetidas = figurinhasIguais(figurinhasPessoa01, figurinhasPessoa02);

        int vetorfigurinhasRepetidas[] = qtdTrocas(figurinhasPessoa01, figurinhasPessoa02, qtdFigurinhasRepetidas);

        System.out.println("\nPodem ser feitas "+qtdFigurinhasRepetidas+ " trocas.");

        System.out.println("\nAs figurinhas repetidas são:");
        for (int i : vetorfigurinhasRepetidas) {
            System.out.print(i + " ");
        }
    }

    public static int[] criarArray(int tamanho){
        Scanner ler = new Scanner(System.in);
        int vetorfigurinhas[] = new int [tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("digite a " + (i+1) + " figurinha:");
            vetorfigurinhas[i] = ler.nextInt();
        }
        return vetorfigurinhas;
    }

    public static int figurinhasIguais(int pessoa01[], int pessoa02[]){
        int cont = 0;

        for(int i = 0; i < pessoa01.length; i++){
            for(int j = 0; j < pessoa01.length; j++){

                if(pessoa01[i] == pessoa02[j]){
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int[] qtdTrocas(int pessoa01[], int pessoa02[], int emComum){
        int vetorRepetidas[] = new int [emComum];
        int posicao = 0;

        for(int i = 0; i < pessoa01.length; i++){
            for(int j = 0; j < pessoa01.length; j++){

                if(pessoa01[i] == pessoa02[j]){
                    vetorRepetidas[posicao] = pessoa01[i];
                    posicao++;
                }
            }
        }
        return vetorRepetidas;
    }
}