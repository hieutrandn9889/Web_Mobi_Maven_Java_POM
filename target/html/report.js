$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BT/signInScreen_BT_Scenario.feature");
formatter.feature({
  "line": 2,
  "name": "Run app to testing medication",
  "description": "",
  "id": "run-app-to-testing-medication",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Medication"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Testing Login",
  "description": "",
  "id": "run-app-to-testing-medication;testing-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I click login button to login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I input email \"\u003cemail\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click allow button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click gps button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click menu taskbar",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click My Pa button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click medication button",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "run-app-to-testing-medication;testing-login;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 17,
      "id": "run-app-to-testing-medication;testing-login;;1"
    },
    {
      "cells": [
        "hieutrandn123@gmail.com",
        "Abc@123"
      ],
      "line": 18,
      "id": "run-app-to-testing-medication;testing-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11378422764,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I open app and testing",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I click skip button",
  "keyword": "When "
});
formatter.match({
  "location": "TC_LogInPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 2435206195,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Testing Login",
  "description": "",
  "id": "run-app-to-testing-medication;testing-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Medication"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click login button to login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I input email \"hieutrandn123@gmail.com\" and password \"Abc@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click allow button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click gps button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click menu taskbar",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click My Pa button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click medication button",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_LogInPage_BT.i_click_login_button_to_login()"
});
formatter.result({
  "duration": 1112594666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hieutrandn123@gmail.com",
      "offset": 15
    },
    {
      "val": "Abc@123",
      "offset": 54
    }
  ],
  "location": "TC_LogInPage_BT.i_input_email_password(String,String)"
});
formatter.result({
  "duration": 16761087390,
  "status": "passed"
});
formatter.match({
  "location": "TC_LogInPage_BT.i_click_login()"
});
formatter.result({
  "duration": 1093326657,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_click_allow_button()"
});
formatter.result({
  "duration": 7333941713,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_click_gps_button()"
});
formatter.result({
  "duration": 3662813909,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_click_menu_taskbar()"
});
