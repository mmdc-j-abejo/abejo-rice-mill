package com.demoproject.abejoricemill;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage stage;
    private Scene scene;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        stage.setTitle("Abejo Rice Mill | v1");
        this.scene = new Scene(fxmlLoader.load(), 1440, 760);
        stage.setScene(this.scene);
        stage.show();
        this.stage = stage;
    }

    public static void main(String[] args) {
        launch();
    }
}