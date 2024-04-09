package d3;

public class C04Concatenation {

    public static void main(String[] args) {
        /*
        2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın
         */

        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        //Java5Güzel yazdırın
        //+ işareti numeric datalarda matematiksel toplama yapar, string datalarda yan yana yazdırır(concat)
        System.out.println(str1+sayi1+str2);

        //8Java yazdırın
        System.out.println( sayi1+sayi2 + str1);//8Java

        //Java8
        System.out.println(str1 + (sayi1+sayi2));//Java8

        //Java8Guzel yazdırın
        System.out.println(str1+ (sayi1+sayi2) + str2);//Java8Guzel

        //2Güzel15 yazdırın
        System.out.println( sayi1-sayi2  +  str2 +   sayi1*sayi2);//2Guzel15

        //Java22 yazdırın
        System.out.println(str1 + (sayi1*sayi1-  sayi2));

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53Güzel yazdırın
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);
        System.out.println(sayi1+""+sayi2+str2);

        //ctrl alt l notları duzenlemeye yarar
        //command alt l

    }


}