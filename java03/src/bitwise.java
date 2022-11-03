import java.util.*;

public class bitwise {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int binario = 0b00100000;
        int numero = ler.nextInt();

        if ((numero & binario) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }

        ler.close();
    }
}