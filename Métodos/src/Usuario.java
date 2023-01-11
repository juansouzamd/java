public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " +smartTv.ligada);
        System.out.println("Canal atual? " +smartTv.canal);
        System.out.println("Volume atual? " +smartTv.volume);

        System.out.println();

        smartTv.mudarCanal(34);
        System.out.println("Mudando para o canal " +smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal " +smartTv.canal);

        System.out.println();
        
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " +smartTv.ligada);

        System.out.println();

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " +smartTv.ligada);

        System.out.println();
        System.out.println();

        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual? " +smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual? " +smartTv.volume);

    }
}
