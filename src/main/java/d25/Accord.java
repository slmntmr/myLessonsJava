package d25;

public class Accord extends Honda{
  //  @Override
  //  public void engine() {
  //      System.out.println("Gas 2.0 Turbo");
  //  }
    //Honda'nin child'i yapilacak (extends ile)
    //2- @Override yazilacak
    //3-Abstract silinecek
    //4- Suslu parantez ile body verilecek
    // "Gas 2.0 Turbo"

  @Override
  public void engine() {
      System.out.println("Gas 2.0 Turbo");
  }



}