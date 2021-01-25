$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.scenario({
  "name": "Register new users for GMI Bank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "name": "user is on the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_is_on_the_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ssn number as \"\u003cSSN\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_enters_ssn_number_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname and lastname as \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_enters_firstname_and_lastname_as_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides address \"\u003caddress\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_provides_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides mobilephone as \"\u003cmobilephone\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_provides_mobilephone_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides a username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_provides_a_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides email id as \"\u003cemail\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_provides_email_id_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password as \"\u003cfirstpassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_enters_the_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirms the new password \"\u003csecondpassword\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_confirms_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button and sees the success message as \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDefinitions.user_clicks_on_register_button_and_sees_the_success_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});