import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Jednorozec {

    private String imie;
    private Rasa rasa;
    private Jednorozec rodzic1;
    private Jednorozec rodzic2;
    private double cena;
    private Status status;
    private String rodzice;


    Jednorozec(String imie, Rasa rasa, double cena,  Status status){

        this.imie = imie;
        this.rasa = rasa;
        this.cena = cena;
        this.status = status;
        rodzice = "brak danych";

    }

    Jednorozec(String imie,Rasa rasa, double cena,Status status, Jednorozec rodzic1, Jednorozec rodzic2){

        this.imie = imie;
        this.rasa = rasa;
        this.cena = cena;
        this.status = status;
        this.rodzic1 = rodzic1;
        this.rodzic2 = rodzic2;
        rodzice = rodzic1.getImie() + " i " + rodzic2.getImie();
    }



    public Rasa getRasa() {
        return rasa;
    }

    public void setRasa(Rasa rasa) {
        this.rasa = rasa;
    }

    public double getCena(){
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Status getStatus() {
        return status;
    }

    public static void setStatusNiedostepny(Jednorozec jednorozec) {
            jednorozec.status = Status.NIEDOSTPENY;
    }
    public  void setStatus(Jednorozec jednorozec) {
        jednorozec.status = Status.NIEDOSTPENY;
    }

    public Jednorozec getRodzic2() {

        return rodzic2;
    }

    public void setRodzic2(Jednorozec rodzic2) {
        this.rodzic2 = rodzic2;
    }



    public Jednorozec getRodzic1() {

        return rodzic1;
    }

    public void setRodzic1(Jednorozec rodzic1) {
        this.rodzic1 = rodzic1;
    }

    public String getImie() {

        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getRodzice() {
        return rodzice;
    }

    public static void testKrzyzowki(Jednorozec rodzic1, Jednorozec rodzic2, Jednorozec jednorozec){

        if(rodzic1.getRasa().toString().equals(rodzic2.getRasa().toString().equals(jednorozec.getRasa()))){}
        else{
            System.out.println("Nie prawidłowe rasy rodziców.");
        }
    }



    public String toString() {

        return "Jednorozec" +
                "imię '" + imie + '\'' +
                ", rasa: " + rasa +
                ", rodzice: " + rodzice +
                ", cena: " + cena +
                ", status: " + status;
    }



}
