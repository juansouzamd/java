import java.util.*;

class Ex05For {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 5 =====");

    System.out.println("Digite o primeiro número");
        int numero01 = in.nextInt();

    System.out.println("Digite o segundo número");
        int numero02 = in.nextInt();

    System.out.println(); //pular linha

    contarPares(numero01, numero02);

    in.close();

    }

    public static void contarPares(int numInicio, int numFim){

        for ( ; numInicio <= numFim; numInicio++){
            if (numInicio % 2 ==0){
                System.out.println(numInicio);
            }
        }          

}
}