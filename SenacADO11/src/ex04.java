import java.util.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        mostra("===== Exercício 4 =====");
        mostra("Quantas palavras você quer digitar?");
        int totalPalavras = ler.nextInt();
        int acertos = 0;

        long inicio = new Date().getTime();

        for (int cont = 1; cont <= totalPalavras; cont++) {

            String palavra = gerarPalavra();
            mostra(palavra);
            mostra("Tente digitar: ");
            String palavraDigitada = ler.next();
            boolean acerto = acertou(palavra, palavraDigitada);

            if (acerto) {
                acertos++;
            }
        }

        String tempo = calculaTempo(inicio);
        precisao(acertos, totalPalavras, tempo);

    }

    public static String gerarPalavra() {
        String consoantes = "bcdfghjklmnpqrstvwxyz";
        String vogais = "aeiou";

        Random rdn = new Random();

        String novaPalavra = "";
        for (int i = 0; i < 8; i++) {
            char letra = ' ';
            if (i % 2 == 0) {
                letra = consoantes.charAt(rdn.nextInt(21));
            } else {
                letra = vogais.charAt(rdn.nextInt(5));
            }
            novaPalavra += letra;
        }
        return novaPalavra;
    }

    public static String calculaTempo(long inicio) {
        long fim = new Date().getTime();
        double tempoEmSeg = (fim - inicio) / 1000.0;
        return (Math.round(tempoEmSeg) + "segundos");
    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }

    public static void precisao(int acertos, int totalPalavras, String tempo) {
        double porcentagem = acertos * 1.0 / totalPalavras * 100;
        mostra("Seu teste terminou!");
        mostra("Precisão: " + porcentagem + "% - Tempo: " + tempo);
    }

    public static boolean acertou(String palavra, String palavraDigitada) {
        if (palavraDigitada.equalsIgnoreCase(palavra)) {
            return true;
        } else {
            return false;
        }
    }

}