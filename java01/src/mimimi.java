import java.util.*;

class Mimimi {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("Programa do MIMIMI");
    System.out.println("Insira sua mensagem");

    String mensagem = in.nextLine();

    String substituir = mensagem.replace("A","i")
                                .replace("a","i")
                                .replace("e","i")
                                .replace("o","i")
                                .replace("u","i")
                                .replace("á","i")
                                .replace("é","i");

    System.out.println(substituir);

    }
}