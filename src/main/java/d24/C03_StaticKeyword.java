package d24;

public class C03_StaticKeyword {
    /*
    scope: kapsam --> var ve methodların nerede gecerli oldugunu belirtir

    4 tane scope vardır
    1: static variable -->  class variable
    2: intance variable --> object variable
    3: local variable  --> method variable
    4: loop variable
     */

    //Bir classta instance, static, local ve loop variablelar olusturunuz
    //instance ve static 2 method olusturunuz
    //main method içinde 2 tane obje olusturunuz, variableları yazdırınız
    //static variable degerini artırınız
    //obj1 inst varb degerini guncelleyiniz
    //obj1, obj2'in ins ve static variablelarını yazdırınız
    //obj2'nin instance ve static variable artırınız
    //obj1, obj2'in ins ve static variablelarını yazdırınız


    int instanceSayi;

    static int staticSayi;

    public void instanceMethod(){
        System.out.println("instance method");
        System.out.println("instanceSayi = " + instanceSayi);
    }
    public static void staticMethod(){
        System.out.println("static method");
        System.out.println("staticSayi = " + staticSayi);
        C03_StaticKeyword obj=new C03_StaticKeyword();
        System.out.println(obj.instanceSayi);
    }

    public static void main(String[] args) {

        int localSayi=0;
        for (int i = 0; i < 2; i++) {//i-->loop variable

        }

        C03_StaticKeyword obj1=new C03_StaticKeyword();
        C03_StaticKeyword obj2=new C03_StaticKeyword();

        System.out.println(staticSayi);//0
        System.out.println(obj1.instanceSayi);//0

        staticSayi++;
        obj1.instanceSayi++;
        System.out.println("staticSayi = " + staticSayi);
        System.out.println("obj1.instanceSayi = " + obj1.instanceSayi);
        System.out.println("obj2.instanceSayi = " + obj2.instanceSayi);
        System.out.println("obj1.staticSayi = " + obj1.staticSayi);

        obj2.staticSayi++;

        System.out.println(staticSayi);//2


        obj2.instanceSayi++;
        System.out.println(obj1.instanceSayi);//1

        staticMethod();
        obj1.instanceMethod();
        /*
        Aynı classtaki static bir method icinden;
          1-static variable/methodlar direk cagrılır,
          2-instance variable/methodlar obje ile cagrılır

        Aynı classtaki instance method icinden;
          1- static variable/methodlar direk cagrılır
          2-instance variable/methodlar direk cagrılabilir

        Farklı class static method icinden
          1- static variable/methodlar class ismi ile cagrılır
          2- instance variable/methodlar obje ile cagrılır

          Farklı class instance method icinden
          1- static variable/methodlar class ismi ile cagrılır
          2- instance variable/methodlar obje ile cagrılır
         */

    }

}