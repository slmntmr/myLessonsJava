package d13;

public class C03NestedForLoop {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        int sayi=5;

        for (int i = 0; i < sayi ; i++) {//satırlar için-->outer loop(dıs loop)

            for (int j = 0; j <= i ; j++) {//inner loop(iç loop)--> sutun icin yani *yazdırma işlemi için
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * * * *
         * * *
         * *
         *
         */
        for (int i = sayi-1; i > 0 ; i--) {//satırlar için

            for (int j = 0; j < i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

        /*

         *
         * *
         * * *
         * *
         *

         */







    }
}