package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory11 {
    public UserStory11() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
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
    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;
    @FindBy(xpath="//span[.='Manage Customers']")
    public WebElement manageCustomer;
    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;
    @FindBy(id = "tp-customer-createDate")
    public WebElement CreateDateBox;
    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;
    @FindBy (id = "tp-customer-user")
    public WebElement dropBox;
    @FindBy(xpath="//*[@id='tp-customer-account']")
    public WebElement accountDropBox;
    @FindBy (id="tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledBox;
    @FindBy(id="save-entity")
    public WebElement saveButton;
    @FindBy(xpath="//*[@id='createDateLabel']/span")
    public WebElement coloredText;
    @FindBy (xpath = "//*[@id=\"admin-menu\"]/a/span")
    public WebElement administration;
    @FindBy (xpath = "//*[@id=\"admin-menu\"]/div/a[1]/span")
    public WebElement userManagement;
    @FindBy (xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement registerIn;
    @FindBy (name = "ssn")
    public WebElement ssn;
    @FindBy(xpath = "//input[@name = 'firstname']")
    public WebElement registration_FirstName;
    @FindBy(xpath = "//input[@name = 'lastname']")
    public WebElement registration_LastName;
    @FindBy(xpath = "//input[@name = 'address']")
    public WebElement registration_Address;
    @FindBy(xpath = "//input[@name = 'mobilephone']")
    public WebElement registration_MobilePhoneNumber;
    @FindBy(xpath = "//input[@name = 'username']")
    public WebElement registration_userName;
    @FindBy(xpath = "//input[@name = 'email']")
    public WebElement registration_Email;
    @FindBy(xpath = "//input[@name = 'firstPassword']")
    public WebElement registration_FirstPassword;
    @FindBy(xpath = "//input[@name = 'secondPassword']")
    public WebElement registration_SecondPassword;
    @FindBy(id = "register-submit")
    public WebElement registration_SubmitButton;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement registration_successMessage;
    @FindBy(xpath = "//*[@id='search-ssn']")
    public WebElement cc_ssn;
    @FindBy (name = "middleInitial")
    public WebElement cc_midname;
    @FindBy (name="email")
    public WebElement cc_email;
    @FindBy (name = "mobilePhoneNumber")
    public WebElement cc_mphone;
    @FindBy (name = "phoneNumber")
    public WebElement cc_phone;
    @FindBy (name = "zipCode")
    public WebElement cc_zipcode;
    @FindBy (name = "address")
    public WebElement cc_adress;
    @FindBy (name = "city")
    public WebElement cc_city;
    @FindBy (name = "ssn")
    public WebElement cc_SSN;
    @FindBy (name = "country.id")
    public WebElement cc_country;
    @FindBy (name = "state")
    public WebElement cc_state;
    @FindBy (name = "user.id")
    public WebElement cc_userid;
    @FindBy (id="tp-customer-account")
    public WebElement account;
    @FindBy (id = "save-entity")
    public WebElement cc_Save;
         }
