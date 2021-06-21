#Author: suriya@your.domain.com

Feature: Add Customer Validation flow

  Scenario: Add Customer Validation
    Given user launches telecom application
		And user click on add customer button
		When user need to fill up the fields
		And user click on submit button
		Then user verify customer id is generated

