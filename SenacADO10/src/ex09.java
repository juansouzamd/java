import java.util.*;

class ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 9 =====");

        System.out.println("Digite sua frase");
        String frase = ler.nextLine();

        String textoFinal = inverter(frase);

        System.out.println(textoFinal);

        ler.close();
    }

    public static String inverter(String texto) {
        String resultado = "";

        for (int contador = texto.length() - 1; contador >= 0; contador--) {
            char letra = texto.charAt(contador);

            resultado = resultado + letra;
        }
        return resultado;
    }
}