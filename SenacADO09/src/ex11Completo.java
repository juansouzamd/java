import java.util.*;

class ex11Completo {
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
    int contador = 0;
    int numeroAscii = 0;
    int posicao = 1;
    int letrasMenagem = mensagem.length();

    while(contador < letrasMenagem){

        numeroAscii = mensagem.charAt(contador);

        if (numeroAscii == 32){
            System.out.println("Espaço");

        } else {
            System.out.println("Letra " + posicao + " = " + mensagem.charAt(contador));
            posicao++;
        }

        contador++;
    }
}
}
