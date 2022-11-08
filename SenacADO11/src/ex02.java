import java.util.*;

class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPrograma para adivinhar o número, você tem 10 tentativas");

        int numSorteado = sortearNumero();
        String jogada = "";
        char resposta;

        do {

            for (int tentativa = 1; tentativa <= 10; tentativa++) {

                if (tentativa == 1){
                    System.out.println("\nO número já foi sorteado\n");
                }

                System.out.println("Digite sua tentativa número " + tentativa + ":");
                int numUsuario = ler.nextInt();

                jogada = ganhou(numSorteado, numUsuario, tentativa);

                if (jogada.equalsIgnoreCase("Parabéns você acertou")) {
                    tentativa = 11;
                }

                System.out.println(jogada);

                if (jogada.equalsIgnoreCase("Você perdeu!!")) {
                    System.out.println("O número sorteado era " + numSorteado);
                }

            }

            System.out.println("\nDeseja jogar novamente? (S ou N)");
            resposta = ler.next().toUpperCase().charAt(0);

            while (resposta != 'S' && resposta != 'N') {
                System.out.println("\nResposata inválida digite novamente:");
                resposta = ler.next().toUpperCase().charAt(0);
            }

        } while (resposta == 'S');
    }

    public static int sortearNumero() {
        Random rdn = new Random();
        int n = rdn.nextInt(1000);
        return n;
    }

    public static String ganhou(int sorteado, int numUsuario, int tentativa) {
        String resposta = "";

        if (numUsuario == sorteado) {
            resposta = "Parabéns você acertou";

        } else if (numUsuario < sorteado) {
            resposta = "O número é maior";

        } else {
            resposta = "O número é menor";

        }

        if (tentativa == 10 && numUsuario != sorteado) {
            resposta = "Você perdeu!!";
        }

        return resposta;
    }

}