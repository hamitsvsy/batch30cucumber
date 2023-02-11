package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @When("kullanıcı amazon sayfasına gider")
    public void kullanıcı_amazon_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonurl"));


    }

    @When("nutella için arama yapar")
    public void nutella_için_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);


    }

    @Then("sonucun nutella içerdiğini test eder")
    public void sonucun_nutella_içerdiğini_test_eder() {

        Assert.assertTrue(amazonPage.sonucyazısı.getText().contains("nutella"));




    }

    @And("sayfayı kapat")
    public void sayfayıKapat() {
        Driver.closeDriver();
    }

    @When("java için arama yapar")
    public void java_için_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);

    }
    @Then("sonucun java içerdiğini test eder")
    public void sonucun_java_içerdiğini_test_eder() {
        Assert.assertTrue(amazonPage.sonucyazısı.getText().contains("Java"));


    }


    @When("ipad için arama yapar")
    public void ipad_için_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("ipad"+ Keys.ENTER);

    }
    @Then("sonucun ipad içerdiğini test eder")
    public void sonucun_ipad_içerdiğini_test_eder() {
        Assert.assertTrue(amazonPage.sonucyazısı.getText().contains("ipad"));

    }


}
