package d30;

public class E05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 0; //b'yi 0 girerseniz ArithmeticException olusur.
        // b'yi 1 girerseniz StringIndexOutOfBoundsException olusur
        // b'yi 4 girerseniz J gelir
        String s = "My Java";
        //getCharFromString(s,a,b);
        getCharFromString2(s,a,b);

    }//main disi
    //1.yol:
    public static void getCharFromString(String s, int a, int b){

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapilamaz " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanmayiniz " + e.getCause());
            //Olmayan index kullanmayiniz null
        }

    }
    //2.yol:

    public static void getCharFromString2(String s, int a, int b){
        //Tum exception turlerini tek bir catch'te yakalamak icin "exception" adli parent kullanilir
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Bir istisna olustu " + e.getClass());
            //getClass() ile exception'nin turunu ogrenebilirsiniz
        }

    }


}