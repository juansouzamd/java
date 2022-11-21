import java.util.Scanner;
import java.util.Random;

class Ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("--------EXERCÍCIO 10--------");

        System.out.println("Informe a qtd de alunos: ");
        int tam = ler.nextInt();

        int tamGrupos = tam / 2;

        int[] grupo1 = new int[tamGrupos];
        int[] grupo2 = new int[tamGrupos];

        for (int i = 0; i < tamGrupos; i++) {
            grupo1[i] = gerarNovo(tam, grupo1, grupo2);
            grupo2[i] = gerarNovo(tam, grupo1, grupo2);
        }

        exibirArray(grupo1);
        exibirArray(grupo2);
    }

    public static void exibirArray(int[] arr) {
        for (int item : arr) {
            System.out.printf("%d - ", item);
        }
        System.out.println();
    }

    public static int buscar(int num, int[] numeros) {
        int pos = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                pos = i;
            }
        }

        return pos;
    }

    public static int gerarNovo(int tamSala, int[] grupo1, int[] grupo2) {
        Random rand = new Random();

        int num = 0;
        do {
            num = rand.nextInt( tamSala + 1);
        } while (buscar(num, grupo1) != -1 ||
                buscar(num, grupo2) != -1);

        return num;
    }

}