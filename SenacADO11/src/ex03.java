import java.util.*;

class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== Exercício 3 =====");

        System.out.println("Programa para realizar a votação de quem será o representante de turma");

        System.out.println("Digite o nome do primeiro candidato");
        String candidato01 = ler.next();

        System.out.println("Digite o nome do segundo candidato");
        String candidato02 = ler.next();

        System.out.println("Digite o nome do terceiro candidato\n");
        String candidato03 = ler.next();

        int voto = 0;
        int votoCandidato01 = 0;
        int votoCandidato02 = 0;
        int votoCandidato03 = 0;

        do {

            voto = exibirMenu(candidato01, candidato02, candidato03);

            limpaTela();

            switch (voto) {
                case 1:
                    votoCandidato01++;
                    break;
                case 2:
                    votoCandidato02++;
                    break;
                case 3:
                    votoCandidato03++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Voto inválido");

            }

        } while (voto != 0);

        avaliarResultado(votoCandidato01, votoCandidato02, votoCandidato03, candidato01, candidato02, candidato03);

    }

    public static int exibirMenu(String aluno1, String aluno2, String aluno3) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha em quem deseja votar\n");
        System.out.println("digite 1 para " + aluno1);
        System.out.println("digite 2 para " + aluno2);
        System.out.println("digite 3 para " + aluno3);
        System.out.println("digite 0 para encerrar a votação");

        int voto = ler.nextInt();

        return voto;
    }

    public static void avaliarResultado(int votosAluno1, int votosAluno2, int votosAluno3, String aluno1, String aluno2,
            String aluno3) {

        System.out.println("O resultado da votação foi:");

        if (votosAluno1 == votosAluno2 && votosAluno1 == votosAluno3) {
            System.out.println("Votação com empate, discutam suas ideias e iniciem uma nova votação");
        } else {

            if (votosAluno1 > votosAluno2 && votosAluno1 > votosAluno3 && votosAluno2 > votosAluno3) {

                System.out.println("Representante: " + aluno1 + ", " + votosAluno1 + " votos");
                System.out.println("Vice-representando: " + aluno2 + ", " + votosAluno2 + " votos");

            } else if (votosAluno1 > votosAluno2 && votosAluno1 > votosAluno3 && votosAluno3 > votosAluno2) {

                System.out.println("Representante: " + aluno1 + ", " + votosAluno1 + " votos");
                System.out.println("Vice-representando: " + aluno3 + ", " + votosAluno3 + " votos");

            } else if (votosAluno2 > votosAluno1 && votosAluno2 > votosAluno3 && votosAluno1 > votosAluno3) {

                System.out.println("Representante: " + aluno2 + ", " + votosAluno2 + " votos");
                System.out.println("Vice-representando: " + aluno1 + ", " + votosAluno1 + " votos");

            } else if (votosAluno2 > votosAluno1 && votosAluno2 > votosAluno3 && votosAluno3 > votosAluno1) {

                System.out.println("Representante: " + aluno2 + ", " + votosAluno2 + " votos");
                System.out.println("Vice-representando: " + aluno3 + ", " + votosAluno3 + " votos");

            } else if (votosAluno3 > votosAluno1 && votosAluno3 > votosAluno2 && votosAluno1 > votosAluno2) {

                System.out.println("Representante: " + aluno3 + ", " + votosAluno3 + " votos");
                System.out.println("Vice-representando: " + aluno1 + ", " + votosAluno1 + " votos");
            } else if (votosAluno3 > votosAluno1 && votosAluno3 > votosAluno2 && votosAluno2 > votosAluno1) {

                System.out.println("Representante: " + aluno3 + ", " + votosAluno3 + " votos");
                System.out.println("Vice-representando: " + aluno2 + ", " + votosAluno2 + " votos");
            }

        }

    }

    public static void limpaTela() {
        System.out.print("\n\npressione <enter> para ir para o próximo voto!.\n");
        new Scanner(System.in).nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
