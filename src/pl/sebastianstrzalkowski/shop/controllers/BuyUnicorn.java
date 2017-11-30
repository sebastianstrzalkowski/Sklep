package pl.sebastianstrzalkowski.shop.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.sebastianstrzalkowski.shop.enums.Status;
import pl.sebastianstrzalkowski.shop.lists.UnicornList;
import pl.sebastianstrzalkowski.shop.models.Unicorn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class BuyUnicorn implements Initializable {

    public TableView unicornTable;
    public TableColumn nameColumn;
    public TableColumn breedColumn;
    public TableColumn priceColum;
    public TableColumn statusColumn;
    public TableColumn parentColumn1;
    public TableColumn parentColumn2;
    public TextField textField;

    private final ObservableList<Unicorn> unicornList = FXCollections.observableArrayList(
            UnicornList.getUnicornList()
    );


    public void buyButton(ActionEvent actionEvent)throws IOException {

        if(!unicornTable.getSelectionModel().isEmpty()) {
            Unicorn unicorn = (Unicorn) unicornTable.getSelectionModel().getSelectedItem();

            if (unicorn.getStatus().equals(Status.NIEDOSTPENY)) {
                textField.setText("Jednorożec " + unicorn.getName() + " nie jest już na sprzedaż, wybierz innego.");
            } else {
                if(Login.getMoney() >= unicorn.getPrice()) {
                    Login.moneyAfterBuy(unicorn.getPrice());
                    unicorn.setStatus(unicorn);
                    unicornTable.refresh();
                    textField.setText("Jednorożec " + unicorn.getName() + " jest Twój. Zostało Ci " + Login.getMoney());
                }
                else{
                    textField.setText("Jednorożec jest za drogi! Brakuje Ci: " + (unicorn.getPrice()-Login.getMoney()));
                }
            }
        }
        else {
            textField.setText("Wybierz zanim klikniesz przycisk :)");
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameColumn.setCellValueFactory(
                new PropertyValueFactory("Name"));
        breedColumn.setCellValueFactory(
                new PropertyValueFactory("Breed"));
        priceColum.setCellValueFactory(
                new PropertyValueFactory("Price"));
        statusColumn.setCellValueFactory(
                new PropertyValueFactory("Status"));
        parentColumn1.setCellValueFactory(
                new PropertyValueFactory("Parent1"));
        parentColumn2.setCellValueFactory(
                new PropertyValueFactory("Parent2"));

        unicornTable.setItems(unicornList);
    }
}
