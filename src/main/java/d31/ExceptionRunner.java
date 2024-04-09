package d31;

public class ExceptionRunner {
    public static void main(String[] args) {


        ogrenciNotu(45);



    } //main disi

    public static void ogrenciNotu(int not){
        if (not < 0 || not > 100){
            try {
                throw new InvalidStudentGradeException("Ogrenci notu sifirdan kucuk veya yuzden buyuk olamaz");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace(); //hatanin ayrintilarini gorelim
            }
        }else {
            System.out.println(not);
        }


    }

}