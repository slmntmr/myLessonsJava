package d23;

public class Dog extends Mammal {
    public void bark()  {
        System.out.println("Dogs bark");
    }
    @Override //Anotation - not - yazmak zorunda degilsiniz
    public void eat()  {
        System.out.println("Dogs eat");
    }

    @Override
    public Animal create()  {
        return new Dog();
    }

    @Override
    public int add(int a, int b)  {
        return a + b;
    }
    //primitive veri turlerinde parent-child iliskisi yoktur.
    //return type degistirilemez

    @Override
    public Integer carpma(Integer a, Integer b) {
        return a * b;
    }


}