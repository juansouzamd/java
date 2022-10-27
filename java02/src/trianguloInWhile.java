public class trianguloInWhile {
    public static void main(String[] args) {
        
        int x = 10;
        int contador = 0;
        int linha = 0;
        String asterisco = "*";

        


        while(contador <= x){

           
            while (x >= contador){
                System.out.print(asterisco);
                x--;
            }

            System.out.println();
            contador++;
            x = 10;

        }


    }
}
