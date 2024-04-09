package d34;

public class Utils {

    /*Java'da "utils" (fayda-araclar-utilities) class’i oluşturmanın temel mantığı,
    belirli bir konsept veya işlevsellikle ilgili yardımcı (helper) metotları bir araya toplamaktır.
    Bu sınıflar genellikle static metotlardan oluşur ve doğrudan sınıf adı üzerinden çağrılırlar.
    Buraya  Java’da olmayan ama bizim surekli projemizde kullandigimiz bir islevi method olarak ekleriz
    ve onu cagirip kullaniriz. Amaca uygun yeni methodlar olusturabiliriz.*/

    /*Hep ekrana bir boslukla yazdirmak icin
    forEach(t -> System.out.print(t+" “) kullandik. For each icini
    method haline getirelim ve cagiralim*/

    public static void printInTheSameLineWithSpace(Object obj){
        //String veya int yazdir diye sinirlamamak icin Object kullandik
        System.out.print(obj + " ");
    }

    public static boolean isNumberEven(int num){
        return num % 2 == 0;
    }


}