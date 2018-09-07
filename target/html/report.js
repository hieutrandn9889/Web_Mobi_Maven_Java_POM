$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ZP/RegisterTo_ZP_Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Register to ZingPoll",
  "description": "I want to registered successfull",
  "id": "register-to-zingpoll",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Register with empty new user",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on ZingPoll website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I input username \u003cusername\u003e and password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "register-to-zingpoll;register-with-empty-new-user;;1"
    },
    {
      "cells": [
        "hieutrandn01@gmail.com",
        "123456"
      ],
      "line": 12,
      "id": "register-to-zingpoll;register-with-empty-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2286013652,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Register with empty new user",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on ZingPoll website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I input username hieutrandn01@gmail.com and password 123456",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TC_RegisterPageSteps_ZP.i_am_on_ZingPoll_website()"
});
formatter.result({
  "duration": 3005610557,
  "status": "passed"
});
formatter.match({
  "location": "TC_RegisterPageSteps_ZP.i_click_the_SignIn_button()"
});
formatter.result({
  "duration": 5175578020,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hieutrandn01@gmail.com",
      "offset": 17
    },
    {
      "val": "123456",
      "offset": 53
    }
  ],
  "location": "TC_RegisterPageSteps_ZP.i_input_username_and_password(String,String)"
});
formatter.result({
  "duration": 4946552434,
  "status": "passed"
});
formatter.after({
  "duration": 200103716,
  "status": "passed"
});
});