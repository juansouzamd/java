import java.util.*;

public class vetorMeses {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String mes [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int dias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < 12; i++){
            System.out.printf("%s, tem %d dias.\n",mes[i], dias[i]);
        }

        in.close();
    }
}
