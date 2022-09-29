import java.util.*;

class cifraDeCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();

        System.out.println("Programa da Cifra de César");

        System.out.println();

        System.out.println("Digite se deseja CRIPTOGRAFAR ou TRADUZIR");
        String desejo = in.nextLine();

        if (desejo.equalsIgnoreCase("traduzir")) {

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

            } // for traduzir

        } else if (desejo.equalsIgnoreCase("criptografar")) {

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

            } // for transformar

        } else {
            System.out.println("Opção não encontrada");
        }

    }// main
}