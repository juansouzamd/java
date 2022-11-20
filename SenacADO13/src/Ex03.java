import java.util.*;

class Ex03 {
  public static void main(String[] args) {

    System.out.println("\n===== Exercício 1 =====");

    System.out.println("\nPrograma da loteria\n");

    int vetor[] = new int[15];

    vetor = gerarNumeros();

    exibirVetor(vetor);

  }

  public static int[] gerarNumeros() {
    Random rdn = new Random();

    int array[] = new int[15];
    int numSorteado, repeticao = 0;

    for (int i = 0; i < array.length; i++) {

      numSorteado = rdn.nextInt(25) + 1;

      while (repeticao != 15) {

        if (array[repeticao] == numSorteado) {

          numSorteado = rdn.nextInt(25) + 1;
          repeticao = 0;

        } else {
          repeticao++;
        }
      }

      array[i] = numSorteado;
      repeticao = 0;
    }
    return array;
  }

  public static void exibirVetor(int vetor[]) {

    for (int i = 0; i < vetor.length; i++) {

      if ( i == vetor.length-1){
        System.out.print(vetor[i]);

      } else if ((i + 1) % 5 == 0){
        System.out.print(vetor[i]);
        System.out.println();

      } else {
        System.out.print(vetor[i] + " - ");
      }
    }
    System.out.println("\n");
  }
}