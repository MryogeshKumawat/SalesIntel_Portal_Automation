$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:TC_01_Login_Page_Validation.feature");
formatter.feature({
  "name": "Validate application login Page",
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Login Screen Content",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Validate Login Page Title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Validate_Page_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Email Field is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Email_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Password Field is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Password_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Remember Me Checkbox is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Remember_Me()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Forgot Password Link is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Forgot_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate FAQ Link is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_FAQ()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Login Button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Tapping only Login Button",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Error Text when Tried with Invalid Username and Invalid Password",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Validate_InvalidUsername_InvalidPassword_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Error Text when Tried with Invalid Password and Invalid Username",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_InvalidPassword_InvalidUsername_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Login with Invalid Username and Valid Password",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Invalid Username",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_invalid_username()"
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
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Error Text when Tried with Invalid Username and Valid Password",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Validate_InvalidUsername_validPassword_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Login with Valid Username and Invalid Password",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Username Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_Clear_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Invalid Password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Login with Invalid Username and Invalid Password",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Username Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_Clear_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Invalid Username",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Invalid Password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Error Text when Tried with Invalid Username and Valid Password",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Validate_InvalidUsername_validPassword_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Forget Password",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Forget Password",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Forgot_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Forget Email Address Field is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_verify_Forget_Email_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Forget Email Address",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_the_Forget_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Reset Password Button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_verify_Forget_Reset_Email_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Reset Password Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Resert_Password_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Remember Me",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Remember Me",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Remember_Me()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Remember Me",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Remember_Me()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Username Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_Clear_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
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
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_02_Search_By_Contact_Name.feature");
formatter.feature({
  "name": "Validate Search By Contact Name",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
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
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search Page Content is displayed",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Radio Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Radio_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Contact Name is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_verify_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Name Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify First Name is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_verify_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Last Name is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_verify_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search without Firstname and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by FirstName and LastName using Integer Value",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Name Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name with Integer Value",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName_with_Integer_Value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name with Integer Value",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName_with_Integer_Value()"
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
  "name": "Verify Error Message is displayed When search with FirstName and LastName only Integer",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_verify_ContactSearchwithinteger()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Valid FirstName and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName()"
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
  "name": "Validate Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application add multiple contact into New Contact List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Name Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName()"
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
  "name": "Validate Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Multiple contact to Add Contact List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_select_multiple_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Append Contact details into the List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_append_multiple_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add all to List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_add_all_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Create New Contact List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_create_new_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter New Contact List",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_the_contact_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Create New Contact List Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_create_new_list_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Contact into the Contact List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On List Tab",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_List_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Preview Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Select_Preview_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application add multiple contact into Existing Contact List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Name Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name to search",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName_to_search()"
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
  "name": "Validate Contact Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Contact_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Multiple contact to Add Contact List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_select_multiple_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Append Contact details into the List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_append_multiple_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add all to List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_add_all_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add all Contact to Existing List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Add_all_Contact_Existing_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact List Drop Down Option",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_List_Drop_Down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add Contact List Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Add_list_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Delete Contact List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On List Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_List_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete Contact List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Delete_Contact_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Delete Contact List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_delete_contact_list()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Reveal Contact1 Search by Valid FirstName and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On SalesIntel Tab",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_SalesIntel_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search First Name1",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search Last Name1",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName1()"
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
  "name": "Click On Contact Search1",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_search1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the Total Reveal Count",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_get_Total_Reveal_Count()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Reveal Contact2 Search by Valid FirstName and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search First Name2",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search Last Name2",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName2()"
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
  "name": "Click On Contact Search2",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_search2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the Total Reveal Count",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_get_Total_Reveal_Count()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Reveal Contact3 Search by Valid FirstName and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search First Name3",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search Last Name3",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName3()"
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
  "name": "Click On Contact Search3",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_search3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the Total Reveal Count",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_get_Total_Reveal_Count()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Reveal Contact4 Search by Valid FirstName and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search First Name4",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search Last Name4",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName4()"
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
  "name": "Click On Contact Search4",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_search4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the Total Reveal Count",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_get_Total_Reveal_Count()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Reveal Contact5 Search by Valid FirstName and LastName",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_clear_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the Text in Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clear_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search First Name5",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_FirstName5()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search Last Name5",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_LastName5()"
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
  "name": "Click On Contact Search5",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_search5()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the Total Reveal Count",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_get_Total_Reveal_Count()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_03_Search_By_Company.feature");
formatter.feature({
  "name": "Validate Search By Company",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
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
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search without Company Name",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Company Radio Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Company_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Valid Company Name",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Company",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_company_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Company Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_company_name()"
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
  "name": "Validate Company Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Company_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application add multiple Company into New Company List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Company",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_company_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Company Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_company_name()"
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
  "name": "Validate Company Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Company_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Multiple Company to Add Company List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_select_multiple_Company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Append Company details into the List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_append_multiple_Company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add all to List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_add_all_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Create New Company List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_create_new_Company_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter New Company List",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_the_company_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Create New Company List Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_create_new_Company_list_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application add multiple Company into Existing Company List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On SalesIntel Tab",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_SalesIntel_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Company",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_company_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Company Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_company_name()"
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
  "name": "Validate Company Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Validate_Company_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Multiple Company to Add Company List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_select_multiple_Company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Append Company details into the List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_append_multiple_Company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add all to List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_add_all_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add Existing Company List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_add_Existing_Company_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Company List Drop Down Option",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Company_List_Drop_Down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add Company List Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Add_Company_list_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Delete Company List",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On List Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_List_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete Company List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Delete_Company_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Delete Company List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_delete_company_list()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_04_Contact_Sort_List.feature");
formatter.feature({
  "name": "Validate Contact by Sort Option",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
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
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Name",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Radio Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Radio_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Contact Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Contact Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Job",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Job Title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Job()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Job Title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Job()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Job Level",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Job Level",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Job Level",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Dept",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Dept",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Dept()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Dept",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Dept()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Comp",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Comp",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Comp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Comp",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Comp()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Location",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Location",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Location",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_05_Company_Sort_List.feature");
formatter.feature({
  "name": "Validate Contact by Sort Option",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
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
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Name",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Company Radio Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Company_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Contact Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Contact Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Job",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Job Title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Job()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Job Title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Job()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Job Level",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Job Level",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Job Level",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Level()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Dept",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Dept",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Dept()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Dept",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Dept()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Comp",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Comp",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Comp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Comp",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Comp()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application to Sort the Contact Details by Location",
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
formatter.before({
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
  "name": "Click On Sort Icon For Display Contact based on Location",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Sort Icon For Display Contact based on Location",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Sort_Icon_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_06_ROD_Contact.feature");
formatter.feature({
  "name": "Validate RoD Contacts Verification",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Universal Valid Username",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_Universal_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Universal Valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_Universal_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search Contact for ROD",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Radio Button for Universal User",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Radio_Button_Universal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Contact Name is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_verify_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Name Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify First Name is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_verify_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Last Name is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_verify_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Universal First Name",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_the_Unviersal_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Universal Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_Universal_LastName()"
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
  "name": "Click On Searched Contact",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Universal_search()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application \"Request Verification\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify Request Verification Button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_verify_Request_Verification_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Request Verification Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Request_Verification()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application for Validate \"Requested Verification\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify Requested Verification Status",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_verify_Request_Verification_Status_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Contact Requested in ROD Section",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify RoD Tab is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_verify_RoD_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On RoD Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_RoD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Requested ROD is Displayed in ROD tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_verify_Requested_ROD_In_ROD_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_07_Search_By_Job_Department.feature");
formatter.feature({
  "name": "Validate Search By Job Department",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate SalesIntel application login Valid User Username and Valid Password",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "And "
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
  "keyword": "And "
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search By Job Department section contents",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify Role Section is displayed",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_verify_Role_Section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Job Department is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_verify_Job_Department()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search without Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Finance Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Finance Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Finance_Department_Filter()"
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
  "name": "Check Finance Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Finance_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by HR Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on HR Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_HR_Department_Filter()"
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
  "name": "Check HR Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Hr_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by IT Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on IT Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_IT_Department_Filter()"
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
  "name": "Check IT Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_IT_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Legal Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Legal Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Legal_Department_Filter()"
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
  "name": "Check Legal Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Legal_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Marketing Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Marketing Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Marketing_Department_Filter()"
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
  "name": "Check Marketing Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Marketing_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Operations Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Operations Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Operations_Department_Filter()"
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
  "name": "Check Operations Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Operations_Department_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Procurement Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Procurement Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Procurement_Department_Filter()"
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
  "name": "Check Procurement Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Procurement_Department_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by R\u0026D Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on R\u0026D Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_RnD_Department_Filter()"
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
  "name": "Check R\u0026D Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_RnD_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Sales Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sales Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Sales_Department_Filter()"
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
  "name": "Check Sales Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Sales_Department_In_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Cross Functional Job Department Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job Department Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_On_JobDepartment_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Cross Functional Department Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Cross_Functional_Department_Filter()"
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
  "name": "Check Cross Functional Department in Search Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_Cross_Functional_Department_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:TC_08_Search_By_Job_Level.feature");
formatter.feature({
  "name": "Validate Search By Job Level",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate application Job Level is displayed",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Job Level Filter is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_verify_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Board Member Job Level Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Job Level Filter",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Board Member Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Board_Member_Job_Level_Filter()"
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
  "name": "Check Board Member Job Level in Result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Check_BoardMember_Job_Level_In_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by C-level Executive Job Level Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On C-Level Executive Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Clevel_Executive_Job_Level_Filter()"
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
  "name": "Check C-level Executive Job level in Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Check_Clevel_Executive_Job_Level_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Voice Presidents Job Level Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Vice Presidents Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Voice_Precident_Job_Level_Filter()"
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
  "name": "Check Vice Presidents Job level in Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Check_Vice_President_Job_Level_IN_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Directors Job Level Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Directors Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Directors_Job_Level_Filter()"
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
  "name": "Check Directors Job level in Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Check_Directors_Job_Level_IN_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Managers Job Level Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Managers Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Managers_Job_Level_Filter()"
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
  "name": "Check Managers Job level in Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Check_Managers_Job_Level_IN_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Search by Key Influencers Job Level Filter",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Clear Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Click_clear_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Do Not Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_do_not_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Job_Level_Filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Key Influencers Job Level Filter",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Key_Influencers_Job_Level_Filter()"
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
  "name": "Check Key Influencers Job level in Result",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Check_Key_Influencers_Job_Level_IN_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate application Logout",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});