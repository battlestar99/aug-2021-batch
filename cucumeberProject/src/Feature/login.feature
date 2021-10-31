
# author: razin anik
#date : 10/30/2021 


Feature: Login feature for sauce lab 

@smoke @regression
Scenario: Validating the login for valid credential 
Given user is on the login page
When  user enters valid password
When user enters valid username
And user clicks on the login button
Then user should be on the inventory page 

@regression
Scenario: Validating the login for invalid credential 
Given user is on the login page
When user enters invalid username
And  user enters invalid password
And user clicks on the login button
Then user should stay in the login page


 @regression
Scenario: Validating the login for problem user credential
Given user is on the login page 
When user enters problem users username
And  user enters invalid password
And user clicks on the login button
Then user should be on the inventory page

