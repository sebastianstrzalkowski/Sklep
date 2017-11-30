package pl.sebastianstrzalkowski.shop.lists;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.sebastianstrzalkowski.shop.enums.Breed;
import pl.sebastianstrzalkowski.shop.enums.Status;
import pl.sebastianstrzalkowski.shop.models.Unicorn;


public class  UnicornList {


    public static ObservableList<Unicorn> unicornList =
            FXCollections.observableArrayList(
                    new Unicorn("Jacek ", Breed.AMARANTOWA, 10000, Status.DOSTEPNY),
                    new Unicorn("Agata ",Breed.AMARANTOWA, 10000, Status.NIEDOSTPENY),
                    new Unicorn("Paweł ", Breed.ROZOWA, 10000, Status.DOSTEPNY)
            );

    public UnicornList() {
      }


    public static ObservableList<Unicorn> getUnicornList() {
        return unicornList;
    }

}
