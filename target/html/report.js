$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Verify login in SC",
  "description": "",
  "id": "verify-login-in-sc",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test input username and password",
  "description": "",
  "id": "verify-login-in-sc;test-input-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AndroidSC"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I input username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I input password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "verify-login-in-sc;test-input-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 10,
      "id": "verify-login-in-sc;test-input-username-and-password;;1"
    },
    {
      "cells": [
        "india",
        "",
        "india"
      ],
      "line": 11,
      "id": "verify-login-in-sc;test-input-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12852804713,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Test input username and password",
  "description": "",
  "id": "verify-login-in-sc;test-input-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AndroidSC"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I input username \"india\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I input password \"india\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_LoginPage_SC.I_open_the_app()"
});
formatter.result({
  "duration": 331270867,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_SC.i_click_login_button()"
});
formatter.result({
  "duration": 85954229301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "india",
      "offset": 18
    }
  ],
  "location": "TC_LoginPage_SC.i_input_username(String)"
});
