package sample;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class readWriteSettings {
    public static void writeSettings(Settings settings) {
        try {
            // создаем поток для записи в файл settings.xml
            FileOutputStream fos = new FileOutputStream("settings.xml");
            // создали энкодер, которые будет писать в поток
            XMLEncoder encoder = new XMLEncoder(fos);

            // записали настройки
            encoder.writeObject(settings);

            // закрыли энкодер и поток для записи
            // если не закрыть, то файл будет пустой
            encoder.close();
            fos.close();
        } catch (Exception e) {
            // на случай ошибки
            e.printStackTrace();
        }
    }

    public static String[] readSettings() {
        String colorName;
        try {
            // создаем поток для чтения из файла
            FileInputStream fis = new FileInputStream("settings.xml");
            // создаем xml декодер из файла
            XMLDecoder decoder = new XMLDecoder(fis);
            /*
             * С помощью decoder.readObject() читаем объект из файла
             * а так как джава сама не может определить, что в файле
             * мы ей подсказываем, указывая в скобочках (Settings)
             * ну и просто загоняем в переменную settings
             */
            Settings changedSettings = (Settings) decoder.readObject();

            // а теперь заполняем форму
            colorName = changedSettings.color_theme_name;
        } catch (Exception e) {
            e.printStackTrace();
            colorName = "redGrey";
        }
        String fileWay;
        String colorOut;
        switch (colorName) {
            case "redGrey":
                fileWay = "/assets/red_grey";
                colorOut = "#dd0031";
                break;
            case "darkBlue":
                fileWay = "/assets/deep_blue";
                colorOut = "#1144aa";
                break;
            case "lightGreen":
                fileWay = "/assets/light_green";
                colorOut = "#25d500";
                break;
            default:
                fileWay = "/assets/deep_blue/0001.png";
                colorOut = "#dd0031";
                break;
        }
        String[] out = {"-fx-background-color: " + colorOut, fileWay};
        return out;
    }
}
