import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("===== Exercício 1 =====");

    int tamanhoVetor = 5;
    int numeros[] = new int [tamanhoVetor];

    for (int i = 0; i < tamanhoVetor; i++){
        System.out.println("Digite o número:");
        numeros[i] = ler.nextInt();
    }

    exibir(numeros);

    }

    public static void exibir(int numeros[]){
        System.out.println("Você digitou os números:");
        for (int num : numeros){
            System.out.println(num);
        }
    }
}
