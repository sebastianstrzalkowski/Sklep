public class Sprzedajacy extends Czlowiek {


    private double budzet;

    public Sprzedajacy(String imie, String nazwisko, double budzet){

        super(imie, nazwisko);
        this.budzet = budzet;
    }

    public Sprzedajacy(String imie, String nazwisko){

        super(imie, nazwisko);

    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }


}

