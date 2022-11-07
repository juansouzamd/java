import java.util.*;

class AnoBissexto {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

    System.out.println("Programa para verificar se um ano é bissexto");
    System.out.println("Insira o ano");

    int ano = in.nextInt();

    boolean bissexto = (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));

    System.out.println("É bissexto? "+bissexto);

    in.close();
    }
}
