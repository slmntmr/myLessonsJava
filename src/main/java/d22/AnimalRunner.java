package d22;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(); //Dogs bark
        d.eat(); //Animals eat
        System.out.println("------------------------------");
        //Bird class'tan bir object uretelim
        Bird b = new Bird();
        b.tweet(); //Birds tweet
        b.drink(); //Animals drink
        System.out.println("------------------------");
        Cat c=new Cat();
        c.meow();
        c.eat();
        c.feedWithMilk();

        //a) Java ‘Multiple Inheritance' i desteklemez. ‘Single Inheritance’ i destekler.
        //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
        //   'Hierarchical Inheritance' denir ve Java bunu kabul eder.
        /*c) Ama coklu parent’lardan yararlanamamak iyi olmadi.
        Ozelliklerini inherit etmek istedigimiz class’lar birden fazla ise (parent’lar) o
        durumda Java bize, Apartman tarzi yapilanma olusturmustur.
        ( 'Multi Level Inheritance’) Java bunu kabul eder.*/

        // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir(yukaridan asagiya)
        // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir (asagidan yukariya)

        //Java’da her class’in bir tane default constructor’i vardir ama bu default constructor
        // class’in icinde gorunmez
        //cunku default constructor "Object Class” icindedir.
        // (ornegin animal class’in () constructoru yok gibidir ama Object’tedir)










    }
}