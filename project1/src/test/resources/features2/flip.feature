Feature: working on google page

  Scenario: web application
    Given user is in google page
    When user searches some text
    Then user click on submit button
    And user is navigated to home page