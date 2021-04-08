package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class color_settings {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane color_settings_pane;

    @FXML
    private Button color_settings_okButton;

    @FXML
    private Button redGreyButton;

    @FXML
    private Button darkBlueButton;

    @FXML
    private Button lightGreenButton;

    @FXML
    void initialize() {
        color_settings_pane.setStyle(readWriteSettings.readSettings()[0]);
        color_settings_okButton.setStyle(readWriteSettings.readSettings()[0]);

        color_settings_okButton.setOnAction(event -> {
            color_settings_okButton.getScene().getWindow().hide();
        });

        redGreyButton.setOnAction(event -> {
            color_settings_pane.setStyle("-fx-background-color: #dd0031");
            color_settings_okButton.setStyle("-fx-background-color: #dd0031");
            Settings settingsChanged = new Settings();
            settingsChanged.color_theme_name = "redGrey";
            readWriteSettings.writeSettings(settingsChanged);
        });

        darkBlueButton.setOnAction(event -> {
            color_settings_pane.setStyle("-fx-background-color: #1144aa");
            color_settings_okButton.setStyle("-fx-background-color: #1144aa");
            Settings settingsChanged = new Settings();
            settingsChanged.color_theme_name = "darkBlue";
            readWriteSettings.writeSettings(settingsChanged);
        });

        lightGreenButton.setOnAction(event -> {
            color_settings_pane.setStyle("-fx-background-color: #25d500");
            color_settings_okButton.setStyle("-fx-background-color: #25d500");
            Settings settingsChanged = new Settings();
            settingsChanged.color_theme_name = "lightGreen";
            readWriteSettings.writeSettings(settingsChanged);
        });

    }
}
