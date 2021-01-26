package gmibank.stepdefinitions;

import gmibank.page.RegistrationPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class UserStory2 {

    RegistrationPage registrationPage = new RegistrationPage();


    @Given("user click on SSN button")
    public void user_click_on_SSN_button() {
        registrationPage.clickSSN.click();
    }

    @When("user Provide the SNN of the applicant")
    public void user_Provide_the_SNN_of_the_applicant() {
        registrationPage.nagivateSSN.sendKeys("123-45-6789");

    }
    @When("user click on the first name textbox")
    public void userClickOnTheFirstNameTextbox() {
        registrationPage.firstName.click();
    }
    @And("user provide he applicant name")
    public void userProvideHeApplicantName() {
        registrationPage.firstName.sendKeys("Simon");
    }

    @When("user Click on the  Last name textbox")
    public void user_Click_on_the_Last_name_textbox() {
       registrationPage.lastName.click();
    }

    @When("user Provide the applicant's last name")
    public void user_Provide_the_applicant_s_last_name() {
       registrationPage.lastName.sendKeys("Rodriguez");
    }

    @When("user Click on address textbox")
    public void user_Click_on_address_textbox() {
        registrationPage.address.click();

    }

    @When("user Provide the address")
    public void user_Provide_the_address() {
       registrationPage.address.sendKeys("Miami");
    }

    @When("user Click on Mobile Phone Number text box")
    public void user_Click_on_Mobile_Phone_Number_text_box() {
        registrationPage.mobilephone.click();
    }

    @When("user Provide the number of Mobile phone number")
    public void user_Provide_the_number_of_Mobile_phone_number() {
       registrationPage.mobilephone.sendKeys("123-234-4567");
    }

    @When("user Click on Username text box")
    public void user_Click_on_Username_text_box() {
      registrationPage.userName.click();
    }

    @When("user Provide the username's name")
    public void user_Provide_the_username_s_name() {
      registrationPage.userName.sendKeys("SimonRod");
    }

    @When("user Click on email text box")
    public void user_Click_on_email_text_box() {
      registrationPage.emailText.click();
    }

    @When("user Provide the username' s email")
    public void user_Provide_the_username_s_email() {
      registrationPage.emailText.sendKeys("Simon@gmail.com");
    }

    @When("user Click on New Password text box")
    public void user_Click_on_New_Password_text_box() {
     registrationPage.password.click();
    }

    @When("user Provide the username's password")
    public void user_Provide_the_username_s_password() {
        registrationPage.password.sendKeys("123abc");

    }

    @When("user Click on Confirm the new password text box")
    public void user_Click_on_Confirm_the_new_password_text_box() {
       registrationPage.secondPassword.click();
    }

    @When("user Provide the new password of username")
    public void user_Provide_the_new_password_of_username() {
        registrationPage.secondPassword.sendKeys("123abc");
    }

    @Then("Click on Register button")
    public void click_on_Register_button() {
       registrationPage.clickRegister.click();
    }


    @Given("user click user icon")
    public void user_click_user_icon() {
        Driver.wait(3);
        registrationPage.userIcon.click();
    }

    @Given("user click register button")
    public void user_click_register_button() {
        Driver.wait(3);
        registrationPage.dropdownRegister.click();
    }

    @Given("verify user is on registration page")
    public void verify_user_is_on_registration_page() {
        Driver.waitForVisibility(registrationPage.clickFirstName,5);
        Assert.assertTrue(registrationPage.clickFirstName.isDisplayed());
    }



    @Given("user clicks register button")
    public void user_clicks_register_button() {
        registrationPage.clickRegister.click();
    }



    @Given("user is on home page")
    public void userIsOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmiUrl"));
    }

    @Then("verify user should not register")
    public void verifyUserShouldNotRegister() {
        Driver.wait(3);
        Assert.assertTrue(registrationPage.errorMessage.isDisplayed());

    }


    @Given("user provide ssn {string}")
    public void user_provide_ssn(String SSN) {
       registrationPage.clickSSN.sendKeys(SSN);
    }

    @Given("user provide firstname {string}")
    public void user_provide_firstname(String firstName) {
        registrationPage.firstName.sendKeys(firstName);
    }

    @Given("user provide lastname {string}")
    public void user_provide_lastname(String lastname) {
       registrationPage.lastName.sendKeys(lastname);
    }

    @Given("user provide  address {string}")
    public void user_provide_address(String address) {
       registrationPage.address.sendKeys(address);
    }

    @Given("user provide mobilePhone {string}")
    public void user_provide_mobilePhone(String phone) {
       registrationPage.mobilephone.sendKeys(phone);
    }

    @Given("user provide  userName {string}")
    public void user_provide_userName(String username) {
        registrationPage.userName.sendKeys(username);
    }

    @Given("user provide email {string}")
    public void user_provide_email(String email) {
       registrationPage.emailText.sendKeys(email);
    }

    @Given("user provide password {string}")
    public void user_provide_password(String password) {
        registrationPage.password.sendKeys(password);
    }

    @Given("user provide repassword {string}")
    public void user_provide_repassword(String repassword) {
       registrationPage.secondPassword.sendKeys(repassword);
    }



    @Given("user click on SSN textbox")
    public void user_click_on_SSN_textbox() {
        registrationPage.clickSSN.click();

    }

    @And("user provide the invalid {string} to Ssn box")
    public void userProvideTheInvalidToSsnBox(String SSN) {
        registrationPage.clickSSN.sendKeys(SSN);
        registrationPage.clickSSN.sendKeys(Keys.TAB);

    }

    @And("user should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(registrationPage.SSNerrorMessage.isDisplayed());
    }
    @Given("user Click on Mobile Phone Number textbox")
    public void userClickOnMobilePhoneNumberTextbox() {
        registrationPage.mobilephone.click();
    }

    @When("user provide the invalid {string}  to Mobile phone number")
    public void userProvideTheInvalidToMobilePhoneNumber(String MobilPhoneNumber) {
      registrationPage.mobilephone.sendKeys(MobilPhoneNumber);
      registrationPage.mobilephone.sendKeys(Keys.TAB);
    }

    @And("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        Assert.assertTrue(registrationPage.PhoneNumberErrorMessage.isDisplayed());

    }

    @Given("user Click on email textbox")
    public void user_Click_on_email_textbox() {
       registrationPage.emailText.click();
    }

    @When("user provide the invalid {string} to email textbox")
    public void user_provide_the_invalid_to_email_textbox(String email) {
        registrationPage.emailText.sendKeys(email);
        registrationPage.emailText.sendKeys(Keys.TAB);
    }

    @When("user should see an error message below the email box")
    public void user_should_see_an_error_message_below_the_email_box() {
        Assert.assertTrue(registrationPage.ErrorEmailMessage.isDisplayed());
    }



}

