# Author: Razin Anik
Feature: Signup module for Yahoo
@yahoo
  Scenario Outline: 
    Given user is on the yahoo sign up page
    When user enters "<firstname>" firstname in the sign up page
    And user enters "<lastname>" lastname in the sign up page
    And user enters "<emailaddress>" email address in the sign up page
    And user enters "<password>" password in the sign up page
    And user Selects "<countryCode>" country code in the sign up page

    Examples: 
      | firstname | lastname | emailaddress | password     | countryCode |
      | Michael   | Scot     | scott1121    | dafdasfds++  | AF          |
      | Michael   | jordan   | jdn323       | fadsfdsafdsa | DZ          |
      | Jim       | Halpert  | jimdsjhfd    | dfdfdfidf    | AO          |
      | Razin     | Anik     | dfdsfds      | dfadsfjdhf8  | BH          |
      | seth      | malik    | dfhfk        | dfjf78++     | CR          |
