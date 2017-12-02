package pl.sebastianstrzalkowski.shop.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import pl.sebastianstrzalkowski.shop.enums.Breed;
import pl.sebastianstrzalkowski.shop.enums.Availability;
import pl.sebastianstrzalkowski.shop.lists.UnicornList;
import pl.sebastianstrzalkowski.shop.models.Unicorn;

import java.net.URL;
import java.util.ResourceBundle;

public class SellUnicorn implements Initializable {

    public TableView unicornTable;
    public TableColumn nameColumn;
    public TableColumn breedColumn;
    public TableColumn priceColumn;
    public TableColumn statusColumn;
    public TableColumn parent1Column;
    public TableColumn parent2Column;
    public TextField nameTextField;
    public TextField breedTextField;
    public TextField priceTextField;
    public TextField statusTextField;
    public ComboBox parent1Box;
    public ComboBox parent2Box;
    public Button addButton;
    public ComboBox breedBox;
    public ComboBox statusBox;
    public Text checkBreed;


    private ObservableList<Unicorn> unicornList = FXCollections.observableArrayList(
            UnicornList.getUnicornList()
    );


    public void initialize(URL location, ResourceBundle resources) {
        nameColumn.setCellValueFactory(
                new PropertyValueFactory("Name"));
        breedColumn.setCellValueFactory(
                new PropertyValueFactory("Breed"));
        priceColumn.setCellValueFactory(
                new PropertyValueFactory("Price"));
        statusColumn.setCellValueFactory(
                new PropertyValueFactory("Status"));
        parent1Column.setCellValueFactory(
                new PropertyValueFactory("Parent1"));
        parent2Column.setCellValueFactory(
                new PropertyValueFactory<Unicorn, String>("Parent2"));

        unicornTable.setItems(unicornList);

        breedBox.getItems().addAll(Breed.values());
        statusBox.getItems().addAll(Availability.values());

        parent1Box.getItems().addAll(
                unicornList
        );
        parent2Box.getItems().addAll(
                unicornList
        );
    }

    public void addButton(ActionEvent actionEvent) {

        try {
            String name = nameTextField.getText();
            double price = Double.parseDouble(priceTextField.getText());

            Breed breed = (Breed) breedBox.getValue();
            Availability availability = (Availability) statusBox.getValue();
            Unicorn parent1 = (Unicorn) parent1Box.getValue();
            Unicorn parent2 = (Unicorn) parent2Box.getValue();

            if (Unicorn.testBreed(parent1, parent2, breed)) {
                unicornList.add(new Unicorn(name, breed, price, availability, parent1, parent2));
                checkBreed.setText("Udało się dodać jednorożca");
                parent2Box.setItems(unicornList);
                parent1Box.setItems(unicornList);
            } else {
                checkBreed.setText("Nie udao się dodać. Sprawdź rasy i rodziców");
            }
        } catch (NumberFormatException nfe) {
            priceTextField.setText("Tylko liczby!!");
        }


    }
}
