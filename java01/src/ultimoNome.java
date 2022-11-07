import java.util.*;

class UltimoNome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa de boas vindas último nome");
    System.out.println("Insira seu nome completo:");

    String nome = in.nextLine();

    String ultimoNome = nome.substring(nome.lastIndexOf(" "));
    String ultimoNomeSemEspaco = ultimoNome.trim();

    System.out.println("Seja bem-vindo "+ultimoNomeSemEspaco);

    }
}
