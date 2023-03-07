package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

import java.security.Key;

public class EditorStepDefinitions {

    EditorPage editorPage = new EditorPage();
    Actions actions = new Actions(Driver.getDriver());


    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButton.click();

    }

    @Then("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String name) {

        editorPage.firstName.sendKeys(name);

    }

    @Then("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastname) {

        editorPage.lastName.sendKeys(lastname);

    }

    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String position) {
        editorPage.position.sendKeys(position);

    }

    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String office) {
        editorPage.office.sendKeys(office);
    }

    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extension) {

        editorPage.extension.sendKeys(extension);

    }

    @Then("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {

        editorPage.stardate.sendKeys(startDate);

    }

    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {
        editorPage.salary.sendKeys(salary);

    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

        editorPage.createButton.click();

    }


    @And("editor ilgili kutulara {string} {string} {string} {string}  {string} {string} {string}  bilgilerini girer")
    public void editorIlgiliKutularaOfficeExtensionStartDateSalaryBilgileriniGirer(String firstname, String lastname,
                                                                                   String position, String office, String extension,
                                                                                   String startDate, String salary) {


        actions.
                sendKeys(editorPage.firstName,firstname).
                sendKeys(Keys.TAB).
                sendKeys(editorPage.lastName,lastname).
                sendKeys(Keys.TAB).
                sendKeys(editorPage.position,position).
                sendKeys(Keys.TAB).
                sendKeys(editorPage.office).
                sendKeys(Keys.TAB).
                sendKeys(editorPage.extension).
                sendKeys(Keys.TAB).
                sendKeys(editorPage.stardate).
                sendKeys(Keys.TAB).
                sendKeys(editorPage.salary).
                sendKeys(editorPage.createButton).perform();
    }

    @Then("{string} ve  {string} girerek kaydın tamamlandığını test eder")
    public void veGirerekKaydınTamamlandığınıTestEder(String firstname, String lastname) throws InterruptedException {

        Thread.sleep(2000);
        editorPage.searchkutusu.click();
        editorPage.searchkutusu.sendKeys(firstname + " " + lastname);

        Assert.assertTrue(editorPage.isimaramailksatır.isDisplayed());




    }
}

