import java.util.*;

class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 6 =====");

        System.out.println("Digite o número base");
        int numeroBase = ler.nextInt();

        System.out.println("Digite o número expoente");
        int numeroExpoente = ler.nextInt();

        String resultadoFinal = "";
        int valorFinal = 0;

        if (numeroBase < 0 || numeroExpoente < 0) {
            resultadoFinal = "Calculo inválido";
        } else {
            valorFinal = potenciaN(numeroBase, numeroExpoente);
            resultadoFinal = numeroBase + " elevado a " + numeroExpoente + " é " + valorFinal;
        }

        System.out.println(resultadoFinal);

        ler.close();
    }

    public static int potenciaN(int numero, int expoente) {
        int resultado = numero;

        if (expoente == 0) {
            resultado = 1;
        } else {
            for (int contador = numero; contador <= expoente; contador++) {
                resultado = resultado * numero;
            }
        }
        return resultado;
    }
}