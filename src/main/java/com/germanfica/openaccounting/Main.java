package com.germanfica.openaccounting;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("OpenAccounting");

        label.setStyle(
            "-fx-text-fill: white;" +
            "-fx-font-size: 24px;" +
            "-fx-font-weight: bold;"
        );

        StackPane root = new StackPane();
        root.getChildren().add(label);
        root.setStyle("-fx-background-color: #1f2430;");

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("OpenAccounting");
        stage.setScene(scene);
        stage.show();
    }

    static void main() {
        launch();
    }
}
