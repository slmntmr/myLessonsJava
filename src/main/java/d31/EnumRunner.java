package d31;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //Cities c = new Cities(); //HATA- enum'dan object uretemezsiniz

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.ANKARA;
        System.out.println(il); //ANKARA


        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu); //06000

        //4- Karabuk'un plaka koduna ulasalim
        System.out.println(Cities.KARABÜK.getPlateCode()); //78

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir
        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler));

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {
            for (Cities w : sehirler){ //ADANA, ADIYAMAN, AFYONKARAHISAR, AGRI

                if (plaka == w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }

    }

}