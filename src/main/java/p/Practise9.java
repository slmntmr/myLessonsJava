package p;

import java.util.ArrayList;

public class Practise9 {
    public static void main(String[] args) {

        String[] a = {"dü", "zen", "li"};
        int b = 10;
        int c = 0;

        getArrey(a, b, c);


        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        System.out.println(nums);

        nums.stream().filter(t->t%2==1).forEach(t-> System.out.print(t+" "));


    }

    public static void getArrey(String[] a, int b, int c) {
        try {
            int idx = b / c;
            String çagır = a[idx];
            System.out.println(çagır);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("İndex nosu " + (a.length - 1) + " den büyük olamaz");
        }
        catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme yapılamaz");
        }
        finally {
            System.out.println("Veri tabanı bağlantısını kesiniz");
        }
        System.out.println("isGoOn");

    }


}