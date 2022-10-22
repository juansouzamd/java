import java.util.*;

class ex06For {
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
        String asterisco = "* ";

        for (int i = 1; i <= tamanho; i++){
            System.out.print(asterisco);
        }
            
}
}
