package pl.sebastianstrzalkowski.shop.lists;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.sebastianstrzalkowski.shop.models.Seller;


public class SellerList {


    public static ObservableList<Seller> sellerList =
            FXCollections.observableArrayList(
                    new Seller("Janusz", "Kowalski", 1000.00),
                    new Seller("Jan", "Nowak", 1000.00),
                    new Seller("Zbigniew", "Xsiński", 1000.00),
                    new Seller("Janek", "Nowak", 1000.00)
            );

    public SellerList() {
    }

    public static void pokazListe(ObservableList<Seller> listaSprzedajacych) {
        for (Seller x : listaSprzedajacych) {
            System.out.print(x.getName());
        }
    }

    public static void addToSellerList(Seller seller) {
        sellerList.add(seller);
    }

    public static ObservableList<Seller> getSellerList() {
        return sellerList;
    }
}