import java.util.*;

class Teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int vetor = in.nextInt();

        int[] numeros = new int[vetor];

        for (int i = 0; i < vetor; i++) {
            System.out.println("Digite o número");
            numeros[i] = in.nextInt();

        }

        System.out.println();

        for (int num : numeros) {

            System.out.println(num);
        }

        System.out.println();

        int contador = 0;
        int seq = 0;

        for (int i = 1; i <  vetor; i++) {
            if (numeros[i] - numeros[contador] == 1) {
                seq++;

                if (i != vetor-1){
                    if (numeros[i + 1] - numeros[contador + 1] != 1) {
                        seq++;
                    }
                } else if (numeros[contador] - numeros[i]  == -1) {
                        seq++;
    
                }
                
            }
            contador++;
        }

        int vetorArmazenar[] = new int[seq];
        int newContador = 0;
        int j = 0;
        int quebras = 0;

        for (int i = 1; i < vetor; i++) {
            if (numeros[i] - numeros[newContador] == 1) {

                vetorArmazenar[j] = numeros[newContador];
                j++;

                if (i != vetor-1){

                if (numeros[i + 1] - numeros[newContador + 1] != 1) {

                    vetorArmazenar[j] = numeros[newContador + 1];
                    j++;
                    quebras++;
                }

            } else if (numeros[newContador] - numeros[i]  == -1) {

                vetorArmazenar[j] = numeros[newContador + 1];
                    j++;
                    quebras++;

            }
            }

            newContador++;
        }

        for (int vet : vetorArmazenar) {
            System.out.println(vet);
        }

        System.out.println();

        System.out.println(seq);
        System.out.println(quebras);


        in.close();

    }
}