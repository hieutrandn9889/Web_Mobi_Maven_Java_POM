$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddNewEventHomgPage_BT_Scenario.feature");
formatter.feature({
  "line": 2,
  "name": "Run IOS to login",
  "description": "",
  "id": "run-ios-to-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SimulatorIOS"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios-to-login;testing-ios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I input email \"\u003cemail\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I see home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click add new event",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "run-ios-to-login;testing-ios;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 15,
      "id": "run-ios-to-login;testing-ios;;1"
    },
    {
      "cells": [
        "thu.nguuyen@smartdev.vn",
        "Test@123"
      ],
      "line": 16,
      "id": "run-ios-to-login;testing-ios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13428972541,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I open application IOS",
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
  "location": "TC_LoginPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 6626038546,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Testing IOS",
  "description": "",
  "id": "run-ios-to-login;testing-ios;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SimulatorIOS"
    },
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I input email \"thu.nguuyen@smartdev.vn\" and password \"Test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I see home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click add new event",
  "keyword": "And "
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
  "duration": 21347446243,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_login()"
});
formatter.result({
  "duration": 10222942007,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_see_home_page()"
});
formatter.result({
  "duration": 102203847,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_click_add_new_button()"
});
formatter.result({
  "duration": 13338548766,
  "status": "passed"
});
formatter.after({
  "duration": 414388746,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Enter Homepage",
  "description": "",
  "id": "run-ios-to-login;enter-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I input email \"\u003cemail\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I open homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click logout button",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "run-ios-to-login;enter-homepage;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 26,
      "id": "run-ios-to-login;enter-homepage;;1"
    },
    {
      "cells": [
        "thu.nguuyen@smartdev.vn",
        "Test@123"
      ],
      "line": 27,
      "id": "run-ios-to-login;enter-homepage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10802422394,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I open application IOS",
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
  "location": "TC_LoginPage_BT.i_click_skip_button()"
});
formatter.result({
  "duration": 6544980293,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Enter Homepage",
  "description": "",
  "id": "run-ios-to-login;enter-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@tag2"
    },
    {
      "line": 1,
      "name": "@SimulatorIOS"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I input email \"thu.nguuyen@smartdev.vn\" and password \"Test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I click login button of app",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I open homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click logout button",
  "keyword": "And "
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
  "duration": 21283045242,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_login()"
});
formatter.result({
  "duration": 10265721842,
  "status": "passed"
});
formatter.match({
  "location": "TC_LogOut_BT.i_open_homepage()"
});
formatter.result({
  "duration": 14947284,
  "status": "passed"
});
formatter.match({
  "location": "TC_LogOut_BT.i_click_logout_button()"
});
formatter.result({
  "duration": 13246089831,
  "status": "passed"
});
formatter.after({
  "duration": 656270148,
  "status": "passed"
});
});