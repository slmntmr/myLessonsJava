package d19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
    public static void main(String[] args) {

    /*
    Bir list olusturunuz. 1'den 15'e kadar tamsayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        System.out.println(list);

        for (int each:list) {

            if (each>10){
                //set(degistirilecek olan el. index, yeni deger)
                //list.set(10,22);
                //indexOf methodu girilen elemanın indexini verir
                list.set(list.indexOf(each),each*2);


            }

        }

        System.out.println(list);





    }
}