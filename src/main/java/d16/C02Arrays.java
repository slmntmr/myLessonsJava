package d16;

import java.util.Arrays;
import java.util.Scanner;

public class C02Arrays {
    public static void main(String[] args) {
        /*

        3 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız

         */
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));//[0, 0, 0]//int'in default degeri 0 oldugu için
        //arr[0]=5;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {//i 0,1,2 için 3 kez loop calısacak

            System.out.println("Lutfen arraye eklemek istediginiz elemanı giriniz");
            int sayi=scan.nextInt();
            arr[i]=sayi;

        }
        System.out.println(Arrays.toString(arr));

        //Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        //once toplam bulalım
        double toplam=0;

        for ( int each: arr) {
            toplam+=each;//toplam=toplam+each;
        }
        System.out.println("toplam = " + toplam);
        //ortalama=toplam/elemansayısı
        double ortalama=toplam/arr.length;
        System.out.println("ortalama = " + ortalama);

        //Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int each:arr) {
            if (each>ortalama){
                System.out.print(each+" ");
            }
        }


    }
}