$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BT/skipScreen_BT_Scenario.feature");
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
  "duration": 22156702804,
  "error_message": "java.lang.NullPointerException\n\tat utility.Hook.setUpBT(Hook.java:67)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:222)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:210)\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:200)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:163)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "TC_SkipPage_BT.i_swide_screen2()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC_SkipPage_BT.i_swide_screen3()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC_SkipPage_BT.i_click_finish_button()"
});
formatter.result({
  "status": "skipped"
});
});