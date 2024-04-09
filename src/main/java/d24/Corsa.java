package d24;

import java.util.ArrayList;
import java.util.List;

public class Corsa extends Opel{

    String hiz="Corsa max 200km hiz yapar";
    String yakit="Corsa arabalar benzinlidir";
    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanir");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6lt yakit tuketirler");
    }

    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    public static void main(String[] args) {

        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//Corsa
        System.out.println("arb1.marka = " + arb1.marka);//Opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//Opel
        System.out.println("arb1.model = " + arb1.model);//Corsa

        arb1.motor();//Corsa

        Opel arb2=new Corsa();
        System.out.println("arb2.hareket = " + arb2.hareket);//Araba
        System.out.println("arb2.hiz = " + arb2.hiz);//Opel
        System.out.println("arb2.yakit = " + arb2.yakit);//Araba
        System.out.println("arb2.marka = " + arb2.marka);//Opel

        //arb2.model;  opelde veya araba classında model olmadıgı için CTE
        arb2.motor();
         /*
        inheritance da variable lar;
        aramaya data turu neyse oradan baslar,
        bulamazsa parenta bakar,
        ilk buldugu yerden alır
         */
        /*
        inheritance da methodlar;
        aramaya data turu ne ise oradan baslar,
        bulamazsa parenta bakar,
        ilk buldugunu almaz
        constructor'ın oldugu classa kadar override edilmiş mi diye bakar
        son buldugu yerden alır
         */
        //arama işlemi variable ve methodlar için asagıdan yukarı dogrudur
        //override kontrol işlemi ise yukarıdan asagı dogrudur




    }
}