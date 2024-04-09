package d17;

import java.util.ArrayList;
import java.util.List;

public class MethodCreation02 {

    public static void main(String[] args) {

        List<String> renkler=new ArrayList<>();
       renkler.add("Kırmızı");
       renkler.add("Sarı");
       renkler.add("Beyaz");
       renkler.add("Mavi");

        listPointer(renkler);


        //--------ornek 1 calistirma
        int sonuc1 = carpma(3, 5);
        System.out.println("sonuc1 = " + sonuc1); //sonuc1 = 15

        //--------ornek 2 calistirma

        int sonuc2 = carpTopla(4,4,2);
        System.out.println("sonuc2 = " + sonuc2); //sonuc2 = 18

        //ornek 3 calıstırma
      pointer("Suleymanı konsola yazdır");


    }//main dısı---------------------------------------------------------------------------------


    //ornek 1: Iki sayiyi carpan bir method olusturunuz
    static int carpma(int a, int b){
        //protected, bu class'tan erisilebilir
        //bir de sadece miras alinan class'lardan erisilebilir
        return a * b;
    }



    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz

    private static int carpTopla(int a, int b, int c){
        //private, sadece bu class'tan erisilebilir

        return a * b + c;

    }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz

    private static void pointer(String str){
        System.out.println(str);



    }

    private static List<String> listPointer(List<String> name){

        System.out.println(name);
        return name;



    }

}