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
  "duration": 13633290365,
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
  "duration": 6501848208,
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
  "duration": 23900147288,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_login()"
});
formatter.result({
  "duration": 11709260789,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_see_home_page()"
});
formatter.result({
  "duration": 115920532,
  "status": "passed"
});
formatter.match({
  "location": "TC_HomePage_BT.i_click_add_new_button()"
});
formatter.result({
  "duration": 15415763141,
  "status": "passed"
});
formatter.after({
  "duration": 888569625,
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
  "duration": 22458791615,
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
  "duration": 11131134756,
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
  "duration": 31289512262,
  "status": "passed"
});
formatter.match({
  "location": "TC_LoginPage_BT.i_click_login()"
});
formatter.result({
  "duration": 11605282331,
  "status": "passed"
});
formatter.match({
  "location": "TC_LogOut_BT.i_open_homepage()"
});
formatter.result({
  "duration": 58176239,
  "status": "passed"
});
formatter.match({
  "location": "TC_LogOut_BT.i_click_logout_button()"
});
formatter.result({
  "duration": 15181426552,
  "status": "passed"
});
formatter.after({
  "duration": 669834811,
  "status": "passed"
});
formatter.uri("RegisterTo_ZP_Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Register to ZingPoll",
  "description": "I want to registered successfull",
  "id": "register-to-zingpoll",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Register with empty new user",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on ZingPoll website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I input username \u003cusername\u003e and password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "register-to-zingpoll;register-with-empty-new-user;;1"
    },
    {
      "cells": [
        "hieutrandn01@gmail.com",
        "123456"
      ],
      "line": 12,
      "id": "register-to-zingpoll;register-with-empty-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2802277509,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Register with empty new user",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on ZingPoll website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I input username hieutrandn01@gmail.com and password 123456",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TC_RegisterPageSteps_ZP.i_am_on_ZingPoll_website()"
});
formatter.result({
  "duration": 10568044486,
  "status": "passed"
});
formatter.match({
  "location": "TC_RegisterPageSteps_ZP.i_click_the_SignIn_button()"
});
formatter.result({
  "duration": 5246003489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hieutrandn01@gmail.com",
      "offset": 17
    },
    {
      "val": "123456",
      "offset": 53
    }
  ],
  "location": "TC_RegisterPageSteps_ZP.i_input_username_and_password(String,String)"
});
formatter.result({
  "duration": 4996074334,
  "status": "passed"
});
formatter.after({
  "duration": 247313717,
  "status": "passed"
});
formatter.uri("calculatorScenario.feature");
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
  "duration": 10224415098,
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
  "location": "TC_calculatorScenario.i_open_the_Calculator_application()"
});
formatter.result({
  "duration": 208464711,
  "status": "passed"
});
formatter.match({
  "location": "TC_calculatorScenario.i_click_number_seven()"
});
formatter.result({
  "duration": 1373076004,
  "status": "passed"
});
formatter.match({
  "location": "TC_calculatorScenario.i_click_plus()"
});
formatter.result({
  "duration": 1713225133,
  "status": "passed"
});
formatter.match({
  "location": "TC_calculatorScenario.i_click_number_two()"
});
formatter.result({
  "duration": 1580917004,
  "status": "passed"
});
formatter.match({
  "location": "TC_calculatorScenario.i_click_equal()"
});
formatter.result({
  "duration": 1965535726,
  "status": "passed"
});
formatter.match({
  "location": "TC_calculatorScenario.i_validate_value()"
});
formatter.result({
  "duration": 1074053846,
  "status": "passed"
});
formatter.after({
  "duration": 2475787467,
  "status": "passed"
});
});