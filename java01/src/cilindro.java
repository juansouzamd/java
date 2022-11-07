import java.util.*;

class Cilindro {

  public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);

  System.out.println("Programa para verificar se o volume de um cilindro pode ser transferido para outro");
  System.out.println("Digite o diâmetro do primeiro cilindro");
  double diametro01 = entrada.nextDouble();
    
    System.out.println("Digite a altura do primeiro cilindro");
  double altura01 = entrada.nextDouble();
    
    System.out.println("Digite o diâmetro do segundo cilindro");
  double diametro02 = entrada.nextDouble();
    
    System.out.println("Digite a altura do segundo cilindro");
  double altura02 = entrada.nextDouble();

  double volume01 = Math.PI * ((Math.pow(diametro01/2, 2)) * altura01);
  double volume02 = Math.PI * ((Math.pow(diametro02/2, 2)) * altura02);

  System.out.println("O primeiro cilindro tem volume de "+volume01);
  System.out.println("O segundo cilindro tem volume de "+volume02);

  boolean transferir = ( volume01 <= volume02);

  System.out.println("É possível transferir o primeiro para o segundo?  "+transferir);

  }
}