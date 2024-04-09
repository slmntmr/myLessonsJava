package p;

import java.util.ArrayList;

public class P3 {
    public static void main(String[] args) {

        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.

        ArrayList<Character> lıst = new ArrayList<>();

        lıst.add('j');
        lıst.add('a');
        lıst.add('v');
        lıst.add('a');
        lıst.add('v');

        System.out.println(lıst);

        ArrayList<Character> newLıst = new ArrayList<>();

        for (Character w : lıst) {

            if (!newLıst.contains(w)) {
              newLıst.add(w);

            }

        }
        System.out.println(newLıst);

    }
}
