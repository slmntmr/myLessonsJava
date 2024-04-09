
package d33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        maksimum4(nums);

    }//main disi

    //1)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
    //1.yol:
    public static void maksimum1(List<Integer> nums) {
        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)
        //Akistaki herhangi bir sayi, bu degerden buyuktur
        //2, 2, 4, 5, 11, 10

        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //2.yol:
    public static void maksimum2(List<Integer> nums) {
        //Integer.MIN_VALUE yerine nums.get(0) ile ilk index'teki elemani t'ye yukleyebiliriz

        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //3.yol
    public static void maksimum3(List<Integer> nums) {
        //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        //reduce() Optional data type dondurur.Bu, sonucun var olabilecegi veya olmayabilecegi anlamina gelir.
        //Bu nedenle sonucu almak icin get() metodu kullanilir.
        System.out.println(max); //11

    }
    //4.yol: best practice
    public static void maksimum4(List<Integer> nums){
        //Java'da :: işareti, "Method Reference" olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.
        Integer max = nums.
                stream().
                distinct().
                reduce(Math::max).
                get();
        System.out.println(max); //11

    }

}
