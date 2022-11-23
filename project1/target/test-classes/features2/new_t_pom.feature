Feature: working on web application

  Scenario Outline: New tours
    Given opening New tours app
    When specify <uname> and <password>
    Then click on submit button
    And close the application 
    
    Examples:
    |uname	|password|
		|Nikhil |nikhil	 |