package d29;

public class E03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.
        String s = "Java";
        karakterSec(s,2);
        karakterSec(s,4); //Hata

    }//main disi

    public static void karakterSec(String s, int idx){
        //charAt() verilen index'teki elemani getirir
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.err.println("olmayan index'leri kullanmayiniz " + e.getMessage());
            //e.printStackTrace(); //Arastirin
        }


    }

}