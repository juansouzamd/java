import java.util.*;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 9 =====");

        System.out.println("\nDigite sua frase:");
        String frase = ler.nextLine();

        String vetorPalavras[] = mapearPalavras(frase);

        exibir(vetorPalavras);
    }

    public static String[] mapearPalavras(String frase){
        
        String palavras[] = frase.split(" ");
        return palavras; 
    }

    public static void exibir(String palavras[]){

        int tamanho = palavras.length;

        System.out.println("\nA frase contém "+tamanho+" palavras, são elas:");

        for (String vet : palavras){
            System.out.println(vet);
        }
    }
}
