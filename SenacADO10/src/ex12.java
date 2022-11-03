import java.util.*;

class ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 12 =====");

        System.out.println("Digite seu número");
        int numero = ler.nextInt();

        String numeroPrimo = ehPrimo(numero);

        System.out.println(numeroPrimo);

        ler.close();

    }

    public static String ehPrimo(int numero) {
        String resultado = "";
        int divisoes = 0;

        if (numero == 0 || numero == 1) {
            resultado = "Não é um número primo";
        } else {
            for (int contador = 1; contador <= numero; contador++) {

                if (numero % contador == 0) {
                    divisoes++;
                }
            }

            if (divisoes == 2) {
                resultado = "É um número primo";
            } else {
                resultado = "Não é um número primo";
            }
        }
        return resultado;
    }

}