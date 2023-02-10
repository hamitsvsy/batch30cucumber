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

        Assert.assertTrue(amazonPage.sonucyazısınutella.getText().contains("nutella"));




    }

    @And("sayfayı kapat")
    public void sayfayıKapat() {
        Driver.closeDriver();
    }
}
