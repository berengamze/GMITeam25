@gmi
Feature: GMI Bank new Customer creation
@TC_1
  Scenario: User should create a new customer by filling out the required fields
    Given the user goes to gmi_login_url and signs in as an Employee
    And user clicks on My Operations
    And click on Manage Customers
    And click on Create a new Customer
@TC_2
  Scenario: The date cannot be typed earlier, in the past, at the time of creation a customer
    Given user clicks on create date box
    And enter a date earlier than the time of creation a customer
    Then verify if it is an invalid input
@TC_3
  Scenario: User can select Zelle Enrolled optionally and save it
    Given user clicks on zelle enrolled
    Then verify if zelle enrolled is true
@TC_4
  Scenario: User can choose a user from the registration and it cannot be blank
    Given user selects a user from dropdown
    Then verify if selected user is valid
@TC_5
  Scenario: User box can not be blank
    Given  user leaves user box empty
    Then verify user box can not be blank
@TC_6
  Scenario: User can choose an account created on manage accounts
    Given user selects an account from account dropdown
    Then verify if selected account is valid