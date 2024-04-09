
package d33;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda11 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        List<String> donusList = bestenCokBuyuk(myList);
        System.out.println(donusList); //[ZEYNEP, MUSTAFA]

    }

    //ornek 11: Bir List'teki karakter sayisi 5’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.
    public static List<String> bestenCokBuyuk(List<String> myList){
        //return myList.stream().filter(t -> t.length() > 5).map(t->t.toUpperCase()).collect(Collectors.toList());
        return myList.stream().filter(t -> t.length() > 5).map(String::toUpperCase).collect(Collectors.toList());

    }



}
