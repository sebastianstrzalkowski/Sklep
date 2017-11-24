import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



public class KupJednorozca implements Initializable {

    public TableView tabelaJednorozcow;
    public TableColumn imieKolumna;
    public TableColumn rasaKolumna;
    public TableColumn cenaKolumna;
    public TableColumn statusKolumna;
    public TableColumn rodzicKolumna1;
    public TableColumn rodzicKolumna2;
    public TextField poleTekstowe;

    private final ObservableList<Jednorozec> listaJ = FXCollections.observableArrayList(
            ListaJ.getListaJ()
    );


    public void kupPrzycisk(ActionEvent actionEvent)throws IOException {

        if(!tabelaJednorozcow.getSelectionModel().isEmpty()) {
            Jednorozec jednorozec = (Jednorozec) tabelaJednorozcow.getSelectionModel().getSelectedItem();

            if (jednorozec.getStatus().equals(Status.NIEDOSTPENY)) {
                poleTekstowe.setText("Jednorożec " + jednorozec.getImie() + " nie jest już na sprzedaż, wybierz innego.");
            } else {
                jednorozec.setStatus(jednorozec);
                tabelaJednorozcow.refresh();
                poleTekstowe.setText("Jednorożec " + jednorozec.getImie() + " jest Twój");
            }
        }
        else {
            poleTekstowe.setText("Wybierz zanim klikniesz przycisk :)");
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imieKolumna.setCellValueFactory(
                new PropertyValueFactory("Imie"));
        rasaKolumna.setCellValueFactory(
                new PropertyValueFactory("Rasa"));
        cenaKolumna.setCellValueFactory(
                new PropertyValueFactory("Cena"));
        statusKolumna.setCellValueFactory(
                new PropertyValueFactory("Status"));
        rodzicKolumna1.setCellValueFactory(
                new PropertyValueFactory("Rodzic"));
        rodzicKolumna2.setCellValueFactory(
                new PropertyValueFactory("Rodzic2"));

        tabelaJednorozcow.setItems(listaJ);
    }
}
