import java.util.*;

class ex01While {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 1 =====");

    System.out.println("Digite seu número");
        int numero = in.nextInt();

    System.out.println(); //pular linha

    contar(numero);

    in.close();

    }

    public static void contar(int num){
    int contador = 1;

        while(contador <= num){
            System.out.println(contador);
            contador++;
        }
        
}
}