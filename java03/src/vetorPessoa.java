import java.util.Locale;
import java.util.Scanner;

public class vetorPessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantodade de pessoas");
        int N = sc.nextInt();

        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Digite o nome");
            nomes[i] = sc.next();
            System.out.println("Digite a idade");
            idades[i] = sc.nextInt();
            System.out.println("Digite a altura");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma = soma + alturas[i];
        }

        double media = soma / N;
        System.out.printf("Altura media: %.2f%n", media);

        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                cont = cont + 1;
            }
        }

        double x = (double) cont * 100.0 / N;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
        
        sc.close();
    }
}