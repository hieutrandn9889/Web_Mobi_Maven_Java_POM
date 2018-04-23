$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AppiumScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Different Options",
  "description": "",
  "id": "validate-different-options",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 36,
  "name": "Test input msg then auto chosing dropdown",
  "description": "",
  "id": "validate-different-options;test-input-msg-then-auto-chosing-dropdown",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@AndroidDropdown"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "I click view buton",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "I click Auto complete button",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I click screen top",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I input content \"\u003ccontent_dropdown\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I choose india dropdown",
  "keyword": "Then "
});
formatter.examples({
  "line": 44,
  "name": "",
  "description": "",
  "id": "validate-different-options;test-input-msg-then-auto-chosing-dropdown;",
  "rows": [
    {
      "cells": [
        "content_dropdown"
      ],
      "line": 45,
      "id": "validate-different-options;test-input-msg-then-auto-chosing-dropdown;;1"
    },
    {
      "cells": [
        "india"
      ],
      "line": 46,
      "id": "validate-different-options;test-input-msg-then-auto-chosing-dropdown;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 46,
  "name": "Test input msg then auto chosing dropdown",
  "description": "",
  "id": "validate-different-options;test-input-msg-then-auto-chosing-dropdown;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@AndroidDropdown"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "I click view buton",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "I click Auto complete button",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I click screen top",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I input content \"india\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I choose india dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumScenario.i_open_the_application()"
});
formatter.result({
  "duration": 140658245,
  "error_message": "java.lang.NullPointerException\n\tat stepdefinations.AppiumScenario.i_open_the_application(AppiumScenario.java:34)\n\tat ✽.Given I open the application(AppiumScenario.feature:37)\n",
  "status": "failed"
});
formatter.match({
  "location": "AppiumScenario.i_click_view_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppiumScenario.i_click_Auto_complete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppiumScenario.i_click_screen_top()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "india",
      "offset": 17
    }
  ],
  "location": "AppiumScenario.i_input_content(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppiumScenario.i_choose_india_drop_down()"
});
formatter.result({
  "status": "skipped"
});
});