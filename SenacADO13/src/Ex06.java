import java.util.*;

class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 6 =====\n");

        System.out.println("Digite quantos números deseja da sequência de Fibonacci:");
        int tamanho = ler.nextInt();

        int vetorFibonacci[] = sequenciaFibonacci(tamanho);

        System.out.println("\nSequência de Fibonacci com "+tamanho+" números:");

        exibir(vetorFibonacci);

    }

    public static int[] sequenciaFibonacci(int tamanho) {
        int vetorFibo[] = new int[tamanho];

        int fibo = 0;
        int a = 0;
        int b = 1;
        int valor = 0;

        while (fibo < tamanho) {

            valor = a + b;
            b = a;
            a = valor;

            vetorFibo[fibo] = valor;
            fibo++;

        }
        return vetorFibo;
    }

    public static void exibir(int numeros[]){

        for (int i : numeros) {
            System.out.print(i+ " ");
        }
    }
}