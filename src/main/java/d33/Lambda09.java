
package d33;

import java.util.ArrayList;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        eHaric(myList);

    } //main disi

    //ornek 9: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void eHaric(List<String> myList){
        myList.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.print(t + " "));
        //Ali Yusuf Zeynep Mustafa
    }


}
