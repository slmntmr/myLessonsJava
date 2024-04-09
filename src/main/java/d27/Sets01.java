
package d27;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {
        //Set'ler tekrarsiz (unique) datalari depolamak icin kullanilir
        //Ornegin; tc kimlik, parmak izi, e mail, ehliyet, il plaka no

        /*Java’da üç tür set vardır:

        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null’i eleman olarak kabul ederler */

        /*String a = "A C";
        System.out.println(a.hashCode());*/

        /*2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir sorted set’tir.*/

        //HashSet nasil olusturulur?

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs); //[]

        //HashSet'e eleman nasil eklenir?
        hs.add("Halil");
        hs.add("Rumeysa");
        hs.add("Ahmet");
        hs.add("Bahar");
        System.out.println(hs); //[Ahmet, Halil, Bahar, Rumeysa]

        hs.add("Ahmet"); //tekrarli eleman hata vermez, tekrarli elemanin uzerine yazar
        System.out.println(hs); //[Ahmet, Halil, Bahar, Rumeysa]

        hs.add(null); //hashSet'e null ekleyebilirsiniz
        System.out.println(hs); //[null, Ahmet, Halil, Bahar, Rumeysa]

        //------------------------------Ekstra bilgi - eleman eklemenin kisa yollari
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Sinan", "Kerem", "Tuba", "Onur"));
        System.out.println(hs2); //[Kerem, Sinan, Tuba, Onur]

        Set<String> hs3 = Set.of("Ilknur", " Seyma", "Halil", "Selim");
        System.out.println(hs3); //[Selim, Halil,  Seyma, Ilknur]
        //Set.of() methodu ile olusturulan set immutable- degistirilemez
        //------------------------------
        //LinkedHashSet nasil olusturulur?
        //generic type
        //data tipi olarak primitive kullanilmaz

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        //LinkedHashSet'e eleman nasil eklenir?
        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs); //[14, 19, 7, 1, null] - insertion order - ekleme sirasi

        //Bir tane daha olusturalim
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls); //[14, 19, 17, 11]

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls); //degisiklige ugrayan method'un solundakidir
        System.out.println(lhs); //[14, 19]
        System.out.println(ls); //[14, 19, 17, 11]

        //-----------------------------
        //TreeSet nasil olusturulur?
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); null koyamazsiniz
        System.out.println(ts); //[A, G, R, U, Z] - natural order (A-Z, sayilarda kucukten buyuge)
        //---------------------
        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        //TreeSet<Character> ss = ts.subSet('G','U'); HATA

        SortedSet<Character> ss = ts.subSet('G','U'); // G dahil, U haric
        System.out.println(ss); //[G, R], ts.subSet('B','H'); olsaydi [G] verirdi


    }
}