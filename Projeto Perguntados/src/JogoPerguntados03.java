import java.util.*;

public class JogoPerguntados03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rdn = new Random();

        int pontuacao = 0;
        int vidas = 4;
        int repeticao = 0;
        int contador = 0;
        char respostaUsuario;
        int vetorNumerosSorteados[] = { -1, -1, -1, -1, -1 };

        for (int c = 0; c < 5; c++) {

            int numeroSorteado = rdn.nextInt(5);

            while (repeticao != 5) {

                if (vetorNumerosSorteados[repeticao] == numeroSorteado) {

                    numeroSorteado = rdn.nextInt(5);
                    repeticao = 0;

                } else {
                    repeticao++;
                }

            }

            vetorNumerosSorteados[contador] = numeroSorteado;
            contador++;

            for (int vet : vetorNumerosSorteados) {
                System.out.println(vet);
            }

            System.out.println("\n");

            String perguntaSorteada = todasPerguntas(numeroSorteado);
            String respostaPerguntaSorteada = respostas(numeroSorteado);
            char gabarito = respostaPerguntaSorteada.charAt(0);

            System.out.println(numeroSorteado);
            System.out.println(respostaPerguntaSorteada);

            System.out.println(perguntaSorteada);

            System.out.println("Digite a alternativa correta:");
            respostaUsuario = ler.next().toUpperCase().charAt(0);

            while (respostaUsuario != 'A' && respostaUsuario != 'B' && respostaUsuario != 'C' && respostaUsuario != 'D'
                    && respostaUsuario != 'E') {

                System.out.println("Resposta inválida, digite novamente:");
                respostaUsuario = ler.next().toUpperCase().charAt(0);

            }

            if (respostaUsuario != gabarito ){
                vidas--;
            }

            if (respostaUsuario == gabarito) {
                System.out.println("\nParabéns você acertou!");
                pontuacao += 10;
            } else if (vidas == 1) {
                System.out.println("\nQue pena! você errou. A reposta certa é a alternativa: " + gabarito+"."+ "\nResta apenas " +vidas+ " vida." );
            }  else if (vidas == 0){
                System.out.println("\nQue pena! você errou. A reposta certa é a alternativa: " + gabarito+".");
            } else {
                System.out.println("\nQue pena! você errou. A reposta certa é a alternativa: " + gabarito+"."+ "\nRestam apenas " +vidas+ " vidas." );
            }

            System.out.println();

            if (vidas == 0){
                System.out.println("Infelizmente acabaram suas vidas.");
                System.out.println("Sua pontuação foi de "+ pontuacao + " pontos.");
                c = 10;
            }

            else if (c == 4){
                System.out.println("Sua pontuação foi de "+ pontuacao + " pontos.");
            }
            repeticao = 0;

        }

    }

    public static String todasPerguntas(int numeroSorteado) {

        String perguntasVetor[] = {

                "\nQual o metal cujo símbolo químico é o Au? (Tema: Ciências)\n" +
                        "a) Cobre\n" +
                        "b) Prata\n" +
                        "c) Mercúrio\n" +
                        "d) Ouro\n" + // reposta correta
                        "e) Manganês\n",

                "\nQuando foi a primeira copa do mundo? (Tema: Esportes)\n" +
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

                "\nQuem foi o primeiro homem a pisar na Lua? Em que ano aconteceu? (Tema: História)\n" +
                        "a) Yuri Gagarin, em 1961\n" +
                        "b) Buzz Aldrin, em 1969\n" +
                        "c) Charles Conrad, em 1969\n" +
                        "d) Charles Duke, em 1971\n" +
                        "e) Neil Armstrong, em 1969\n" // reposta correta

        };

        String pergunta = perguntasVetor[numeroSorteado];

        return pergunta;
    }

    public static String respostas(int numeroSorteado) {

        String respostasPerguntas[] = { "D", "C", "A", "C", "E" };

        String resposta = respostasPerguntas[numeroSorteado];

        return resposta;
    }
}
