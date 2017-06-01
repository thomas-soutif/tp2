package fr.univ_amu.iut.exercice2;

import javafx.application.Application;
import javafx.stage.Stage;

public class MySecondJavaFXWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Second Useless JavaFX Window");
        primaryStage.setResizable(false);
        primaryStage.setHeight(400);
        primaryStage.setWidth(800);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }
}
