import java.util.*;

 class ano {
  public static void main(String[] args) {
  Scanner in = new Scanner (System.in);
  
  int valor = in.nextInt();

  int ano = valor / 365;
    
  int diferenca = valor % 365;

  int meses = diferenca / 30;

  int dias = diferenca % 30;
  
    
  System.out.println(ano+" ano(s)");
  System.out.println(meses+" mes(es)");
  System.out.println(dias+" dia(s)");
    
  }
}