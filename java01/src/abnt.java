import java.util.*;

class Abnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
    System.out.println("Programa para fomatar ABNT");

    System.out.println("Insira o nome do autor");
    String nomeAutor = in.nextLine();
    System.out.println("Insira a obra");
    String obra = in.nextLine();
    System.out.println("Insira a cidade");
    String cidade = in.nextLine();
    System.out.println("Insira a editora");
    String editora = in.nextLine();

    System.out.println("Insira o ano de lançamento");
    int anoLancamento = in.nextInt();

    String pegarUltimoNome = nomeAutor.substring(nomeAutor.lastIndexOf(" "));
    String ultimoNome = pegarUltimoNome.trim();

    char primeiraLetraNome = nomeAutor.charAt(0);

    String pegarSobrenome = nomeAutor.substring(nomeAutor.indexOf(" "), nomeAutor.lastIndexOf(" "));

    String tirarEspacoSobrenome = pegarSobrenome.trim();
    
    String primeiraLetraSobrenome = tirarEspacoSobrenome.substring(0, 1);

    System.out.println(ultimoNome+ ", "+primeiraLetraNome+ ". "+ primeiraLetraSobrenome+ ". "+obra+ ". "+cidade+ ": "+editora+ ", "+anoLancamento+ ".");

    in.close();
    }
}