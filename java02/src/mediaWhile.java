import java.util.*;

public class mediaWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    double nota  = in.nextDouble();
    int contador = 0;
    double media = 0;
    double valor = 0;


        while (nota >= 0){
            contador = contador +1;
            valor = valor + nota;
            nota = in.nextDouble();
        }

        if (contador > 0){
            media = valor / contador; 
            System.out.printf("%.2f.%n",media);    
        } else {
            System.out.println("Impossivel de calcular");
        }

        in.close();
    }
}
