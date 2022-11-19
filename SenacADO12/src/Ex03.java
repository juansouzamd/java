import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("===== Exercício 3 =====");

    int tamanhoVetor = 5;
    String numeros[] = new String [tamanhoVetor];

    for (int i = 0; i < tamanhoVetor; i++){
        System.out.println("Digite o nome:");
        numeros[i] = ler.next();
    }

    System.out.println(); // pular linha

    exibir(numeros);

    }

    public static void exibir(String numeros[]){
        System.out.println("Você digitou os nomes:");
        for (String num : numeros){
            System.out.println(num);
        }
    }
}