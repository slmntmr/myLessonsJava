package d22;

public class InstanceBlock2 {

    //Eger tum constructor'larin icinde calismasi gereken ayni kodlar varsa
    //tekrardan kurtulmak icin bu kodlari instance block icine yazariz

    public int year;

    {
        System.out.println("Herkese selam");
    }

    //2 tane constructor olusturalim
    public InstanceBlock2(){
        //Buradaki kodu instance block icine tasidik
    }

    public InstanceBlock2(int year) {
        //Buradaki kodu instance block icine tasidik
        this.year = year;
    }
}