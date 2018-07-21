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
formatter.before({
  "duration": 12517671861,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I open application amd show skip screen",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Testing view button",
  "description": "",
  "id": "run-app-to-skip-screen;testing-view-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I swide screen1",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I swide screen2",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I swide screen3",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click finish button",
  "keyword": "And "
});
formatter.match({
  "location": "TC_SkipPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 14493888184,
  "status": "passed"
});
formatter.match({
  "location": "TC_SkipPage_BT.i_swide_screen2()"
});
formatter.result({
  "duration": 13817353724,
  "status": "passed"
});
formatter.match({
  "location": "TC_SkipPage_BT.i_swide_screen3()"
});
formatter.result({
  "duration": 14633649869,
  "status": "passed"
});
formatter.match({
  "location": "TC_SkipPage_BT.i_click_finish_button()"
});
formatter.result({
  "duration": 1410840052,
  "status": "passed"
});
});