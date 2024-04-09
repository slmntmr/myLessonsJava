package d19;

public class C05Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız


        String str1="Ali";
        String str2="Abdurrahman";
        String str3="Mustafa";
        String str4="Cemil";
        String str5="Yusuf";
        String str6="Yasemin";

        enUzunKelime(str1,str6,str3,str4,str5);


    }

    public static void enUzunKelime(String... str) {//bir methodda sadece 1 tane varargs olabilir ve her zaman en sonda olur

        String enUzunKelime="";

        for (String each:str) {

            if (each.length()>enUzunKelime.length()){

                enUzunKelime=each;
            }

        }
        System.out.println(enUzunKelime);

    }
}