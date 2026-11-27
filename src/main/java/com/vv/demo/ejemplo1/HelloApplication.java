package com.vv.demo.ejemplo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        Button bt1 = new Button("Encabezado");
        Button bt2 = new Button("Center");
        Button bt3 = new Button("Botton");
        Button bt4 = new Button("Right");
        Button bt5 = new Button("Left");

        //solo sirve para BorderPane:

        root.setTop(bt1);
        root.setCenter(bt2);
        root.setBottom(bt3);
        root.setRight(bt4);
        root.setLeft(bt5);


        bt1.setMaxWidth(Double.MAX_VALUE);
        bt1.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(bt1, new Insets(5, 5, 5, 5));

        scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}