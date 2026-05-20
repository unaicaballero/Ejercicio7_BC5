package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Crear GridPane
        GridPane grid = new GridPane();

        // Espacios entre filas y columnas
        grid.setHgap(10);
        grid.setVgap(10);

        // Centrar contenido
        grid.setAlignment(Pos.CENTER);

        // Botones
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");

        // Agregar botones a la cuadricula
        grid.add(b1, 0, 0);
        grid.add(b2, 1, 0);
        grid.add(b3, 0, 1);
        grid.add(b4, 1, 1);

        // Escena
        Scene scene = new Scene(grid, 400, 300);

        // Ventana
        stage.setTitle("Ejercicio 7");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}