package pl.sebastianstrzalkowski.shop.lists;




import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.sebastianstrzalkowski.shop.models.Buyer;



public class BuyerList {


    public static ObservableList<Buyer> buyerList =
            FXCollections.observableArrayList(
                    new Buyer("Jarek", "Kowalski", 10000.00),
                    new Buyer("Tadeusz", "Nowak", 1000.00),
                    new Buyer("Ireneusz", "Ygrekowski", 31000.00)
            );

    public BuyerList() {
    }

    public static void showList(ObservableList<Buyer> BuyerList) {
        for (Buyer x : buyerList) {
            System.out.print(x.getName());
        }
    }
    public void addToBuyerList(Buyer kupujacy) {
        buyerList.add(kupujacy);
    }

    public static ObservableList<Buyer> getBuyerList(){
        return buyerList;
    }
}
