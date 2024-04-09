package d25;

public class Civic extends Honda{ //1-extends ile Honda'ya child yapalim

    @Override //2- @Override yazdik
    public void engine() { //3-abstract silindi
        System.out.println("Gas 1.6 Eco"); //4-suslu parantez ile body eklendi
    }
}