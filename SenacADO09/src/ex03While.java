import java.util.*;

class Ex03While {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 3 =====");

    System.out.println("Digite o primeiro número");
        int numero01 = in.nextInt();

    System.out.println("Digite o segundo número");
        int numero02 = in.nextInt();

    System.out.println(); //pular linha

    contar(numero01, numero02);

    in.close();

    }

    public static void contar(int numInicio, int numFim){

        while(numInicio <= numFim){
            System.out.println(numInicio);
            numInicio++;
        }
        
}
}
