package pl.sebastianstrzalkowski.shop.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.sebastianstrzalkowski.shop.lists.BuyerList;
import pl.sebastianstrzalkowski.shop.lists.SellerList;
import pl.sebastianstrzalkowski.shop.models.Buyer;
import pl.sebastianstrzalkowski.shop.models.Seller;

public class Register {
    public RadioButton rulesRadioButton;
    public TextField nameField;
    public TextField surnameField;
    public TextField moneyField;
    public Button registerButton;
    public RadioButton sellerRadioButton;
    public RadioButton buyerRadioButton;

    public void registerButton(ActionEvent actionEvent) {
        String name = nameField.getText();
        String surname = surnameField.getText();
        buyerRadioButton.setSelected(true);
        if (nameField.getText().isEmpty() || surnameField.getText().isEmpty() || moneyField.getText().isEmpty()) {
            registerButton.setText("Uzupełnij dane!");
        } else {
            try {
                double money = Double.parseDouble(moneyField.getText());
                if (!rulesRadioButton.isSelected()) {
                    registerButton.setText("Zaakceptuj regulamin");
                } else {
                    if (buyerRadioButton.isSelected()) {
                        sellerRadioButton.setSelected(false);
                        BuyerList.addToBuyerList(new Buyer(name, surname, money));
                        ((Stage) registerButton.getScene().getWindow()).close();
                    } else if (sellerRadioButton.isSelected()) {
                        buyerRadioButton.setSelected(false);
                        SellerList.addToSellerList(new Seller(name, surname, money));
                        ((Stage) registerButton.getScene().getWindow()).close();
                    }
                }
            } catch (NumberFormatException nfe) {
                moneyField.setText("Tylko liczby!!");
            }
        }
    }
}

