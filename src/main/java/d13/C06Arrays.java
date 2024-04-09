package d13;

import java.util.Arrays;

public class C06Arrays {
    public static void main(String[] args) {
               /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarına deger atayınız, arrayi yazdırınız
         */
        int[] arr = new int[5];//index degil, eleman sayısı

        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]//int default degeri

        arr[0]=5;
        System.out.println(Arrays.toString(arr));//[5, 0, 0, 0, 0]
        //arrayin son elemanını 13 olarak guncelleyim
        arr[4]=13;
        System.out.println(Arrays.toString(arr));
        //dinamik
        //arrayin son elemanın indexi-> array uzunlugu -1
        int sonIdx=arr.length-1;
        arr[sonIdx]=15;
        System.out.println(Arrays.toString(arr));



    }
}