Feature: working on e-commerce site
Scenario: Amazon links capturing
Given opening Amazon website 
When Capture links get title url
Then store text title url into excel
Then capture the screenchot
And close the window