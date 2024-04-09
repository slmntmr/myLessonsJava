
package d32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 10));
        tekKupTekrarsiz(nums);
        System.out.println();
        List<Integer> nums1=new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(9);
        nums1.add(4);
        nums1.add(7);
        tekKupTekrarsiz(nums1);


    } //main disi

    //1) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekKupTekrarsiz(List<Integer> nums) {
        //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));//27 125
    }

}
