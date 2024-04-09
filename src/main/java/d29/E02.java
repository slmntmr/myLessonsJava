package d29;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "1234a"; //kullanici ornegin 1234a girerse exception olusur
        convertStringtoInt(s);


    }//main disi
    public static void convertStringtoInt(String s){
        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1); //1'i String'i int'e donusturebildik mi diye ekledim.

        }catch (NumberFormatException e){
            System.out.println("Donusum icin rakam disi karakter kullanmayiniz :" + e.getMessage());
        }
    }

}