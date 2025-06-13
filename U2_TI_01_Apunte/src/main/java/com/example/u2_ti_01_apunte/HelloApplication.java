package com.example.u2_ti_01_apunte;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Button button1 = new Button("Button Aceptar");
        Button button2 = new Button("Button Cancelar");

        button1.setOnAction(e -> {
            label1.setText("Aceptado");
        });
        button2.setOnAction(e -> {
            label2.setText("Cancelado");
        });

        HBox hbox =new HBox(20,label1,label2,button1,button2);
        Scene scene =new Scene(hbox,500,240);

        stage.setTitle("Primer proyecto");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}