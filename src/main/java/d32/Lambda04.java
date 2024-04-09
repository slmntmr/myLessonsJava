
package d32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 11, 10));
        tekrarsizCiftKare(nums);

    } //main disi

    //1) Bir list'teki “tekrarsiz","cift " elemanlarin "karelerinin"
    // "toplamını" hesaplayan method oluşturun
    public static void tekrarsizCiftKare(List<Integer> nums) {
        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.
        //ornegin iki sayiyi toplayalim. 3 + 5 = 8'e indirgendi

        int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, Integer::sum);

        System.out.println(toplam); //104
    }

    //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
    //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
    //u: Ilk elemandir
    //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

    //İlk iterasyonda:
    //t=0 (başlangıç değeri olarak belirtildiği için)
    //u=4 (ilk eleman)
    //t+u = 4

    //İkinci iterasyonda:
    //t=4 (önceki adımdan gelen sonuç)
    //u=100 (ikinci eleman)
    //t+u = 104

    /*Java’da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
    Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
    Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/



}


