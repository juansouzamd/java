import java.util.*;

class senha02 {
  public static void main (String[] args){
    Scanner in = new Scanner (System.in);
    
    System.out.print("Digite uma senha: ");
    String senha = in.next();

    String verifica = senha.replaceAll("[!, @, #, $, %, *, &,, (, )]", "@");
    String verifica2 = verifica.replaceAll("[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]", "#");

    int numero = verifica2.indexOf("@");
    int numero2 = verifica2.lastIndexOf("@");

    System.out.println(numero);
    System.out.println(numero2);

    int numero3 = verifica2.indexOf("#");
    int numero4 = verifica2.lastIndexOf("#");

    System.out.println(numero3);
    System.out.println(numero4);

    int tamanho = senha.length();

    if (tamanho >= 8 && numero != numero2 && numero3 != numero4){
      System.out.println("Senha forte");
    } else {
      System.out.println("Senha fraca");
    }
  }
}
