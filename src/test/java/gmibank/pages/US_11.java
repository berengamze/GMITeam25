package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_11 {
    public US_11() { PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(xpath = "//a[@href='#']")
    public WebElement userIcon;
    @FindBy(id = "login-item")
    public WebElement signIn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement MyOperations;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement ManageCustomers;
    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement CreateCustomer;
    @FindBy(xpath = "//*[@id=\"tp-customer-firstName\"]")
    public WebElement firstname;
    @FindBy(xpath = "//*[@id=\"tp-customer-lastName\"]")
    public WebElement lastname;
    @FindBy(xpath = "//*[@id=\"tp-customer-middleInitial\"]")
    public WebElement middleinitial;
    @FindBy(xpath = "//*[@id=\"tp-customer-email\"]")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"tp-customer-mobilePhoneNumber\"]")
    public WebElement mobilephone;
    @FindBy(xpath = "//*[@id=\"tp-customer-phoneNumber\"]")
    public WebElement phonenumber;
    @FindBy(xpath = "//*[@id=\"tp-customer-zipCode\"]")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@id=\"tp-customer-address\"]")
    public WebElement address;
    @FindBy(xpath = "//*[@id=\"tp-customer-city\"]")
    public WebElement city;
    @FindBy(xpath = "//*[@id=\"tp-customer-ssn\"]")
    public WebElement ssnumber;
    @FindBy(xpath = "//*[@id=\"tp-customer-createDate\"]")
    public WebElement createdate;
    @FindBy(xpath = "//*[@id=\"tp-customer-zelleEnrolled\"]")
    public WebElement zelle;
    @FindBy(xpath = "//*[@id=\"tp-customer-user\"]")
    public WebElement userDropDown;
    @FindBy(xpath = "//*[@id=\"tp-customer-account\"]")
    public WebElement accountDropDown;

}