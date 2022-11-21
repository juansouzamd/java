import java.util.*;

class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n===== Exercício 8 =====\n");

        System.out.println("Informe a quantidade de alunos:");
        int quantidade = ler.nextInt();

        System.out.println();

        double vetorAlunos[] = criarArray(quantidade);

        double alunosOrdenados[] = ordenar(vetorAlunos);

        System.out.println("\nFila indiana:");

        exibir(alunosOrdenados);

    }

    public static double[] criarArray(int tamanho) {
        Scanner ler = new Scanner(System.in);
        double alunos[] = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe a altura do aluno " + (i + 1) + ":");
            alunos[i] = ler.nextDouble();
        }

        return alunos;
    }

    public static double[] ordenar(double alturas[]) {
        double menor = 0;

        for (int i = 1; i < alturas.length; i++) {
            
            for (int j = 0; j < i; j++) {

                if (alturas[i] < alturas[j]) {
                    menor = alturas[i];
                    alturas[i] = alturas[j];
                    alturas[j] = menor;
                }
            }
        }

        return alturas;
    }

    public static void exibir(double alturas[]) {

        for (double i : alturas) {
            System.out.println(i);
        }
    }
}
