package edu.farmingdale.javafx_exercise;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 805, 472);
        scene.getStylesheets().add(getClass().getResource("TableViewStyle.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
//.column-header {
//    -fx-background-color: #A3A3A3;
//}
//
//.column-header .label {
//    -fx-text-fill: white;
//    -fx-font-weight: bold;
//}
//.form-input {
//    -fx-background-color: white;
//    -fx-text-fill: black;
//    -fx-prompt-text-fill: #888888;
//    -fx-border-color: transparent;
//    -fx-background-radius: 4;
//    -fx-border-radius: 4;
//}
//.form-input .content {
//    -fx-background-color: blue;
//    -fx-background-radius: 4;
//}