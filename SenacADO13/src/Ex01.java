import java.util.*;

public class Ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean continuar = true;
        String tarefas[] = new String[10000];
        String novaTarefa;
        int cont = 1;

        System.out.println("\n===== Exercício 1 =====\n");

        while (continuar) {

            System.out.println("Informe a tarefa:");
            novaTarefa = ler.nextLine();

            tarefas = adicionar(tarefas, cont, novaTarefa);

            continuar = novarodada(novaTarefa, continuar);

            cont++;
        }

        System.out.println("\nSuas tarefas do dia são:");

        exibir(tarefas, cont);

    }

    public static String[] adicionar(String tarefas[], int cont, String novaTarefa) {

        for (int i = (cont - 1); i < cont; i++) {
            tarefas[cont-1] = cont + ". " + novaTarefa;
        }
        return tarefas;
    }

    public static boolean novarodada(String novaTarefa, boolean continuar) {

        if (novaTarefa.equalsIgnoreCase("sair")) {
            continuar = false;
        }
        return continuar;
    }

    public static void exibir(String tarefas[], int cont) {

        for (int i = 0; i < (cont-2); i++) {
            System.out.println(tarefas[i]);
        }
    }

}
