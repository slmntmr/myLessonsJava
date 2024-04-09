package d8;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayıyının karesini ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1 == sayi2 ? "Sayilar birbirine esit" :
                (sayi1 > sayi2 ? (sayi1 * sayi1) : (sayi2 * sayi2)));
        //(sayi2 > sayi1 ? (sayi2 * sayi2) : (sayi1 * sayi1)

        // \n "" içinde yazılır konsolda imleci alt satıra atar


    }
}