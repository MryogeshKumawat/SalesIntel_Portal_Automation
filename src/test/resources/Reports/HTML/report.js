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
  "status": "passed"
});
formatter.step({
  "name": "get the Contact Work Email and store it",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Copy_And_Store_The_Work_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch Research Portal",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.launch_the_Research_Portal_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login To Research Portal",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_Login_To_Research()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Contact With Email",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Search_With_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Last modified Date In Research Portal Where updated within the Selected Date",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Validate_Last_Modified_Date_In_Research_Portal_For_Custom_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});