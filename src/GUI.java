import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GUI extends Application {

    @FXML
    public AnchorPane myPane;
    public List<Sprzedajacy> listaSprzedajacych = new ArrayList<Sprzedajacy>();
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws IOException {

        myPane = (AnchorPane) FXMLLoader.load(getClass().getResource
                ("Login.fxml"));
        Scene myScene = new Scene(myPane, 600,500);

        stage.setScene(myScene);
        stage.show();
    }

}

