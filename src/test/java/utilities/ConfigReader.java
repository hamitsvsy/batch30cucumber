package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //1-)Properties objesi oluşturacağız
    static Properties properties;


    //2-)bu class ın amacı configuratıon.properties dosyasını okumak
    //ve oradaki key value ikililerini istediğimiz key'e ait value'yu
    //bize getirmek
    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties =  new Properties();
            properties.load(fileInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    //3-)Test class larından configReADER CLASSına ulaşıp yukarıdaki islemleri
    //yapmamızı sağlaycak bir method oluşturacağız
    //bir method oluşturuyoruz

    public static String getProperty(String key){

        String value = properties.getProperty(key);
        return value;

    }


}
