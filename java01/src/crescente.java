import java.util.*;

public class Crescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    int y = in.nextInt();
        
        while (x != y) {

            if (x < y) {
                System.out.println(x + " - "+ y + " Crescente");
            } else {
                 System.out.println(x + " - "+ y + " decrescente");
            }

            x = in.nextInt();
            y = in.nextInt();
        }
    }

}
