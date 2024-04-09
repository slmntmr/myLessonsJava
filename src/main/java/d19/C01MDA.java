package d19;

import java.util.Arrays;

public class C01MDA {

    public static void main(String[] args) {
                /*
        mdarray olusturun yazdırın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
        //1.yol
        int[][] arr1 = new int[3][2];

        //2.yol
        int[][] arr = {{1,5,6},{4,9,-5},{10,8,3,2}};

        System.out.println(arr);//[[I@19dfb72a  --> mda 'ın referansi

        System.out.println(Arrays.toString(arr));//[[I@17c68925, [I@7e0ea639, [I@3d24753a]--> her bir iç arrayın referanslarından olusan bir dizi

        System.out.println(Arrays.deepToString(arr));//[[1, 5], [4, 9, -5], [10, 8, 3, 2]]

        int[] brr= new int[arr.length];//bu arraye mda arrayin her bir iç arrayinin elemanları toplamını koyacagız


        // int idx=0;
        // for (int[]  each: arr ) {// outer arrayin her bir elemanını(int[]) getirecek

        //     int toplam=0;

        //     for (int each1  : each ) {//her bir inner arrayin elemanlarını getirecek
        //         toplam+=each1;//1+5=6
        //                       //4+9-5=8
        //     }
        //     brr[idx]=toplam;
        //     idx++;
        // }
        // System.out.println(Arrays.toString(brr));

        //fori


        //int[][] arr = {{1,5},{4,9,-5},{10,8,3,2}};

        for (int i = 0; i < arr.length ; i++) {//dıs arraydeki her bir eleman gelecek(gelecek olan elemanlar da birer array)

            int toplam=0;

            for (int j = 0; j <arr[i].length ; j++) {//iç arrayin her bir elemani gelecek
                toplam+=arr[i][j];


            }
            brr[i]=toplam;

        }
        System.out.println(Arrays.toString(brr));





    }


}