package d7;

public class StringManipulations03 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        //valueOf() methodu belirtilen String'i Double'a cevirir

        String tv = "$456.99";

        String laptop = "$875.99";

        tv = tv.replace("$", ""); //"456.99"

        laptop = laptop.replace("$", ""); // "875.99"

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);

        System.out.println(totalPrice); //1332.98

        //-------------------------

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC

        //trim() methodu bir String'deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String'i istediginiz karakterden parcalamaya yarar

        String name = "   ali     cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        //char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0); //\s+ birden fazla boslugu secer
        System.out.println(last); //C






    }
}