package pl.sebastianstrzalkowski.shop.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pl.sebastianstrzalkowski.shop.lists.BuyerList;
import pl.sebastianstrzalkowski.shop.lists.SellerList;
import pl.sebastianstrzalkowski.shop.models.Buyer;
import pl.sebastianstrzalkowski.shop.models.Seller;

import java.io.IOException;

public class Login {
    public TextField surnameField;
    public TextField nameField;
    public CheckBox buyerCheck;
    public CheckBox sellerCheck;
    public AnchorPane login;
    public Text loginMsg;
    public Button loginButton;
    public String title = "Witaj";
    private int test = 0;
    private static double money;


    private ObservableList<Seller> sellerList;

    private ObservableList<Buyer> buyerList;


    public void loginButton(ActionEvent actionEvent) throws IOException {
        String name = nameField.getText();
        String surname = surnameField.getText();
        if (sellerCheck.isSelected()) {
            sellerList = FXCollections.observableArrayList(
                    SellerList.getSellerList()
            );
            for (Seller x : sellerList)
                if (x.getName().equals(name) && x.getSurname().equals(surname)) {
                    test = 0;
                    ((Stage) loginButton.getScene().getWindow()).close();
                    Stage stageSell = new Stage();
                    AnchorPane myPaneWindowSell = (AnchorPane) FXMLLoader.load(getClass().getResource
                            ("fxml/SellUnicorn.fxml"));
                    Scene mySceneSell = new Scene(myPaneWindowSell);
                    stageSell.setTitle(title + " " + name);
                    stageSell.setScene(mySceneSell);
                    stageSell.show();

                    break;
                } else if (!x.getName().equals(name) || !x.getSurname().equals(surname)) {
                    test++;
                }
            if (test == sellerList.size()) {
                loginButton.setText("Złe dane logowania");
            }
        }
        if (buyerCheck.isSelected()) {
            buyerList = FXCollections.observableArrayList(
                    BuyerList.getBuyerList()
            );
            for (Buyer x : buyerList)
                if (x.getName().equals(name) && x.getSurname().equals(surname)) {
                    test = 0;
                    ((Stage) loginButton.getScene().getWindow()).close();
                    Stage stageBuy = new Stage();
                    AnchorPane myPaneWindowBuy = (AnchorPane) FXMLLoader.load(getClass().getResource
                            ("fxml/BuyUnicorn.fxml"));
                    Scene myScene = new Scene(myPaneWindowBuy);
                    stageBuy.setTitle(title + " " + login);
                    stageBuy.setScene(myScene);
                    stageBuy.show();

                    money = x.getMoney();
                    break;
                } else if (!x.getName().equals(name) || !x.getSurname().equals(surname)) {
                    test++;
                }

            if (test == buyerList.size()) {
                loginButton.setText("Złe dane logowania");
            }

        }

    }

    public static double getMoney() {
        return money;
    }

    public static void moneyAfterBuy(double price) {
        money = money - price;
    }

    public void sellerCheck(ActionEvent actionEvent) {
        buyerCheck.setSelected(false);
    }

    public void buyerCheck(ActionEvent actionEvent) {
        sellerCheck.setSelected(false);
    }

    public void registerButton(ActionEvent actionEvent) {
        Stage stageRegister = new Stage();
        try {
            AnchorPane myPaneWindowRegister = (AnchorPane) FXMLLoader.load(getClass().getResource
                    ("fxml/Register.fxml"));
            Scene myScene = new Scene(myPaneWindowRegister);
            stageRegister.setTitle("Rejestracja");
            stageRegister.setScene(myScene);
            stageRegister.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


