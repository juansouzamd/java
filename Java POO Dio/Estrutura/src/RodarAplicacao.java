public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro01 = new Carro();

        carro01.setCor("Azul");
        carro01.setModelo("BMW 320i");
        carro01.setcapacidaDeTanque(59);

        System.out.println(carro01.getCor());
        System.out.println(carro01.getModelo());
        System.out.println(carro01.getCapacidadeTanque());
        System.out.println(carro01.valorTotalTanque(5.40));

        System.out.println("\n");
        
        Carro carro02 = new Carro("Preto", "Hyundai i30", 45);

        System.out.println(carro02.getCor());
        System.out.println(carro02.getModelo());
        System.out.println(carro02.getCapacidadeTanque());
    }
}
