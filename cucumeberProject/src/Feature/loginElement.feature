# author: razin anik

Feature: login feature with multiple web elements

@regression
Scenario: validating login elements are in the login page

Given user is on the login page 
When user should be able to type in username text box
And user should be able to type in password text box
And user should be able to click on the click button

