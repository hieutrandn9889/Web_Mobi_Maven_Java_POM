$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BT/signUpScreen_BT_Scenario.feature");
formatter.feature({
  "line": 2,
  "name": "Run app to testing register screen",
  "description": "",
  "id": "run-app-to-testing-register-screen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegisterScreen"
    }
  ]
});
formatter.before({
  "duration": 13147647649,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I open application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I click skip button to going register screen",
  "keyword": "When "
});
formatter.match({
  "location": "TC_SignUpPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 1936640299,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Testing Sign up by google plus",
  "description": "",
  "id": "run-app-to-testing-register-screen;testing-sign-up-by-google-plus",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@C3GooglePlus"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I click Google plus button of app",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_SignUpPage_BT.i_click_Google_plus_btn()"
});
formatter.result({
  "duration": 1215061963,
  "status": "passed"
});
});