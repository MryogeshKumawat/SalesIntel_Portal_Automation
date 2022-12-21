$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/D:/Automation/SalesIntel_Portal_Automation-master/SalesIntel_Portal_Automation-master/src/test/resources/Features/New_UI_View/TC_21_Search_By_Last_Modified.feature");
formatter.feature({
  "name": "To validate Search by Last Modified Filter",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate SalesIntel application Launching application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Valid User Username and Valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Last Modified using Custom filter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Check Whether Last Modified Filter is Displayed",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Check_Last_Modified_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Last Modified Date Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Last_Modified_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Last Modified Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Last_Modified_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Custom filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Last_Modified_Custom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check particular date is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Check_Custom_Date_Is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Particular Date",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Custom_Date_Is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get The Selected Date and Store it",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Get_The_Selected_Date_And_Store_It()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Radio Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Radio_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Reveal Contact Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Reveal_Contact_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the First Contact in Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Searched_Contact()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div[@class\u003d\u0027tbody\u0027])[1]\"}\n  (Session info: chrome\u003d108.0.5359.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-CU7SE24\u0027, ip: \u0027172.16.17.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.2.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.124, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\Astegic\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:57450}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7082d5dca827bf717ecce69a5e581c11\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027tbody\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy25.click(Unknown Source)\r\n\tat org.base.Global.clickButton(Global.java:77)\r\n\tat org.stepdefinition.Steps.I_Click_Searched_Contact(Steps.java:233)\r\n\tat ✽.Click on the First Contact in Search Result(file:/D:/Automation/SalesIntel_Portal_Automation-master/SalesIntel_Portal_Automation-master/src/test/resources/Features/New_UI_View/TC_21_Search_By_Last_Modified.feature:103)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "get the Contact Work Email and store it",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Copy_And_Store_The_Work_Email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Launch Research Portal",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.launch_the_Research_Portal_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login To Research Portal",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_Login_To_Research()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search Contact With Email",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Search_With_Email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the Last modified Date In Research Portal Where updated within the Selected Date",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Validate_Last_Modified_Date_In_Research_Portal_For_Custom_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});