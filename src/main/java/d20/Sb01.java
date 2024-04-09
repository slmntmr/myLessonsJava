package d20;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) "StringBuilder" classi da String ureten bir classtir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) String uretir,
            StringBuilder Class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli
        yöntemler ve işlevler içerir. Bunlar arasında append, delete, insert,
        replace gibi sık kullanılan yöntemler bulunur.
        */

        //immutable - degistirilemez -String
        String s = "Java";
        String t = s + "x";
        String w = t + "?";

        String c1 = "Ali";
        String c2 = new String("Ali");


        String str1 = "abc";
        String str2 = "abc";


        String str3 = new String("abc");


        //String Builder - Mutable - degistirilebilir

        //StringBuilder b = "Ali"; HATA
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1); //Python

        sb1.append("!");
        System.out.println(sb1); //Python!

        //Odev : Bir String'i degistirdikten sonra tekrar ayni String'e yuklersem orjinal deger degismez mi?

        String a = "Money";
        a = a + " More";



    }
}