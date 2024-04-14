package com.mycompany.ex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {

 

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        HBox dichbox = new HBox(10);
        TextField decitxt = new TextField();
        Label declbl = new Label("Decimal ");
        dichbox.setPadding(new Insets(10, 10, 10, 10));
        dichbox.getChildren().addAll(declbl, decitxt);
        HBox hexbox = new HBox();
        TextField hextxt = new TextField();
        Label hexlbl = new Label("Hex            ");
        hexbox.setPadding(new Insets(10, 10, 10, 10));
        hexbox.getChildren().addAll(hexlbl, hextxt);
        HBox binbox = new HBox();
        TextField bintxt = new TextField();
        Label binlbl = new Label("Binary   ");
        binbox.setPadding(new Insets(10, 10, 10, 10));
        binbox.getChildren().addAll(binlbl, bintxt);
        root.getChildren().addAll(dichbox, hexbox, binbox);
        Scene scene = new Scene(root, 240, 200);
        decitxt.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                int decimal = Integer.parseInt(decitxt.getText());
                hextxt.setText(Integer.toHexString(decimal));
                bintxt.setText(Integer.toBinaryString(decimal));
            }
        });

        hextxt.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                int decimal = Integer.parseInt(hextxt.getText(), 16);
                decitxt.setText(String.valueOf(decimal));
                bintxt.setText(Integer.toBinaryString(decimal));
            }
        });

        
        
        bintxt.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                int decimal = Integer.parseInt(bintxt.getText(), 2);
                hextxt.setText(Integer.toHexString(decimal));
                decitxt.setText(String.valueOf(decimal));
            }
        });

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    



    public static void main(String[] args) {
        launch();
    }

}