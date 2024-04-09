package d16;


import java.util.ArrayList;
import java.util.List;


public class C04OrtakIsimler {
    public static void main(String[] args) {
        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]
         */
        String[] arr={"John","  Brad  ","Angel","Sofia","Emily","Aycan"};

        String[] brr={"sofia","brad","grace","ayCAN","emily","hazel"};

        List<String> ortakIsimler = new ArrayList<>();

        for (String each1:arr) {//Angel
            for (String each2:brr) {//hazel
                if (each1.trim().equalsIgnoreCase(each2.trim())){
                    ortakIsimler.add(each1);
                }
            }
        }

        System.out.println(ortakIsimler);




    }
}