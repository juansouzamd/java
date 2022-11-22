import java.util.*;

public class projetoIntegrador01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nInforme a quantidade de vendedores:");
        int quantidade = in.nextInt();

        System.out.println("\nInforme o nome dos vendedores:");

        String nomeVendedores[] = criarVetorNome(quantidade);

        System.out.println("\nInforme o valor das vendas dos vendedores:");

        double valorTotalDeVendas[] = criarVetorVendas(quantidade);

        System.out.println("\nInforme o percetual das vendas dos vendedores:");

        int percentualDeVendas[] = criarVetorPercentual(quantidade);

        double valorParaReceber[] = calculoComissaoVendas(valorTotalDeVendas, percentualDeVendas, quantidade);

        int posicaoDoMaiorValor = calculoMaiorValor(valorParaReceber);

        int posicaoDoMenorValor = calculoMenorValor(valorParaReceber);

        double totalDeVendasTodosVendedores = calculoDeTodosVendedores(valorTotalDeVendas);

        System.out.println("\nRelatório com os nomes dos vendedores e os valores e os valores a receber referentes a comissão:\n");

        for(int i = 0; i< quantidade; i++){
            System.out.println(nomeVendedores[i] + " vai receber " + valorParaReceber[i]);
        }

        System.out.println("\nTotal de vendas de todos os vendedores:");

        System.out.println("O valor é " + totalDeVendasTodosVendedores);

        System.out.println("\nMaior valor a receber e o nome de quem receberá:");

        System.out.println(nomeVendedores[posicaoDoMaiorValor] + " vai receber o maior valor que é "+ valorParaReceber[posicaoDoMaiorValor]);

        System.out.println("\nMenor valor a receber e o nome de quem receberá:");

        System.out.println(nomeVendedores[posicaoDoMenorValor] + " vai receber o menor valor que é "+ valorParaReceber[posicaoDoMenorValor]+"\n");

    }

    public static String[] criarVetorNome(int tamanho) {
        Scanner in = new Scanner(System.in);
        String nomeVendedores[] = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("digite o nome do " + (i + 1) + " vendedor");
            nomeVendedores[i] = in.next();
        }
        return nomeVendedores;
    }

    public static double[] criarVetorVendas(int tamanho) {
        Scanner in = new Scanner(System.in);
        double numeroVendas[] = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("digite o total de vendas do " + (i + 1) + " vendedor");
            numeroVendas[i] = in.nextDouble();
        }
        return numeroVendas;
    }

    public static int[] criarVetorPercentual(int tamanho) {
        Scanner in = new Scanner(System.in);
        int comissao[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("digite a comissão do " + (i + 1) + " vendedor");
            comissao[i] = in.nextInt();
        }
        return comissao;
    }

    public static double[] calculoComissaoVendas(double valorTotalDeVendas[], int percentualDeVendas[], int quantidade) {

        double valorComissaoCalculado[] = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            valorComissaoCalculado[i] = (valorTotalDeVendas[i] * percentualDeVendas[i]) / 100;
        }

        return valorComissaoCalculado;
    }

    public static int calculoMaiorValor(double valorParaReceber[]) {
        double valor = valorParaReceber[0];
        int posicao = 0;

        for (int i = 1; i < valorParaReceber.length; i++) {

            if (valor < valorParaReceber[i]) {
                valor = valorParaReceber[i];
                posicao = i;
            }
        }
        return posicao;
    }

    public static int calculoMenorValor(double valorParaReceber[]) {
        double valor = valorParaReceber[0];
        int posicao = 0;

        for (int i = 1; i < valorParaReceber.length; i++) {

            if (valor > valorParaReceber[i]) {
                valor = valorParaReceber[i];
                posicao = i;
            }
        }
        return posicao;
    }

    public static double calculoDeTodosVendedores(double valorTotalDeVendas[]){
        double valor = 0;

        for(int i = 0; i < valorTotalDeVendas.length; i++){
            valor += valorTotalDeVendas[i];
        }
        return valor;
    }
}
