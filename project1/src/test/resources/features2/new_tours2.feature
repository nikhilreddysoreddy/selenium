Feature: working on web application

  Scenario Outline: new tours application
    Given user is in new tours application
    When user needs to enter <username> and <password>
    Then user clicks on signup button
    And user navigated to home page
    
    Examples:
    	|username|password|
    	|mercury |123456	|
    
