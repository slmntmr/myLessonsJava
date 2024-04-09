package d29;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //Hashmap'in arka planda calismasi
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington");
        capitals.get("USA");

        capitals.put("Italy", "Rome");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        capitals.put("Turkiye", "Istanbul");



    }
}