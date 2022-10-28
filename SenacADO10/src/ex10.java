import java.util.*;

class ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 10 =====");

        System.out.println("Digite sua frase");
        String frase = ler.nextLine();

        String textoFinal = palindromo(frase);

        System.out.println(textoFinal);

        ler.close();
    }
    public static String palindromo(String texto){
        String resultado = "";
        
        for (int contador = texto.length()-1; contador >= 0; contador--){
            char letra = texto.charAt(contador);
            
            resultado = resultado + letra;
        }

            String verificar = "";

        if (texto.equalsIgnoreCase(resultado)){
            verificar = "É um palíndromo";
        } else {
            verificar = "Não é um palíndromo";
        }
        return verificar;
    }
}