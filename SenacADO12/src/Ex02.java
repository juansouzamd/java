import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("===== Exercício 2 =====");

    int tamanhoVetor = 5;
    double numeros[] = new double [tamanhoVetor];

    for (int i = 0; i < tamanhoVetor; i++){
        System.out.println("Digite o número:");
        numeros[i] = ler.nextDouble();
    }

    System.out.println(); // pular linha

    exibir(numeros);

    }

    public static void exibir(double numeros[]){
        System.out.println("Você digitou os números:");
        for (double num : numeros){
            System.out.println(num);
        }
    }
}