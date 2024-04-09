
package d33;

import java.util.ArrayList;
import java.util.List;

public class Lambda10 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        bestenAzTekrarsiz(myList);

    } //main disi
    //ornek 10: Bir List'te karakter sayisi 5’den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

    public static void bestenAzTekrarsiz(List<String> myList){
        myList.stream().distinct().filter(t -> t.length() < 5).forEach(t -> System.out.print(t + " ")); //Ali Elif
    }

}

