import java.util.*;

class Ex04While {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 4 =====");

    System.out.println("Digite o primeiro número");
        int numero01 = in.nextInt();

    System.out.println("Digite o segundo número");
        int numero02 = in.nextInt();

    System.out.println(); //pular linha

    contarRegressivo(numero01, numero02);

    in.close();

    }

    public static void contarRegressivo(int numFim, int numInicio){

        while(numFim >= numInicio){
            System.out.println(numFim);
            numFim--;
        }
        
}
}