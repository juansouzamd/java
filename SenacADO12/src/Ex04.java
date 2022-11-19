import java.util.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 4 =====");

        System.out.println("Digite o tamanho do vetor");
        int tamanho = ler.nextInt();

        int array[] = criarArray(tamanho);

        System.out.println(); // pular linha

        exibir(array);

    }

    public static int[] criarArray(int tamanho){
        Scanner ler = new Scanner (System.in);
        int vetor[] = new int [tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o número:");
            vetor[i] = ler.nextInt();
        }
        return vetor;
    }

    public static void exibir(int vetor[]){
        for(int vet : vetor){
            System.out.println(vet);
        }
    }
}
