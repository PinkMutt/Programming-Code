/**
 * Calculator
 * Author: Dragon Liu
 * Date: April 9, 2019 6:43 PM
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
            Label label = new Label("Hello World!");
            Scene scene = new Scene(label);

            primaryStage.setScene(scene);
            primaryStage.show();
    }
}