package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {

    public static String readProperties(String key) {
        String val = "";
        Properties prop = new Properties();
        try {
            prop.load(new FileReader(""));
            val = prop.getProperty(key).toString();
        } catch (Exception e) {
            e.getMessage();
        }
        return val;
    }
}
