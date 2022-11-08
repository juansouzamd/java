class Testar {
    public static void main(String[] args) {

        int array[] = { 3, 5};

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < 2; i++) {

            if (i < 1) {

                a = array[i] - 1;

            } else {

                a = (array[i] - array[i-1]) - 1;
            }

            if (a > b){
                c = a;
                b = a;
                d = array[i];
            }

        }

        System.out.print("\n" + a + " " + b+ " " + c + " " + d);
    }
}