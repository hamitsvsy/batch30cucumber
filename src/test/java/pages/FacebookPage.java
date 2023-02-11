package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement facebookEmail;


    @FindBy (xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
    public WebElement facebookPassword;


    @FindBy (xpath = "//button[@name='login']")
    public WebElement facebookGirisButon;


    @FindBy (xpath = "//img[@class='_9ay6 img']")
    public WebElement facebookYanlışGirişİkon;

    @FindBy (xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
    public WebElement facebookCerez;








}
