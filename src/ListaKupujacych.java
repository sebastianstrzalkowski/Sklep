import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ListaKupujacych {


    public static ObservableList<Sprzedajacy> listaKupujacych =
            FXCollections.observableArrayList(
                    new Sprzedajacy("Jarek", "Kowalski", 10000.00),
                    new Sprzedajacy("Tadeusz", "Nowak", 1000.00),
                    new Sprzedajacy("Ireneusz", "Ygrekowski", 31000.00)
            );

    public ListaKupujacych() {
    }
}
