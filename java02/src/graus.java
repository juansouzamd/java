public class graus {
    public static void main(String[] args) {

    double f, c;
        
        System.out.println("°F | °C"); //f vai representar graus fahrenheit e c graus celsius
        
        for (f=30; f<=50; f++) { //faço f variar de 30 a 50 aumentando de 1 em 1
            c = (5.0/9.0)*(f-32.0); //calculo c a partir de f
            System.out.println(f+"°F | "+c+"°C"); //imprimo

        }

    }
}
