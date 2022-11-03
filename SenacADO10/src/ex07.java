import java.util.*;

class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 7 =====");

        System.out.println("Digite sua frase");
        String frase = ler.nextLine();

        System.out.println(); // pular linha

        String textoFinal = separar(frase);

        System.out.println(textoFinal);

        ler.close();
    }

    public static String separar(String texto) {
        String resultado = "";

        for (int contador = 0; contador < texto.length(); contador++) {
            char letra = texto.charAt(contador);
            resultado = resultado + letra + "-";
        }
        return resultado;
    }

}
