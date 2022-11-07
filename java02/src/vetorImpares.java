import java.util.*;

public class VetorImpares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Digite a quantidade de numeros que deseja armazenar");
        int array = in.nextInt();

        int [] vetor = new int [array];

    for (int i = 0; i < array; i++){
        System.out.println("Digite o numero");
        vetor[i] = in.nextInt();
             
    }

       for (int j = 0; j < array; j++){
        
        if (vetor[j] % 2 != 0){
            System.out.println(vetor[j]);
        }
       }



    in.close();
    }
}
