import java.util.*;

class Ex06While {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 6 =====");

    System.out.println("Digite seu número do tamanho");
        int numero = in.nextInt();

    System.out.println(); //pular linha

    linha(numero);

    in.close();

    }

    public static void linha(int tamanho){
        int contador = 1;
        String asterisco = "* ";

        while(contador <= tamanho){
            System.out.print(asterisco);
            contador++;
        }
        
}
}