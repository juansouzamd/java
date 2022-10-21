import java.util.*;

class ex10 {
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
        int contador = 0;
        int letrasMenagem = mensagem.length();

    while(contador < letrasMenagem){

        System.out.println(mensagem.charAt(contador));

        contador++;
    }


    }
}