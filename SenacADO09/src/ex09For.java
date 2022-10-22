import java.util.*;

class ex09For {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 9 =====");

    System.out.println("Digite o número da tabuada");
        int numero = in.nextInt();

    System.out.println(); //pular linha

    tabuada(numero);

    in.close();

}

    public static void tabuada(int numeroTabuada){
        int resultado = 0;

       for (int i = 1; i <= 10; i++){

            resultado = i * numeroTabuada;
            System.out.println(numeroTabuada + " x " + i + " = " + resultado);

       }

    }
}
