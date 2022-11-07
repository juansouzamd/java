import java.util.*;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int x = in.nextInt();

        System.out.println("Digite o segundo número");
        int y = in.nextInt();

        int max, min;
        int valor = 0;

        if (x < y){
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }


        for (int i = min+1; i < max; i++){

            if (i % 2 != 0){
                valor = valor + i;
            }
        }

        System.out.println(valor);

        in.close();

    }
  
}
