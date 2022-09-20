import java.util.*;

class primeiroNome {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("Programa de mensagem de boas vindas");
    System.out.println("Digite seu nome:");

    String nome = in.nextLine();

    String primeiroNome = nome.substring(0 , nome.indexOf(" "));

    System.out.println("Seja bem-vindo "+primeiroNome+"!");

    }
}
