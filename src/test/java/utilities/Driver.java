
package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    //sadece public yaparsam obje oluşturmam gerekir
    //public static dersem her yerden class ismi ile ulaşabilir.
    //ama bu halıyle her yerden ulaşmak istemiyoruz

    private Driver() {
        //Driver driver = new Driver();
        //Driver classından obje üretilemesin diye Driver classı SINGLETON yapıyoruz
        //hiçbir yerden ulaşılmasını istemiyorum
        //access modiefier i private seçiyoruz
    }


    private static WebDriver driver;
    //driveri başka classlardan sadece Driver class ismi ile çağırabilmek için
    //için STATİC yaptık.henuz bu drıver ile ilhili ayar  yapmadığım için bunu
    //yanlışlıkla kullanması diye erişimi private yaptık.(sadece bu class ın kullanımına açok olacak)

    public static WebDriver getDriver() {


        if (driver == null) {

            switch (ConfigReader.getProperty("browser")) {


                case " chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case " firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case " opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case " edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driver;
    }


    public static void closeDriver () {

        if (driver!=null){
            driver.quit();
        }
        driver=null;

    }


}

