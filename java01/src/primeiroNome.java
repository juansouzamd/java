import java.util.*;

class PrimeiroNome {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("Programa de mensagem de boas vindas");
    System.out.println("Digite seu nome:");

    String nome = in.nextLine();

    String primeiroNome = nome.substring(0 , nome.indexOf(" "));

    System.out.println("Seja bem-vindo "+primeiroNome+"!");

    }
}
