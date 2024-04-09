package p;

public class P4 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("**********");
        int leng = sb.length();
        int cap = sb.capacity();

        System.out.println("---------ÖRNEK1-----------");
        System.out.println("leng = " + leng);
        System.out.println("cap = " + cap);

        System.out.println("---------ÖRNEK2------------");
        StringBuilder sb1 = new StringBuilder("Elmas");
        StringBuilder tersten = sb1.reverse();
        System.out.println("tersten = " + tersten);

        StringBuilder sb2 = new StringBuilder();

        sb2.append("Mavi");
        System.out.println("sb2 = " + sb2);

        StringBuilder newSb2 = sb2.deleteCharAt(0);
        System.out.println("newSb2 = " + newSb2);

        StringBuilder newsb = sb2.replace(3, 3, "Kırmızı");
        System.out.println("newsb = " + newsb);

        StringBuilder newsb1=newsb.insert(10,"Beyaz");
        System.out.println("newsb1 = " + newsb1);

        String s="öyle bir çalışınki tanımayanlar sizi (haşa) esbabperest sansınlar";
        String s1=s.toUpperCase();
        System.out.println("s1 = " + s1);


    }
}
// File->settings->plugins de lombok yazdığınızda çıkan eklentiyi aktif edebilirsiniz.