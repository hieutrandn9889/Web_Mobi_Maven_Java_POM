$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("iosScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Run IOS",
  "description": "",
  "id": "run-ios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios;testing-ios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SimulatorIOS"
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
  "name": "I click skip button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I input email \"\u003cemail\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "run-ios;testing-ios;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "run-ios;testing-ios;;1"
    },
    {
      "cells": [
        "thu.nguuyen@smartdev.vn",
        "Test@123"
      ],
      "line": 11,
      "id": "run-ios;testing-ios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12849096936,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios;testing-ios;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SimulatorIOS"
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
  "name": "I click skip button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I input email \"thu.nguuyen@smartdev.vn\" and password \"Test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.match({
  "location": "iOSscenario.i_open_the_application_IOS()"
});
formatter.result({
  "duration": 324674765,
  "status": "passed"
});
formatter.match({
  "location": "iOSscenario.i_click_skip_button()"
});
formatter.result({
  "duration": 3675937633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thu.nguuyen@smartdev.vn",
      "offset": 15
    },
    {
      "val": "Test@123",
      "offset": 54
    }
  ],
  "location": "iOSscenario.i_input_email_password(String,String)"
});
formatter.result({
  "duration": 11149674061,
  "status": "passed"
});
formatter.match({
  "location": "iOSscenario.i_click_login()"
});
formatter.result({
  "duration": 10336439737,
  "status": "passed"
});
formatter.after({
  "duration": 589846311,
  "status": "passed"
});
});