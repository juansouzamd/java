import java.util.*;

class ex07For {
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
       
        String asterisco = "* ";

        for (int i = 1; i <= tamanho; i++){

            for (int j = 1; j <= tamanho; j++){
                System.out.print(asterisco);
            }

            System.out.println();
        }

}
}