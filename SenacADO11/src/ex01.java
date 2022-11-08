import java.util.*;

class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPrograma da calculadora\n");

        int opcao = exibirMenu();

        do {

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o primeiro número");
                    double numeroSoma01 = ler.nextDouble();

                    System.out.println("Digite o segundo número");
                    double numeroSoma02 = ler.nextDouble();

                    double resultadoSoma = somar(numeroSoma01, numeroSoma02);

                    System.out.println("O resultado é " + resultadoSoma);
                    break;

                case 2:
                    System.out.println("\nDigite o primeiro número");
                    double numeroSubtracao01 = ler.nextDouble();

                    System.out.println("Digite o segundo número");
                    double numeroSubtracao02 = ler.nextDouble();

                    double resultadoSubtracao = subtrair(numeroSubtracao01, numeroSubtracao02);

                    System.out.println("O resultado é " + resultadoSubtracao);
                    break;

                case 3:
                    System.out.println("\nDigite o primeiro número");
                    double numeroMultiplicacao01 = ler.nextDouble();

                    System.out.println("Digite o segundo número");
                    double numeroMultiplicacao02 = ler.nextDouble();

                    double resultadoMultiplicacao = multiplicar(numeroMultiplicacao01, numeroMultiplicacao02);

                    System.out.println("O resultado é " + resultadoMultiplicacao);
                    break;

                case 4:
                    System.out.println("\nDigite o primeiro número");
                    double numeroDivisao01 = ler.nextDouble();

                    System.out.println("Digite o segundo número");
                    double numeroDivisao02 = ler.nextDouble();

                    double resultadoDivisao = dividir(numeroDivisao01, numeroDivisao02);

                    System.out.println("O resultado é " + resultadoDivisao);
                    break;

                case 5:
                    System.out.println("\nDigite o primeiro número");
                    double numeroPotencia01 = ler.nextDouble();

                    System.out.println("Digite o segundo número");
                    double numeroPotencia02 = ler.nextDouble();

                    double resultadoPotencia = potencia(numeroPotencia01, numeroPotencia02);

                    System.out.println("O resultado é " + resultadoPotencia);
                    break;

                case 6:
                    System.out.println("\nDigite o número");
                    double numeroRaiz = ler.nextDouble();

                    double resultadoRaiz = raizQuadrada(numeroRaiz);

                    System.out.println("O resultado é " + resultadoRaiz);
                    break;

                case 0:
                    System.out.println("\nPrograma finalizado");
                    break;

                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }

            System.out.println();

            if (opcao != 0) {
                opcao = exibirMenu();
            }

        } while (opcao != 0);

    }

    public static int exibirMenu() {

        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potência");
        System.out.println("6. Raiz Quadrada");
        System.out.println("0. Sair");

        System.out.println();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o opcão desejada: ");
        int opcao = ler.nextInt();
        return opcao;
    }

    public static double somar(double n1, double n2) {
        double soma = n1 + n2;
        return soma;
    }

    public static double subtrair(double n1, double n2) {
        double subtracao = n1 - n2;
        return subtracao;
    }

    public static double multiplicar(double n1, double n2) {
        double multiplicacao = n1 * n2;
        return multiplicacao;
    }

    public static double dividir(double n1, double n2) {
        double divisao = n1 / n2;
        return divisao;
    }

    public static double potencia(double num, double exp) {
        double potenciacao = Math.pow(num, exp);
        return potenciacao;
    }

    public static double raizQuadrada(double num) {
        double raiz = Math.sqrt(num);
        return raiz;
    }
}