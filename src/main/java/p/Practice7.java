package p;

public class Practice7 {
    public static void main(String[] args) {
        int resalt = bölme(8, 0);
        System.out.println(resalt);


        String s = "kale123";
        çevir(s);

        getCaractare(s,3);


    }


    public static int bölme(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Sıfıra bölme işlemi yapılamaz");

        }
        return a;
    }

    public static void çevir(String s) {
        try {
            int tranlatıon = Integer.valueOf(s);
            System.out.println(tranlatıon);
        } catch (NumberFormatException e) {
            System.out.println("formatta tutarsızlık var");
        }
    }

    public static void getCaractare(String s,int idx){
        try {
            char caractare=s.charAt(10);
            System.out.println(caractare);
        } catch (Exception e) {
            System.out.println("index bulunamadı");
        }


    }


}
