$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddNewEventHomgPageBTScenario.feature");
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
  "line": 10,
  "name": "",
  "description": "",
  "id": "run-ios;testing-ios;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 11,
      "id": "run-ios;testing-ios;;1"
    },
    {
      "cells": [
        "thu.nguuyen@smartdev.vn",
        "Test@123"
      ],
      "line": 12,
      "id": "run-ios;testing-ios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9906764684,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
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
  "location": "TC_LoginPage_BT.i_open_the_application_IOS()"
});
formatter.result({
  "duration": 310390799,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 5152933401,
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
  "location": "TC_LoginPage_BT.i_input_email_password(String,String)"
});
formatter.result({
  "duration": 18009246910,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_login()"
});
formatter.result({
  "duration": 7915687551,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Enter Homepage",
  "description": "",
  "id": "run-ios;enter-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@LogOutBT"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I open homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click logout button",
  "keyword": "And "
});
formatter.match({
  "location": "TC_LogOut_BT.i_open_homepage()"
});
formatter.result({
  "duration": 9178093,
  "status": "passed"
});
formatter.match({
  "location": "TC_LogOut_BT.i_click_logout_button()"
});
formatter.result({
  "duration": 11308495099,
  "status": "passed"
});
formatter.after({
  "duration": 333581695,
  "status": "passed"
});
formatter.uri("LoginAndLogoutBTScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Run IOS to login",
  "description": "",
  "id": "run-ios-to-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios-to-login;testing-ios",
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
  "line": 10,
  "name": "",
  "description": "",
  "id": "run-ios-to-login;testing-ios;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 11,
      "id": "run-ios-to-login;testing-ios;;1"
    },
    {
      "cells": [
        "thu.nguuyen@smartdev.vn",
        "Test@123"
      ],
      "line": 12,
      "id": "run-ios-to-login;testing-ios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8562074838,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios-to-login;testing-ios;;2",
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
  "location": "TC_LoginPage_BT.i_open_the_application_IOS()"
});
formatter.result({
  "duration": 8600527,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 5301068433,
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
  "location": "TC_LoginPage_BT.i_input_email_password(String,String)"
});
formatter.result({
  "duration": 16680923869,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_login()"
});
formatter.result({
  "duration": 7280336980,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Enter Homepage",
  "description": "",
  "id": "run-ios-to-login;enter-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@homePageBT"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I see home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click add new event",
  "keyword": "And "
});
formatter.match({
  "location": "TC_HomePage_BT.i_see_home_page()"
});
formatter.result({
  "duration": 9243383,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_click_add_new_button()"
});
formatter.result({
  "duration": 11414047809,
  "status": "passed"
});
formatter.after({
  "duration": 331264250,
  "status": "passed"
});
});