import java.util.*;

class hipotenusa {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

    System.out.println("Programa para calcular a Hipotenusa");

    System.out.println("Insira o cateto oposto:");
    double catetoOposto = in.nextDouble();

    System.out.println("Insira o cateto adjacente:");
    double catetoAdjacente = in.nextDouble();

    double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));

    System.out.println("A hipotenusa é "+hipotenusa);
    
    }
}
