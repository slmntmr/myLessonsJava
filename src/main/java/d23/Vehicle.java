package d23;

public class Vehicle {

    //Constructor Hiyerasisi

    /*
    Child class’tan bir object olusturdugunuzda constructor’lar en ustteki parent class’tan
    baslatilarak alta doğru calistirilir
    */

    /*Düşünün ki bir otomobil üreticisi olduğunuzu ve farklı türde otomobiller üretiyorsunuz.

        1- Grandparent Class: Bu class, tüm otomobillerin temel özelliklerini içerir.
        Örneğin, otomobillerin markası, modeli, yakıt türü gibi ortak özellikleri burada tanımlanır.
        Bu sınıfın bir constructor'ı vardır ve yeni bir otomobil oluşturulduğunda bu constructor çağrılır.
        Bu constructor, otomobilin temel özelliklerini ayarlar.

        2- Parent Class: Bu class, Grandparent sınıfını genişletir ve daha özelleştirilmiş otomobil türlerini temsil eder.
         Örneğin, sedan otomobillerin özellikleri burada tanımlanabilir.
         Parent sınıfının constructor'ı, hem kendi özelliklerini hem de miras aldığı Grandparent sınıfının
         özelliklerini ayarlar.

        3- Child Class (Çocuk Sınıf): Bu class, Parent sınıfını genişletir ve daha spesifik bir otomobil türünü
        temsil eder, örneğin spor otomobillerini. Child sınıfının constructor'ı, hem kendi özelliklerini
        hem de miras aldığı Parent ve Grandparent sınıflarının özelliklerini ayarlar.

        **Yukarıdan aşağıya doğru constructorlar sırasıyla çalışır

        Sonuc: Her bir class, daha özelleştirilmiş bir otomobil türünü temsil eder ve her biri üst
        class özelliklerini miras alır ve kendi özelliklerini ekler*/


    //constructor olusturalim
    public Vehicle(){
        this("m",2,"m");
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil, String motor){
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }


}