import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Jednorozec> listaJednorozcow = new ArrayList<Jednorozec>();

        Jednorozec jednorozec = new Jednorozec("Jacek ",Rasa.AMARANTOWA, 10000, Status.DOSTEPNY);
        Jednorozec jednorozec1 = new Jednorozec("Agata ",Rasa.AMARANTOWA, 10000, Status.NIEDOSTPENY);
        Jednorozec jednorozec2 = new Jednorozec("Paweł ", Rasa.ROZOWA, 10000, Status.DOSTEPNY, jednorozec, jednorozec1);

        ListaJednorozcow.dodajJednorozca(jednorozec);
        ListaJednorozcow.dodajJednorozca(jednorozec1);
        ListaJednorozcow.dodajJednorozca(jednorozec2);

        ListaJednorozcow.wyswietlJednorozce();


        ListaJednorozcow.sprzedajJednororzca(jednorozec1);
    }

}
