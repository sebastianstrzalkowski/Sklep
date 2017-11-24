import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.*;

public class Login {
    public TextField hasloPole;
    public TextField loginPole;
    public CheckBox kupujacySprawdz = new CheckBox();
    public CheckBox sprzedawcaSprawdz =new CheckBox();
    public AnchorPane zaloguj;

    Sprzedajacy sprzedajacy = new Sprzedajacy("Janusz", "Kowalski", 1000.00);
    Sprzedajacy sprzedajacy1 =  new Sprzedajacy("Jan", "Nowak", 1000.00);

   private final ObservableList<Sprzedajacy> listaSprzedajacych = FXCollections.observableArrayList(
           new Sprzedajacy("Janusz", "Kowalski", 1000.00),
           new Sprzedajacy("Jan", "Nowak", 1000.00),
           new Sprzedajacy("Zbigniew", "Xsiński", 1000.00),
           new Sprzedajacy("Janek", "Nowak", 1000.00)

    );


    public void initialize(URL location, ResourceBundle resources) {


    }

    public void zalogujPrzycisk(ActionEvent actionEvent) {

        String login = loginPole.getText();
        String haslo = hasloPole.getText();
        System.out.println(login);
        System.out.println(haslo);
        Sprzedajacy sprzedajacy = new Sprzedajacy(loginPole.getText(), hasloPole.getText(),1000.00);



            ListaSprzedajacych.pokazListe(listaSprzedajacych);
                /*if (sprzedajacy.getImie().equals(login) && sprzedajacy.getNazwisko().equals(haslo)){
                    System.out.println("Witaj "+ login);
                    break;
                }
                else if(!sprzedajacy.getImie().equals(login) && !sprzedajacy.getNazwisko().equals(haslo)){
                    System.out.println("Nie znam Cię " + sprzedajacy.getImie() + " " + sprzedajacy.getNazwisko());
                }*/
            };



       }



