package d3;

public class C01Variables {

    public static void main(String[] args) {

        //(int) bir variable(yas)  olustur ve yazdır
        //data turu + data ismi + atama operatoru + deger + ;
        int         yas          =               32      ;
        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi = 50 ;
        System.out.println(sayi);
        System.out.println(50);

        System.out.println(sayi);//ctrl d ile alt alta kopyalama işlemi yapılır
        System.out.println(sayi);
        System.out.println(sayi);
        System.out.println(sayi);

        //konsola 'sayi = 50' seklinde yazdır
        System.out.println("sayi = " + sayi);//etiketiyle yazdırma işlemi
        System.out.println("sayi = " + sayi);//soutv

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim = yas ;
        //byte benimYasim=(byte)yas;---> type casting


        //String bir variable olusturalım (isim)
        String isim = "Ali";

        //isim variable ını etiketıyle yazdır
        System.out.println("isim = " + isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim ;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);


        //isim variable'ının degerini guncelle
        isim ="Can";

        //isim ve onunIsmi variable'larını yazdır
        System.out.println("isim = " + isim);// Can
        System.out.println("onunIsmi = " + onunIsmi);// Ali


    }//main sonu

}//class sonu


