
package d33;

import java.util.ArrayList;
import java.util.List;

public class Lambda12 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        bestenAzKucuk(myList);

    } //main disi

    //ornek 12: Bir List'teki karakter sayisi 5’den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

    public static void bestenAzKucuk(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(t -> t.toLowerCase()).
                sorted().
                forEach(t -> System.out.print(t + " ")); //ali elif
    }

}

