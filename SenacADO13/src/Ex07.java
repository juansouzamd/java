import java.util.*;

class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 7 =====\n");

        System.out.println("Informe quantos pilotos estão competindo:");
        int numPilotos = ler.nextInt();

        System.out.println();

        int grid[] = criarArray(numPilotos);

        System.out.println("\nDigite as novas posições:\n");

        int fimCorrida[] = criarArray(numPilotos);

        String resultadoFinal[] = perfomacePiloto(numPilotos, grid, fimCorrida);

        System.out.println();

        exibir(resultadoFinal);
    }

    public static int[] criarArray(int tamanho){
        Scanner ler = new Scanner(System.in);
        int vetorGrid[] = new int [tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("Informe a posicao do piloto " + (i+1));
            vetorGrid[i] = ler.nextInt();
        }
        return vetorGrid;
    }

    public static String[] perfomacePiloto(int numPilotos, int posLargada[], int posChegada[]){
        String resultado[] = new String [numPilotos];
        int posicao = 0;

        for(int i = 0; i < numPilotos; i++){
            posicao = posLargada[i] - posChegada[i];

            if(posicao == 0){
                resultado[i] = "O piloto " + (i+1) + " manteve a posição";
            } else if (posicao > 0) {
                resultado[i] = "O piloto " + (i+1) + " retrocedeu " + posicao+ " posições";
            } else {
                resultado[i] = "O piloto " + (i+1) +" avançou " + Math.abs(posicao)+ " posições";
            }
        }

        return resultado;
    }

    public static void exibir(String posicoes[]){

        for (String i : posicoes) {
            System.out.println(i);
        }
    }
}