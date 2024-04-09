package d28;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        //key'i tekrarli kullandiginizda hata vermiyordu ama bu sekilde yapmak best practice degildir
        stdAges.put("Tom", 35);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.
        stdAges.replace("Tom",39);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //2) replace() methodu eski deger kontrolu yaparak ta calisir
        stdAges.replace("Tom", 21, 45);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        stdAges.replace("Tom", 39, 45);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);
        System.out.println(stdAges); //77 eklemez. {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        stdAges.putIfAbsent("Ayse", 23);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}

        //4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar

        System.out.println(stdAges.get("Tom")); //45
        System.out.println(stdAges.getOrDefault("Tom", -1)); //45

        System.out.println(stdAges.get("Jerry")); //null
        System.out.println(stdAges.getOrDefault("Jerry", -1)); //-1

        //5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        Boolean b = stdAges.containsValue(19);
        System.out.println(b); //true
        System.out.println(stdAges.containsValue(99)); //false

        System.out.println(stdAges.containsKey("TOM")); //false
        System.out.println(stdAges.containsKey("Tom")); //true

        System.out.println("-------------------");

        //6)remove("Tom"); methodu key kullanarak entry silmeye yarar
        stdAges.remove("Tom"); //{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}

        //remove("Can",19); methodu hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez

        stdAges.remove("Can", 18);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}

    }
}
