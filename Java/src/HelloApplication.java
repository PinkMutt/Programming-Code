import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World!");
        Scene scene = new Scene(label, 150, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}