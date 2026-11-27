package com.vv.demo.ejemplo4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo4 extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) {

        Label texto = new Label("Hola buenos días");
        Button boton = new Button("Pulsa");

        VBox root = new VBox(texto, boton);

        root.setSpacing(10);
        root.setAlignment(Pos.TOP_LEFT);

        scene = new Scene(root, 300, 150);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
