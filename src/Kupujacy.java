public class Kupujacy extends Czlowiek {


    private double budzet;

    Kupujacy(String imie, String nazwisko, double budzet){
        super(imie, nazwisko);
        this.budzet = budzet;
    }



    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }
}
