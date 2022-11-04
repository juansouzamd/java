import java.util.*;

class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPrograma para adivinhar o número");

        int numero = sortearNumero();

        System.out.println("\nO número já foi sorteado.\n");
        int tentativa = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite sua tentativa número " + i + ":");
            tentativa = ler.nextInt();

            if (tentativa == numero) {
                System.out.println("Parabéns você acertou");
                i = 11;
            } else if (tentativa < numero) {
                System.out.println("O número é maior");
            } else {
                System.out.println("O número é menor");
            }

            if (i == 10 && tentativa != numero){
                System.out.println("Você perdeu!!");
            }
        }

        
    }

    public static int sortearNumero() {
        Random rdn = new Random();
        int n = rdn.nextInt(1000);
        return n;
    }

    public static String ganhou(int numeroSorteado) {
        Scanner ler = new Scanner(System.in);
        String resultado = "";

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite sua tentativa número " + i + ":");
            int tentativa = ler.nextInt();

            if (tentativa == numeroSorteado) {
                System.out.println("Parabéns você acertou");
                i = 11;
            } else if (tentativa < numeroSorteado) {
                System.out.println("O número é maior");
            } else {
                System.out.println("O número é menor");
            }
        }
        return resultado;
    }

}
