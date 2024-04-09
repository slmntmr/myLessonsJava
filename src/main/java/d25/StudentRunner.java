package d25;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getAge()); //13

        System.out.println(s.isSuccessful()); //true

        s.setAge(25);
        System.out.println(s.getAge()); //25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false

        //set ve get'in coksa kullanildigi class'lara JavaBeans'te deniliyor.

    }
}