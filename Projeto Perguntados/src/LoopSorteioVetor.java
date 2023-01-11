import java.util.*;

public class LoopSorteioVetor {
    public static void main(String[] args) {
        Random rdn = new Random();

        int repeticao = 0;
        int contador = 0;

        int vetorNumerosSorteados[] = {-1, -1, -1, -1, -1};

        for (int c = 0; c < 5; c++) {

            int numeroSorteado = rdn.nextInt(5);

           while(repeticao != 5) {

            if (vetorNumerosSorteados[repeticao] == numeroSorteado) {

                numeroSorteado = rdn.nextInt(5);
                repeticao = 0;
               
            }else {
                repeticao++;
            }
            
           }

            vetorNumerosSorteados[contador] = numeroSorteado;
            contador++;

            for (int vet : vetorNumerosSorteados) {
                System.out.println(vet);
            }

            repeticao = 0;
        }
    }
}