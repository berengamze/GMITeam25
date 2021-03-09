$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_11.feature");
formatter.feature({
  "name": "GMI Bank new Customer creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@gmi"
    }
  ]
});
formatter.scenario({
  "name": "User should create a new customer by filling out the required fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmi"
    },
    {
      "name": "@TC_1"
    }
  ]
});
formatter.step({
  "name": "the user goes to gmi_login_url and signs in as an Employee",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.theUserGoesToGmi_login_urlAndSignsInAsAnEmployee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Operations",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.user_clicks_on_My_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Manage Customers",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.click_on_Manage_Customers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create a new Customer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.click_on_Create_a_new_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The date cannot be typed earlier, in the past, at the time of creation a customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmi"
    },
    {
      "name": "@TC_2"
    }
  ]
});
formatter.step({
  "name": "user clicks on create date box",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.user_clicks_on_create_date_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter a date earlier than the time of creation a customer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.enter_a_date_earlier_than_the_time_of_creation_a_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if it is an invalid input",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.verify_if_it_is_an_invalid_input()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can select Zelle Enrolled optionally and save it",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmi"
    },
    {
      "name": "@TC_3"
    }
  ]
});
formatter.step({
  "name": "user clicks on zelle enrolled",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.user_clicks_on_zelle_enrolled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if zelle enrolled is true",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.verify_if_zelle_enrolled_is_true()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can choose a user from the registration and it cannot be blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmi"
    },
    {
      "name": "@TC_4"
    }
  ]
});
formatter.step({
  "name": "user selects a user from dropdown",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.user_selects_a_user_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if selected user is valid",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.verify_if_selected_user_is_valid()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User box can not be blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmi"
    },
    {
      "name": "@TC_5"
    }
  ]
});
formatter.step({
  "name": "user leaves user box empty",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.user_leaves_user_box_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user box can not be blank",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.verify_user_box_can_not_be_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can choose an account created on manage accounts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmi"
    },
    {
      "name": "@TC_6"
    }
  ]
});
formatter.step({
  "name": "user selects an account from account dropdown",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.user_selects_an_account_from_account_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if selected account is valid",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_SD.verify_if_selected_account_is_valid()"
});
formatter.result({
  "status": "passed"
});
});