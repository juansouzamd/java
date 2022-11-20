import java.util.*;

class Ex10 {
    public static void main(String[] args) {

        System.out.println("\n===== Exercício 3 =====");

        System.out.println("\nPrograma para analisar se duas pessoas são compatíveis em uma rede social\n");

        int tamanhoVetor = 5;

        String interessesPessoa01[] = new String[tamanhoVetor];
        String interessesPessoa02[] = new String[tamanhoVetor];

        System.out.println("Digite os interesses da primeira pessoa");

        interessesPessoa01 = preencherInteresses(tamanhoVetor);

        System.out.println("\nDigite os interesses da segunda pessoa");

        interessesPessoa02 = preencherInteresses(tamanhoVetor);

       int porcentagem = porcentagemCompararInteresses(tamanhoVetor, interessesPessoa01, interessesPessoa02);

       if (porcentagem > 50){
        System.out.println("\nDeu Match!");
        System.out.println("Similaridade: "+porcentagem+"%");
       } else {
        System.out.println("Fila anda!");
       }

    }

    public static String[] preencherInteresses(int tamanho) {
        Scanner ler = new Scanner(System.in);

        String interesse[] = new String[tamanho];

        for (int i = 0; i < interesse.length; i++) {
            System.out.println(i + 1 + " interesse:");
            interesse[i] = ler.next();
        }
        return interesse;
    }

    public static int porcentagemCompararInteresses(int tamanho, String vetorInteresse01[], String vetorInteresse02[]) {
        int cont = 0;

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {

                if (vetorInteresse01[j].equalsIgnoreCase(vetorInteresse02[i])) {
                    cont++;
                }
            }
        }
        int porcentagem = (cont * 100) / tamanho;
        return porcentagem;
    }
}