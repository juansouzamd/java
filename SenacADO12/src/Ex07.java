import java.util.*;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 7 =====");

        System.out.println("\nDigite a quantidade de notas:");
        int quantidade = ler.nextInt();

        double vetorNotas[] = criarArray(quantidade);

        double mediaFinal = media(vetorNotas);

        double menorNota = menor(vetorNotas);

        double maiorNota = maior(vetorNotas);

        System.out.println("\nA maior nota é " + maiorNota);
        System.out.println("A menor nota é " + menorNota);
        System.out.println("A média é " + mediaFinal + "\n");

        exibir(vetorNotas);
    }

    public static double[] criarArray(int tamanho) {
        Scanner ler = new Scanner(System.in);
        double array[] = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            array[i] = ler.nextDouble();
        }

        return array;
    }

    public static double media(double notas[]) {
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double mediaDasNotas = somaNotas / notas.length;
        return mediaDasNotas;
    }

    public static double menor(double notas[]) {
        double menorNota = 0, nota = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] < nota) {
                menorNota = notas[i];
                nota = notas[i];
            } else {
                menorNota = nota;
            }

        }
        return menorNota;
    }

    public static double maior(double notas[]) {
        double maiorNota = 0, nota = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > nota) {
                maiorNota = notas[i];
                nota = notas[i];
            } else {
                maiorNota = nota;
            }
        }
        return maiorNota;
    }

    public static void exibir(double notas[]) {

        System.out.println("Notas digitadas:");

        for (int i = 0; i < notas.length; i++) {

            if (notas.length - 1 == i) {
                System.out.print(notas[i]);
            } else {
                System.out.print(notas[i] + " - ");
            }

        }
    }
}
