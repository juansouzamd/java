public class AreaCalculo {

    public static void area (double lado){
        System.out.println("A área do quadrado é: " + lado * lado);
    }
    
    public static void area (double lado01, double lado02){
        System.out.println("A área do retângulo é: " + lado01 * lado02);
    }

    public static void area (double baseMenor, double baseMaior, double altura){
        System.out.println("A área do trapézio é: " +((baseMaior + baseMenor) * altura) /2);
    }
}
