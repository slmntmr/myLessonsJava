package d8;

import java.util.Scanner;

public class C07StringManipulations {

    public static void main(String[] args) {

     /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
    ali can
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi sisteme giriniz \nNot:Yalnızca tek ad ve tek soyad girilmeli");
        String adSoyad= scan.nextLine();
        //space idx bulalım
        int spaceIdx =adSoyad.indexOf(" ");
        String ad= adSoyad.substring(0,spaceIdx);//ilk idx dahil, ikinci idx hariç
        //ali
        String soyad=adSoyad.substring(spaceIdx+1);

        //ali->ALI ->  Ali
        String ad2 = ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1);
        String soyad2 = soyad.toUpperCase().charAt(0) + soyad.toLowerCase().substring(1);

        System.out.println("Ad : "+ ad2);
        System.out.println("Soyad : "+ soyad2);




    }
}