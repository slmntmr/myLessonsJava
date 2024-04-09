package p;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {


        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdirin.

        String[] renkler = new String[5];

        renkler[0] = "Mavi";
        renkler[1] = "Yeşil";
        renkler[4] = "Mor";
        renkler[2] = "Kırmızı";
        renkler[3] = "Beyaz";

        int toplam = 0;

        for (String w : renkler) {

            toplam = toplam + w.length();

        }

        System.out.println("toplam = " + toplam);

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //     bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int[] age = new int[6];

        age[0] = 5;
        age[1] = 13;
        age[2] = 9;
        age[3] = 14;
        age[4] = 23;
        age[5] = 10;


        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        int mınımum = age[0];
        int maxsımum = age[0];

        for (int w : age) {

            maxsımum = Math.max(w, maxsımum);
            mınımum = Math.min(w, mınımum);
        }
        System.out.println("maxsımum = " + maxsımum);
        System.out.println("mınımum = " + mınımum);
        System.out.println("Toplam: " + (maxsımum + mınımum));


    }
}
