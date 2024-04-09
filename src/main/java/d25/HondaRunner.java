package d25;

public class HondaRunner {
    public static void main(String[] args) {
        //Honda h = new Honda();  //Abstract bir class'tan object uretilemez

        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        a.engine(); //Gas 2.0 Turbo

        a.music(); //Pro, dogrudan kullandi
    }
}