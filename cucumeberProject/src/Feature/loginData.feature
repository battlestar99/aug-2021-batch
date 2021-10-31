#Author: razin anik
# date: 10/31/2021
# validating the login with different sets of data
Feature: Validating login with multiple data set

@data
  Scenario Outline: 
    Given user is on the login page
    When user enters "<username>" username for login
    And user enters "<password>" password for login
    And user clicks on the login button
    Then user should navigate to the "<expectedUrl>"

    Examples: 
      | username                | password     | expectedUrl                              |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/inventor.html |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/inventory.html |
      | test_user               | secret_sauce | https://www.saucedemo.com/               |
