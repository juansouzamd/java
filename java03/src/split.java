public class split {
    public static void main(String[] args) {
        
        String texto = "uva laranja acerola abacate pitanga melancia";

        String vetor[] = texto.split(" ");

        for (String vet : vetor){
            System.out.println(vet);
        }
    }
}
