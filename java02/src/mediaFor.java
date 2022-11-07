import java.util.*;

public class MediaFor {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);

    System.out.println("Programa da média");

    System.out.println("Digite quantidade de notas que deseja fazer a média");
        int quantidade = in.nextInt();

    String x = "";
    double contador = 0;
    double notas = 0;
    double valor = 0;

    if (quantidade <= 0){
        x = "Impossível de calcular";
    } else {

        for(int i = 0; i < quantidade; i++){
        System.out.println("Digite a nota");
            notas = in.nextDouble();
            contador = contador + 1;
            valor = valor + notas;
        } 

        double media = valor / contador;
        x = "Sua média é "+media;

    }

    System.out.println(x);
    in.close();

    }
}
