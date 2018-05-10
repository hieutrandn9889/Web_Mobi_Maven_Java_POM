$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterToZingPoll.feature");
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
  "duration": 3059719353,
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
  "location": "RegisterPageSteps.i_am_on_ZingPoll_website()"
});
formatter.result({
  "duration": 10762097670,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.i_click_the_SignIn_button()"
});
formatter.result({
  "duration": 5178793040,
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
  "location": "RegisterPageSteps.i_input_username_and_password(String,String)"
});
formatter.result({
  "duration": 4703649959,
  "status": "passed"
});
formatter.after({
  "duration": 1018184555,
  "status": "passed"
});
formatter.uri("calculatorScenario.feature");
formatter.feature({
  "line": 2,
  "name": "Calculator",
  "description": "",
  "id": "calculator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AndroidCalculator"
    }
  ]
});
formatter.before({
  "duration": 7746863604,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Calculator",
  "description": "",
  "id": "calculator;calculator",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open the Calculator application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click number seven",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click plus",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click number two",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click equal",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I validate value",
  "keyword": "Then "
});
formatter.match({
  "location": "calculatorScenario.i_open_the_Calculator_application()"
});
formatter.result({
  "duration": 273574204,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_number_seven()"
});
formatter.result({
  "duration": 927556391,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_plus()"
});
formatter.result({
  "duration": 1032340995,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_number_two()"
});
formatter.result({
  "duration": 1296022121,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_equal()"
});
formatter.result({
  "duration": 1621550152,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_validate_value()"
});
formatter.result({
  "duration": 1385789564,
  "status": "passed"
});
formatter.after({
  "duration": 2349202491,
  "status": "passed"
});
formatter.uri("iosScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Run IOS",
  "description": "",
  "id": "run-ios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15138979212,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios;testing-ios",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@IOS"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open application IOS",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click UI to testing click function",
  "keyword": "When "
});
formatter.match({
  "location": "iOSscenario.i_open_the_application_IOS()"
});
formatter.result({
  "duration": 313698,
  "status": "passed"
});
formatter.match({
  "location": "iOSscenario.i_click_UI()"
});
formatter.result({
  "duration": 18160995383,
  "status": "passed"
});
formatter.after({
  "duration": 479098189,
  "status": "passed"
});
});