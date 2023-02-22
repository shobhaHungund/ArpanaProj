Feature: Login Action
Scenario: :Verify Login for valid inputs and display message as Login Successful
Given User is on Home page
When user clicks on Sign in 
Then Login page is dislayed with title Rediffmail
When user enters user name password
And clicks on Submit
Then user gets connected users inbox and display message as Successful

Scenario: :Verify Login for invalid inputs and display error message
Given User is on Home page
When user clicks on Sign in 
Then Login page is dislayed with title Rediffmail
When enter invalid user name and valid password 
And clicks on Submit
Then Check for error message
When user enters valid user name and invalid password
Then Check for error message

