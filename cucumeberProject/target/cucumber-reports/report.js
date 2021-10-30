$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "# author: razin anik"
    },
    {
      "line": 3,
      "value": "#date : 10/30/2021"
    }
  ],
  "line": 6,
  "name": "Login feature for sauce lab",
  "description": "",
  "id": "login-feature-for-sauce-lab",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1913133900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validating the login for valid credential",
  "description": "",
  "id": "login-feature-for-sauce-lab;validating-the-login-for-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should be on the inventory page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 305467400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_valid_username()"
});
formatter.result({
  "duration": 86675500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_valid_password()"
});
formatter.result({
  "duration": 103266600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 124161500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_inventory_page()"
});
formatter.result({
  "duration": 106039400,
  "status": "passed"
});
formatter.after({
  "duration": 884353800,
  "status": "passed"
});
formatter.before({
  "duration": 1224000100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validating the login for invalid credential",
  "description": "",
  "id": "login-feature-for-sauce-lab;validating-the-login-for-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user enters invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user should stay in the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 230389300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_invalid_username()"
});
formatter.result({
  "duration": 117256900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_invalid_password()"
});
formatter.result({
  "duration": 104634200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 57225500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_stay_in_the_login_page()"
});
formatter.result({
  "duration": 10918200,
  "status": "passed"
});
formatter.after({
  "duration": 818273100,
  "status": "passed"
});
formatter.before({
  "duration": 1242524600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validating the login for problem user credential",
  "description": "",
  "id": "login-feature-for-sauce-lab;validating-the-login-for-problem-user-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@smoke"
    },
    {
      "line": 27,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user enters problem users username",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user enters invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user should be on the inventory page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 242774300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_problem_users_username()"
});
formatter.result({
  "duration": 95667300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_invalid_password()"
});
formatter.result({
  "duration": 92648400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 108582500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_inventory_page()"
});
formatter.result({
  "duration": 18624600,
  "status": "passed"
});
formatter.after({
  "duration": 753866000,
  "status": "passed"
});
formatter.uri("loginElement.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# author: razin anik"
    }
  ],
  "line": 3,
  "name": "login feature with multiple web elements",
  "description": "",
  "id": "login-feature-with-multiple-web-elements",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1287436400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "validating login elements are in the login page",
  "description": "",
  "id": "login-feature-with-multiple-web-elements;validating-login-elements-are-in-the-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user should be able to type in username text box",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be able to type in password text box",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be able to click on the click button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 229132300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_type_in_username_text_box()"
});
formatter.result({
  "duration": 68450000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_type_in_password_text_box()"
});
formatter.result({
  "duration": 62021200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_click_on_the_click_button()"
});
formatter.result({
  "duration": 59626500,
  "status": "passed"
});
formatter.after({
  "duration": 813891800,
  "status": "passed"
});
});