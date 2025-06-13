package com.example.u2_ti_01_apunte;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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

        VBox vbox =new VBox(20,label1,label2,button1,button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene =new Scene(vbox,500,240);

        stage.setTitle("Primer proyecto");
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Test/princess_7734501.png")));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}