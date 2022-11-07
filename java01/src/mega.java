import java.util.*;

class Mega {
  public static void main(String[] args){
  Scanner entrada = new Scanner (System.in);
  Random aleatorio = new Random();

  System.out.println("Números da mega sena");

  for (int i = 1; i < 7; i++) {
            System.out.println(aleatorio.nextInt(61));
     }
}
}
