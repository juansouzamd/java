import java.util.*;

class CifraCesarCompleta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continua = true;
        System.out.println("seja bem vindo ao Programa da cifra de césar, podemos continuar?");
        while (continua) {
            String zero = in.nextLine();
            System.out.println("Digite TRANSFORMAR para mudarmos de Português para Cifra de Cezar");
            System.out.println("Digite TRADUZIR para mudarmos de Cifra de Cesar para Português");
            String escolha = in.nextLine();
            if (escolha.equalsIgnoreCase("transformar")) {
                System.out.println("Insira sua frase: ");
                String palavra = in.nextLine();

                System.out.println("Insira a rotação:");
                int rotacao = in.nextInt();

                int letrasPalavra = palavra.length();
                int numero = 0;
                int ascii = 0;

                for (int i = 0; i < letrasPalavra; i++) {

                    numero = palavra.charAt(i);
                    if (numero >= 97 && numero <= 122) {

                        if (numero == 32) {
                            System.out.print(" ");
                        } else {
                            ascii = ((numero - 97) + rotacao) % 26 + 97;

                            System.out.print((char) ascii);
                        }
                    } else {
                        if (numero == 32) {
                            System.out.print(" ");
                        } else {
                            ascii = ((numero - 65) + rotacao) % 26 + 65;

                            System.out.print((char) ascii);
                        }
                    }

                } // fecha for
                System.out.println();
                System.out.println("Voce deseja continuar?");
                String si = in.next();

                if (si.equalsIgnoreCase("não") || si.equalsIgnoreCase("nao")) {
                    System.out.println("Muito obrigado por usar nosso programa :)");
                    continua = false;
                }
            } else { // voltando - traduzindo
                if (escolha.equalsIgnoreCase("traduzir")) {
                    System.out.println("Insira sua frase: ");
                    String palavra = in.nextLine();

                    System.out.println("Insira a rotação:");
                    int rotacao = in.nextInt();
                    double x = rotacao / 26;
                    int y = (int) x;
                    rotacao -= (y * 26);

                    int letrasPalavra = palavra.length();
                    int numero = 0;
                    int ascii = 0;

                    for (int i = 0; i < letrasPalavra; i++) {

                        numero = palavra.charAt(i);
                        if (numero >= 97 && numero <= 122) {

                            if (numero == 32) {
                                System.out.print(" ");
                            } else {

                                if (((numero - 97) - rotacao) < 0) {
                                    ascii = (((numero - 97) - rotacao) + 26) % 26 + 97;
                                    System.out.print((char) ascii);
                                } else {
                                    ascii = ((numero - 97) - rotacao) % 26 + 97;

                                    System.out.print((char) ascii);
                                }
                            }
                        } else {
                            if (numero == 32) {
                                System.out.print(" ");
                            } else {
                                if (((numero - 97) - rotacao) < 0) {
                                    ascii = (((numero - 65) - rotacao) + 26) % 26 + 65;
                                    System.out.print((char) ascii);
                                } else {
                                    ascii = ((numero - 97) - rotacao) % 26 + 97;

                                    System.out.print((char) ascii);
                                }
                            }
                        }

                    }
                    System.out.println();
                    System.out.println("Voce deseja continuar?");
                    String si = in.next();
                    if (si.equalsIgnoreCase("não") || si.equalsIgnoreCase("nao")) {
                        System.out.println("Muito obrigado por usar nosso programa :)");
                        continua = false;
                    }
                } else {
                    System.out.println("Não existe essa opção!");
                }
            } // fecha while
        }

    } // fecha void

} // fecha class
