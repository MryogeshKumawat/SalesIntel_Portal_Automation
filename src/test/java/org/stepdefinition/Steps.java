package org.stepdefinition;

import com.github.dockerjava.api.model.HealthCheck;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import net.bytebuddy.asm.Advice;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.ThrowableInformation;
import org.apache.velocity.runtime.directive.contrib.For;
import org.base.Global;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.pagemanager.PageObjectManager;
import org.testng.Assert;

import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Steps extends Global {
	public static Logger log;
	public static WebDriver driver;
	public static List<String> Contactlist, Comparelist;


	//	@Given("Launch the url")
//	public void launch_the_url() {
//		driver = getDriver();
//		maximizeWindow();
//		implicitWait();
//		launchURL(readPropertyFileData().getProperty("url"));
//	}
	@Given("Launch the url")
	public void launch_the_url() throws Throwable {
		driver = getDriver();
		maximizeWindow();
		implicitWait();
		launchURL(ReadDatafromJson("Contact_Name", "url"));
	}
//
//	@When("Enter Valid Username")
//	public void i_enter_the_username() throws Throwable {
//		log = readLog4jData();
//		log.info("User is navigate to SalesIntel site");
//		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
//				readPropertyFileData().getProperty("UserName"));
//		log.info("User enter the correct username");
//	}

	@When("Enter Valid Username")
	public void i_enter_the_username() throws Throwable {
		log = readLog4jData();
		log.info("User is navigate to SalesIntel site");
		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
				ReadDatafromJson("Contact_Name", "UserName"));
		log.info("User enter the correct username");
	}

	@When("Enter Universal Valid Username")
	public void i_enter_the_Universal_username() throws Throwable {
		log = readLog4jData();
		log.info("User is navigate to SalesIntel site");
		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
				ReadDatafromJson("Contact_Name", "UniversalUserName"));
		log.info("User enter the correct username");
	}

	//	@When("Enter Valid Password")
//	public void i_enter_the_password() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
//				readPropertyFileData().getProperty("Password"));
//		log.info("User enter the correct password");
//	}
	@When("Enter Valid Password")
	public void i_enter_the_password() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
				ReadDatafromJson("Contact_Name", "Password"));
		log.info("User enter the correct password");
	}

	@When("Enter Universal Valid Password")
	public void i_enter_the_Universal_password() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
				ReadDatafromJson("Contact_Name", "UniversalPassword"));
		log.info("User enter the correct password");
	}

	@Then("Click on Contact Name Button")
	public void I_Click_Contact_Name() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getContactName());
		log.info("User click the Contact Name Button");
		Thread.sleep(5000);
	}

	@Then("Click on Contact Radio Button")
	public void I_Click_Contact_Radio_Button() throws Throwable {
		Thread.sleep(15000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getnewContactradiobutton());
		log.info("User Click on Contact Radio Button");
		Thread.sleep(5000);
	}

	@Then("Click on Contact Radio Button for Universal User")
	public void I_Click_Contact_Radio_Button_Universal() throws Throwable {
		Thread.sleep(15000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getnewuniversalContactradiobutton());
		log.info("User Click on Contact Radio Buttonn");
		Thread.sleep(5000);
	}

	@Then("Click on Company Radio Button")
	public void I_Click_Company_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getnewCompanyradiobutton());
		log.info("User Click on Company Radio Button");
		Thread.sleep(5000);
	}

	@Then("Click on Contact Email Button")
	public void I_Click_Contact_Email() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getContactEmail());
		log.info("User click the Contact Email Filter");
	}
//	@When("Enter the First Name")
//	public void i_enter_the_FirstName() throws Throwable {
////		readCompleteDataFromEXcel();
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readPropertyFileData().getProperty("FirstName"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
//     	log.info("User enter the First Name");
//	}

	@When("Enter the First Name")
	public void i_enter_the_FirstName() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "FirstName"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("User enter the First Name");
	}

	@When("Enter the Universal First Name")
	public void i_enter_the_Unviersal_FirstName() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "UniversalFirstName"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("Enter the Universal First Name");
	}

	//	@When("Enter the Last Name")
//	public void i_enter_the_LastName() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),readPropertyFileData().getProperty("LastName"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
//		log.info("User enter the Last Name");
//	}
	@When("Enter the Last Name")
	public void i_enter_the_LastName() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "LastName"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("User enter the Last Name");
	}

	@When("Enter the Universal Last Name")
	public void i_enter_the_Universal_LastName() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "UniversalLastName"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Last Name");
	}

	@Then("Click on Search Button")
	public void I_Click_Search_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getSearchButton());
		log.info("User click on Search Button");
		Thread.sleep(10000);
	}

	@And("Click on the First Contact in Search Result")
	public void I_Click_Searched_Contact() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getFirstSearchedContact());
		log.info("User Click on the First Contact in Search Result");
		Thread.sleep(2000);
	}

	@Then("Click on Company Search Button")
	public void I_Click_Company_Search_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCompanySearchButton());
		log.info("User click the Contact Name Button");
		Thread.sleep(10000);
	}


	@Then("Validate Email Text Box is displayed")
	public void I_Validate_Email_TextBox() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getSearchButton());
		log.info("User click the Contact Name Button");
	}

	@Then("Validate Password Text Box is displayed")
	public void I_Validate_Password_TextBox() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getSearchButton());
		log.info("User click the Contact Name Button");
	}

	@Then("Click on FAQ")
	public void I_Click_FAQ() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getFaq());
		log.info("User click the Contact Name Button");
	}

	@Then("Click on Remember Me")
	public void I_Click_Remember_Me() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getRememberMe());
		log.info("User click the Contact Name Button");
	}

	@When("Click on Forget Password")
	public void I_Click_Forgot_Password() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getForgotPassword());
		log.info("User click the Contact Name Button");
	}

	@Then("Click On Login Button")
	public void I_Click_Login_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getLoginButton());
		log.info("User click Click On Login Button");
		Thread.sleep(10000);
	}

	@Then("Validate Email Field is displayed")
	public void I_Email_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getEmailPlaceholder().isDisplayed());
		log.info("Validate Email Field is displayed");
	}

	@Then("Validate Password Field is displayed")
	public void I_Validate_Password_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getPasswordPlaceholder().isDisplayed());
		log.info("Validate Password Field is displayed");
	}

	@Then("Validate Login Page Title is displayed")
	public void I_Validate_Page_Title() throws Throwable {
		log = readLog4jData();
		log.info("Validate Login Page Title is displayed");
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getLoginTitle().isDisplayed());
		log.info("Validate Login Page Title is displayed");
	}

	@Then("Validate FAQ Link is displayed")
	public void I_Validate_FAQ() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getFaq().isDisplayed());
		log.info("Validate FAQ Link is displayed");
	}

	@Then("Validate Remember Me Checkbox is displayed")
	public void I_Validate_Remember_Me() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getRememberMe().isDisplayed());
		log.info("Validate Remember Me Checkbox is displayed");
	}

	@Then("Validate Forgot Password Link is displayed")
	public void I_Validate_Forgot_Password() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getForgotPassword().isDisplayed());
		log.info("Validate Forgot Password Link is displayed");
	}

	@Then("Validate Login Button is displayed")
	public void I_Validate_Login_Button() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getLoginButton().isDisplayed());
		log.info("Validate Login Button is displayed");
	}
//	@When("Enter Invalid Username")
//	public void i_enter_invalid_username() {
//		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
//				readPropertyFileData().getProperty("InvalidUserName"));
//		log.info("User enter Invalid Usernamee");
//	}

	@When("Enter Invalid Username")
	public void i_enter_invalid_username() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(), ReadDatafromJson("Contact_Name", "InvalidUserName"));
		log.info("User enter Invalid Username");
	}

//	@When("Enter Invalid Password")
//	public void i_enter_invalid_password() {
//		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
//				readPropertyFileData().getProperty("InvalidPassword"));
//		log.info("User enter Enter Invalid Password");
//	}

	@When("Enter Invalid Password")
	public void i_enter_invalid_password() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(), ReadDatafromJson("Contact_Name", "InvalidPassword"));
		log.info("User enter Enter Invalid Password");
	}

	@Then("Validate Error Text when Tried with Invalid Username and Valid Password")
	public void I_Validate_InvalidUsername_validPassword_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getInvalidUsernameResult().isDisplayed());
		log.info("Validate Error Text when Tried with Invalid Username and Valid Password");
	}

	@Then("Validate Error Text when Tried with Invalid Username and Invalid Password")
	public void I_Validate_InvalidUsername_InvalidPassword_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getInvalidUsernamepasswordResult().isDisplayed());
		log.info("Validate Error Text when Tried with Invalid Username and Invalid Password");
	}

	@Then("Validate Error Text when Tried with Invalid Password and Invalid Username")
	public void I_Validate_InvalidPassword_InvalidUsername_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getInvalidpasswordUsernameResult().isDisplayed());
		log.info("Validate Error Text when Tried with Invalid Password and Invalid Username");
	}

	@When("Verify Contact Name is displayed")
	public void I_verify_Contact_Name() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getContactName().isDisplayed());
		log.info("Verify Contact Name is displayed");
	}

	@When("Verify First Name is displayed")
	public void i_verify_FirstName() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getFirstName().isDisplayed());
		log.info("Verify First Name is displayed");
		Thread.sleep(5000);
	}

	@When("Verify Last Name is displayed")
	public void i_verify_LastName() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getLastName().isDisplayed());
		log.info("Verify Last Name is displayed");
		Thread.sleep(5000);
	}

	@When("Verify Individual section is displayed")
	public void i_verify_Individualsection() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getIndividualsection().isDisplayed());
		log.info("Verify Individual section is displayed");
		Thread.sleep(5000);
	}

	//	@When("Enter the First Name with Integer Value")
//	public void i_enter_the_FirstName_with_Integer_Value() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),
//				readPropertyFileData().getProperty("FirstName_Integer"));
//		log.info("User enter the First Name");
//		Thread.sleep(3000);
//	}
	@When("Enter the First Name with Integer Value")
	public void i_enter_the_FirstName_with_Integer_Value() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),
				ReadDatafromJson("Contact_Name", "FirstName_Integer"));
		log.info("User enter the First Name");
		Thread.sleep(3000);
	}

	//	@When("Enter the Last Name with Integer Value")
//	public void i_enter_the_LastName_with_Integer_Value() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),
//				readPropertyFileData().getProperty("LastName_Integer"));
//		log.info("User enter the Last Name");
//		Thread.sleep(3000);
//	}
	@When("Enter the Last Name with Integer Value")
	public void i_enter_the_LastName_with_Integer_Value() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),
				ReadDatafromJson("Contact_Name", "LastName_Integer"));
		log.info("User enter the Last Name");
		Thread.sleep(3000);
	}

	@And("Verify Error Message is displayed When search with FirstName and LastName only Integer")
	public void i_verify_ContactSearchwithinteger() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getContactSearchwithInteger().isDisplayed());
		log.info("Verify Individual section is displayed");
		Thread.sleep(10000);
	}

	@When("Verify Forget Email Address Field is displayed")
	public void i_verify_Forget_Email_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getForgetPasswordEmail().isDisplayed());
		log.info("Verify Forget Email Address Field is displayed");
		Thread.sleep(5000);
	}
//	@When("Enter Forget Email Address")
//	public void i_enter_the_Forget_Email() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getForgetPasswordEmail(),
//				readPropertyFileData().getProperty("Email"));
//		log.info("Enter Forget Email Address");
//		Thread.sleep(5000);
//	}

	@When("Enter Forget Email Address")
	public void i_enter_the_Forget_Email() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getForgetPasswordEmail(),
				readPropertyFileData().getProperty("Email"));
		log.info("Enter Forget Email Address");
		Thread.sleep(5000);
	}

	@When("Verify Reset Password Button is displayed")
	public void i_verify_Forget_Reset_Email_Field() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getResetPasswordButton().isDisplayed());
		log.info("Verify Forget Email Address Field is displayed");
		Thread.sleep(3000);
	}

	@And("Click On Reset Password Button")
	public void I_Click_Resert_Password_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getResetPasswordButton());
		log.info("User click Click On Login Button");
		Thread.sleep(3000);
	}

	@When("Verify Contact Email is displayed")
	public void I_verify_Contact_Email() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getContactEmail().isDisplayed());
		log.info("Verify Contact Name is displayed");
	}

	@And("Click On Contact Email")
	public void I_Click_Contact_Email_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getContactEmail());
		log.info("User click Click On Login Button");
	}

	@And("Verify Error Message is displayed When search with Invalid Email Address")
	public void i_verify_ContactSearchwithinvalidEmail() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getContactSearchwithInteger().isDisplayed());
		log.info("Verify Individual section is displayed");
	}

	//	@When("Enter Contact Email Address")
//	public void i_enter_the_Contact_Email() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getContactEmailInputbox(),
//				readPropertyFileData().getProperty("Email"));
//		log.info("Enter Forget Email Address");
//	}
	@When("Enter Contact Email Address")
	public void i_enter_the_Contact_Email() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getContactEmailInputbox(),
				ReadDatafromJson("Contact_Name", "Email1"));
		log.info("Enter Contact Email Address");
	}

	/*
	@Then("Clear Text in Password Field")
	public void I_clear_text_Username() {
		clickButton(PageObjectManager.getInstance().getLoginPage().getForgotPassword().clear());
		driver.findElement(By.xpath(PageObjectManager.getInstance().getLoginPage().getForgotPassword()).clear());
		log.info("User click the Contact Name Button");
	}
*/
	@When("Clear the Text in Username Field")
	public void i_Clear_username() throws Throwable {
		clearText(PageObjectManager.getInstance().getLoginPage().getUserName());
		log.info("Clear the Text in Username Field");
	}

	@When("Clear the Text in Password Field")
	public void i_clear_password() throws Throwable {
		clearText(PageObjectManager.getInstance().getLoginPage().getPassword());
		log.info("Clear the Text in Password Field");
	}

	@When("Clear the Text in First Name Field")
	public void i_clear_the_FirstName() throws Throwable {
		clearText(PageObjectManager.getInstance().getLoginPage().getFirstName());
		log.info("Clear the Text in First Name Field");
	}

	@When("Clear the Text in Last Name Field")
	public void i_clear_the_LastName() throws Throwable {
		clearText(PageObjectManager.getInstance().getLoginPage().getLastName());
		log.info("Clear the Text in Last Name Field");
	}

	@When("Clear the Text in Contact Email Field")
	public void i_clear_the_contactEmail() throws Throwable {
		clearText(PageObjectManager.getInstance().getLoginPage().getContactEmailInputbox());
		log.info("User Clear the Text in Email Field");
	}

	//	@When("Enter Invalid Contact Email Address")
//	public void i_enter_the_invalid_Contact_Email() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getContactEmailInputbox(),
//				readPropertyFileData().getProperty("InvalidEmail"));
//		log.info("Enter Invalid Contact Email Address");
//	}
	@When("Enter Invalid Contact Email Address")
	public void i_enter_the_invalid_Contact_Email() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getContactEmailInputbox(),
				ReadDatafromJson("Contact_Name", "InvalidEmail"));
		log.info("User Enter Invalid Contact Email Address");
	}

	@And("Verify Job Department is displayed")
	public void I_verify_Job_Department() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getDepartmentFilter().isDisplayed());
		log.info("Verify Department Filter is Displayed");
	}

	@And("Click on Job Department Filter")
	public void I_Click_On_JobDepartment_Filter() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getDepartmentFilter());
		Thread.sleep(5000);
		log.info("User Click on Department Filter");
	}

	@Then("Click on Finance Department Filter")
	public void I_Click_Finance_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getFinanceDepartmentFilter());
		Thread.sleep(2000);
		log.info("User Click on Finance Department Filter");
	}

	@Then("Check Finance Department in Search Result")
	public void I_Check_Finance_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getFinanceDepartmentInResult().isDisplayed());
		log.info("User Check Finance Department in Search Result");
	}

	@Then("Click on HR Department Filter")
	public void I_Click_HR_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getHrDepartmentFilter());
		Thread.sleep(2000);
		log.info("User Click on HR Department Filter");
	}

	@Then("Check HR Department in Search Result")
	public void I_Check_Hr_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getHrDepartmentInResult().isDisplayed());
		log.info("User Check HR Department in Search Result");
	}

	@Then("Click on IT Department Filter")
	public void I_Click_IT_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getITDepartmentFilter());
		Thread.sleep(2000);
		log.info("User Click on IT Department Filter");
	}

	@Then("Check IT Department in Search Result")
	public void I_Check_IT_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getITDepartmentInResult().isDisplayed());
		log.info("User Check IT Department in Search Result");
	}

	@Then("Click on Legal Department Filter")
	public void I_Click_Legal_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getLegalDepartmentFilter());
		log.info("Click on Legal Department Filter");
	}

	@Then("Check Legal Department in Search Result")
	public void I_Check_Legal_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getLegalDepartmentInResult().isDisplayed());
		log.info("User Check Legal Department in Search Result");
	}

	@Then("Click on Marketing Department Filter")
	public void I_Click_Marketing_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getMarketingDepartmentFilter());
		log.info("Click on Marketing Department Filter");
	}

	@Then("Check Marketing Department in Search Result")
	public void I_Check_Marketing_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getMarketingDepartmentInResult().isDisplayed());
		log.info("User Check Marketing Department in Search Result");
	}


	@Then("Click on Operations Department Filter")
	public void I_Click_Operations_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getOperationsDepartmentFilter());
		log.info("Click on Operations Department Filter");
	}

	@Then("Check Operations Department in Search Result")
	public void I_Check_Operations_Department_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getOperationsDepartmentInResult().isDisplayed());
		log.info("User Check Operations Department in Search Result");
	}

	@Then("Click on Procurement Department Filter")
	public void I_Click_Procurement_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getProcurementDepartmentFilter());
		log.info("Click on Procurement Department Filter");
	}

	@Then("Check Procurement Department in Search Result")
	public void I_Check_Procurement_Department_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getProcurementDepartmentInResult().isDisplayed());
		log.info("User Check Procurement Department in Search Result");
	}

	@Then("Click on R&D Department Filter")
	public void I_Click_RnD_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getRndDepartmentFilter());
		log.info("Click on R&D Department Filter");
	}

	@Then("Check R&D Department in Search Result")
	public void I_Check_RnD_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getRndDepartmentInResult().isDisplayed());
		log.info("User Check R&D Department in Search Result");
	}

	@Then("Click on Sales Department Filter")
	public void I_Click_Sales_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getSalesDepartmentFilter());
		log.info("User Click on Sales Department Filter");
	}

	@Then("Check Sales Department in Search Result")
	public void I_Check_Sales_Department_In_Search_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getSalesDepartmentIn_Result().isDisplayed());
		log.info("User Check Sales Department in Search Result");
	}

	@Then("Click on Cross Functional Department Filter")
	public void I_Click_Cross_Functional_Department_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCrossFunctionalDepartmentFilter());
		log.info("User Click on Cross Functional Department Filter");
	}

	@Then("Check Cross Functional Department in Search Result")
	public void I_Check_Cross_Functional_Department_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getCrossFunctionalDepartmentInResult().isDisplayed());
		log.info("User Check Cross Functional Department in Search Result");
	}

	@When("Verify Job Level Filter is displayed")
	public void I_verify_Job_Level_Filter() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getContactJobLevel().isDisplayed());
		log.info("Verify Job Level Filter is displayed");
	}

	@And("Click On Job Level Filter")
	public void I_Click_Job_Level_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getContactJobLevel());
		log.info("User click Click On Job Level Filter");
	}

	@Then("Click on Board Member Job Level Filter")
	public void I_Click_Board_Member_Job_Level_Filter() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getBoardMemberJobLevelFilter());
		log.info("User Click on Board Member Job Level Filter");
	}

	@Then("Check Board Member Job Level in Result")
	public void I_Check_BoardMember_Job_Level_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getBoardMemberJobLevelInResult().isDisplayed());
		log.info("User Check Board Member Job Level in Result");
	}

	@When("Verify Role Section is displayed")
	public void I_verify_Role_Section() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getRolesection().isDisplayed());
		log.info("Verify Contact Name is displayed");
	}

	@When("Verify Job Level Select All Option is displayed")
	public void I_verify_job_level_Select_all() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getJobLevelSelectAll().isDisplayed());
		log.info("Verify Job Level Select All Option is displayed");
	}

	@And("Click On Job Level Select All Option")
	public void I_Click_Job_Level_Select_all_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getJobLevelSelectAll());
		log.info("User click Click On Login Button");
	}

	@When("Verify Job Level Board Member Option is displayed")
	public void I_verify_job_level_Board_Memeber() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getJobBoardMember().isDisplayed());
		log.info("erify Job Level Board Member Option is displayed");
	}

	@And("Click On Job Level Board Member Option")
	public void I_Click_Job_Level_Button_Board_Member() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getJobBoardMember());
		log.info("User click Click On Login Button");
	}

	@When("Verify Job Level C-Level Executive Option is displayed")
	public void I_verify_job_level_cexecutive() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getJobclevelexecutiveFilter().isDisplayed());
		log.info("Verify Job Level C-Level Executive Option is displayed");
	}

	@And("Click On C-Level Executive Job Level Filter")
	public void I_Click_Clevel_Executive_Job_Level_Filter() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getJobclevelexecutiveFilter());
		log.info("User Click On C-Level Executive Job Level Filter");
	}

	@And("Click On Vice Presidents Job Level Filter")
	public void I_Click_Voice_Precident_Job_Level_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getVicePrecidentsJobLevelFilter());
		log.info("Click On Vice Presidents Job Level Filter");
	}

	@And("Click On Directors Job Level Filter")
	public void I_Click_Directors_Job_Level_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getDirectorsJobLevelFilter());
		log.info("User Click On Directors Job Level Filter");
	}

	@And("Click On Managers Job Level Filter")
	public void I_Click_Managers_Job_Level_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getManagersJobLevelFilter());
		log.info("User Click On Managers Job Level Filter");
	}

	@And("Click On Key Influencers Job Level Filter")
	public void I_Click_Key_Influencers_Job_Level_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getKeyInfluencersJobLevelFilter());
		log.info("User Click On Key Influencers Job Level Filter");
	}


	@And("Verify Title filter is Displayed")
	public void I_Verify_Title_Filter() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getTitleFilter().isDisplayed());
		log.info("User Verify Title filter is Displayed");
	}

	@And("Click on Title Filter")
	public void I_Click_On_Title_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getTitleFilter());
		Thread.sleep(2000);
		log.info("User click on Title Filter");
	}

	@And("Enter Title in Title filter")
	public void I_Enter_Job_Title() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getTitleTextField(),
				ReadDatafromJson("Contact_Name", "Job_Title"));
		log.info("User enter Job Title in Tile text field");
		Thread.sleep(2000);
	}

	@Then("Check searched title is displayed in Search Result")
	public void I_Check_Title_In_Result() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getTitleInResult().isDisplayed());
		Thread.sleep(3000);
		log.info("User Check searched title is displayed in Search Result");
	}

	@When("Verify Location filter is Displayed")
	public void I_Verify_Location_Filter() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getLocationFilter().isDisplayed());
		log.info("User verify Location filter is Displayed");
	}

	@And("Click on Location Filter")
	public void I_Click_Location_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getLocationFilter());
		Thread.sleep(5000);
		log.info("User Click on Location Filter");
	}

	@And("Click on State Page")
	public void I_Click_On_State_Page() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getStatePage());
		log.info("User Click on State Page");
	}

	@And("Click on States Filter")
	public void I_Click_State_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getStateField());
		Thread.sleep(2000);
		log.info("User click on States Filter");
	}

	@And("Enter California State")
	public void I_Enter_California_State() throws Throwable {
		Thread.sleep(5000);
		enterData(PageObjectManager.getInstance().getLoginPage().getStateField(),
				ReadDatafromJson("Contact_Name", "StateName"));
		log.info("User Enter the California State");
	}

	@Then("Click on Location Tab")
	public void I_Click_Location_Tab() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().LocationTab());
		log.info("User click on Location Tab");
		Thread.sleep(10000);
	}

	@Then("Click on State Combobox")
	public void I_Click_State_Combobox() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().Statevalueselection());
		log.info("User click on Location Tab");
		Thread.sleep(10000);
	}

	@When("Enter the Data in State Combobox")
	public void i_enter_the_Data_State_Combobox() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().Statevalueselection(), ReadDatafromJson("Contact_Name", "Stateselection"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Data in State Combobox");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}


	@And("Click on California State")
	public void I_Click_On_California_State() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCaliforniaState());
		Thread.sleep(3000);
		log.info("User Click on California State");
	}

	@Then("Check CA for California State in Search Result")
	public void I_Check_California_In_Result() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getCaliforniaInResult().isDisplayed());
		log.info("User Check CA for California State in Search Result");
	}

	@And("Click on Zip code under USA")
	public void I_Click_On_Zip_Code_Page() throws Throwable {
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getZipCodePage());
		log.info("User click on Zip code page under USA");
		Thread.sleep(2000);
	}

	@And("Enter Zip Code in the text field")
	public void I_Enter_Zip_Code() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getZipCodeTextField(),
				ReadDatafromJson("Contact_Name", "Zip_Code"));
		log.info("User Enter the Zip Code");
	}

	@And("Select 100 Miles in the dropdown")
	public void I_Select_100_Miles_Under_Zip_Code() throws Throwable {
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getMilesSelectBox());
		Thread.sleep(2000);
		Select milesOptions = new Select(PageObjectManager.getInstance().getLoginPage().getMilesSelectBox());
		milesOptions.selectByVisibleText("100 Miles");
		Thread.sleep(2000);
		log.info("User select 100 Miles in the dropdown");
	}

	@And("Click on Metro Areas under USA")
	public void I_Click_On_Metro_Area_Page() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getMetroAreaPage());
		Thread.sleep(2000);
		log.info("User click on Metro Areas under USA");
	}

	@And("Click on Metro Areas Text Field")
	public void I_Click_on_Metro_Area_Text_Field() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getMetroAreaTextField());
		Thread.sleep(1000);
		log.info("User Click on Metro Areas Text Field");
	}

	@And("Click on Albany GA Metro Area")
	public void I_Click_On_Albany_GA_Metro_Area() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getAlbanyORMetroArea());
		Thread.sleep(2000);
		log.info("Click on Albany GA Metro Area");
	}

	@And("Enter Albany GA Metro Area")
	public void I_Enter_Albany_GA_Metro_Area() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getMetroAreaTextField(), ReadDatafromJson("Contact_Name", "Metro Area"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter Albany GA Metro Area");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@And("Click on Non USA Radio Button")
	public void I_Click_on_Non_USA_Radio_Button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getNonUsaRadioButton());
		log.info("User Click on Non USA Radio Button");
		Thread.sleep(2000);
	}

	@And("Click on Global Radio Button")
	public void I_Click_on_Global_Radio_Button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getGlobalRadioButton());
		log.info("User Click on Global Radio Button");
		Thread.sleep(2000);
	}

	@And("Click on Country Input Box")
	public void I_Click_On_Country_Box() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCountryBox());
		log.info("User click on Country Input Box");
		Thread.sleep(2000);
	}

	@And("Enter Non USA Country Name")
	public void I_Enter_Non_USA_Country_Name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getCountryBox(), ReadDatafromJson("Contact_Name", "Non-USA Country"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("User enter Non USA Country Name");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@And("Enter Global Country Name")
	public void I_Enter_Global_Country_Name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getCountryBox(), ReadDatafromJson("Contact_Name", "Global Country"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("User enter Global Country Name");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@Then("Check Country in Location in Search Result")
	public void I_Check_Country_Location_In_Result() throws Throwable {
		String NonUSACountry = ReadDatafromJson("Contact_Name", "Non-USA Country");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\'" + NonUSACountry + "\')]")).isDisplayed());
		log.info("Non USA Country is displayed under Location in Search Result");
		Thread.sleep(3000);
	}

	@Then("Check Global Country in Location in Search Result")
	public void I_Check_Global_Country_Location_In_Result() throws Throwable {
		String GlobalCountryName = ReadDatafromJson("Contact_Name", "Global Country");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\'" + GlobalCountryName + "\')]")).isDisplayed());
		log.info("Global Country is displayed under Location in Search Result");
		Thread.sleep(3000);
	}

	@When("Click on Keywords Filter")
	public void I_Click_On_Keywords_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getKeywordsFilter());
		log.info("User click on Keywords Filter");
	}

	@And("Click on Keywords Input box")
	public void I_Click_On_Keywords_Input_Box() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getKeywordsInputBox());
		log.info("User click on Keywords Input Box");
	}

	@And("Enter the Keyword")
	public void I_Enter_Keyword_In_Input_Box() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getKeywordsInputBox(), ReadDatafromJson("Contact_Name", "Keyword"));
		Thread.sleep(3000);
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("User Enter the Keyword");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@When("Click on Industry Filter")
	public void I_Click_On_Industry_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getIndustryFilter());
		log.info("Click on Industry Filter");
		Thread.sleep(2000);
	}

	@And("Click on NAICS or SIC Code page")
	public void I_Click_NAICSorSIC_Code_page() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getNAICSorSICpage());
		log.info("User Click on NAICS or SIC Code page");
		Thread.sleep(3000);
	}

	@And("Click on SIC Radio button")
	public void I_Click_SIC_Code_Radio_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getSICcodeRadioButton());
		log.info("User Click on SIC Radio button");
	}

	@When("Click on Revenue Filter")
	public void I_Click_On_Revenue_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getRevenueFilter());
		log.info("USer Click on Revenue Filter");
		Thread.sleep(2000);
	}

	@When("Click on Employee Size Filter")
	public void I_Click_On_Employee_Size_Filter() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getEmployeeSizeFilter());
		log.info("USer Click on Employee Size Filter");
		Thread.sleep(2000);
	}

	@And("Enter Minimum Revenue")
	public void I_Enter_Minimum_Revenue() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getMinRevenueInputBox(), ReadDatafromJson("Contact_Name", "Minimum Revenue"));
		log.info("User Enter Minimum Revenue");
		Thread.sleep(2000);
	}

	@And("Enter Minimum Employee Size")
	public void I_Enter_Minimum_Employee_Size() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getMinEmpSizeInputBox(), ReadDatafromJson("Contact_Name", "Minimum Employee Size"));
		log.info("User Enter Minimum Employee Size");
		Thread.sleep(2000);
	}

	@And("Enter Maximum Revenue")
	public void I_Enter_Maximum_Revenue() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getMaxRevenueInputBox(), ReadDatafromJson("Contact_Name", "Maximum Revenue"));
		log.info("User Enter Maximum Revenue");
		Thread.sleep(2000);
	}

	@And("Enter Maximum Employee Size")
	public void I_Enter_Maximum_Employee_Size() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getMaxEmpSizeInputBox(), ReadDatafromJson("Contact_Name", "Maximum Employee Size"));
		log.info("User Enter Maximum Employee Size");
		Thread.sleep(2000);
	}

	@Then("validate the Revenue in Search Result")
	public void I_Check_Revenue_In_Result() throws Throwable {
		Thread.sleep(2000);
		String RevenueInResult = PageObjectManager.getInstance().getLoginPage().getRevenueInSearchResult().getText();
		String RevenueCleaned = RevenueInResult.replaceAll("[A-Z]", "");
		double RevenueDouble = Double.parseDouble(RevenueCleaned);
		int RevenueInteger = (int) RevenueDouble;
		int MinimumRevenue = Integer.parseInt(ReadDatafromJson("Contact_Name", "Minimum Revenue"));
		int MaximumRevenue = Integer.parseInt(ReadDatafromJson("Contact_Name", "Maximum Revenue"));
		if (RevenueInteger >= MinimumRevenue && RevenueInteger <= MaximumRevenue) {
			System.out.println("Revenue Range is From " + MinimumRevenue + " To " + MaximumRevenue + " and Revenue in Searched Result is " + RevenueInteger + "");
			log.info("User Validated that Searched Revenue is Between the Input Range");
		} else {
			System.out.println("Revenue Range is From " + MinimumRevenue + " To " + MaximumRevenue + " and Revenue in Searched Result is " + RevenueInteger + "");
			log.info("User Validated that Searched Revenue is Out of the Input Range");
		}
		Thread.sleep(3000);
	}

	@Then("validate the Employee Size in Search Result")
	public void I_Check_Employee_Size_In_Result() throws Throwable {
		Thread.sleep(2000);
		String EmpSizeInResult = PageObjectManager.getInstance().getLoginPage().getEmpSizeInSearchResult().getText();
//		String RevenueCleaned = RevenueInResult.replaceAll("[A-Z]", "");
//		double RevenueDouble = Double.parseDouble(RevenueCleaned);
		int EmpSizeInteger = Integer.parseInt(EmpSizeInResult);
		int MinimumEmpSize = Integer.parseInt(ReadDatafromJson("Contact_Name", "Minimum Employee Size"));
		int MaximumEmpSize = Integer.parseInt(ReadDatafromJson("Contact_Name", "Maximum Employee Size"));
		if (EmpSizeInteger >= MinimumEmpSize && EmpSizeInteger <= MaximumEmpSize) {
			System.out.println("Employees / Size Range is From " + MinimumEmpSize + " To " + MaximumEmpSize + " and Company Size in Searched Result is " + EmpSizeInteger + "");
			log.info("User Validated that Searched Company size is Between the Input Range");
		} else {
			System.out.println("Employees / size Range is From " + MinimumEmpSize + " To " + MaximumEmpSize + " and Company size in Searched Result is " + EmpSizeInResult + "");
			log.info("User Validated that Searched Company Size is Out of the Input Range");
		}
		Thread.sleep(3000);
	}

	@When("Validate TECHNOGRAPHICS is displayed")
	public void I_Check_Technographics() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getTechnographics().isDisplayed());
		log.info("Technographics is Displayed");
	}

	@And("Click on Products Filter")
	public void I_Click_On_Producet() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getProductFilter());
		log.info("User Click on Products Filter");
		Thread.sleep(2000);
	}


	@And("Click on Provider Filter")
	public void I_Click_On_Provider() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getProviderFilter());
		log.info("User Click on Provider Filter");
		Thread.sleep(2000);
	}

	@And("Click on Categories Filter")
	public void I_Click_On_Categories() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCategoriesFilter());
		log.info("User Click on Categories Filter");
		Thread.sleep(2000);
	}

	@And("Select All Check box for Categories")
	public void I_Click_On_SelectALL_CheckBox_In_Categories() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getSelectAllCheckBoxForCategories());
		log.info("User Select All Check box for Categories");
		Thread.sleep(2000);
	}

	@And("Click on Technographic product text box")
	public void I_Click_On_Product_Text_Box() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getProductTextBox());
		log.info("Click on Technographic product text box");
		Thread.sleep(2000);
	}

	@And("Click on Technographic Provider text box")
	public void I_Click_On_Provider_Text_Box() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getProviderTextBox());
		log.info("Click on Technographic Provider text box");
		Thread.sleep(2000);
	}


	@And("Enter the product name")
	public void I_Enter_The_Product_Name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getProductTextBox(), ReadDatafromJson("Contact_Name", "Product Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		enterData(PageObjectManager.getInstance().getLoginPage().getProductTextBox(), ReadDatafromJson("Contact_Name", "Product Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getProductTextBox(), ReadDatafromJson("Contact_Name", "Product Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		log.info("User Enter the product name");
		Thread.sleep(5000);
	}

	@And("Enter the Provider name")
	public void I_Enter_The_Provider_Name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getProviderTextBox(), ReadDatafromJson("Contact_Name", "Provider Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		enterData(PageObjectManager.getInstance().getLoginPage().getProviderTextBox(), ReadDatafromJson("Contact_Name", "Provider Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getProviderTextBox(), ReadDatafromJson("Contact_Name", "Provider Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		log.info("User Enter the Provider name");
		Thread.sleep(5000);

	}

	@And("Enter the Category name")
	public void I_Enter_The_Category_Name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getCategoryTextBox(), ReadDatafromJson("Contact_Name", "Category Name1"));
		String CategoryName1 = ReadDatafromJson("Contact_Name" , "Category Name1");
		clickButton(driver.findElement(By.xpath("//span[contains(text(),\'" + CategoryName1 + "\')]")));
		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getCategoryTextBox());
		Thread.sleep(1000);
		enterData(PageObjectManager.getInstance().getLoginPage().getCategoryTextBox(), ReadDatafromJson("Contact_Name", "Category Name2"));
		String CategoryName2 = ReadDatafromJson("Contact_Name" , "Category Name2");
		clickButton(driver.findElement(By.xpath("//span[contains(text(),\'" + CategoryName2 + "\')]")));
		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getCategoryTextBox());
		Thread.sleep(1000);
		enterData(PageObjectManager.getInstance().getLoginPage().getCategoryTextBox(), ReadDatafromJson("Contact_Name", "Category Name3"));
		String CategoryName3 = ReadDatafromJson("Contact_Name" , "Category Name3");
		clickButton(driver.findElement(By.xpath("//span[contains(text(),\'" + CategoryName3 + "\')]")));
		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getCategoryTextBox());
		Thread.sleep(1000);
		log.info("User Enter the Category name");
		Thread.sleep(2000);

	}

	@And("Click on company name")
	public void I_Click_On_Company_Name() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getCompanyNameInResult());
		log.info("User Click on company name");
		Thread.sleep(3000);
	}

	@And("Click on All in Company detail page")
	public void I_Click_On_All() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getAllButton());
		log.info("User Click on All in Company detail page");
		Thread.sleep(3000);
	}

	@And("Click on All Button in Products")
	public void I_Click_On_All_Button_In_Products() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getALLButtonInProduct());
		log.info("User Click on All Button in Products");
		Thread.sleep(1000);
	}

	@And("Click on All Button in Provider")
	public void I_Click_On_All_Button_In_Provider() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getALLButtonInProvider());
		log.info("User Click on All Button in Providers");
		Thread.sleep(1000);
	}

	@And("Click on All Button in Category")
	public void I_Click_On_All_Button_In_Category() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getALLButtonInCategory());
		log.info("User Click on All Button in Category");
		Thread.sleep(1000);
	}

	@And("Click on None Button in Products")
	public void I_Click_On_None_Button_In_Products() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getNoneButtonInProduct());
		log.info("User Click on None Button in Products");
		Thread.sleep(1000);
	}

	@And("Click on None Button in Provider")
	public void I_Click_On_None_Button_In_Providers() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getNoneButtonInProvider());
		log.info("User Click on None Button in Providers");
		Thread.sleep(1000);
	}

	@And("Click on None Button in Category")
	public void I_Click_On_None_Button_In_Category() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getNoneButtonInCategory());
		log.info("User Click on None Button in Category");
		Thread.sleep(1000);
	}

	@And("Click on SalesIntel Logo")
	public void I_Click_On_SalesIntel_Logo() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getSalesIntelLogo());
		log.info("User Click on SalesIntel Logo");
		Thread.sleep(2000);
	}

	@When("Click on Back to search results")
	public void I_Click_On_Back_To_Search_Results() throws Throwable{
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getBackToSearchResults());
		log.info("USer Click on Back to search results");
		Thread.sleep(2000);
	}

	@And("Validate Back to Search button is displayed")
	public void I_Validate_Back_To_Search_Button() throws Throwable{
		Thread.sleep(2000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getBackToSearchResults().isDisplayed());
		log.info("User Validate Back to Search button is displayed");
	}

	@And("Enter the product name in Search textbox")
	public void I_Enter_Product_Name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name1"));
		log.info("Enter the product name in Search textbox");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}



//	@Then("Check the technographic product in Company detail page")
//	public void I_Check_Product_In_Result() throws Throwable {
//	String CopyProductFromResult = PageObjectManager.getInstance().getLoginPage().getProductInResult().getText();
//	String EnteredProduct = ReadDatafromJson("Contact_Name", "Product Name1");
//		if(CopyProductFromResult.contentEquals(EnteredProduct))
//
//	{
//		System.out.println("Searched Product is Displayed in Search Result");
//		log.info("Check the technographic product in Company detail page");
//	}
//		else
//		{
//		System.out.println("Searched Product is not Displayed in Search Result");
//		log.info("Check the technographic product in Company detail page and it's Failed");
//	    }
//
//}

		@Then("Check Any technographic product in Company detail page")
	public void I_Check_Any_Product_In_Result() throws Throwable {
			enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name1"));
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			boolean FirstProductForAny = false;
			try {
				if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
					FirstProductForAny = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
				}
			}
			catch (Exception e){
				System.out.println("First product is not displayed in Results");
			}

			Thread.sleep(2000);
			clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
			Thread.sleep(2000);
			enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name2"));
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			boolean SecondProductForAny = false;
			try {
				if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
					SecondProductForAny = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
				}
			}
			catch (Exception e) {
				System.out.println("Second product is not Displayed in Results");
			}

			Thread.sleep(2000);
			clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
			Thread.sleep(2000);
			enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name3"));
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			boolean ThirdProductForAny = false;
			try {
				if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
					ThirdProductForAny = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
				}
			}
			catch (Exception e){
				System.out.println("Third product is not displayed in Results");
			}
			Thread.sleep(2000);
			if (FirstProductForAny || SecondProductForAny || ThirdProductForAny){
				log.info("User Validated Any one technographic product in Company detail page");
			}
			else {
				log.info("Not even one Searched product is displayed in Company Detail page TC - Failed");
			}

		}

	@And("Check Any technographic Provider in Company detail page")
	public void I_Check_Any_Provider_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstProviderForAny = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				FirstProviderForAny = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First Provider is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondProviderForAny = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				SecondProviderForAny = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second Provider is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdProviderForAny = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				ThirdProviderForAny = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third Provider is not displayed in Results");
		}
		Thread.sleep(2000);
		if (FirstProviderForAny || SecondProviderForAny || ThirdProviderForAny){
			log.info("User Validated Any one technographic Provider in Company detail page");
		}
		else {
			log.info("Not even one Searched Provider is displayed in Company Detail page TC - Failed");
		}

	}


	@And("Check Any technographic Category in Company detail page")
	public void I_Check_Any_Category_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstCategoryForAny = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				FirstCategoryForAny = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First Category is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondCategoryForAny = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				SecondCategoryForAny = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second Category is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdCategoryForAny = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				ThirdCategoryForAny = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third Category is not displayed in Results");
		}
		Thread.sleep(2000);
		if (FirstCategoryForAny || SecondCategoryForAny || ThirdCategoryForAny){
			log.info("User Validated Any one technographic Category in Company detail page");
		}
		else {
			log.info("Not even one Searched Category is displayed in Company Detail page TC - Failed");
		}

	}



	@Then("Check Any technographic Category in Company detail page to Validate Select ALL")
	public void I_Check_Any_Categories_In_Company_Detail_To_Validate_Select_ALL() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed());
		log.info("User Check Any technographic Category in Company detail page to Validate Select ALL");
	}

	@Then("Check All technographic products in Company detail page")
	public void I_Check_All_Products_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstProductForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
				FirstProductForAll = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First product is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondProductForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
				SecondProductForAll = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second product is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdProductForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
				ThirdProductForAll = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third product is not displayed in Results");
		}
		Thread.sleep(2000);
		if (FirstProductForAll && SecondProductForAll && ThirdProductForAll){
			log.info("User Validated All technographic products in Company detail page");
		}
		else {
			log.info("All Searched product are not displayed in Company Detail page TC - Failed");
		}

	}

	@Then("Check All technographic Providers in Company detail page")
	public void I_Check_All_Providers_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstProviderForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				FirstProviderForAll = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First Provider is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondProviderForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				SecondProviderForAll = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second Provider is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdProviderForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				ThirdProviderForAll = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third Provider is not displayed in Results");
		}
		Thread.sleep(2000);
		if (FirstProviderForAll && SecondProviderForAll && ThirdProviderForAll){
			log.info("User Validated All technographic Providers in Company detail page");
		}
		else {
			log.info("All Searched Provider are not displayed in Company Detail page TC - Failed");
		}

	}

	@Then("Check All technographic Category in Company detail page")
	public void I_Check_All_Category_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstCategoryForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				FirstCategoryForAll = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First Category is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondCategoryForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				SecondCategoryForAll = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second Category is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdCategoryForAll = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				ThirdCategoryForAll = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third Category is not displayed in Results");
		}
		Thread.sleep(2000);
		if (FirstCategoryForAll && SecondCategoryForAll && ThirdCategoryForAll){
			log.info("User Validated All technographic Category in Company detail page");
		}
		else {
			log.info("All Searched Category are not displayed in Company Detail page TC - Failed");
		}

	}



	@Then("Check None of the technographic product is displayed in Company detail page")
	public void I_Check_None_Products_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstProductForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
				FirstProductForNone = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First product is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondProductForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
				SecondProductForNone = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second product is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Product Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdProductForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed()) {
				ThirdProductForNone = PageObjectManager.getInstance().getLoginPage().getProductInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third product is not displayed in Results");
		}
		Thread.sleep(2000);
		if (!FirstProductForNone && !SecondProductForNone && !ThirdProductForNone){
			log.info("User Validated None of the technographic products is displayed in Company detail page");
		}
		else {
			log.info("Any one product is displayed in Company Detail page TC - Failed");
		}

	}


	@Then("Check None of the technographic Provider is displayed in Company detail page")
	public void I_Check_None_Providers_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstProviderForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				FirstProviderForNone = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First Provider is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondProviderForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				SecondProviderForNone = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second Provider is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Provider Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdProviderForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed()) {
				ThirdProviderForNone = PageObjectManager.getInstance().getLoginPage().getProviderInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third Provider is not displayed in Results");
		}
		Thread.sleep(2000);
		if (!FirstProviderForNone && !SecondProviderForNone && !ThirdProviderForNone){
			log.info("User Validated None of the technographic Providers is displayed in Company detail page");
		}
		else {
			log.info("Any one Provider is displayed in Company Detail page TC - Failed");
		}

	}


	@Then("Check None of the technographic Category is displayed in Company detail page")
	public void I_Check_None_Category_In_Result() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name1"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean FirstCategoryForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				FirstCategoryForNone = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("First Category is not displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name2"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean SecondCategoryForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				SecondCategoryForNone = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e) {
			System.out.println("Second Category is not Displayed in Results");
		}

		Thread.sleep(2000);
		clearText(PageObjectManager.getInstance().getLoginPage().getSearchInputBox());
		Thread.sleep(2000);
		enterData(PageObjectManager.getInstance().getLoginPage().getSearchInputBox(), ReadDatafromJson("Contact_Name", "Category Name3"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean ThirdCategoryForNone = false;
		try {
			if (PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed()) {
				ThirdCategoryForNone = PageObjectManager.getInstance().getLoginPage().getCategoryInResult().isDisplayed();
			}
		}
		catch (Exception e){
			System.out.println("Third Category is not displayed in Results");
		}
		Thread.sleep(2000);
		if (!FirstCategoryForNone && !SecondCategoryForNone && !ThirdCategoryForNone){
			log.info("User Validated None of the technographic Category is displayed in Company detail page");
		}
		else {
			log.info("Any one Category is displayed in Company Detail page TC - Failed");
		}

	}



	@When("Check INTENT is displayed")
	public void I_Check_Intent() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getINTENT().isDisplayed());
		log.info("User Check INTENT is displayed");
		Thread.sleep(1000);
	}

	@And("Click on Score Threshold Filter")
	public void I_Click_On_Score_Threshold_Filter() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getScoreThresHoldFilter());
		log.info("User Click on Score Threshold Filter");
		Thread.sleep(2000);
	}

	@And("Click On Topic Threshold")
	public void I_Click_On_Topic_Threshold_Filter() throws Throwable{
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getTopicThresHoldFilter());
		log.info("User Click on Topic Threshold Filter");
		Thread.sleep(2000);
	}

	@And("Select Minimum Score as 86")
	public void I_Select_Score_Threshold() throws Throwable{
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		//actions.dragAndDropBy(Webelement, 0, 0).perform();
		actions.clickAndHold(PageObjectManager.getInstance().getLoginPage().ScoreThresholdMover()).moveToElement(PageObjectManager.getInstance().getLoginPage().ScoreThresholdMover(), 30, 0).release().
				perform();
		Thread.sleep(2000);
	}

	@And("Select Minimum Topic Threshold")
	public void I_Select_Topic_Threshold() throws Throwable{
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		//actions.dragAndDropBy(Webelement, 0, 0).perform();
		actions.clickAndHold(PageObjectManager.getInstance().getLoginPage().TopicThresholdMover()).moveToElement(PageObjectManager.getInstance().getLoginPage().TopicThresholdMover(), -95, 0).release().
				perform();
		Thread.sleep(2000);
	}

	@Then("Check Search result for Topic Threshold")
	public void I_Check_Topic_Threshold_In_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getTopicThresholdInResult().isDisplayed());
		log.info("Check Search result for Topic Threshold");
		Thread.sleep(2000);
	}

	@Then("Check Score in Result")
	public void I_Check_Score_In_Result() throws Throwable{
	String ScoreInResult =PageObjectManager.getInstance().getLoginPage().getNetflixTopicInResult().getText();
	String ScoreCleaned =ScoreInResult.replaceAll("[A-Z,a-z,(),\\s]", "");
	int ScoreINT = Integer.parseInt(ScoreCleaned);
	if (ScoreINT>=86 && ScoreINT<=100){
		System.out.println("Score in Result is between 86 and 100");
		log.info("User Check Score in Result");
	}
	else {
		System.out.println("Score in Result is not as Expected");
		log.info("User Check Score in Result and It's Failed");
	}
	}

	@And("Click on Topics")
	public void I_Click_On_Topics() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getTopicFilter());
		log.info("USer Click on Topics");
		Thread.sleep(1000);
	}

	@And("Select Netflix Topic")
	public void I_Select_Netflix_Topic() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getNetflixTopic());
		log.info("User Select Netflix Topic");
		Thread.sleep(2000);
	}

	@And("Select Hulu Topic")
	public void I_Select_Hulu_Topic() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getHuluTopic());
		log.info("User Select Hulu Topic");
		Thread.sleep(2000);
	}

	@Then("Check Searched Topic in Search Result")
	public void I_Check_Netflix_Topic_In_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getNetflixTopicInResult().isDisplayed());
		log.info("USer Check Searched Topic in Search Result");
		Thread.sleep(3000);
	}

	@And("Click on Industry Name Input box")
	public void I_Click_On_Industry_Name_Input_Box() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getIndustryNameInputBox());
		log.info("Click on Industry Name Input box");
		Thread.sleep(2000);
	}

	@And("Enter Industry Name")
	public void I_Enter_Industry_Name() throws Throwable{
		enterData(PageObjectManager.getInstance().getLoginPage().getIndustryNameInputBox(),ReadDatafromJson("Contact_Name", "Industry Name"));
		log.info("User enter Industry Name");
		Thread.sleep(2000);
	}

	@And("Click on Particular Industry")
	public void I_Click_On_Particular_Industry() throws Throwable{
		String IndustryName = ReadDatafromJson("Contact_Name" , "Industry Name");
		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + IndustryName + "\')]")));
		log.info("USer click on Particular Industry");
		Thread.sleep(2000);
	}

	@Then("Check the Industry in Search Result")
	public void I_Check_Industry_In_Result() throws Throwable{
		String IndustryInResult = ReadDatafromJson("Contact_Name" , "Industry Name");
		Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),\'" + IndustryInResult + "\')])[2]")).isDisplayed());
		log.info("User check the Industry in Search Result");
		Thread.sleep(5000);
	}

//	@Then("Check the Industry is not in Search Result")
//	public void I_Check_Industry_Is_Not_In_Result() throws Throwable{
//		String IndustryInResult = ReadDatafromJson("Contact_Name" , "Industry Name");
//		Assert.assertFalse(driver.findElement(By.xpath("(//*[contains(text(),\'" + IndustryInResult + "\')])[2]")).isDisplayed());
//		log.info("Check the Industry is not in Search Result");
//		Thread.sleep(5000);
//	}

	@Then("Check Industry for NAICS code in Search Result")
	public void I_Check_Industry_For_NAICS_In_Result() throws Throwable{
		String NAICSIndustryInResult = ReadDatafromJson("Contact_Name" , "NAICS Code Industry");
		Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),\'" + NAICSIndustryInResult + "\')])[1]")).isDisplayed());
		log.info("USer Check Industry for NAICS code in Search Result");
		Thread.sleep(5000);
	}

	@Then("Check Industry for SIC code in Search Result")
	public void I_Check_Industry_For_SIC_In_Result() throws Throwable{
		String SICIndustryInResult = ReadDatafromJson("Contact_Name" , "SIC Code Industry");
		Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),\'" + SICIndustryInResult + "\')])[1]")).isDisplayed());
		log.info("USer Check Industry for SIC code in Search Result");
		Thread.sleep(3000);
	}

	@And("CLick on NAICS Code input box")
	public void I_Click_On_NAICS_Code_Input_Box() throws Throwable{
		Thread.sleep(3000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getNAICScodeInputBox());
		log.info("User cLick on NAICS Code input box");
		Thread.sleep(2000);
	}

	@And("Enter NAICS Code")
	public void I_Enter_NAICS_Code() throws Throwable{
		enterData(PageObjectManager.getInstance().getLoginPage().getNAICScodeInputBox(), ReadDatafromJson("Contact_Name", "NAICS Code"));
		log.info("User Enters NAICS Code");
		Thread.sleep(2000);
	}

	@And("Enter SIC Code")
	public void I_Enter_SIC_Code() throws Throwable{
		enterData(PageObjectManager.getInstance().getLoginPage().getNAICScodeInputBox(), ReadDatafromJson("Contact_Name", "SIC Code"));
		log.info("User Enters SIC Code");
		Thread.sleep(2000);
	}

	@And("Click on None of Page")
	public void I_Click_On_None_Of_Page() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getNoneOfPage());
		log.info("User Click on None of Page");
		Thread.sleep(3000);
	}

	@And("Click on Select All Check Box")
	public void I_Click_On_Select_All_Check_Box() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getSelectAllCheckBox());
		log.info("User Select All Industries");
		Thread.sleep(2000);
	}

	@And("Click on Searched Contact")
	public void I_Click_On_Searched_Contact() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getSearchedContact());
		log.info("User Click on Searched Contact");
	}

	@Then("Check email in Search Result")
	public void I_Check_Email_In_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getEmailInResult().isDisplayed());
	}

	@Then("Check Vice Presidents Job level in Result")
	public void I_Check_Vice_President_Job_Level_IN_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getVicePresidentJobLevelInResult().isDisplayed());
		log.info("User Check Vice Presidents Job level in Result");
	}

	@Then("Check Directors Job level in Result")
	public void I_Check_Directors_Job_Level_IN_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getDirectorsJobLevelInResult().isDisplayed());
		log.info("User Check Directors Job level in Result");
	}

	@Then("Check Managers Job level in Result")
	public void I_Check_Managers_Job_Level_IN_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getManagersJobLevelInResult().isDisplayed());
		log.info("User Check Managers Job level in Result");
	}

	@Then("Check Key Influencers Job level in Result")
	public void I_Check_Key_Influencers_Job_Level_IN_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getKeyInfluencersJobLevelInResult().isDisplayed());
		Thread.sleep(5000);
		log.info("User Check Key Influencers Job level in Result");
	}

	@Then("Check C-level Executive Job level in Result")
	public void I_Check_Clevel_Executive_Job_Level_Result() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getClevelExecutiveJobLevelInResult().isDisplayed());
	}


	@When("Verify Job Level Vice President Option is displayed")
	public void I_verify_job_Vicepresident() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getJobVicepresident().isDisplayed());
		log.info("Verify Job Level Vice President Option is displayed");
	}

	@And("Click On Job Level Vice President Option")
	public void I_Click_Job_Level_Vicepresident_Button() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getJobVicepresident());
		log.info("User click Click On Login Button");
	}

	@When("Verify Job Level Directors Option is displayed")
	public void I_verify_job_level_directors() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getJobDirectors().isDisplayed());
		log.info("Verify Job Level Directors Option is displayed");
	}

	@And("Click On Job Level Directors Option")
	public void I_Click_Job_Level_Button_Directors() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getJobDirectors());
		log.info("User click Click On Login Button");
	}

	@When("Verify Job Level Managers Option is displayed")
	public void I_verify_job_level_managers() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getJobManagers().isDisplayed());
		log.info("Verify Job Level Managers Option is displayed");
	}

	@And("Click On Job Level Manager Option")
	public void I_Click_Job_Level_Button_Manager() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getJobManagers());
		log.info("User Click On Job Level Manager Option");
	}

	@When("Check Ranking filter is displayed")
	public void I_Check_Ranking_Filter() throws Throwable{
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getRankingFilter().isDisplayed());
		log.info("User Check Ranking filter is displayed");
		Thread.sleep(3000);
	}


	@And("Validate Search Result")
	public void I_Validate_Search_Result() throws Throwable {
		List<WebElement> allElement = driver.findElements(By.xpath("(//span[contains(text(),'Vikas')])[2]"));
		for (WebElement eachElement : allElement) {
			String actualValue = eachElement.getText();
			if (actualValue.contains("Vikas")) {
				System.out.println("The Actual Result values: " + actualValue);
				Assert.assertTrue(actualValue.contains("Vikas"));
			} else {
				System.out.println("Both Actual and Expected are mismatching");
			}
		}
		log.info("Validate Search Result");
	}

	@And("Validate Company Search Result")
	public void I_Validate_Company_Search_Result() {
		List<WebElement> allElement = driver.findElements(By.xpath("//*[contains(text(),'Adobe')]"));
		for (WebElement eachElement : allElement) {
			String actualValue = eachElement.getText();
			if (actualValue.contains("Adobe")) {
				System.out.println("The Actual Result values: " + actualValue);
				Assert.assertTrue(actualValue.contains("Adobe"));
			} else {
				System.out.println("Both Actual and Expected are mismatching");
			}
		}
		log.info("Validate Search Result");
	}

	//	@When("Enter the Search First Name1")
//	public void i_enter_the_FirstName1() throws Throwable {
////		readCompleteDataFromEXcel();
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), readPropertyFileData().getProperty("FirstName1"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
//		log.info("Enter the Search First Name1");
//	}
	@When("Enter the Search First Name1")
	public void i_enter_the_FirstName1() throws Throwable {
//		readCompleteDataFromEXcel();
		Thread.sleep(3000);
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "FirstName1"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("Enter the Search First Name1");
	}

	//	@When("Enter the Search Last Name1")
//	public void i_enter_the_LastName1() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),readPropertyFileData().getProperty("LastName1"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
//		log.info("Enter the Search Last Name1");
//	}
	@When("Enter the Search Last Name1")
	public void i_enter_the_LastName1() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "LastName1"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Search Last Name1");
	}

	@And("Click On Contact Search1")
	public void I_Click_Contact_search1() throws Throwable {
		String Contactsearchname1 = ReadDatafromJson("Contact_Name", "ContactSearch1");
//		driver.findElement(By.xpath("//*[contains(text(),\'"+Contactsearchname1+"\')]"));
		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + Contactsearchname1 + "\')]")));
		System.out.println("The Label Name is: " + driver.findElement(By.xpath("//*[contains(text(),\'" + Contactsearchname1 + "\')]")).getText());
//		clickButton(PageObjectManager.getInstance().getLoginPage().getContactSearch1());
		log.info("User click Click On Login Button");
		Thread.sleep(3000);
	}

	@And("Click On Searched Contact")
	public void I_Click_Contact_Universal_search() throws Throwable {
		clickButton(driver.findElement(By.xpath("(//span[@placement='auto' and contains(text(),'Kirst')])[1]")));
//		String UniversalContactsearchname = ReadDatafromJson("Contact_Name", "UniversalSearch");
////		driver.findElement(By.xpath("//*[contains(text(),\'"+Contactsearchname1+"\')]"));
//		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + UniversalContactsearchname + "\')]")));
//		System.out.println("The Label Name is: " + driver.findElement(By.xpath("//*[contains(text(),\'" + UniversalContactsearchname + "\')]")).getText());
////		clickButton(PageObjectManager.getInstance().getLoginPage().getContactSearch1());
		log.info("User click Click On Searched Contact for Request Verification");
		Thread.sleep(3000);
	}

	@When("Verify Reveal Contact Search Button is displayed")
	public void I_verify_Reveal_Search_Button() throws Throwable {
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getContactSearchReveal().isDisplayed());
		log.info("Verify Job Level Managers Option is displayed");
		Thread.sleep(3000);
	}

	@When("Verify Request Verification Button is displayed")
	public void I_verify_Request_Verification_Button() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().RequestVerificationButton().isDisplayed());
		log.info("Verify Request Verification Button is displayed");
		Thread.sleep(3000);
	}

	@When("Verify RoD Tab is displayed")
	public void I_verify_RoD_Tab() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().getRoDTab().isDisplayed());
		log.info("Verify Request Verification Button is displayed");
	}

	@And("Click On RoD Tab")
	public void I_Click_RoD() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getRoDTab());
		log.info("Click On Request Verification Button");
		Thread.sleep(3000);
	}
	@When("Verify Requested Verification Status")
	public void I_verify_Request_Verification_Status_Button() throws Throwable {
		Thread.sleep(10000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().RequestVerificationButton().isDisplayed());
		log.info("Verify Request Verification is clicked");
	}
	@And("Click On Request Verification Button")
	public void I_Click_Request_Verification() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().RequestVerificationButton());
		log.info("Click On Request Verification Button");
		Thread.sleep(3000);
	}

	@And("Click On Reveal Contact Search Button")
	public void I_Click_Reveal_Contact_search() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getContactSearchReveal());
		log.info("Click On Reveal Contact Search Button");
		Thread.sleep(3000);
	}

	@And("Get the Total Reveal Count")
	public void I_get_Total_Reveal_Count() throws Throwable {
//		gettext(PageObjectManager.getInstance().getLoginPage().getUpdatedReveal());
		System.out.println(PageObjectManager.getInstance().getLoginPage().getUpdatedReveal().getText());
		log.info("Get the Total Reveal Count");
		Thread.sleep(3000);
	}

	//	@When("Enter the Search First Name2")
//	public void i_enter_the_FirstName2() throws Throwable {
////		readCompleteDataFromEXcel();
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), readPropertyFileData().getProperty("FirstName2"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
//		log.info("Enter the Search First Name2");
//	}
	@When("Enter the Search First Name2")
	public void i_enter_the_FirstName2() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "FirstName2"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("Enter the Search First Name2");
	}

	//	@When("Enter the Search Last Name2")
//	public void i_enter_the_LastName2() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),readPropertyFileData().getProperty("LastName2"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
//		log.info("Enter the Search Last Name2");
//	}
	@When("Enter the Search Last Name2")
	public void i_enter_the_LastName2() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "LastName2"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Search Last Name2");
	}

	@And("Click On Contact Search2")
	public void I_Click_Contact_search2() throws Throwable {
		String Contactsearchname2 = ReadDatafromJson("Contact_Name", "ContactSearch2");
//		driver.findElement(By.xpath("//*[contains(text(),\'"+Contactsearchname1+"\')]"));
		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + Contactsearchname2 + "\')]")));
		log.info("User Click On Contact Search2");
		Thread.sleep(3000);
	}

	//	@When("Enter the Search First Name3")
//	public void i_enter_the_FirstName3() throws Throwable {
////		readCompleteDataFromEXcel();
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), readPropertyFileData().getProperty("FirstName3"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
//		log.info("Enter the Search First Name2");
//	}
	@When("Enter the Search First Name3")
	public void i_enter_the_FirstName3() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "FirstName3"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("Enter the Search First Name2");
	}

	//	@When("Enter the Search Last Name3")
//	public void i_enter_the_LastName3() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),readPropertyFileData().getProperty("LastName3"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
//		log.info("Enter the Search Last Name2");
//	}
	@When("Enter the Search Last Name3")
	public void i_enter_the_LastName3() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "LastName3"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Search Last Name2");
	}

	//	@And("Click On Contact Search3")
//	public void I_Click_Contact_search3() throws Throwable {
//		clickButton(PageObjectManager.getInstance().getLoginPage().getContactSearch3());
//		log.info("User click Click On Login Button");
//		Thread.sleep(3000);
//	}
	@And("Click On Contact Search3")
	public void I_Click_Contact_search3() throws Throwable {
		String Contactsearchname3 = ReadDatafromJson("Contact_Name", "ContactSearch3");
//		driver.findElement(By.xpath("//*[contains(text(),\'"+Contactsearchname1+"\')]"));
		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + Contactsearchname3 + "\')]")));
		log.info("User click Click On Login Button");
		Thread.sleep(3000);
	}

	//	@When("Enter the Search First Name4")
//	public void i_enter_the_FirstName4() throws Throwable {
////		readCompleteDataFromEXcel();
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), readPropertyFileData().getProperty("FirstName4"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
//		log.info("Enter the Search First Name2");
//	}
	@When("Enter the Search First Name4")
	public void i_enter_the_FirstName4() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "FirstName4"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("Enter the Search First Name2");
	}
//	@When("Enter the Search Last Name4")
//	public void i_enter_the_LastName4() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),readPropertyFileData().getProperty("LastName4"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
//		log.info("Enter the Search Last Name2");
//	}

	@When("Enter the Search Last Name4")
	public void i_enter_the_LastName4() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "LastName4"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Search Last Name2");
	}

	@And("Click On Contact Search4")
	public void I_Click_Contact_search4() throws Throwable {
		String Contactsearchname4 = ReadDatafromJson("Contact_Name", "ContactSearch4");
//		driver.findElement(By.xpath("//*[contains(text(),\'"+Contactsearchname1+"\')]"));
		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + Contactsearchname4 + "\')]")));
		log.info("User click Click On Login Button");
		Thread.sleep(3000);
	}

	//	@When("Enter the Search First Name5")
//	public void i_enter_the_FirstName5() throws Throwable {
////		readCompleteDataFromEXcel();
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), readPropertyFileData().getProperty("FirstName5"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
//		log.info("Enter the Search First Name2");
//	}
	@When("Enter the Search First Name5")
	public void i_enter_the_FirstName5() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "FirstName5"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("Enter the Search First Name2");
	}

//	@When("Enter the Search Last Name5")
//	public void i_enter_the_LastName5() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(),readPropertyFileData().getProperty("LastName5"));
////		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
//		log.info("Enter the Search Last Name2");
//	}

	@When("Enter the Search Last Name5")
	public void i_enter_the_LastName5() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getLastName(), ReadDatafromJson("Contact_Name", "LastName5"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,1));
		log.info("Enter the Search Last Name2");
	}

	@And("Click On Contact Search5")
	public void I_Click_Contact_search5() throws Throwable {
		String Contactsearchname5 = ReadDatafromJson("Contact_Name", "ContactSearch5");
//		driver.findElement(By.xpath("//*[contains(text(),\'"+Contactsearchname1+"\')]"));
		clickButton(driver.findElement(By.xpath("//*[contains(text(),\'" + Contactsearchname5 + "\')]")));
		log.info("User click Click On Login Button");
		Thread.sleep(3000);
	}

	@And("Click On Clear Button")
	public void I_Click_clear_Button() throws Throwable {
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getClearbutton());
		log.info("User click on Clear Button");
	}

	@And("Click On Do Not Save Button")
	public void I_Click_do_not_save_Button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getDonotsavebutton());
		Thread.sleep(3000);
		log.info("User click on Do Not save button");
	}

	@And("Click On Fast Growing Contact List")
	public void I_Click_fast_growing_list() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getFastgrowingContact());
		log.info("User click on Clear Button");
	}

	@And("Click On Add all to List")
	public void I_Click_add_all_list() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getAddalltolistbutton());
		log.info("User click on Add All to List");
	}

	@And("Click On Create New Contact List")
	public void I_Click_create_new_list() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCreatenewcontactlist());
		log.info("User click on Create New Contact List");
	}

	//	@When("Enter New Contact List")
//	public void i_enter_the_contact_list() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getEntercreatenamelist(),
//				readPropertyFileData().getProperty("Contactlist"));
//		log.info("User Enter New Contact List");
//	}
	@When("Enter New Contact List")
	public void i_enter_the_contact_list() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getEntercreatenamelist(),
				ReadDatafromJson("Contact_Name", "Contactlist"));
		log.info("User Enter New Contact List");
	}

	@And("Click On Create New Contact List Save Button")
	public void I_Click_create_new_list_save_button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getcreatenamelistsavebutton());
		System.out.println("Clicked on Save Button");
		log.info("User click on Create New Contact List Save Button");
	}

	@And("Click On Add Contact List Save Button")
	public void I_Click_Add_list_save_button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getcreatenamelistsavebutton());
		log.info("User click on Create New Contact List Save Button");
	}
	@And("Click On Add Company List Save Button")
	public void I_Click_Add_Company_list_save_button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getcreatenamelistsavebutton());
		log.info("User click on Create New Contact List Save Button");
	}
	@And("Click On List Tab")
	public void I_Click_List_Tab() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getListtab());
		log.info("User click on List Tab");
	}

	@And("Click On SalesIntel Tab")
	public void I_Click_SalesIntel_Tab() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSalesIntelTab());
		log.info("User click on List Tab");
	}

	@And("Select Multiple contact to Add Contact List")
	public void I_select_multiple_Contacts() {
		for (int i = 1; i < 6; i++) {
			driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])[" + i + "]")).get(0).click();
			//System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])["+i+"]")).size());
		}
		log.info("Select Multiple contact to Add Contact List");
	}

	@And("Select Multiple Company to Add Company List")
	public void I_select_multiple_Company() {
		for (int i = 1; i < 4; i++) {
			driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])[" + i + "]")).get(0).click();
			//System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])["+i+"]")).size());
		}
		log.info("Select Multiple Company to Add Company List");
	}
	@And("Append Contact details into the List")
	public void I_append_multiple_Contacts() {
		Contactlist = new LinkedList<>();
		for (int i = 1; i < 6; i++) {
			String Contactname = driver.findElements(By.xpath("((//input[@type='checkbox' and @title='Select'])[" + i + "]//following::span)[" + i + "]")).get(0).getText();
			//System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])["+i+"]")).size());
			Contactlist.add(Contactname);
		}
		log.info("Append Contact details into the List");
	}

	@And("Append Company details into the List")
	public void I_append_multiple_Company() {
		Contactlist = new LinkedList<>();
		for (int i = 1; i < 6; i++) {
			String Companyname = driver.findElements(By.xpath("((//input[@type='checkbox' and @title='Select'])[" + i + "]//following::span)[" + i + "]")).get(0).getText();
			//System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])["+i+"]")).size());
			Contactlist.add(Companyname);
		}
		log.info("Append Company details into the List");
	}

	@Then("Select Preview Button")
	public void I_Select_Preview_Button() throws Throwable {
		Thread.sleep(5000);
		Actions Clickpreview = new Actions(driver);
//		String contactlistnamesearch = readPropertyFileData().getProperty("Contactlist");
		String contactlistnamesearch = ReadDatafromJson("Contact_Name", "Contactlist");
		Clickpreview.doubleClick(driver.findElement(By.xpath("(//*[contains(text(),'" + contactlistnamesearch + "')])[2]//following::button[@title='Preview']"))).build().perform();
		//driver.findElement(By.xpath("(//*[contains(text(),'"+contactlistnamesearch+"')])[2]//following::button[@title='Preview']"))
		log.info("Select Preview Button");
	}

	@And("Compare Contact details into the List")
	public void I_compare_multiple_Contacts() {
		Comparelist = new LinkedList<>();
		for (int i = 1; i < 3; i++) {
			String Comparename = driver.findElements(By.xpath("((//input[@type='checkbox' and @title='Select'])[" + i + "]//following::span)[" + i + "]")).get(0).getText();
			//System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox' and @title='Select'])["+i+"]")).size());
			Comparelist.add(Comparename);
		}
		System.out.println(Contactlist);
		System.out.println(Comparelist);
		Assert.assertTrue(Contactlist.equals(Comparelist));
		Contactlist.retainAll(Comparelist);
		log.info("Select Multiple contact to Add Contact List");
	}

	@And("Delete Contact List")
	public void I_Delete_Contact_List() throws Throwable {
		Thread.sleep(5000);
		Actions Clickpreview = new Actions(driver);
		String contactlistnamesearch = ReadDatafromJson("Contact_Name", "Contactlist");
		Clickpreview.doubleClick(driver.findElement(By.xpath("(//*[contains(text(),'" + contactlistnamesearch + "')])[2]//following::button[@title='Delete']"))).build().perform();
		//driver.findElement(By.xpath("(//*[contains(text(),'"+contactlistnamesearch+"')])[2]//following::button[@title='Preview']"))
		log.info("Select Multiple contact to Add Contact List");
	}

	@And("Delete Company List")
	public void

	I_Delete_Company_List() throws Throwable {
		Thread.sleep(5000);
		Actions Clickpreview = new Actions(driver);
		String contactlistnamesearch = ReadDatafromJson("Contact_Name", "Companylist");
		Clickpreview.doubleClick(driver.findElement(By.xpath("(//*[contains(text(),'" + contactlistnamesearch + "')])[2]//following::button[@title='Delete']"))).build().perform();
		//driver.findElement(By.xpath("(//*[contains(text(),'"+contactlistnamesearch+"')])[2]//following::button[@title='Preview']"))
		log.info("Select Multiple contact to Add Contact List");
	}

	@And("Click On Delete Contact List")
	public void I_delete_contact_list() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getDeletecontactList());
		log.info("Click On Delete Contact List");
	}

	@And("Verify Requested ROD is Displayed in ROD tab")
	public void I_verify_Requested_ROD_In_ROD_Tab() throws Throwable {
		Thread.sleep(10000);
		Assert.assertTrue(PageObjectManager.getInstance().getLoginPage().RODreqestedInRODtab().isDisplayed());
		log.info("User Verified Requested ROD in ROD Tab");
	}


	@When("Click On Setting Options")
	public void I_click_welcome_Logout() throws Throwable {
		Thread.sleep(3000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getWelcomeTextforLogout());
		log.info("User Click On Setting Options");
	}

	@And("Click On Logout Options")
	public void I_click_Logout() throws Throwable {
		Thread.sleep(3000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getLogout());
		log.info("Click On Logout Button");
	}
	@And("Click On Delete Company List")
	public void I_delete_company_list() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getDeletecontactList());
		log.info("Click On Delete Company List");
		Thread.sleep(10000);
	}
	@Then("Click On Contact Tab")
	public void I_contact_Tab() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getContactsTab());
		log.info("User click on Clear Button");
	}

	@When("Enter the First Name to search")
	public void i_enter_the_FirstName_to_search() throws Throwable {
//		readCompleteDataFromEXcel();
		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(), ReadDatafromJson("Contact_Name", "Search_name"));
//		enterData(PageObjectManager.getInstance().getLoginPage().getFirstName(),readData(0,0));
		log.info("User enter the First Name");
	}
	@And("Validate Contact Search Result")
	public void I_Validate_Contact_Search_Result() {
		List<WebElement> allElement = driver.findElements(By.xpath("//*[contains(text(),'Micheal')]"));
		for (WebElement eachElement : allElement) {
			String actualValue = eachElement.getText();
			if (actualValue.contains("Micheal")) {
				System.out.println("The Actual Result values: " + actualValue);
				Assert.assertTrue(actualValue.contains("Micheal"));
			} else {
				System.out.println("Both Actual and Expected are mismatching");
			}
		}
		log.info("Validate Search Result");
	}
	@And("Click On Add all Contact to Existing List")
	public void I_Click_Add_all_Contact_Existing_List() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getAddtoexistinglist());
		log.info("User Click On Add all Contact to Existing List");
	}
	@And("Click on Contact List Drop Down Option")
	public void I_Click_Contact_List_Drop_Down() throws Throwable {
		Select selectcontact = new Select(PageObjectManager.getInstance().getLoginPage().getContactListDropdown());
		selectcontact.selectByVisibleText(ReadDatafromJson("Contact_Name", "Contactlist"));
		log.info("User Click On Add all Contact to Existing List");
	}
	@And("Click on Company List Drop Down Option")
	public void I_Click_Company_List_Drop_Down() throws Throwable {
		Select selectcompany = new Select(PageObjectManager.getInstance().getLoginPage().getCompanyListDropdown());
		selectcompany.selectByVisibleText(ReadDatafromJson("Contact_Name", "Companylist"));
		log.info("User Click on Company List Drop Down Option");
	}
	@Then("Click On Company Tab")
	public void I_company_Tab() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getCompanyTab());
		log.info("User click on Clear Button");
		Thread.sleep(5000);
	}
	@Then("Click On Company")
	public void I_company_option() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getCompanyName());
		log.info("User click on Clear Button");
		Thread.sleep(5000);
	}
	@When("Enter Valid Company Name")
	public void i_enter_the_company_name() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getCompanyInput(),
				ReadDatafromJson("Contact_Name", "Company_name"));
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		log.info("User Enter Valid Company Name");
		Thread.sleep(2000);
	}

	@And("Click On Company Input Text Field")
	public void I_Click_Company_name() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCompanyInput());
		log.info("Click On Company Input Text Field");
		Thread.sleep(5000);
	}

	@And("Click On Create New Company List")
	public void I_Click_create_new_Company_list() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getCreatenewcompanylist());
		log.info("User Click On Create New Company List");
	}
	@And("Click On Add Existing Company List")
	public void I_Click_add_Existing_Company_list() throws Throwable {
		clickButton(PageObjectManager.getInstance().getLoginPage().getAddtoexistingcompanylist());
		log.info("User Click On Add Existing Company List");
	}
	@When("Enter New Company List")
	public void i_enter_the_company_list() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getEntercreatenamelist(),
				ReadDatafromJson("Contact_Name", "Companylist"));
		log.info("User Enter New Company List");
	}
	@And("Click On Create New Company List Save Button")
	public void I_Click_create_new_Company_list_save_button() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getcreatenamelistsavebutton());
		System.out.println("Clicked on Save Button");
		log.info("User Click On Create New Company List Save Button");
	}
	@And("Click On Sort Icon For Display Contact based on Contact Name")
	public void I_Click_Sort_Icon_Name() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSortbyName());
		System.out.println("Click On Sort Icon For Display Contact based on Contact Name");
		log.info("Click On Sort Icon For Display Contact based on Contact Name");
		Thread.sleep(10000);
	}
	@And("Click On Sort Icon For Display Contact based on Job Title")
	public void I_Click_Sort_Icon_Job() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSortbyLevel());
		System.out.println("Click On Sort Icon For Display Contact based on Job Title Name");
		log.info("Click On Sort Icon For Display Contact based on Job Title Name");
		Thread.sleep(10000);
	}
	@And("Click On Sort Icon For Display Contact based on Job Level")
	public void I_Click_Sort_Icon_Level() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSortbyLevel());
		System.out.println("Click On Sort Icon For Display Contact based on Job Level Name");
		log.info("Click On Sort Icon For Display Contact based on Job Level Name");
		Thread.sleep(10000);
	}
	@And("Click On Sort Icon For Display Contact based on Dept")
	public void I_Click_Sort_Icon_Dept() throws Throwable {
		Thread.sleep(10000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSortbyDept());
		System.out.println("Click On Sort Icon For Display Contact based on Job Title Name");
		log.info("Click On Sort Icon For Display Contact based on Job Title Name");
		Thread.sleep(10000);
	}
	@And("Click On Sort Icon For Display Contact based on Comp")
	public void I_Click_Sort_Icon_Comp() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSortbyComp());
		System.out.println("Click On Sort Icon For Display Contact based on Job Title Name");
		log.info("Click On Sort Icon For Display Contact based on Job Title Name");
		Thread.sleep(10000);
	}
	@And("Click On Sort Icon For Display Contact based on Location")
	public void I_Click_Sort_Icon_Location() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getSortbyLocation());
		System.out.println("Click On Sort Icon For Display Contact based on Job Title Name");
		log.info("Click On Sort Icon For Display Contact based on Job Title Name");
		Thread.sleep(10000);
	}

	@And("Move the SalesIntel Website Screen Up")
	public void I_Scroll_Up_Screen() throws Throwable {
		Thread.sleep(5000);
		Scrollpup(PageObjectManager.getInstance().getLoginPage().getScrollup());
	}
	@And("Move the SalesIntel Website Screen Down")
	public void I_Scroll_down_Screen() throws Throwable {
		Thread.sleep(5000);
		Scrollpup(PageObjectManager.getInstance().getLoginPage().getScrolldown());
	}

	@And("Click On Browse Button")
	public void I_Click_Browse() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().getBrowsefile());
		log.info("Click On Browse Button");
	}
	@And("Upload File From Local Directory")
	public void I_Upload_File_Directory() throws Throwable {
		Thread.sleep(5000);
		uploadfilefromlocal("C:\\Users\\Asus\\Desktop\\Book1.csv");
	}

}