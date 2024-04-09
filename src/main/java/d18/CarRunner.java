package d18;

public class CarRunner {
    public static void main(String[] args) {
        //4- car class'indan bir object uretelim
        //8- constructor icine arguman girelim

        Car c1 = new Car("BMW","3.20",2023,false);
        System.out.println(c1.brand); //Honda
        System.out.println(c1.model); //Accord
        System.out.println(c1.year); //2023
        System.out.println(c1.hybrid); //true

        c1.hareket(); //Honda hizli hareket eder
        c1.dur(); //Honda guvenli bir sekilde durur

        //5- Car class'a donup custom constructor olusturalim

        //9-
        Car c2 = new Car("Audi", "A4",2018,false);
        System.out.println(c1); //Car{brand='BMW', model='3.20', year=2023, hybrid=false}
        System.out.println(c2); //Car{brand='Audi', model='A4', year=2018, hybrid=false}

        //objeyi yazdirmak icin toString methodu olusturulur. Car class'a git
    }
}