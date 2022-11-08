import java.util.*;

class Ex10For {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 10 =====");

    System.out.println("Digite sua frase");
        String frase = in.nextLine();

    System.out.println(); //pular linha

    soletrar(frase);

    in.close();

}

    public static void soletrar(String mensagem){

        int letrasMenagem = mensagem.length();

        for (int i = 0; i < letrasMenagem; i++){

            System.out.println(mensagem.charAt(i));

        }
}
}