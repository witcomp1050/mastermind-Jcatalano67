package edu.wit.comp1050;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

        public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MasterMind.fxml"));
        stage.setTitle("MasterMind");
        stage.setScene(new Scene(root, 520, 750));
        stage.show();



    }
}
