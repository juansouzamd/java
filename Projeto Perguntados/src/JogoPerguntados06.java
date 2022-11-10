import java.util.*;

public class JogoPerguntados06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rdn = new Random();

        int pontuacao = 0, repeticao = 0, contador = 0, reinicio = 0, contadorRespostasCertas = 0, vidas = 4, numeroQuestao = 1;
        char respostaUsuario, respostaJogarNovamente;
        int vetorNumerosSorteados[] = new int[25];

        for (int i = 0; i < 25; i++) {
            vetorNumerosSorteados[i] = -1;
        }


        for (int rodada = 0; rodada < 25; rodada++) {

            int numeroSorteado = rdn.nextInt(25);

            while (repeticao != 25) {

                if (vetorNumerosSorteados[repeticao] == numeroSorteado) {

                    numeroSorteado = rdn.nextInt(25);
                    repeticao = 0;

                } else {
                    repeticao++;
                }

            }

            vetorNumerosSorteados[contador] = numeroSorteado;
            contador++;

            cabecalho(rodada, reinicio);

            String perguntaSorteada = todasPerguntas(numeroSorteado);
            String respostaPerguntaSorteada = respostas(numeroSorteado);
            char gabarito = respostaPerguntaSorteada.charAt(0);

            System.out.printf("========= Pergunta Número: %d =========%n",numeroQuestao);
            System.out.println(perguntaSorteada);

            System.out.println("Digite a alternativa correta:");
            respostaUsuario = ler.next().toUpperCase().charAt(0);

            while (respostaUsuario != 'A' && respostaUsuario != 'B' && respostaUsuario != 'C' && respostaUsuario != 'D'
                    && respostaUsuario != 'E') {

                System.out.println("Resposta inválida, digite novamente:");
                respostaUsuario = ler.next().toUpperCase().charAt(0);
            }

            if (respostaUsuario != gabarito) {
                vidas--;
            } else if (respostaUsuario == gabarito) {
                
                if (numeroSorteado == 4 || numeroSorteado == 9 || numeroSorteado == 14 || numeroSorteado == 19 || numeroSorteado == 24){
                    pontuacao += 30;
                } else if (numeroSorteado == 3 || numeroSorteado == 8 || numeroSorteado == 13 || numeroSorteado == 18 || numeroSorteado == 23){
                    pontuacao += 20;
                } else {
                    pontuacao += 10;
                }

                contadorRespostasCertas++;
            }

            numeroQuestao++;

            String classificacao = ranking(pontuacao);

            corrigeResposta(respostaUsuario, gabarito, vidas, pontuacao);

            System.out.println();

            fimVidas(vidas, pontuacao, classificacao);

            ultimaRodada(rodada, contadorRespostasCertas, pontuacao, classificacao);

            if (vidas == 0 || rodada == 24) {

                System.out.println("\nDeseja jogar novamente? (S ou N)");
                respostaJogarNovamente = ler.next().toUpperCase().charAt(0);

                while (respostaJogarNovamente != 'S' && respostaJogarNovamente != 'N') {
                    System.out.println("\nResposata inválida digite novamente:");
                    respostaJogarNovamente = ler.next().toUpperCase().charAt(0);
                }

                if (respostaJogarNovamente == 'N') {
                    rodada = 30;
                    System.out.println("\nObrigado por jogar nosso jogo :)\n");
                } else {
                    reinicio = 1;
                    rodada = -1;
                    contadorRespostasCertas = 0;
                    pontuacao = 0;
                    vidas = 4;
                    contador = 0;
                    numeroQuestao = 1;
                    for (int i = 0; i < 25; i++) {
                        vetorNumerosSorteados[i] = -1;
                    }
                }
            }

            repeticao = 0;

        }

    }

    public static String todasPerguntas(int numeroSorteado) {

        String perguntasVetor[] = {

                "\nTema: Ciências, Valendo 10 Pontos:\n" +
                        "Qual o metal cujo símbolo químico é o Au?\n" +
                        "A) Cobre\n" +
                        "B) Prata\n" +
                        "C) Mercúrio\n" +
                        "D) Ouro\n" + // reposta correta
                        "E) Manganês\n",

                "\nTema: Ciências, Valendo 10 Pontos:\n" +
                        "Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?\n" +
                        "A) Yuri Gagarin, em 1961\n" +
                        "B) Buzz Aldrin, em 1969\n" +
                        "C) Charles Conrad, em 1969\n" +
                        "D) Charles Duke, em 1971\n" +
                        "E) Neil Armstrong, em 1969\n", // reposta correta

                "\nTema: Ciências, Valendo 10 Pontos:\n" +
                        "Quanto tempo a luz do Sol demora para chegar à Terra?\n" +
                        "A) 12 minutos\n" +
                        "B) 1 dia\n" +
                        "C) 12 horas\n" +
                        "D) 8 minutos\n" + // reposta correta
                        "E) 12 segundos\n",

                "\nTema: Ciências, Valendo 20 Pontos:\n" +
                        "As pessoas de qual tipo sanguíneo são consideradas doadores universais\n" +
                        "A) Tipo A\n" +
                        "B) Tipo B\n" +
                        "C) Tipo O\n" + // reposta correta
                        "D) Tipo AB\n" +
                        "E) Tipo AB\n",

                "\nTema: Ciências, Valendo 30 Pontos:\n" +
                        "Quais dos órgãos abaixo pertencem ao sistema respiratório?\n" +
                        "A) Laringe e traqueia\n" + // reposta correta
                        "B) Pulmões e faringe\n" +
                        "C) Esôfago e brônquios\n" +
                        "D) Tireoide e hipófise\n" +
                        "E) Pâncreas e vasos sanguíneos\n",

                "\nTema: Geografia, Valendo 10 Pontos:\n" +
                        "Qual é a capital do Acre?\n" +
                        "A) Rio Branco\n" + // reposta correta
                        "B) Amazonia\n" +
                        "C) Acre\n" +
                        "D) Rondonia\n" +
                        "E) Macapá\n",

                "\nTema: Geografia, Valendo 10 Pontos:\n" +
                        "Qual desses Países não é Europeu?\n" +
                        "A) Macedonia\n" +
                        "B) Espanha\n" +
                        "C) Grecia\n" +
                        "D) Casaquistão\n" + // reposta correta
                        "E) Polonia\n",

                "\nTema: Geografia, Valendo 10 Pontos:\n" +
                        "Em que continente está localizado o Catar?\n" +
                        "A) África\n" +
                        "B) Ásia\n" + // reposta correta
                        "C) Oceania\n" +
                        "D) América do Sul\n" +
                        "E) América Central\n",

                "\nTema: Geografia, Valendo 20 Pontos:\n" +
                        "Qual o maior país do mundo?\n" +
                        "A) China\n" +
                        "B) Brasil\n" +
                        "C) Canadá\n" +
                        "D) Estados Unidos\n" +
                        "E) Rússia\n", // reposta correta

                "\nTema: Geografia, Valendo 30 Pontos:\n" +
                        "Qual o rio mais longo mundo?\n" +
                        "A) Rio Nilo\n" + // reposta correta
                        "B) Rio Amazonas\n" +
                        "C) Rio Yangtze\n" +
                        "D) Rio Paraná\n" +
                        "E) Rio Congo\n",

                "\nTema: Matemática, Valendo 10 Pontos:\n" +
                        "Um ângulo de 90º é um ângulo?\n" +
                        "A) Reto\n" + // reposta correta
                        "B) Obtuso\n" +
                        "C) Agudo\n" +
                        "D) Raso\n" +
                        "E) Côncavo\n",

                "\nTema: Matemática, Valendo 10 Pontos:\n" +
                        "Quantos segundos há em duas horas?\n" +
                        "A) 2800\n" +
                        "B) 3600\n" +
                        "C) 6200\n" +
                        "D) 6900\n" +
                        "E) 7200\n", // reposta correta

                "\nTema: Matemática, Valendo 10 Pontos:\n" +
                        "Quantos centímetros existem em 5 metros?\n" +
                        "A) 50 cm\n" +
                        "B) 500 cm\n" + // reposta correta
                        "C) 5000 cm\n" +
                        "D) 0,5 cm\n" +
                        "E) 0,05 cm\n",

                "\nTema: Matemática, Valendo 20 Pontos:\n" +
                        "Qual o maior número primo compreendido entre 30 e 40?\n" +
                        "A) 33\n" +
                        "B) 35\n" +
                        "C) 37\n" + // reposta correta
                        "D) 38\n" +
                        "E) 39\n",

                "\nTema: Matemática, Valendo 30 Pontos:\n" +
                        "Um cubo possui 4 centímetros de altura, 2 centímetros de largura e 5 centímetros de comprimento. Qual é o volume dessa figura?\n"
                        +
                        "A) 8 centímetros cúbicos\n" +
                        "B) 8 metros cúbicos\n" +
                        "C) 8 centímetros quadrados\n" +
                        "D) 40 centímetros cúbicos\n" + // reposta correta
                        "E) 40 metros quadrados\n",

                "\nTema: Esportes, Valendo 10 Pontos:\n" +
                        "Quando foi a primeira copa do mundo?\n" +
                        "A) 1950\n" +
                        "B) 1900\n" +
                        "C) 1930\n" + // reposta correta
                        "D) 1934\n" +
                        "E) 1926\n",

                "\nTema: Esportes, Valendo 10 Pontos:\n" +
                        "A cada quantos anos são realizados os Jogos Olímpicos?\n" +
                        "A) 2 anos\n" +
                        "B) 3 anos\n" +
                        "C) 4 anos\n" + // reposta correta
                        "D) 5 anos\n" +
                        "E) 6 anos\n",

                "\nTema: Esportes, Valendo 10 Pontos:\n" +
                        "Quanto tempo dura uma partida de futebol completa?\n" +
                        "A) 30 minutos\n" +
                        "B) 45 minutos\n" +
                        "C) 50 minutos\n" +
                        "D) 60 minutos\n" +
                        "E) 90 minutos\n", // reposta correta

                "\nTema: Esportes, Valendo 20 Pontos:\n" +
                        "Em que cidade está localizado o estádio popularmente conhecido como La Bombonera?\n" +
                        "A) Rio de Janeiro\n" +
                        "B) Buenos Aires\n" + // reposta correta
                        "C) Asunción\n" +
                        "D) Madri\n" +
                        "E) São paulo\n",

                "\nTema: Esportes, Valendo 30 Pontos:\n" +
                        "Quem ganhou a Copa do Mundo de 2010?\n" +
                        "A) Brasil\n" +
                        "B) Argentina\n" +
                        "C) Alemanha\n" +
                        "D) Espanha\n" + // reposta correta
                        "E) França\n",

                "\nTema: Conhecimentos Gerais, Valendo 10 Pontos:\n" +
                        "Qual é o substantivo usado para se referir a um grupo de lobos?\n" +
                        "A) Alcateia\n" + // reposta correta
                        "B) Rebanho\n" +
                        "C) Bando\n" +
                        "D) Matilha\n" +
                        "E) Lobos\n",

                "\nTema: Conhecimentos Gerais, Valendo 10 Pontos:\n" +
                        "Na mitologia grega, Zeus era filho de quem?\n" +
                        "A) Apolo\n" +
                        "B) Thor\n" +
                        "C) Urano\n" +
                        "D) Cronos\n" + // reposta correta
                        "E) Poseidon\n",

                "\nTema: Conhecimentos Gerais, Valendo 10 Pontos:\n" +
                        "Qual é o nome do maior osso do corpo humano?\n" +
                        "A) Fíbula\n" +
                        "B) Úmero\n" +
                        "C) Fêmur\n" + // reposta correta
                        "D) Rádio\n" +
                        "E) Tíbia\n",

                "\nTema: Conhecimentos Gerais, Valendo 20 Pontos:\n" +
                        "Onde se localiza Machu Picchu?\n" +
                        "A) Colômbia\n" +
                        "B) China\n" +
                        "C) Bolívia\n" +
                        "D) Índia\n" +
                        "E) Peru\n", // reposta correta

                "\nTema: Conhecimentos Gerais, Valendo 30 Pontos:\n" +
                        "Quem inventou a lâmpada?\n" +
                        "A) Graham Bell\n" +
                        "B) Thomas Edison\n" + // reposta correta
                        "C) Henry Ford\n" +
                        "D) Santos Dumont\n" +
                        "E) Nikola Tesla\n"

        };

        String pergunta = perguntasVetor[numeroSorteado];

        return pergunta;
    }

    public static String respostas(int numeroSorteado) {

        String respostasPerguntas[] = { "D", "E", "D", "C", "A", "A", "D", "B", "E", "A", "A", "E", "B", "C", "D", "C", "C", "E", "B", "D", "A", "D", "C", "E", "B" };

        String resposta = respostasPerguntas[numeroSorteado];

        return resposta;
    }

    public static void cabecalho(int rodada, int reinicio) {

        if (rodada == 0 && reinicio == 0) {
            System.out.println("\nBem vindo ao jogo Perguntados\n");
            System.out.println("Escolha as alternativas corretas e descubra sua classificação!!\n");
        } else {
            System.out.println("\n========== Jogo Perguntados ==========");
        }

    }

    public static void corrigeResposta(char respostaUsuario, char gabarito, int vidas, int pontuacao) {

        if (respostaUsuario == gabarito) {
            System.out.println("\nParabéns você acertou!");
        } else if (vidas == 1) {
            System.out.println("\nQue pena! você errou. A reposta certa é a alternativa: " + gabarito + "."
                    + "\nResta apenas " + vidas + " vida.");
        } else if (vidas == 0) {
            System.out.println("\nQue pena! você errou. A reposta certa é a alternativa: " + gabarito + ".");
        } else {
            System.out.println("\nQue pena! você errou. A reposta certa é a alternativa: " + gabarito + "."
                    + "\nRestam apenas " + vidas + " vidas.");
        }

    }

    public static void fimVidas(int vidas, int pontuacao, String classificacao) {

        if (vidas == 0) {
            System.out.println("Infelizmente acabaram suas vidas.");
            System.out.println("Você fez " + pontuacao + " pontos.");
            System.out.println("Sua classificação foi, "+classificacao+".\n");
        }

    }

    public static void ultimaRodada(int rodada, int contadorRespostasCertas, int pontuacao, String classificacao) {

        if (rodada == 24) {

                System.out.println("Você fez " + pontuacao + " pontos.");
                System.out.println("Sua classificação foi, "+classificacao+".\n");
            
        }
    }

    public static String ranking(int pontuacao){
        String resposta = "";

        if (pontuacao <= 150 && pontuacao >= 100){
            resposta = "Nível Bronze";
        } else if (pontuacao <= 210){
            resposta = "Nível Prata";
        } else if (pontuacao <= 290){
            resposta = "Nível Ouro";
        } else if (pontuacao <= 350){
            resposta = "Nível Diamante";
        } else {
            resposta ="Nível Latão";
        }
        return resposta;
    }
}
