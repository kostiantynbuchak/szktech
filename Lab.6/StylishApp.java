import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StylishApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Witaj w aplikacji!");
        label.setId("stylishLabel");

        Button button1 = new Button("Przycisk 1");
        button1.getStyleClass().add("buttonClass");

        Button button2 = new Button("Przycisk 2");
        button2.getStyleClass().add("buttonClass");

        Button button3 = new Button("Przycisk 3");

        VBox layout = new VBox(10, label, button1, button2, button3);
        layout.setId("root");
        Scene scene = new Scene(layout, 400, 300);
        scene.getStylesheets().add("style.css");

        RotateTransition rotate = new RotateTransition(Duration.seconds(2), label);
        rotate.setByAngle(360);
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setAutoReverse(true);
        rotate.play();

        TranslateTransition translate = new TranslateTransition(Duration.seconds(2), label);
        translate.setByX(100);
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setAutoReverse(true);
        translate.play();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Stylowa Aplikacja");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
