import java.util.*;

class Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String resp;
        
        do {

            System.out.println("Programa para trasnformar celsius em fahrenheit");
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = in.nextDouble();

            double fah = 9*celsius/5 + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n",fah);

            System.out.println();

            System.out.print("Deseja repetir (s/n)? ");
            resp = in.next();

        } while(resp.equalsIgnoreCase("s"));


        in.close();

    }
}