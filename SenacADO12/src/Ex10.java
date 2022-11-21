import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 10 =====");

        System.out.println("\nDigite um número para sortear dois grupos");
        int numero = ler.nextInt();

        int tamanhoGrupo01 = 0, tamanhoGrupo02 = 0, dividirGrupos = 0;

        if(numero % 2 == 1){
            dividirGrupos = (numero - 1) / 2;
            tamanhoGrupo01 = dividirGrupos +1;
            tamanhoGrupo02 = dividirGrupos;

        } else {
            tamanhoGrupo01 = numero / 2;
            tamanhoGrupo02 = numero / 2;
        }


        int primeiroGrupo[] = gerarPrimeiroGrupo(tamanhoGrupo01, numero);

        int segundoGrupo[] = gerarSegundoGrupo(primeiroGrupo, tamanhoGrupo02, numero);

        exibir(primeiroGrupo, segundoGrupo);
    }

    public static int[] gerarPrimeiroGrupo(int tamanhoGrupo01, int numero){
        Random rnd = new Random();
        int vetorGrupo01[] = new int [tamanhoGrupo01];
        int numeroSorteado = 0;

        for (int i = 0; i < vetorGrupo01.length; i++){

            numeroSorteado = rnd.nextInt(numero)+1;

            for(int j = 0; j < vetorGrupo01.length; j++){

                if (numeroSorteado == vetorGrupo01[j]){

                    numeroSorteado = rnd.nextInt(numero)+1;
                    j = -1;

                } 

            }

            vetorGrupo01[i] = numeroSorteado;

        }
        return vetorGrupo01;
    }

    public static int[] gerarSegundoGrupo(int primeiroGrupo[], int tamanhoGrupo02, int numero){

        Random rnd = new Random();
        int vetorGrupo02[] = new int [tamanhoGrupo02];
        int numeroSorteado = 0;

        for (int i = 0; i < vetorGrupo02.length; i++){

            numeroSorteado = rnd.nextInt(numero)+1;

            for(int v = 0; v < primeiroGrupo.length; v++){

                if (numeroSorteado == primeiroGrupo[v]){
                    numeroSorteado = rnd.nextInt(numero)+1;
                    v = -1;
                }
            }

            for(int j = 0; j < vetorGrupo02.length; j++){

                if (numeroSorteado == vetorGrupo02[j]){

                    numeroSorteado = rnd.nextInt(numero)+1;
                    j = -1;

                    for(int h = 0; h < primeiroGrupo.length; h++){

                        if (numeroSorteado == primeiroGrupo[h]){
                            numeroSorteado = rnd.nextInt(numero)+1;
                            h = -1;
                        }
                    }

                }
            }

            vetorGrupo02[i] = numeroSorteado;

        }
        return vetorGrupo02;
    }

    public static void exibir(int primeiroGrupo[], int segundoGrupo[]){

        System.out.println("\nPrimeiro grupo:");
        for (int i : primeiroGrupo) {
            System.out.print(i +" ");
        }

        System.out.println("\nSegundo grupo:");
        for (int i : segundoGrupo) {
            System.out.print(i +" ");
        }
    }
}
