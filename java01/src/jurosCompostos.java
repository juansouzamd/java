import java.util.*;

class JurosCompostos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa para calcular os juros composto");

    System.out.println("Insira o valor da compra:");
    double valor = in.nextDouble();

    System.out.println("Insira o número de parcelas:");
    int parcelas = in.nextInt();

    System.out.println("Insira a taxa de juros:");
    double juros = in.nextDouble();

    double jurosCompostos = (valor * Math.pow((juros/100) + 1, parcelas));
    double parcelasPorMes = jurosCompostos / parcelas;

    System.out.println("Sua compra ficará R$ " +jurosCompostos +" em "+parcelas +"x de R$ " + parcelasPorMes + " por mês.");
    }
}
