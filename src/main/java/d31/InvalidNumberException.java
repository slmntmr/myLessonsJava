package d31;

public class InvalidNumberException extends RuntimeException{
    //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim


    public InvalidNumberException(String message)  {
        super(message);
    }
}