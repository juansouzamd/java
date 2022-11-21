import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 2 =====");

        System.out.println("Digite a quantidade de números:");
        int tamanho = ler.nextInt();

        int vetorNumeros[] = criarArray(tamanho);

        vetorNumeros = inverter(vetorNumeros);

        exibir(vetorNumeros);

    }

    public static int[] criarArray(int tamanho) {
        Scanner ler = new Scanner(System.in);
        int array[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + " número:");
            array[i] = ler.nextInt();
        }

        return array;
    }

    public static int[] inverter(int numeros[]) {

        int numeroAtual = 0, trocar = 0, percorrer = 0;
        int numArray = numeros.length - 1;

        if ((numeros.length - 1) % 2 == 0) {
            percorrer = (numeros.length - 1) / 2;
        } else {
            percorrer = numeros.length / 2;
        }

        for (int i = 0; i < percorrer; i++) {

            numeroAtual = numeros[numArray];
            trocar = numeros[i];

            numeros[i] = numeroAtual;
            numeros[numArray] = trocar;
            numArray--;
        }

        return numeros;
    }

    public static void exibir(int numeros[]){

        System.out.println("\nOs números invertidos são:");

        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }
    }
}