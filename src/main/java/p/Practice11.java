package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        System.out.println(list);
        yunikDabulCarp(list);
        maxımum(list);
        mınımum(list);
        naturelorder(list);
        yedidenBuyuk(list);

        List<String> stringList=new ArrayList<>();
        stringList.add("Elma");
        stringList.add("Erik");
        stringList.add("Kiraz");
        stringList.add("Nar");
        stringList.add("Karpuz");
        stringList.add("Portakal");
        stringList.add("");
        eWitStart(stringList);
        eLessWitStart(stringList);
       printLessOfFour(stringList);
       printLessOfFourToUpperCase(stringList);



    }
    //1) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void yunikDabulCarp(List<Integer> nums) {
        int letslook = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, Integer::compareTo);
        System.out.println(letslook);

    }    //1)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    public static void maxımum(List<Integer> nums) {
        Integer max = nums.stream().reduce(Math::max).get();
        System.out.println("koleksın yapımızın maxsımum degerı: " + max);


    }

    public static void mınımum(List<Integer> nums) {
        Integer min = nums.stream().reduce(Math::min).get();
        System.out.println("Kolleksın yapımızın mınımum degerı: " + min);


    }

    public static void naturelorder(List<Integer> nums) {
        System.out.println("kolleksın yapımızın dogal sıralaması: ");
        nums.stream().sorted().forEach(t -> System.out.println("Kolleksın yapımızın dogal sıralaması: " + t + " "));

    }
//8)Verilen List'ten 7’den buyuk en kucuk cift sayiyi bulmak için bir method oluşturun

    public static void yedidenBuyuk(List<Integer> nums) {
        System.out.println("Listemizdeki yediden buyuk cift elemanları yazdıran metod");
        nums.stream().filter(t -> t > 7 && t % 2 == 0).forEach(t -> System.out.print(t + " "));
        System.out.println();

    }
    //ornek 9: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void eWitStart(List<String> meyve){
        System.out.println("E ile baslayan meyveler: ");
        meyve.stream().filter(t->t.startsWith("E")).forEach(t-> System.out.println(t+" "));


    }

  public static void   eLessWitStart(List<String> meyve){
      System.out.println("E ile baslamayan meyvelerimiz:");
        meyve.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.println(t+" "));



  }
    //ornek 10: Bir List'te karakter sayisi 5’den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

    public static void printLessOfFour(List<String> meyve){
        System.out.println("Uzunlugu dortten buyuk olan meyvelerimiz:");
        meyve.stream().filter(t->t.length()>4).forEach(t-> System.out.println(t+" "));



    }
    //ornek 11: Bir List'teki karakter sayisi 5’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.

    public static void printLessOfFourToUpperCase(List<String> meyve){
        System.out.println("Uzunlugu dortten buyuk olan meyvelerimiz buyuk harf ıle:");
        meyve.
                stream().
                filter(t->t.length()>4).
                map(String::toUpperCase).
                collect(Collectors.toList()).
                forEach(t-> System.out.println(t+" "));

    }


}
