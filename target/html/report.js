$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterToZingPoll.feature");
formatter.feature({
  "line": 1,
  "name": "Register to ZingPoll",
  "description": "I want to registered successfull",
  "id": "register-to-zingpoll",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16508224619,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Register with empty new user",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on ZingPoll website \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The SignIn form should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Choose task new user radio button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The SignUp form should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click Register button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify the failure message \"Please enter your name.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I verify the failure message \"Please enter your email.\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify the failure message \"Please enter your password.\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the failure message \"The re-type password is required and cannot be empty\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the failure message \"Please agree with the term!\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 26
    }
  ],
  "location": "RegisterPageSteps.i_am_on_ZingPoll_website(String)"
});
formatter.result({
  "duration": 5861116602,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.i_click_the_SignIn_button()"
});
formatter.result({
  "duration": 5447847604,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 2756419918,
  "status": "passed"
});
});