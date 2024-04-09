package d18;

public class Car {
            /* 1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle
            main methoduna ihtiyaç duymazsınız.
            2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
            main methodu oluşturmanız gerekebilir.
            3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method’lu class olur.
             Adina da “runner” eklenir.*/

    //1- variable'lar olusturalim (pasif ozellikler)
    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    //2-method'lar olusturalim (aktif ozellikler)

    public void hareket(){

        System.out.println(brand + " hizli hareket eder");
    }

    public void  dur(){

        System.out.println(brand + " guvenli bir sekilde durur");
    }

    //3- Bunlari olusturduk. CarRunner (main'li) calistirici class'i olusturalim

    /*6-
        Constructor nedir?
        Classtan object olusturmamizi saglayan bolumdur.
        Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
        Bu constructor’lara “default constructor” denir.
        default constructor ===> Car ()

        Ama car class'i bize hep ayni degerleri gonderir. Bu class'i kullanip farkli degerler olusturabiliriz.
        Kendiniz constructor’inizi olusturdugunuz zaman Java default constructor’i siler
        ---------
        Constructor nasil olusturulur?

        Access Modifier + Class ismi + () + {}

        */

    public Car (String brand, String model, int year, boolean hybrid){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }
    //7- Ozel Constructor'i olusturdugumuzda Java default olani sildi
    //runner'a gidip 4 argumani girelim

    //10- toString


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}