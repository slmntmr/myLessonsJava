package d24;

public class C02_StringBuilder {
    public static void main(String[] args) {

            /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
             */

        /*
        1- parametresiz constructor
        2- String parametreli constructor
        3- int parametreli constructor
         */

        StringBuilder sb1=new StringBuilder(7);
        System.out.println("sb1.capacity() = " + sb1.capacity());//7
        System.out.println("sb1.length() = " + sb1.length());

        sb1.append("hava guzel");

        System.out.println(sb1);

    /*  String str="merhaba";
        str=str.substring(5);
        System.out.println(str);
        */

        //ilk önce space indexini bulalım
        int idx = sb1.indexOf(" ");
        sb1.deleteCharAt(idx);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);//lezugavah

        sb1.delete(sb1.length()-4,sb1.length());
        System.out.println(sb1);//lezug

        sb1.reverse();//guzel
        //Java guzel

        sb1.insert(0,"Java ");
        System.out.println(sb1);

        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("java guzel");
        System.out.println("sb1.capacity() = " + sb1.capacity());//34


    }
}