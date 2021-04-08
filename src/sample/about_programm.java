package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class about_programm {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button about_programm_okButton;

    @FXML
    private Pane about_programm_pane;


    @FXML
    void initialize() {
        about_programm_pane.setStyle(readWriteSettings.readSettings()[0]);
        about_programm_okButton.setStyle(readWriteSettings.readSettings()[0]);

        about_programm_okButton.setOnAction(event -> {
            about_programm_okButton.getScene().getWindow().hide();
        });
    }
}