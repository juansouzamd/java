import java.util.Scanner;

class Ex01Prof {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=== Exercício 01 ===");
        System.out.println("Informe as tarefas seguidas de <enter> ou 'sair'");

        String[] tarefas = new String[0];
        String opcao = ler.nextLine();

        while (!opcao.equals("sair")) {
            tarefas = adicionar(opcao, tarefas);

            opcao = ler.nextLine();
        }

        System.out.println("\nSua lista de tarefas:");
        exibir(tarefas);
    }

    public static String[] adicionar(String novaTarefa, String[] tarefas) {

        String[] novo = new String[tarefas.length + 1];
        for (int i = 0; i < tarefas.length; i++) {
            novo[i] = tarefas[i];
        }
        novo[tarefas.length] = novaTarefa;

        return novo;
    }

    public static void exibir(String[] tarefas) {
        int num = 0;
        for (String item : tarefas) {
            System.out.printf("%d. %s \n", ++num, item);
        }
    }
}