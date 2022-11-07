public class TrianguloInvertido {
    public static void main(String[] args) {
        
        int x = 10;
        String asterisco = "*";

        while (x != 0){

            for (int i = 1; i < x; i++){
                System.out.print(" ");
            }

            System.out.println(asterisco);
           asterisco += "*";

            x = x -1;
        }


    }
}
