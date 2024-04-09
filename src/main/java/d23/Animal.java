package d23;

public class Animal { //public final class Animal : final olan bir class'in child'i olmaz

    //OOP (Object Oriented Programming -  Nesne Tabanlı Programlama )

    //Gerçek hayatta gördüğümüz birçok Object'in (nesnenin) bilgisayar ortamına aktarılma şeklidir.
    //Yani bir object'in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
    // ortamında gösterilmesi buna örnek olarak verilebilir.

    /*Object Yönelimli Programlamanın Faydaları:

    1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
    2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
    ile çalıştırılabilir. Substring() method’u 1 kere yazilmis ama surekli kullanabiliyoruz.
    3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
    4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
    5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class’ ta değişiklik
    yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

    /* OOP’leri 4 temel özellikte inceleyebiliriz.
    1. Inheritance - Miras Alma
    2. Polymorphism - Çok Biçimlilik
    3. Encapsulation - Kapsülleme
    4. Abstraction - Soyutlama
    */

    // 1. Inheritance - Miras Alma
    //Ozellikleri bir class'tan diğer class'lara alan bir kavramdır.

    //Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bir cogunu
    //kapsiyor. O zaman direkt olusturdugunuz class'i, ozelliklerini kullanmak istediginiz class'a "child" yaparsiniz

    //Bunu da "extends - uzanir" keyword'unu kullanarak yapiyoruz

    /*
    Inheritance’in Faydalari nelerdir?

    1) Kodun yeniden kullanılmasına yardımcı olur.
    2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
    emekten tasarruf sağlayabiliriz.
    3) Kolayca update yapabiliriz.
    4) Class’lari kuculturuz.
    5) Daha az geliştirme ve bakım maliyetine yol açar.
    */

    //--------------------------
    //2.Polymorphism:
    //Method Overloading + Method Overriding

    //OOP'nin prensiplerinin 2.sidir. Polymorphism (cok bicimlilik) demektir.
    //Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde
    // calistirabilmek icin kullanilir.

    //iki cesidi var.

    // i.Method Overloading: Bunu gormustuk
    //ii.Method Overriding - ustune yazma - gecersiz kilma - class'lar arasinda dolasacagiz

    // Child class'in Parent'taki methodu degistirerek kullanmasidir.

    public void eat(){
        System.out.println("Animals eat");
       /* final double pi = 3.14;
        pi = 3; //final bir variable'i degistiremezsiniz*/
    }
    public void drink() {
        System.out.println("Animals drink");
    }

    //---------------------
    //Override isleminde access modifier’larin durumlarini ogrendik. Simdi de return type durumlarina bakalim.
    // Parent icinde data type’i olan bir method olusturup child’da override edelim
    public Animal create(){ //Burada data type Animal'dir
        return new Animal(); //yeni bir Animal objesi urettik
        //memory'e yerlestirmeden return ettik

        //public final Animal create olan bir method override edilemez
    }

    //--------------------
    //Parent’ta int veri turunde bir method acip, child’da override etseydik ne olurdu?
    public int add(int a, int b) {
        return a + b;
    }

    //---------------------
    //Peki Parent’ta Class veri turunde bir method acip, child’da override etseydik ne olurdu?
    public Integer carpma(Integer a, Integer b) {
        return a * b;
    }

    //-------------------
    /*Return type void ise degisim olmaz. Hep void olarak kalir*/


}