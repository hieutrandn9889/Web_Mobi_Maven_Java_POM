$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BT/skipScreen.feature");
formatter.feature({
  "line": 2,
  "name": "Run app to skip screen",
  "description": "",
  "id": "run-app-to-skip-screen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AndroidBT"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Testing view button",
  "description": "",
  "id": "run-app-to-skip-screen;testing-view-button",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@SwideScreen"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I swide screen1",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I swide screen2",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I swide screen3",
  "keyword": "And "
});
});