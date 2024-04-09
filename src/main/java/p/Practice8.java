package p;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class Practice8 {
    public static void main(String[] args) {
        String[] arr = {"ar", "da", "han"};
        diziİdsGet(arr, 3);

        String s = "Sabırla";
        int a = 10;
        int b = 0;
        ikiliHata(s, a, b);

        String t = null;
        nullLength(t);


        hataFırlat(5);


    }

    public static void diziİdsGet(String[] arr, int idx) {
        try {
            String s = arr[idx];
            System.out.println(s);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index numarası " + (arr.length - 1) + " den büyük olamaz");
        }

    }

    public static void ikiliHata(String s, int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("İndex numarası " + (s.length() - 1) + " den büyük olamaz");
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bolme olmaz");
        }


    }

    public static void nullLength(String t) {
        try {
            int idxUzunluk = (t.length() - 1);
            System.out.println(idxUzunluk);
        } catch (NullPointerException e) {
            System.out.println("Null lenght metoduyla kullanılamz");
        }


    }

    public static void hataFırlat(int age) {
if (age<=0){
            throw new IllegalArgumentException("Yaş negatif değer alamaz");
        }else {
    System.out.println(age);
        }

    }


}
