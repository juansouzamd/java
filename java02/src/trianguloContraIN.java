public class TrianguloContraIN {
    public static void main(String[] args) {
        
        int x = 10;
        String asterisco = "*";
        String espaco = " ";

        while(x != 0){

            for(int i = 0; i < x; i++){
                
                System.out.print(asterisco);
            }
            System.out.println();
            System.out.print(espaco);
            espaco = espaco + " ";

            x -= 1;
        }

    }
}