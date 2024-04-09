package d23;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;
    public Car(){
        this("M");
        System.out.println("Sedan");
    }
    public Car(String tip){
        super();
        System.out.println("Sport");
    }

}