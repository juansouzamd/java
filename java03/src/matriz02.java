import java.util.*;
class matriz02 {
  public static void main(String[] args){
    Random rdn = new Random();
    int l = 5;
    int c = 5;

    int[][] matriz = new int[l][c];
    for(int a = 0; a < l; a++){
      for(int b = 0; b < c; b++){
        matriz[a][b]= rdn.nextInt(100);        
      }
    }
    for(int a = 0; a < l; a++){
      for(int b = 0; b < c; b++){
        System.out.print(matriz[a][b] + "   ");       
      }
      System.out.println();
      System.out.println();
    }
  }
}
