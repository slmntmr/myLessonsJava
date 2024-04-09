package d30;

public class E07 {
    public static void main(String[] args) {
        //6) IllegalArgumentException,bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
        //printAge(25);
        printAge(-3); //Java negatif yas girildiginde hata olusturmaz, hatayi biz ogretecegiz

    } //main disi

    public static void printAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("Yasi negatif girmeyiniz");
        }else {
            System.out.println(age);
        }
    }

}