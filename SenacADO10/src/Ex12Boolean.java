import java.util.*;

class ExBoolean {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 12 =====");

        System.out.println("Digite seu número");
        int numero = ler.nextInt();

        boolean numeroPrimo = ehPrimo(numero);

        if (numeroPrimo) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }

    }

    public static boolean ehPrimo(int numero) {
        boolean resultado;
        int divisoes = 0;

        if (numero == 0 || numero == 1) {
            resultado = false;
        } else {
            for (int contador = 1; contador <= numero; contador++) {
                if (numero % contador == 0) {
                    divisoes++;
                }
            }
            if (divisoes == 2) {
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }
}