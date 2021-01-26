@User2
Feature: Registration

  Background:

    Given user is on home page
    Given user click user icon
    Given user click register button
    Given verify user is on registration page

  @tc02_01
  Scenario: Any field on the registration page should not be left blank

    Given user click on SSN button
    When user click on SSN textbox
    When user Provide the SNN of the applicant
    When user click on the first name textbox
    And user provide he applicant name
    And user Click on the  Last name textbox
    And user Provide the applicant's last name
    When user Click on address textbox
    And user Provide the address
    When user Click on Mobile Phone Number text box
    And user Provide the number of Mobile phone number
    When user Click on Username text box
    And user Provide the username's name
    When user Click on email text box
    And user Provide the username' s email
    When user Click on New Password text box
    And user Provide the username's password
    And user Click on Confirm the new password text box
    And user Provide the new password of username
    Then Click on Register button


  @tc02_01
  Scenario Outline:Any field on the registration page should not be left blank

    Given user provide ssn "<SSN>"
    Given user provide firstname "<firstname>"
    Given user provide lastname "<lastname>"
    Given user provide  address "<address>"
    Given user provide mobilePhone "<mobilePhone>"
    Given user provide  userName "<userName>"
    Given user provide email "<email>"
    Given user provide password "<password>"
    Given user provide repassword "<rePassword>"
    Given user clicks register button
    Then verify user should not register



    Examples: test data

      | SSN         | firstname | lastname  | address | mobilePhone  | userName | email   | password | rePassword |
      | 34524-6789  | Simon     | Rodriguez | Miami   | 123-234-6789 | Simon    | a@b.com | abcd     | abcd       |
      | 345-24-6789 |           | Rodriguez | Miami   | 123-234-6789 | Simon    | a@b.com | abcd     | abcd       |
      | 345-24-6789 | Simon     |           | Miami   | 123-234-6789 | Simon    | a@b.com | abcd     | abcd       |
      | 345-24-6789 | Simon     | Rodriguez |         | 123-234-6789 | Simon    | a@b.com | abcd     | abcd       |
      | 345-24-6789 | Simon     | Rodriguez | Miami   |              | Simon    | a@b.com | abcd     | abcd       |
      | 345-24-6789 | Simon     | Rodriguez | Miami   | 123-234-6789 |          | a@b.com | abcd     | abcd       |
      | 345-24-6789 | Simon     | Rodriguez | Miami   | 123-234-6789 | Simon    |         | abcd     | abcd       |
      | 345-24-6789 | Simon     | Rodriguez | Miami   | 123-234-6789 | Simon    | a@b.com |          | abcd       |
      | 345-24-6789 | Simon     | Rodriguez | Miami   | 123-234-6789 | Simon    | a@b.com | abcd     |            |


  @test02_02
  Scenario Outline:SSN number cannot be of any chars nor spec chars except "-"

    Given user click on SSN textbox
    And user provide the invalid "<SSN>" to Ssn box
    And user should see error message

    Examples: test data
      | SSN         |
      | 123-34-123h |
      | 123-23-234# |


  @tc02_03
  Scenario Outline: Mobilephone number cannot be of any chars nor spec chars except "-"

    Given user Click on Mobile Phone Number textbox
    When user provide the invalid "<MobilPhoneNumber>"  to Mobile phone number
    And user should see an error message

    Examples: test data

      | MobilPhoneNumber |
      | 123-344-345*     |
      | 123-345-678u     |

  @tc02_04
  Scenario Outline: email id cannot be created without "@" sign and "." extensions

    Given user Click on email textbox
    When user provide the invalid "<email>" to email textbox
    And user should see an error message below the email box

    Examples: test data

      | email    |
      | a@b.com# |
      | a%b.com  |
