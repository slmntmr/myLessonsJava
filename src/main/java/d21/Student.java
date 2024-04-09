package d21;

public class Student {
    //Access Modifier (Erisim belirleyici)
    //Java'da 1.public, 2.protected, 3.default, 4.private

    /*
    1)public
    2)protected
    3)default
    4)private

    public > protected > default > private

    public      ==>  public olanlar her class’dan kullanilabilir
    protected   ==> protected olanlar baska package’lardan kullanilamaz,
                ancak baska package’larda child classlar icinden kullanilabilir
    default     ==> default olanlar baska package’lardan kullanilamazlar
    private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

    "protected ile default" arasindaki farki söyleyiniz?
    Not ==> protected olanlar baska package’lardan kullanilamaz ancak baska package’larda
    child classlar icinden kullanilabilir. default olanlar baska package’lardan kullanilamazlar
 */

    public String stdName = "Ali Can";

    protected String address = "Istanbul"; // Ali Can'in akrabalari gorebilsin

    String email = "alican@gmail.com";

    private String tcKimlik = "1234567891";

    @Override
    public String toString() {
        return "Student{" + "stdName='" + stdName + '\'' + ", address='" + address + '\'' + ", email='" + email + '\'' + '}';
    }
}