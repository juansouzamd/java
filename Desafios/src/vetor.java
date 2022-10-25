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

        for (int j = 0; j < vetor; j++){
        
            System.out.println((int)numeros[j]);

        }


        System.out.println();

        int valorNumero = 0;
        int soma = 0;
        int num = 0;
        int vezes = 0;
        int quebra = 0;
        int p;
        int novoArray [] = new int [vetor]; 

        for (p = 0; p < vetor; p++){

            soma = valorNumero - num;

            if (soma == 1){
                vezes++;

                novoArray[p] = valorNumero;

                
            } else if (soma > 1 || soma < 1) {
                quebra++;
            }
            
            num = valorNumero;
            valorNumero = numeros[p];
    
           
        }

        for (int l = 0; l < vetor; l++){
        
            System.out.println(novoArray[l]+ "novo array");
        }

        System.out.println(vezes + "vezes que caiu no == 1");
        System.out.println(quebra+ "quebras");

        in.close();
    }
}
