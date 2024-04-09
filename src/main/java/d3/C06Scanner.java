package d3;

import java.util.Scanner;

public class C06Scanner {
    /*
  kullanıcıdan kilosunu ve metre cinsinden boyunu isteyiniz
  ve vucut kitle indeksini bulunuz

  not: vucut kitle indeksi: kilo/(boy*boy)

   */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        System.out.println("Lutfen metre cinsinden boyunuzu giriniz");
        double boy = input.nextDouble();

        //vucut kitle indeksi: kilo/(boy*boy)
        System.out.println(kilo/(boy*boy));

    }

}