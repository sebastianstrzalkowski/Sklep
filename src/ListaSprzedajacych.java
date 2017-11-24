import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ListaSprzedajacych  {


    public static ObservableList<Sprzedajacy> listaSprzedajacych =
                FXCollections.observableArrayList(
                        new Sprzedajacy("Janusz", "Kowalski", 1000.00),
                        new Sprzedajacy("Jan", "Nowak", 1000.00),
                        new Sprzedajacy("Zbigniew", "Xsiński", 1000.00),
                        new Sprzedajacy("Janek", "Nowak", 1000.00)
                );

    public ListaSprzedajacych() {
    }

    public static void pokazListe(ObservableList<Sprzedajacy> listaSprzedajacych) {
        for (Sprzedajacy x : listaSprzedajacych) {
            System.out.print(x.getImie());
        }
    }

    public static void dodajDoListaSprzedajacych(Sprzedajacy sprzedajacy) {
        listaSprzedajacych.add(sprzedajacy);
    }

    /* public static ObservableList<Sprzedajacy> getListaSprzedajacych() {
        return listaSprzedajacych;
    }*/
}