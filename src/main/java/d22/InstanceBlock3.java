package d22;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;

    //Instance block - Bu class'tan her object olusturuldugunda burasi calisir

    {
        color = "Siyah";
        fuelType = "Benzin";
    }

    //Constructor
    public InstanceBlock3(){
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakit turu : " + fuelType);
    }

    //Parametreli Constructor - default olarak siyah ve benzinle baslatmak istemezsek bunu kullanacagiz

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}