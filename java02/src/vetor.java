import java.util.*;

public class Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);


        System.out.println("Digite o tamanho do vetor");
            int tamanho = in.nextInt();

        double [] lista = new double [tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite o numero");
                
            lista [i] = in.nextDouble();
        }

        for (int j = 0; j < tamanho; j++){

            System.out.println(lista[j]);
        }

        in.close();
    }
}
