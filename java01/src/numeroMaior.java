import java.util.*;

 class numeroMaior {
  public static void main(String[] args) {
  Scanner in = new Scanner (System.in);
  
  int a = in.nextInt();
  int b = in.nextInt();
  int c = in.nextInt();

  int maior1 = (a + b + Math.abs(a - b)) / 2;
  int maior2 = (maior1 + c + Math.abs(maior1 - c)) / 2;
  

  System.out.println(maior2+" eh o maior");
    
  }
}
