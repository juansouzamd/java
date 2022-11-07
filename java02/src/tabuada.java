import java.util.*;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("Programa da tabuada");

    System.out.println("Digite o número de qual tabuada deseja");
        int tabuada = in.nextInt();

        if (tabuada < 0){
            System.out.println("Impossível de calcular");
        } else {
            
            for (int i = 0; i <= 10; i++){
                System.out.println(tabuada+" x "+i+" = "+tabuada*i);
            }

        }
        in.close();
    }
}
