package d24;

public class Child extends Parent{

    int yas=10;

    public static void main(String[] args) {

        System.out.println(Parent.isim);
        Parent.method1();

        //child class parenta extends oldugu için class ismi
        // yazmadan da cagırabilddik

        System.out.println(isim);
        method1();
        method2();
        //Math.max(1,2);

        Child obj1=new Child();
        System.out.println("obj1.yas = " + obj1.yas);//10
        obj1.method3();

        Parent obj2=new Parent();
        System.out.println("obj2.yas = " + obj2.yas);//30
        obj2.method4();

    }


}