package d8;

import java.util.Scanner;

public class C06Switch {
    public static void main(String[] args) {
        /*
       Kullanıcıdan ay numarasını sisteme girmesini isteyiniz.
       Eger girilen ay 2 numaralı ay ise kullanıcıdan yıl da isteyin.
       Bu bilgilere göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 1-12 arası bir ay numarasi giriniz");
        int ay = scan.nextInt();

        switch (ay){
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Girdiginiz ay 30 gun ceker");break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12:
                System.out.println("Girdiginiz ay 31 gun ceker");break;
            case 2 :
                System.out.println("Lutfen yil giriniz");
                int yil = scan.nextInt();

                if (yil % 4 == 0){
                    System.out.println("Girdiginiz ay 29 gun ceker");
                }else{
                    System.out.println("Girdiginiz ay 28 gun ceker");
                }
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");


        }



    }
}