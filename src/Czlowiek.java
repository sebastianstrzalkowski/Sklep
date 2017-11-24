public class Czlowiek {

    private static String imie;
    private static String nazwisko;

    Czlowiek(String imie, String nazwisko){

        this.imie = imie;
        this.nazwisko = nazwisko;

    }



    public static String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public static String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
