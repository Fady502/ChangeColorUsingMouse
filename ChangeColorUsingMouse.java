//Fady Zaki SDEV200 14Feb2024
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorUsingMouse extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        Circle circle = new Circle(100, Color.WHITE);

        // StackPane to hold the circle
        StackPane root = new StackPane(circle);

        // Event handler to change color on mouse press
        root.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            circle.setFill(Color.BLACK);
        });

        // Event handler to change color on mouse release
        root.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            circle.setFill(Color.WHITE);
        });

        // Create the scene
        Scene scene = new Scene(root, 300, 300);

        // Set the scene and show the stage
        primaryStage.setTitle("Change Color Using Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
