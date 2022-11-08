import java.util.*;

class Ex11For {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("===== Exercício 11 =====");

    System.out.println("Digite sua frase");
        String frase = in.nextLine();

    System.out.println(); //pular linha

    soletrar(frase);

    in.close();

}

    public static void soletrar(String mensagem){
        int numero = 1;
        int letrasMenagem = mensagem.length();
        int espaco = mensagem.indexOf(" ");


        for (int i = 0; i < letrasMenagem; i++){

            if (i == espaco){
                System.out.println("Espaço");
            } else {
                System.out.println("Letra " + numero + " = " + mensagem.charAt(i));
                numero++;
            }

        }

    }
}
