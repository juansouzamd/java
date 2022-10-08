public class trianguloContra {
    public static void main(String[] args) {
        
        int x = 10;
        String asterisco = "*";

        while(x != 0){

            for(int i = 0; i < x; i++){

                System.out.print(asterisco);

            }
            System.out.println();

            x -= 1;
        }

    }
}
