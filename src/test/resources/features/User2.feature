
  @User2
  Feature: Registration

    Background:

      Given user is on home page
      Given user click user icon
      Given user click register button
      Given verify user is on registration page

   Scenario Outline:Any_field_on_the_registration_page_should_not_be_left_blank

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




    Scenario:SSN number cannot be of any chars nor spec chars except "-"

      Given user click on SSN textbox
      When user provide the SSN using character "-" between the numbers
      And user should not see any error message
