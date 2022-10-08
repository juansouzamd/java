public class losango {
    public static void main(String[] args) {
        
        int x = 10;
        String asterisco = "*";
        int y = x/2;
        int z = x/2;

        while (y != 0){

            for (int i = 1; i < y; i++){
                System.out.print(" ");
            }

            System.out.println(asterisco);
           asterisco += "**";

            y = y -1;
        }

        String aste = "*";
        String espa = " ";

        while(z != 0){

            for(int j = 1; j < z*2; j++){
                
                System.out.print(aste);

            }
            System.out.println();
            System.out.print(espa);
            espa = espa + " ";
            

            z -= 1;
        }


    }
}