
public class pi{
    public static void main(String[] args) {
        

        int n=10; //n eh a quantidade de parcelas que vou adicionar em H
		int i;
        double mult=1, H=0;
    
        for(i=0;i<n;i++){ //faço n-vezes
            System.out.println("impar = "+ (2*i+1));
            H+=((mult*1.0)/((2*i+1)*(2*i+1)*(2*i+1))); //adiciona a nova parcela em H
            System.out.println("valor de H = "+ H);
            mult*=-1; //alterno o sinal para a próxima parcela
        }
    
        double pi = 3.0/(H*32.0); //Calculo pi
    
        System.out.println("valor de pi = "+ pi); //imprimo

    }

}