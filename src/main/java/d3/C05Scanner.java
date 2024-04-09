package d3;

import java.util.Scanner;

public class C05Scanner {

        /*
   kullanıcıdan aldıgınız sayının karesini bulunuz
   not:bir sayının karesi,sayının kendisi ile carpımına esittir
    */

    public static void main(String[] args) {

        //1. adım Scanner objesi olusturmak
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen karesini bulmak istediginiz sayiyi giriniz");
        int sayi =scan.nextInt();

        System.out.println("Girdiginiz sayi : "+sayi);

        System.out.println("Girdiginiz sayinin karesi : " + sayi*sayi);



    }
}