package d6;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String Data Tipi (Class)
        //Cumleler, kelimeler, semboller, rakamlar icerebilir.

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.
        //length() String'in uzunlugunu dondurur

        String s = "Java is easy";

        int sLength = s.length();
        System.out.println(sLength); //12

        //-------------------------

        //Ornek 2: "s" String'inde ilk ve son indexteki karakterleri aliniz.
        //charAt(int index) metodu, belirtilen indekste yer alan karakteri döndürmek için kullanılır.

        //index 0 tabanlidir.

        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        char lastChar = s.charAt(11); //static code, hard code
        System.out.println(lastChar); //y

        char lastChar2 = s.charAt(s.length()-1); //dynamic code
        System.out.println(lastChar2); //y

        //-----------------------
        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //beginIndex dahil, endIndex harictir
        //Java is easy

        String sub1 = s.substring(0,4);
        System.out.println(sub1); //Java

        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2); //is

        //Ornek 5: "s" String'indeki “easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3); //easy

        //2.kullanimi: substring(int beginIndex) : Belirtilen indexten baslayarak sonuna kadar olan String'i dondurur
        String sub4 = s.substring(8);
        System.out.println(sub4); //easy


    }
}