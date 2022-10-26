import java.util.*;

class vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
            int vetor = in.nextInt();
        
            int [] numeros = new int [vetor];
    
        for (int i = 0; i < vetor; i++){
            System.out.println("Digite o número");
            numeros[i] = in.nextInt();

        }

        System.out.println();

        for (int num : numeros){
        
            System.out.println(num);
        }

        System.out.println();

        
        int num = numeros[0];
        int array = 0;
        int contador = 1;


  

            for (int i = 0; i < vetor; i++){

               if(numeros[contador] - numeros[i] == 1){

                    

               } 

                array = numeros[i];
                int valor = array - num;
                
    
                if (valor == 1){
                    contador++;
                }
    
                num = array;
            }



  

       /* System.out.println();

        for (int sequencia : seq){
            System.out.println(sequencia);
        }*/


        in.close();
   
}
}