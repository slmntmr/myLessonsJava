package d8;

import java.util.Scanner;

public class C03Ternary {

    public static void main(String[] args) {
        // condition(kosul) ? (true olma durumunda calisacak kod) : (false olma durumunda calisacak kod);
       /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sisteme bir sayi giriniz");
        int sayi = scan.nextInt();

        Object result = sayi%2==0 ? ("Cift Sayi") : (sayi+3);

        System.out.println(result);




    }
}