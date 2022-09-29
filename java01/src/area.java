import java.util.*;

 class area {
  public static void main(String[] args) {
  Scanner in = new Scanner (System.in);
  
  double A = in.nextDouble();
  double B = in.nextDouble();
  double C = in.nextDouble();
    
  double areaTriangulo = (A * C) / 2;
  double areaCirculo = 3.14159 * Math.pow(C, 2);
  double areaTrapezio = ((A + B) * C) / 2;
  double areaQaudrado = Math.pow(B, 2);
  double areaRetangulo = A * B;
  

  System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
  System.out.printf("CIRCULO: %.3f%n",areaCirculo);
  System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
  System.out.printf("QUADRADO: %.3f%n",areaQaudrado);
  System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
    
  }
}