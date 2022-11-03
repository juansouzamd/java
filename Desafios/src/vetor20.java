import java.util.*;

class vetor20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * System.out.println("Digite o tamanho do vetor");
         * int vetor = in.nextInt();
         * 
         * int [] numeros = new int [vetor];
         * 
         * for (int i = 0; i < vetor; i++){
         * System.out.println("Digite o número");
         * numeros[i] = in.nextInt();
         * 
         * }
         * 
         * System.out.println();
         * 
         * for (int num : numeros){
         * 
         * System.out.println(num);
         * }
         * 
         * System.out.println();
         */

        int vetor[] = { 3, 1, 2, 3, 8, 4, 5, 6, 7, 8, 3};
        int contador = 0;
        int seq = 0;

          for (int i = 1; i < 11; i++){
            if (vetor[i] - vetor[contador] == 1){
              seq++;
            }
            contador++;
          }

          

          System.out.println(seq);

        in.close();

    }
}
