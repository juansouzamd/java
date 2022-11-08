import java.util.*;

public class JogoPerguntas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rdn = new Random();

        // int pontuacao = 0;
        // int tentativas = 1;
        int repeticao = 0;
        int numeroSorteado = 0;
        int vetorNumerosSorteados[] = { -1, -1, -1, -1, -1, };

        for (int i = 0; i < 5; i++) {

            numeroSorteado = rdn.nextInt(5);

            String perguntaSorteada = todasPerguntas(numeroSorteado);
            String respostaPerguntaSorteada = respostas(numeroSorteado);

            System.out.println(numeroSorteado);
            System.out.println(respostaPerguntaSorteada);
            System.out.println(perguntaSorteada);

            vetorNumerosSorteados[i] = numeroSorteado;

        }

    }

    public static String todasPerguntas(int numeroSorteado) {

        String perguntasVetor[] = {

                "\nQual o metal cujo símbolo químico é o Au?\n" +
                        "a) Cobre\n" +
                        "b) Prata\n" +
                        "c) Mercúrio\n" +
                        "d) Ouro\n" + // reposta correta
                        "e) Manganês\n",

                "\nQuando foi a primeira copa do mundo?\n" +
                        "a) 1950\n" +
                        "b) 1900\n" +
                        "c) 1930\n" + // reposta correta
                        "d) 1934\n" +
                        "e) 1926\n",

                "\nQuem é o autor de O Príncipe?\n" +
                        "a) Maquiavel\n" + // reposta correta
                        "b) Antoine de Saint-Exupéry\n" +
                        "c) Montesquieu\n" +
                        "d) Thomas Hobbes\n" +
                        "e) Rousseau\n",

                "\nQual o maior animal terrestre?\n" +
                        "a) Baleia Azul\n" +
                        "b) Dinossauro\n" +
                        "c) Elefante africano\n" + // reposta correta
                        "d) Tubarão Branco\n" +
                        "e) Girafa\n",

                "\nQuem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?\n" +
                        " a) Yuri Gagarin, em 1961\n" +
                        " b) Buzz Aldrin, em 1969\n" +
                        "c) Charles Conrad, em 1969\n" +
                        "d) Charles Duke, em 1971\n" +
                        "e) Neil Armstrong, em 1969\n" // reposta correta

        };

        String pergunta = perguntasVetor[numeroSorteado];

        return pergunta;
    }

    public static String respostas(int numeroSorteado) {

        String respostasPerguntas[] = { "d", "c", "a", "c", "e" };

        String resposta = respostasPerguntas[numeroSorteado];

        return resposta;
    }
}