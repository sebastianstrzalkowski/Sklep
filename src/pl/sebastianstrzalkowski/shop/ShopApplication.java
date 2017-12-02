package pl.sebastianstrzalkowski.shop;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class ShopApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        AnchorPane myPane = (AnchorPane) FXMLLoader.load(getClass().getResource
                ("controllers/fxml/Login.fxml"));
        Scene myScene = new Scene(myPane, 600, 370);

        stage.setTitle("Panel logowania");
        stage.setScene(myScene);
        stage.show();
    }

}

