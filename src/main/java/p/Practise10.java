package p;

import java.util.ArrayList;
import java.util.List;

public class Practise10 {
    public static void main(String[] args) {

        List<Integer> myNumber = new ArrayList<>();
        myNumber.add(5);
        myNumber.add(6);
        myNumber.add(7);
        myNumber.add(8);
        myNumber.add(9);
        myNumber.add(10);
        toplamYzdır(myNumber);


    }//main dışı

    //1) Bir list'teki “tekrarsiz","cift " elemanlarin "karelerinin"
    // "toplamını" hesaplayan method oluşturun
    public static void toplamYzdır(List<Integer> number) {

     int  sumer= number.stream().distinct().filter(t -> t % 2 == 0).map(t->t*t).reduce(0,Integer::sum);
        System.out.println(sumer);


    }


}
