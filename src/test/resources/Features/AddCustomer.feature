#Author: suriya@your.domain.com
Feature: Add Customer Validation flow

  Scenario: Add Customer Validation
    Given user launches telecom application
    And user click on add customer button
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add customer validation using 1D list concept
    Given user launches telecom application
    And user click on add customer button
    When user need to fill up the field using OneDim List
      | suriya | kmar | su@gamail.com | address | 987654321 |
    And user click on the submit button
    Then user verify customer id is generated

  Scenario: Add customer validation using 1D map concept
    Given user launches telecom application
    And user click on add customer button
    When user need to fill up the field using OneDim mmap
      | Fname | suriya       |
      | Lname | kumar        |
      | Email | su@gmail.com |
      | Addr  | address      |
      | Phno  |    987654321 |
    And user click on the submit button
    Then user verify customer id is generated

  Scenario: Add customer validation using 2D list concept
    Given user launches telecom application
    And user click on add customer button
    When user need to fill up the field using TwoDim List
      | suriya | kumar   | su@gamail.com | address | 987654321 |
      | raja   | sekar   | rs@gamail.com | adayar  | 114567655 |
      | ram    | kumar   | rk@gamail.com | chennai |  11234567 |
      | gopi   | shankar | gs@gamail.com | tvt     |  34567766 |
      | tamil  | Arasan  | ta@gamail.com | wimco   |  34575411 |
    And user click on the submit button
    Then user verify customer id is generated

  Scenario: Add customer validation using 2D Map concept
    Given user launches telecom application
    And user click on add customer button
    When user need to fill up the field using TwoDim Map
      | Fname | Lname   | Mail          | Address | Phno      |
      | raja  | sekar   | rs@gamail.com | adayar  | 114567655 |
      | ram   | kumar   | rk@gamail.com | chennai |  11234567 |
      | gopi  | shankar | gs@gamail.com | tvt     |  34567766 |
      | tamil | Arasan  | ta@gamail.com | wimco   |  34575411 |
    And user click on the submit button
    Then user verify customer id is generated
