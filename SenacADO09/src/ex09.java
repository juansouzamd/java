import java.util.*;

class ex09 {
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
        int contador = 1;
        int resultado = 0;

        while(contador <= 10){
            resultado = contador * numeroTabuada;
            System.out.println(numeroTabuada + " x " + contador + " = " + resultado);

         contador++;
        }

    }
}
