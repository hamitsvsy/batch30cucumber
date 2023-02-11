package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FacebookPage;

public class facebookStepDefinitions {

    FacebookPage facebookPage = new FacebookPage();

    @Then("facebook çerezleri kapat")
    public void facebook_çerezleri_kapat() {
        facebookPage.facebookCerez.click();

    }



    @Then("facebook email kutusuna {string} yazar")
    public void facebook_email_kutusuna_yazar(String kullanıcıEmail) {
        facebookPage.facebookEmail.sendKeys(kullanıcıEmail);


    }



    @Then("facebook password kutusuna {string} yazar")
    public void facebook_password_kutusuna_yazar(String kullanıcıPassword) {
        facebookPage.facebookPassword.sendKeys(kullanıcıPassword);

    }
    @Then("facebook Login Butonuna basar")
    public void facebook_login_butonuna_basar() {
        facebookPage.facebookGirisButon.click();

    }
    @Then("giriş yapılmadığını test eder")
    public void giriş_yapılmadığını_test_eder() {

        Assert.assertTrue(facebookPage.facebookYanlışGirişİkon.isDisplayed());

    }








}
