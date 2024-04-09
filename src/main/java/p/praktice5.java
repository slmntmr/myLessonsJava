package p;

import java.util.Scanner;

public class praktice5 {

    public static int bölme(int a, int b){
       return a/b;



    }
public static int hesabMakinesi() {
    Scanner inPut = new Scanner(System.in);
    System.out.println("Lütfen sayınızı giriniz: ");
    int myNumber = inPut.nextInt();

    int sonuç=1;



   for (int i =1 ; i<11; i++) {
       sonuç= myNumber * i;
    }

    return sonuç;

}




}
