#Author: Suriya@your.domain.com
Feature: Add Tariff paln validation

  Scenario Outline: Add Tariff paln flow validation
    Given user launch the telecom Application
    And click the Add Tariff button
    When user fil up the Tariff details"<mr>","<flm>","<fim>","<fsp>","<lpmc>","<ipmc>","<spc>"
    And user clik the submit button
    Then user verifies the Congratulation message

    Examples: 
      | mr  | flm | fim | fsp | lpmc | ipmc | spc |
      | 100 | 299 | 300 | 400 |    3 |    4 |   5 |
      | 100 | 299 | 300 | 400 |    3 |    4 |   5 |
      | 100 | 299 | 300 | 400 |    3 |    4 |   5 |
      | 100 | 299 | 300 | 400 |    3 |    4 |   5 |
