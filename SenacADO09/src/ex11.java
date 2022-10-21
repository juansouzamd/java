import java.util.*;

class ex11 {
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
        int numero = 1;
        int letrasMenagem = mensagem.length();
        int espaco = mensagem.indexOf(" ");

    while(contador < letrasMenagem){

        if (contador == espaco){
            System.out.println("Espaço");
        } else {
            System.out.println("Letra " + numero + " = " + mensagem.charAt(contador));
            numero++;
        }
      
        contador++;
    }

    }
}
