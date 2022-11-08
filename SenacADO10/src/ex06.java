import java.util.*;

class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 6 =====");

        System.out.println("Digite o número base");
        int numeroBase = ler.nextInt();

        System.out.println("Digite o número expoente");
        int numeroExpoente = ler.nextInt();

        System.out.println(); // pular linha

        String resultado = potenciaN(numeroBase, numeroExpoente);

        System.out.println(resultado);

        ler.close();
    }

    public static String potenciaN(int numero, int expoente) {
        String resultadoFinal = "";
        int valor = numero;

        if (numero < 0 || expoente < 0) {
            resultadoFinal = "Calculo inválido";
        } else {
            if (expoente == 0) {
                valor = 1;
                resultadoFinal = numero + " elevado a " + expoente + " é " + valor;
            } else {
                for (int contador = 2; contador <= expoente; contador++) {
                    valor = valor * numero;
                }
                resultadoFinal = numero + " elevado a " + expoente + " é " + valor;
            }
        }
        return resultadoFinal;
    }
}