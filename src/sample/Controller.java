package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton menu_button;

    @FXML
    private MenuItem menu_about_color_settings;

    @FXML
    private MenuItem menu_about_programm;

    @FXML
    private MenuItem menu_exit;

    @FXML
    private ImageView image1;

    @FXML
    private TextField volts_to_dbmkv_in0;

    @FXML
    private TextField volts_to_dbmkv_out0;

    @FXML
    private TextField dbvkv_to_volts_in0;

    @FXML
    private TextField dbvkv_to_volts_out0;

    @FXML
    private TextField dbv_to_volts_in0;

    @FXML
    private TextField dbv_to_volts_out0;

    @FXML
    private TextField volts_to_dbv_in0;

    @FXML
    private TextField volts_to_dbv_out0;

    @FXML
    private TextField dbv_to_dbmkv_in0;

    @FXML
    private TextField dbv_to_dbmkv_out0;

    @FXML
    private TextField dbmkv_to_dbv_in0;

    @FXML
    private TextField dbmkv_to_dbv_out0;

    @FXML
    private TextField dbmka_to_mka_in0;

    @FXML
    private TextField dbmka_to_mka_out0;

    @FXML
    private TextField mka_to_dbmka_in0;

    @FXML
    private TextField mka_to_dbmka_out0;

    @FXML
    private TextField aaaa1;

    @FXML
    private TextField aaaa2;

    @FXML
    private TextField aaaa3;

    @FXML
    private TextField aaaa4;

    @FXML
    private TextField aaaa5;

    @FXML
    private TextField aaaa6;

    @FXML
    private TextField aaaa10;

    @FXML
    private TextField aaaa11;

    @FXML
    private TextField aaa1;

    @FXML
    private TextField aaa2;

    @FXML
    private TextField aaa3;

    @FXML
    private TextField aaa4;

    @FXML
    private TextField aaa5;

    @FXML
    private TextField aaa6;

    @FXML
    private TextField aaa7;

    @FXML
    private TextField aaa8;

    @FXML
    private TextField aaa9;

    @FXML
    private TextField aaa10;

    @FXML
    private TextField aaa11;

    @FXML
    private TextField aaa12;

    @FXML
    private TextField aaa13;

    @FXML
    private TextField aaa14;

    @FXML
    private TextField aaa15;

    @FXML
    private TextField aaa16;

    @FXML
    private TextField aaa17;

    @FXML
    private TextField aaa18;

    @FXML
    private TextField aaa19;

    @FXML
    private TextField aaa20;

    @FXML
    private TextField aaa21;

    @FXML
    private TextField aaa22;

    @FXML
    private TextField aaaaaa12;

    @FXML
    private TextField aaaaaa13;

    @FXML
    private ImageView image2;

    @FXML
    private TextField bbb1;

    @FXML
    private TextField bbb2;

    @FXML
    private TextField bbb3;

    @FXML
    private TextField bbb4;

    @FXML
    private TextField bbb5;

    @FXML
    private TextField bbb6;

    @FXML
    private TextField bbb7;

    @FXML
    private TextField bbb8;

    @FXML
    private TextField bbb9;

    @FXML
    private TextField bbb10;

    @FXML
    private TextField bbb11;

    @FXML
    private TextField bbb12;

    @FXML
    private TextField bbb27;

    @FXML
    private TextField bbb29;

    @FXML
    private TextField bbb26;

    @FXML
    private TextField bbb30;

    @FXML
    private TextField bbb28;

    @FXML
    private TextField bbb16;

    @FXML
    private TextField bbb17;

    @FXML
    private TextField bbb15;

    @FXML
    private TextField bbb14;

    @FXML
    private TextField bbb19;

    @FXML
    private TextField bbb20;

    @FXML
    private TextField bbb18;

    @FXML
    private TextField bbb21;

    @FXML
    private TextField bbb22;

    @FXML
    private TextField bbb24;

    @FXML
    private TextField bbb25;

    @FXML
    private TextField bbb23;

    @FXML
    private TextField bbb32;

    @FXML
    private TextField bbb34;

    @FXML
    private TextField bbb31;

    @FXML
    private TextField bbb35;

    @FXML
    private TextField bbb33;

    @FXML
    private TextField bbb36;

    @FXML
    private TextField bbb37;

    @FXML
    private TextField bbb38;

    @FXML
    private TextField bbb39;

    @FXML
    private TextField bbb40;

    @FXML
    private TextField bbb41;

    @FXML
    private TextField bbb42;

    @FXML
    private TextField bbb43;

    @FXML
    private TextField bbb44;

    @FXML
    private TextField bbb45;

    @FXML
    private TextField bbb46;

    @FXML
    private TextField bbb47;

    @FXML
    private TextField bbb48;

    @FXML
    private TextField bbb49;

    @FXML
    private TextField bbb50;

    @FXML
    private TextField bbb51;

    @FXML
    private TextField bbb52;

    @FXML
    private TextField bbb53;

    @FXML
    private TextField bbb54;

    @FXML
    private TextField bbb55;

    @FXML
    private TextField bbb161;

    @FXML
    private TextField bbb171;

    @FXML
    private TextField bbb151;

    @FXML
    private TextField bbb162;

    @FXML
    private TextField bbb172;

    @FXML
    private TextField bbb152;

    @FXML
    private TextField bbb141;

    @FXML
    private ImageView image3;

    @FXML
    private TextField ccc1;

    @FXML
    private TextField ccc2;

    @FXML
    private TextField ccc3;

    @FXML
    private TextField ccc4;

    @FXML
    private TextField ccc5;

    @FXML
    private TextField ccc6;

    @FXML
    private TextField ccc7;

    @FXML
    private TextField ccc8;

    @FXML
    private TextField ccc9;

    @FXML
    private TextField ccc10;

    @FXML
    private TextField ccc15;

    @FXML
    private TextField ccc16;

    @FXML
    private TextField ccc17;

    @FXML
    private TextField ccc18;

    @FXML
    private TextField ccc19;

    @FXML
    private TextField ccc20;

    @FXML
    private TextField ccc21;

    @FXML
    private TextField ccc22;

    @FXML
    private TextField ccc23;

    @FXML
    private TextField ccc24;

    @FXML
    private TextField ccc13;

    @FXML
    private TextField ccc14;

    @FXML
    private TextField ccc11;

    @FXML
    private TextField ccc12;


    @FXML
    private Button redGreyButton;

    @FXML
    private Button darkBlueButton;

    @FXML
    private Button lightGreenButton;

    private void onButtonSettingsChanged() {
        Image img1 = new Image(readWriteSettings.readSettings()[1] + "/0001.png");
        Image img2 = new Image(readWriteSettings.readSettings()[1] + "/0002.png");
        Image img3 = new Image(readWriteSettings.readSettings()[1] + "/0003.png");

        image1.setImage(img1);
        image2.setImage(img2);
        image3.setImage(img3);
    }

    @FXML
    void initialize() {
        onButtonSettingsChanged();
        menu_button.setStyle(readWriteSettings.readSettings()[0]);

        menu_about_color_settings.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("color_settings.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
            onButtonSettingsChanged();
            menu_button.setStyle(readWriteSettings.readSettings()[0]);
        });

        menu_about_programm.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("about_programm.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        menu_exit.setOnAction(event -> {
            //Stage currentStage = (Stage)menu_exit.getScene().getWindow();
            //currentStage.close();
        });

        // ----------------------------------------------------
        // ------- LOG -> LINEAR VOLTAGE ----------------------
        // ----------------------------------------------------

        dbvkv_to_volts_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(dbvkv_to_volts_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV_to_Volts");
            dbvkv_to_volts_out0.setText(String.valueOf(ans[0]));
        });

        volts_to_dbmkv_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(volts_to_dbmkv_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Volts_to_dBmkV");
            volts_to_dbmkv_out0.setText(String.valueOf(ans[0]));
        });

        dbv_to_volts_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(dbv_to_volts_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBV_to_Volts");
            dbv_to_volts_out0.setText(String.valueOf(ans[0]));
        });

        volts_to_dbv_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(volts_to_dbv_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Volts_to_dBV");
            volts_to_dbv_out0.setText(String.valueOf(ans[0]));
        });

        dbv_to_dbmkv_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(dbv_to_dbmkv_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBV_to_dBmkV");
            dbv_to_dbmkv_out0.setText(String.valueOf(ans[0]));
        });

        dbmkv_to_dbv_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(dbmkv_to_dbv_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBV");
            dbmkv_to_dbv_out0.setText(String.valueOf(ans[0]));
        });

        // ----------------------------------------------------
        // ------- LOG -> LINEAR CURRENT ----------------------
        // ----------------------------------------------------

        dbmka_to_mka_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(dbmka_to_mka_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA_to_mkA");
            dbmka_to_mka_out0.setText(String.valueOf(ans[0]));
        });

        mka_to_dbmka_in0.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(mka_to_dbmka_in0.getText() + "d")};
            double[] ans = Funcs.calculate(data, "mkA_to_dBmkA");
            mka_to_dbmka_out0.setText(String.valueOf(ans[0]));
        });

        aaaa10.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaaa10.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBA_to_A");
            aaaa11.setText(String.valueOf(ans[0]));
        });

        aaaa1.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaaa1.getText() + "d")};
            double[] ans = Funcs.calculate(data, "A_to_dBA");
            aaaa2.setText(String.valueOf(ans[0]));
        });

        aaaa3.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaaa3.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBA_to_dBmkA");
            aaaa4.setText(String.valueOf(ans[0]));
        });

        aaaa5.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaaa5.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBA");
            aaaa6.setText(String.valueOf(ans[0]));
        });

        // ----------------------------------------------------
        // ------- LOG -> LINEAR POWER ------------------------
        // ----------------------------------------------------

        bbb1.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb1.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBm_to_Watts");
            bbb2.setText(String.valueOf(ans[0]));
        });

        bbb3.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb3.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Watts_to_dBm");
            bbb4.setText(String.valueOf(ans[0]));
        });

        bbb5.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb5.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBW_to_Watts");
            bbb6.setText(String.valueOf(ans[0]));
        });

        bbb7.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb7.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Watts_to_dBW");
            bbb8.setText(String.valueOf(ans[0]));
        });

        bbb9.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb9.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBW_to_dBm");
            bbb10.setText(String.valueOf(ans[0]));
        });

        bbb11.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb11.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBm_to_dBW");
            bbb12.setText(String.valueOf(ans[0]));
        });

        // ----------------------------------------------------
        // ------- TERM CONVERSIONS ---------------------------
        // ----------------------------------------------------

        bbb26.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb26.getText() + "d"), 50d};
            double[] ans = Funcs.calculate(data, "dBm_to_dBmkV");
            bbb27.setText(String.valueOf(ans[0]));
        });
        bbb28.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb28.getText() + "d"), Double.parseDouble(bbb29.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBm_to_dBmkV");
            bbb30.setText(String.valueOf(ans[0]));
        });
        bbb29.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb28.getText() + "d"), Double.parseDouble(bbb29.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBm_to_dBmkV");
            bbb30.setText(String.valueOf(ans[0]));
        });


        bbb31.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb31.getText() + "d"), 50d};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBm");
            bbb32.setText(String.valueOf(ans[0]));
        });
        bbb33.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb33.getText() + "d"), Double.parseDouble(bbb34.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBm");
            bbb35.setText(String.valueOf(ans[0]));
        });
        bbb34.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb33.getText() + "d"), Double.parseDouble(bbb34.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBm");
            bbb35.setText(String.valueOf(ans[0]));
        });


        bbb38.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb38.getText() + "d"), 50d};
            double[] ans = Funcs.calculate(data, "dBm_to_dBmkA");
            bbb36.setText(String.valueOf(ans[0]));
        });
        bbb40.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb40.getText() + "d"), Double.parseDouble(bbb37.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBm_to_dBmkA");
            bbb39.setText(String.valueOf(ans[0]));
        });
        bbb37.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb40.getText() + "d"), Double.parseDouble(bbb37.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBm_to_dBmkA");
            bbb39.setText(String.valueOf(ans[0]));
        });


        bbb48.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb48.getText() + "d"), 50d};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBm");
            bbb46.setText(String.valueOf(ans[0]));
        });
        bbb50.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb50.getText() + "d"), Double.parseDouble(bbb47.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBm");
            bbb49.setText(String.valueOf(ans[0]));
        });
        bbb47.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb50.getText() + "d"), Double.parseDouble(bbb47.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBm");
            bbb49.setText(String.valueOf(ans[0]));
        });


        bbb43.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb43.getText() + "d"), 50d};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBmkV");
            bbb41.setText(String.valueOf(ans[0]));
        });
        bbb45.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb45.getText() + "d"), Double.parseDouble(bbb42.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBmkV");
            bbb44.setText(String.valueOf(ans[0]));
        });
        bbb42.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb45.getText() + "d"), Double.parseDouble(bbb42.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA_to_dBmkV");
            bbb44.setText(String.valueOf(ans[0]));
        });


        bbb53.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb53.getText() + "d"), 50d};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBmkA");
            bbb51.setText(String.valueOf(ans[0]));
        });
        bbb55.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb55.getText() + "d"), Double.parseDouble(bbb52.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBmkA");
            bbb54.setText(String.valueOf(ans[0]));
        });
        bbb52.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb55.getText() + "d"), Double.parseDouble(bbb52.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV_to_dBmkA");
            bbb54.setText(String.valueOf(ans[0]));
        });

        // ----------------------------------------------------
        // -------FIELD STRENGTH & POWER DENSITY --------------
        // ----------------------------------------------------


        aaa1.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa1.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV/m_to_V/m");
            aaa2.setText(String.valueOf(ans[0]));
        });

        aaa3.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa3.getText() + "d")};
            double[] ans = Funcs.calculate(data, "V/m_to_dBmkV/m");
            aaa4.setText(String.valueOf(ans[0]));
        });

        aaa5.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa5.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV/m_to_dBmW/m^2");
            aaa6.setText(String.valueOf(ans[0]));
        });

        aaa7.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa7.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmW/m^2_to_dBmkV/m");
            aaa8.setText(String.valueOf(ans[0]));
        });

        aaa9.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa9.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkV/m_to_dBmkA/m");
            aaa10.setText(String.valueOf(ans[0]));
        });

        aaa11.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa11.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA/m_to_dBmkV/m");
            aaa12.setText(String.valueOf(ans[0]));
        });

        aaaaaa12.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaaaaa12.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBmkA/m_to_dBpT");
            aaaaaa13.setText(String.valueOf(ans[0]));
        });

        aaa13.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa13.getText() + "d")};
            double[] ans = Funcs.calculate(data, "dBpT_to_dBmkA/m");
            aaa14.setText(String.valueOf(ans[0]));
        });

        aaa15.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa15.getText() + "d")};
            double[] ans = Funcs.calculate(data, "W/m^2_to_V/m");
            aaa16.setText(String.valueOf(ans[0]));
        });

        aaa17.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa17.getText() + "d")};
            double[] ans = Funcs.calculate(data, "V/m_to_W/m^2");
            aaa18.setText(String.valueOf(ans[0]));
        });

        aaa19.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa19.getText() + "d")};
            double[] ans = Funcs.calculate(data, "mkT_to_A/m");
            aaa20.setText(String.valueOf(ans[0]));
        });

        aaa21.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(aaa21.getText() + "d")};
            double[] ans = Funcs.calculate(data, "A/m_to_mkT");
            aaa22.setText(String.valueOf(ans[0]));
        });

        // ----------------------------------------------------
        // ------- E-FIELD ANTENNAS ---------------------------
        // ----------------------------------------------------

        bbb151.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb151.getText() + "d"), Double.parseDouble(bbb161.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Correction_Factor_0");
            bbb171.setText(String.valueOf(ans[0]));
        });
        bbb161.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb151.getText() + "d"), Double.parseDouble(bbb161.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Correction_Factor_0");
            bbb171.setText(String.valueOf(ans[0]));
        });


        bbb141.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb141.getText() + "d"), Double.parseDouble(bbb152.getText() + "d"),
                    Double.parseDouble(bbb162.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Field_Strength");
            bbb172.setText(String.valueOf(ans[0]));
        });
        bbb152.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb141.getText() + "d"), Double.parseDouble(bbb152.getText() + "d"),
                    Double.parseDouble(bbb162.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Field_Strength");
            bbb172.setText(String.valueOf(ans[0]));
        });
        bbb162.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb141.getText() + "d"), Double.parseDouble(bbb152.getText() + "d"),
                    Double.parseDouble(bbb162.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Field_Strength");
            bbb172.setText(String.valueOf(ans[0]));
        });


        bbb14.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb14.getText() + "d"), Double.parseDouble(bbb15.getText() + "d"),
                    Double.parseDouble(bbb16.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Required_Power");
            bbb17.setText(String.valueOf(ans[0]));
        });
        bbb15.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb14.getText() + "d"), Double.parseDouble(bbb15.getText() + "d"),
                    Double.parseDouble(bbb16.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Required_Power");
            bbb17.setText(String.valueOf(ans[0]));
        });
        bbb16.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb14.getText() + "d"), Double.parseDouble(bbb15.getText() + "d"),
                    Double.parseDouble(bbb16.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Required_Power");
            bbb17.setText(String.valueOf(ans[0]));
        });


        // ----------------------------------------------------
        // ------- LOOP ANTENNAS ------------------------------
        // ----------------------------------------------------

        bbb18.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb18.getText() + "d"), Double.parseDouble(bbb19.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Correction_Factor_1");
            bbb20.setText(String.valueOf(ans[0]));
        });
        bbb19.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb18.getText() + "d"), Double.parseDouble(bbb19.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Correction_Factor_1");
            bbb20.setText(String.valueOf(ans[0]));
        });


        bbb21.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb21.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Assumed_E-field_for_shields_loops_0");
            bbb22.setText(String.valueOf(ans[0]));
        });


        bbb23.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb23.getText() + "d"), Double.parseDouble(bbb24.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Assumed_E-field_for_shields_loops_1");
            bbb25.setText(String.valueOf(ans[0]));
        });
        bbb24.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(bbb23.getText() + "d"), Double.parseDouble(bbb24.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Assumed_E-field_for_shields_loops_1");
            bbb25.setText(String.valueOf(ans[0]));
        });

        // ----------------------------------------------------
        // ------- CURRENT PROBES -----------------------------
        // ----------------------------------------------------

        ccc1.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc1.getText() + "d"), Double.parseDouble(ccc2.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Correction_Factor_2");
            ccc3.setText(String.valueOf(ans[0]));
        });
        ccc2.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc1.getText() + "d"), Double.parseDouble(ccc2.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Correction_Factor_2");
            ccc3.setText(String.valueOf(ans[0]));
        });


        ccc4.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc4.getText() + "d"), Double.parseDouble(ccc5.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Power_needed");
            ccc6.setText(String.valueOf(ans[0]));
        });
        ccc5.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc4.getText() + "d"), Double.parseDouble(ccc5.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Power_needed");
            ccc6.setText(String.valueOf(ans[0]));
        });


        // ----------------------------------------------------
        // ------- RETURN LOSS TO VSWR ------------------------
        // ----------------------------------------------------

        ccc7.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc7.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Г_0");
            ccc8.setText(String.valueOf(ans[0]));
        });

        ccc9.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc9.getText() + "d")};
            double[] ans = Funcs.calculate(data, "VSWR_0");
            ccc10.setText(String.valueOf(ans[0]));
        });

        ccc11.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc11.getText() + "d")};
            double[] ans = Funcs.calculate(data, "VSWR_1");
            ccc12.setText(String.valueOf(ans[0]));
        });

        ccc13.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc13.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Mismatch_Loss");
            ccc14.setText(String.valueOf(ans[0]));
        });

        ccc15.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc15.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Reflected_Power");
            ccc16.setText(String.valueOf(ans[0]));
        });

        ccc17.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc17.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Return_Loss_0");
            ccc18.setText(String.valueOf(ans[0]));
        });

        ccc19.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc19.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Return_Loss_1");
            ccc20.setText(String.valueOf(ans[0]));
        });

        ccc21.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc21.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Г_1");
            ccc22.setText(String.valueOf(ans[0]));
        });

        ccc23.setOnKeyReleased(event -> {
            double[] data = {Double.parseDouble(ccc23.getText() + "d")};
            double[] ans = Funcs.calculate(data, "Through_Power");
            ccc24.setText(String.valueOf(ans[0]));
        });

    }
}
