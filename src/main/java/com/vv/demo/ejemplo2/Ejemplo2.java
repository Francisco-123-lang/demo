package com.vv.demo.ejemplo2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo2 extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) {

        Label texto = new Label("Hola DAM");

        TextField usuario = new TextField();

        Button boton = new Button("Pulsar");


        //Ejemplo de que se puede agregar un Pane dentro de otro Pane
        Button boton2 = new Button("aña");
        Label texto2 = new Label("Nashee");


        StackPane root2 = new StackPane(texto2, boton2);

        VBox root = new VBox(texto, boton, usuario, root2);


        //Esto se usa para centrar los componentes en la página:
        root.setAlignment(Pos.CENTER);

        //Creamos un margen a los lados para el textLabel de usuario
        VBox.setMargin(usuario, new Insets(0, 50, 0, 50));

        //Esto sirve para dejar espacio entre componentes, solo sirve para VBOX:
        root.setSpacing(5);

        //Esto sirve para utilizar márgenes:

        scene = new Scene(root, 300, 150);

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
