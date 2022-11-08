import java.util.*;

class Ex01For {
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

        for(int i = 1; i <= num; i++ ){
            System.out.println(i);
        }
        
}
}
