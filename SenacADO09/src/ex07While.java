import java.util.*;

class Ex07While {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 7 =====");

    System.out.println("Digite seu número do tamanho");
        int numero = in.nextInt();

    System.out.println(); //pular linha

    quadrado(numero);

    in.close();

    }

    public static void quadrado(int tamanho){
        int contador01 = 1;
        int contador02 = 1;
        String asterisco = "* ";

        while (contador01 <= tamanho){

            while(contador02 <= tamanho){
                System.out.print(asterisco);
                contador02++;
            }

         System.out.println();
         contador01++;
         contador02 = 1;
        }

        
}
}
