package test.javafx.calcolatrice.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 438, 620);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
        System.out.println("ciao");
    }

    public static void main(String[] args) {
        launch();
    }
}