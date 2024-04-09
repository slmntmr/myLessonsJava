package d24;

public class Opel extends Araba{

    protected String hiz="Opel arabalar max 220km hiz yaparlar";
    protected String marka="Opel";
    protected String sirketMerkezi="Almanya";

    protected void garanti(){
        System.out.println("Opel arabalar 2 yil garantilidir");
    }

    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanırlar");
    }
}