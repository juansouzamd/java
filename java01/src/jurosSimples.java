import java.util.*;

class jurosSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa para calcular os juros simples");

    System.out.println("Insira o valor da compra:");
    double valor = in.nextDouble();

    System.out.println("Insira o número de parcelas:");
    int parcelas = in.nextInt();

    System.out.println("Insira a taxa de juros:");
    double juros = in.nextDouble();

    double jurosSimples = ((valor * parcelas * juros) / 100) + valor;
    double parcelasPorMes = jurosSimples / parcelas;

    System.out.println("Sua compra ficará R$ " +jurosSimples +" em "+parcelas +"x de R$ " + parcelasPorMes + " por mês.");

    }
}
