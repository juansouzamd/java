import java.util.*;

class Imc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.println("Programa para calcular o IMC");
    
    System.out.println("Insira sua altura:");
    double altura = in.nextDouble();

    System.out.println("Insira seu peso:");
    double peso = in.nextDouble();

    double imc = (peso / (altura * altura));

    System.out.println("Seu imc é " +imc);
    
    }
}
