package d17;

public class MethodCreation01 {

    public static void main(String[] args) {

    int   resalt=collecsıon(5,6);
    System.out.println("resalt = " + resalt);

        /*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.

        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir ve
        bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde geçerli
        ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz.

        Java da metot main metodun disinda olusturulur.

        Access modifier + Static (optional) + return type + method ismi + () + {}

        Olusturulan method main method icinden cagirilir. Buna "Method Call" denir
        */int sonuc = toplama(5, 3);
      System.out.println("sonuc = " + sonuc); //sonuc =
  } //Main method so
  //Ornek 1: Toplama islemi yapan bir method olusturun
  public static int toplama(int a, int b) {

        return a + b;
    }


    public static int collecsıon(int x, int y){

      int  z=x*y;
      return z;




    }

}