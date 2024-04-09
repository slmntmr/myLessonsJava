package d21;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println(Student2.stdName); //Ali Can

        Student2 ali = new Student2();
        System.out.println(ali.age); //18

        Student2.staticMethod(); //Ben static bir methodum
        ali.nonStaticMethod(); //Ben non-static bir methodum

    }
}