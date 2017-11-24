import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class ListaJ {


    public static ObservableList<Jednorozec> listaJ =
            FXCollections.observableArrayList(
                    new Jednorozec("Jacek ",Rasa.AMARANTOWA, 10000, Status.DOSTEPNY),
                    new Jednorozec("Agata ",Rasa.AMARANTOWA, 10000, Status.NIEDOSTPENY),
                    new Jednorozec("Paweł ", Rasa.ROZOWA, 10000, Status.DOSTEPNY)
            );

    public ListaJ() {
      }


    public static ObservableList<Jednorozec> getListaJ() {
        return listaJ;
    }
}
