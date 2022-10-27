public class trianguloWhile {
    public static void main(String[] args) {
        
        int x = 10;
        int contador = 1;
        int linha = 0;
        String asterisco = "*";


        while(contador != x){

            while (linha < contador){
                System.out.print(asterisco);
                linha++;
            }

            System.out.println();
            contador++;
            linha = 0;

        }


    }
}
