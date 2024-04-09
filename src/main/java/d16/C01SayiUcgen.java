package d16;

import java.util.Scanner;

public class C01SayiUcgen {
    public static void main(String[] args) {
    /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:
    örnegin: Satır Sayısı 4 icin;
     1
     2 3
     4 5 6
     7 8 9 10
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz ucgenin satir sayisini giriniz");
        int satir= scan.nextInt();

        int a=1;

        for (int i = 1; i <= satir ; i++) {//satırlar icin

            for (int j = 1; j <=i ; j++) {//sutunlar icin

                System.out.print( a +" ");
                a++;

            }
            System.out.println();

        }

        System.out.println("==========================================");
                /*
                  1 2 3 4
                  5 6 7
                  8 9
                  10
         */
        a=1;

        for (int i = satir; i >= 1 ; i--) {//satırlar icin

            for (int j = 1; j <=i ; j++) {//sutunlar icin

                System.out.printf("%-3d",a);//+ saga yaslı, - sola yaslı sekilde yazdırır -->souf

                //System.out.print( a +" ");
                a++;

            }
            System.out.println();

        }



    }
}