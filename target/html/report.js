$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AppiumScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Different Options",
  "description": "",
  "id": "validate-different-options",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Test send SMS and get SMS",
  "description": "",
  "id": "validate-different-options;test-send-sms-and-get-sms",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@Android_API_SMS"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click OS and click SMS Messaging",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I input sms \"\u003csms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I input content sms \"\u003ccontent_sms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click send button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I verify message sent",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "validate-different-options;test-send-sms-and-get-sms;",
  "rows": [
    {
      "cells": [
        "sms",
        "content_sms"
      ],
      "line": 32,
      "id": "validate-different-options;test-send-sms-and-get-sms;;1"
    },
    {
      "cells": [
        "00465",
        "Detail sms: 004655"
      ],
      "line": 33,
      "id": "validate-different-options;test-send-sms-and-get-sms;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19786263057,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Test send SMS and get SMS",
  "description": "",
  "id": "validate-different-options;test-send-sms-and-get-sms;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@Android_API_SMS"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click OS and click SMS Messaging",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I input sms \"00465\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I input content sms \"Detail sms: 004655\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click send button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I verify message sent",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumScenario.i_open_the_application()"
});
formatter.result({
  "duration": 1084664712,
  "status": "passed"
});
formatter.match({
  "location": "AppiumScenario.i_click_OS_and_click_SMS_message()"
});
formatter.result({
  "duration": 3795786465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "00465",
      "offset": 13
    }
  ],
  "location": "AppiumScenario.i_enter_into_the_name_field(String)"
});
formatter.result({
  "duration": 8420866262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Detail sms: 004655",
      "offset": 21
    }
  ],
  "location": "AppiumScenario.i_input_content_sms(String)"
});
formatter.result({
  "duration": 6749533584,
  "status": "passed"
});
formatter.match({
  "location": "AppiumScenario.i_click_send_button()"
});
formatter.result({
  "duration": 3681550171,
  "status": "passed"
});
formatter.match({
  "location": "AppiumScenario.i_verify_message_sent()"
});
formatter.result({
  "duration": 34170412514,
  "status": "passed"
});
formatter.after({
  "duration": 1650771999,
  "status": "passed"
});
});