package gmibank.page;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement dropdownRegister;

    @FindBy(id="ssn")
    public WebElement nagivateSSN;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement clickFirstName;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(xpath = "//input [@name='mobilephone']")
    public WebElement mobilephone;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id="email")
    public WebElement emailText;

    @FindBy(id="firstPassword")
    public WebElement password;

    @FindBy(id="secondPassword")
    public WebElement secondPassword;

    @FindBy(id="register-submit")
    public WebElement clickRegister;

    @FindBy(id="ssn")
    public WebElement clickSSN;

    @FindBy(xpath = "//div[@class='alert alert-warning fade show']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement SSNerrorMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement PhoneNumberErrorMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ErrorEmailMessage;
}
