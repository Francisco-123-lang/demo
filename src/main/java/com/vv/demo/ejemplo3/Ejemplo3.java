package com.vv.demo.ejemplo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

//mismo ejemplo pero usando StackPane que hace que los componentes se sobrepongan entre sí

public class Ejemplo3 extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) {

        Label texto = new Label("Hola DAM");
        Button boton = new Button("Pulsar");

        //En este caso lo usamos para crear una cajita y dentro agregar los materiales
        StackPane root2 = new StackPane(texto, boton);

        //En este caso metemo nuestra primera caja dentro de otra caja:
        VBox root = new VBox(root2);

        //Centra los materiales izquierda pero no en el centro porque está dentro de VBOX:
        root2.setAlignment(Pos.CENTER_LEFT);


        //así creamos un setMargin, el orden es arriba, derecha, abajo, izquierda:
        //Esta caja permite separar nuestros componentes que estaban superpuestos entre sí:
        StackPane.setMargin(texto, new Insets (0, 0, 50, 0));
        //este setmargin coloca un borde para la primera caja que creamos:
        VBox.setMargin(root2, new Insets (0, 0, 0, 5));

        scene = new Scene(root, 300, 150);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
