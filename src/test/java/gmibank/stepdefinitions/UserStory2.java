package gmibank.stepdefinitions;

import gmibank.page.RegistrationPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory2 {

    RegistrationPage registrationPage = new RegistrationPage();


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
        Driver.wait(3);
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



   @When("user provide the SSN using character {string} between the numbers")
    public void user_provide_the_SSN_using_character_between_the_numbers(String SSN) {
       registrationPage.clickSSN.sendKeys(SSN);
        }



    @When("user should not see any error message")
    public void user_should_not_see_any_error_message() {
     registrationPage.
        }



}