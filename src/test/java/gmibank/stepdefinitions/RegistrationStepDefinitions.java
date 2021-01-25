package gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import gmibank.page.RegistrationPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefinitions {


    RegistrationPage registrationPage = new RegistrationPage();

    Faker faker = new Faker();
    String ssn;
    String firstname;
    String lastname;
    String address;
    String mobilePhone;
    String username;
    String email;
    String password;
    String passwordConfirmation;
    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        Driver.getDriver().get("http://gmibank.com/account/register");
        registrationPage.loginDropdown.click();
        registrationPage.dropdownRegister.click();
    }
    @Given("user enters ssn number as {string}")
    public void user_enters_ssn_number_as(String ssn) {
        ssn = faker.idNumber().ssnValid();
        this.ssn = ssn;
        registrationPage.nagivateSSN.sendKeys(ssn);
    }
    @Then("user enters firstname and lastname as {string} and {string}")
    public void user_enters_firstname_and_lastname_as_and(String firstname, String lastname) {
        firstname = faker.name().firstName();
        lastname = faker.name().lastName();
        this.firstname = firstname;
        this.lastname = lastname;
        registrationPage.firstName.sendKeys(firstname);
        registrationPage.lastName.sendKeys(lastname);
    }
    @When("user provides address {string}")
    public void user_provides_address(String string) {
        address = faker.address().streetAddress();
        this.address = address;
        registrationPage.address.sendKeys(address);
    }
    @Then("user provides mobilephone as {string}")
    public void user_provides_mobilephone_as(String string) {
        mobilePhone = faker.phoneNumber().cellPhone().replace(".","-").replace("(","").replace(")","-")
                .replace(" ","").trim();
        this.mobilePhone = mobilePhone;
        registrationPage.mobilephone.sendKeys(mobilePhone);
    }
    @Then("user provides a username {string}")
    public void user_provides_a_username(String string) {
        username = faker.name().username();
        this.username = username;
        registrationPage.userName.sendKeys(username);
    }
    @Then("user provides email id as {string}")
    public void user_provides_email_id_as(String string) {
        email = faker.internet().emailAddress();
        this.email = email;
        registrationPage.emailText.sendKeys(email);
    }
    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String string) {
        password = faker.internet().password().concat("&");
        this.password = password;
        registrationPage.password.sendKeys(password);
    }
    @When("user confirms the new password {string}")
    public void user_confirms_the_new_password(String string) {
        registrationPage.secondPassword.sendKeys(password);
    }
    @Then("user clicks on register button and sees the success message as {string}")
    public void user_clicks_on_register_button_and_sees_the_success_message_as(String string) {
        registrationPage.clickRegister.click();
        Driver.waitForVisibility(registrationPage.registrationSuccessmessage,4);
        Assert.assertTrue(registrationPage.registrationSuccessmessage.isDisplayed());
    }
}



