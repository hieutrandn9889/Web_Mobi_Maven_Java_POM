$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculatorScenario.feature");
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
  "duration": 29211657566,
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
  "duration": 1184547929,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_number_seven()"
});
formatter.result({
  "duration": 2142614624,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_plus()"
});
formatter.result({
  "duration": 840659205,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_number_two()"
});
formatter.result({
  "duration": 910977345,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_click_equal()"
});
formatter.result({
  "duration": 1636473699,
  "status": "passed"
});
formatter.match({
  "location": "calculatorScenario.i_validate_value()"
});
formatter.result({
  "duration": 1500406306,
  "status": "passed"
});
formatter.after({
  "duration": 5604572459,
  "status": "passed"
});
});