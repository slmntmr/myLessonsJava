package d16;

import java.util.Arrays;

public class C03ArrayeElemanEkleme {
    public static void main(String[] args) {
        /*
        verilen arraye istenen bir elemanı ekleyen bir kod yazınız
        int [] arr={1,4,7,11};
        eklenecek eleman = 5 ;
         */
        int[] arr={1,4,7,11};
        int eklenecek=5;

        System.out.println(Arrays.toString(arr));//[1, 4, 7, 11]
        //arrayden 1 fazla eleman içeren yeni bir array olusturalım
        int [] brr= new int[arr.length+1];

        //arr nin elemanlarını tek tek brr'ye ekleyelim
        //1.yol
        for (int i = 0; i < arr.length ; i++) {
            brr[i]=arr[i];
        }

        //2.yol
        int idx=0;
        for (int each:arr) {
            brr[idx]=each;
            idx++;
        }
        System.out.println(Arrays.toString(brr));//[1, 4, 7, 11, 0]
        brr[brr.length-1]=eklenecek;
        System.out.println(Arrays.toString(brr));

        arr=brr;//data turlerinin aynı olması yani ikisinin de array olması

        System.out.println(Arrays.toString(arr));//[1, 4, 7, 11, 5]
    }
}