package p;

import java.util.ArrayList;
import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        // [12, 3, -3, 5, 23] ==> 3, -3
        int[] arrey = new int[5];

        arrey[0] = 12;
        arrey[1] = 4;
        arrey[2] = -2;
        arrey[4] = 3;
        arrey[3] = 19;
        System.out.println(Arrays.toString(arrey));
        Arrays.sort(arrey);
        System.out.println(Arrays.toString(arrey));

        for (int w : arrey) {
            if (w < 5) {
                System.out.print(w + " ");

            }
        }  //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 19 olarak olarak değiştirin
        System.out.println("");

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(11);
        number.add(12);
        number.add(13);
        number.add(14);
        number.add(15);

        System.out.println(number);


        for (Integer w : number) {

            if (w % 2 == 1){
                number.set(number.indexOf(w),19);

            }


        }
        System.out.println(number);







    }
}
