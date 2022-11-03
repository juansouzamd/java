import java.util.*;

public class matriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz");
        int linhas = in.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz");
        int colunas = in.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o numero");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
