package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    private static Stage primaryStage; // **Declare static Stage**

    static public Stage getPrimaryStage() {
        return Main.primaryStage;
    }

    private void setPrimaryStage(Stage stage) {
        Main.primaryStage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Инженерный калькулятор по СВЧ технике");
        Color c = Color.rgb(221, 221, 221, 0.5);
        primaryStage.setScene(new Scene(root, 1920, 1000, c));
        primaryStage.show();
        Image icon = new Image("/assets/icons/AppIcon.png");
        primaryStage.getIcons().add(icon);
    }
}
