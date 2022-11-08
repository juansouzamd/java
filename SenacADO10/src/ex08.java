import java.util.*;

class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 8 =====");

        System.out.println("Digite sua frase");
        String frase = ler.nextLine();

        String textoFinal = separar(frase);

        System.out.println(textoFinal);

        ler.close();
    }

    public static String separar(String texto) {
        String resultado = "";

        for (int contador = 0; contador < texto.length(); contador++) {
            char letra = texto.charAt(contador);

            if (letra == ' ') {
            } else if (contador == 0) {
                resultado = resultado + letra;
            } else {
                resultado = resultado + "-" + letra;
            }

        }
        return resultado.toUpperCase();
    }
}
