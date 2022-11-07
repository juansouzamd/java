import java.util.*;

class Senha01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa para verificar se asenha é forte");
    System.out.println("Insira sua senha:");

    String senha = in.nextLine();

    boolean quantidade = senha.length() >= 6;

    boolean procuraNumero =  senha.indexOf("1") >= 0 ||
                             senha.indexOf("2") >= 0 ||
                             senha.indexOf("3") >= 0 ||
                             senha.indexOf("4") >= 0 ||
                             senha.indexOf("5") >= 0 ||
                             senha.indexOf("6") >= 0 ||
                             senha.indexOf("7") >= 0 ||
                             senha.indexOf("8") >= 0 ||
                             senha.indexOf("9") >= 0 ||
                             senha.indexOf("0") >= 0;

    boolean caractereEspecial =  senha.indexOf("!") >= 0 ||
                                 senha.indexOf("@") >= 0 ||
                                 senha.indexOf("#") >= 0 ||
                                 senha.indexOf("%") >= 0 ||
                                 senha.indexOf("&") >= 0 ||
                                 senha.indexOf("*") >= 0 ||
                                 senha.indexOf("(") >= 0 ||
                                 senha.indexOf(")") >= 0 ||
                                 senha.indexOf("^") >= 0 ||
                                 senha.indexOf("_") >= 0;

    boolean verificaSenha = procuraNumero && caractereEspecial && quantidade;

    System.out.println(verificaSenha);
                

    }
}
