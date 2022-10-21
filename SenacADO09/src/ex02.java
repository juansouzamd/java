import java.util.*;

class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 2 =====");

    System.out.println("Digite seu número");
        int numero = in.nextInt();

    System.out.println(); //pular linha

    contarRegressivo(numero);

    in.close();

    }

    public static void contarRegressivo(int num){
    int contador = 1;

        while(contador <= num){
            System.out.println(num);
            num--;
        }
        
}
}
