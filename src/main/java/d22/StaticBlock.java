package d22;

import java.time.LocalDate;

public class StaticBlock {

    /*“static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını
    veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.

     Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
     Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
     bir şekilde hazır olmasını sağlar.*/

    //Senaryo: Subat ayinda fiyatlarda indirim olacak.Class cagirildiginda otomatik price’i alacak ve
    // class’in heryerinde bu degeri kullanacak

    //Bir variable olusturdugunuzda deger atamazsaniz, o variable'i initialize (baslatmak) etmediniz demektir
    static double pi;
    static int price;

    static {
        System.out.println("static block 2");
        LocalDate currentDate = LocalDate.now();

        if (currentDate.getMonthValue() == 2){
            price = 1000;
            System.out.println(price);
        }else {
            price = 2000;
            System.out.println(price);
        }
    }


    static { //static block
        pi = 3.14; //pi variable'ina deger atadik
        System.out.println("static block 1");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method ici");
    }
}