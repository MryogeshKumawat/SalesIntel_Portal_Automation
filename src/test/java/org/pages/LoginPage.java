package org.pages;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Global {

//	public static String Readuserdata()
//	{
//		String name = readPropertyFileData().getProperty("FirstName1");
//		return name;
//	}
//	public static String name = Readuserdata();
//
//	public static String usernamexpath = "//*[contains(text(),"\"name\"")]";
	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'Request')])[1]")
	private WebElement RequestVerificationButton;

	@FindBy(xpath = "//div[contains(text(),'Jonathan Kirst')]")
	private WebElement RODreqestedInRODtab;

	@FindBy(xpath = "//a[@class='nav-link' and contains(text(),'RoD')]")
	private WebElement RoDTab;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginCTA;
	@FindBy(xpath = "//span[text()='Name']")
	private WebElement ContactName;
	@FindBy(xpath = "//*[@name='firstName']")
	private WebElement FirstName;
	@FindBy(xpath = "//*[@name='lastName']")
	private WebElement LastName;
	@FindBy(xpath = "(//span[@class='h6 py-2 px-0 cursor-pointer search-bar-title'])[15]")
	private WebElement contactemail;
	@FindBy(xpath = "//*[@type='submit' and @class='btn btn-primary btn-search']")
	private WebElement SearchButton;

	@FindBy(xpath = "(//*[@type='submit' and @class='btn btn-primary btn-search'])[1]")
	private WebElement CompanySearchButton;

	@FindBy(xpath = "(//div[contains(text(),'Company Name or Domain')]//following::input[@type='text' and @aria-autocomplete='list'])[1]")
	private WebElement CompanyInput;

	@FindBy(xpath = "//*[contains(text(),'FAQ')]")
	private WebElement Faq;

	@FindBy(xpath = "//*[@class='page-title mb-0' and contains(text(),'Login')]")
	private WebElement LoginTitle;

	@FindBy(xpath = "//span[text()='Company']")
	private WebElement CompanyName;

	@FindBy(xpath = "//*[@placeholder='Email']")
	private WebElement EmailPlaceholder;

	@FindBy(xpath = "//*[contains(text(),'Data Enrichment')]")
	private WebElement Scrolldown;

	@FindBy(xpath = "//*[contains(text(),'Type Company Name or Domain')]")
	private WebElement Scrollup;

	@FindBy(xpath = "//*[@placeholder='Password']")
	private WebElement PasswordPlaceholder;

	@FindBy(xpath = "//*[contains(text(),' Remember me')]")
	private WebElement RememberMe;

	@FindBy(xpath = "//*[@type='submit' and contains(text(),'Login')]")
	private WebElement LoginButton;

	@FindBy(xpath = "(//input[@type='radio'])[8]")
	private WebElement newContactradiobutton;

	@FindBy(xpath = "(//span[@class='search-option-label']//preceding-sibling::input[@type='radio' and contains(@class,'form-check-input')])[2]")
	private WebElement newuniversalContactradiobutton;

	@FindBy(xpath = "(//input[@type='radio'])[7]")
	private WebElement newCompanyradiobutton;

	@FindBy(xpath = "//*[contains(text(),'Forgot Password')]")
	private WebElement ForgotPassword;

	@FindBy(xpath = "//*[contains(text(),'Please enter a valid Username.')]")
	private WebElement InvalidUsernameResult;

	@FindBy(xpath = "//*[contains(text(),'Username is')]")
	private WebElement InvalidUsernamepasswordResult;

	@FindBy(xpath = "//*[contains(text(),'Password is')]")
	private WebElement InvalidpasswordUsernameResult;

	@FindBy(xpath = "//*[contains(text(),'Individual')]")
	private WebElement Individualsection;

	@FindBy(xpath = "//*[contains(text(),'No Contacts Found')]")
	private WebElement ContactSearchwithInteger;

	@FindBy(xpath = "//*[@placeholder='Email']")
	private WebElement ForgetPasswordEmail;

	@FindBy(xpath = "//*[contains(text(),'Reset Password')]")
	private WebElement ResetPasswordButton;

	@FindBy(xpath = "//select[contains(@placeholder,'Select contact from list')]")
	private WebElement ContactListDropdown;

	@FindBy(xpath = "//select[contains(@placeholder,'Select')]")
	private WebElement CompanyListDropdown;

	@FindBy(xpath = "//*[@placeholder='Work or Personal Email']")
	private WebElement ContactEmailInputbox;

	@FindBy(xpath = "(//span[@class='h6 py-2 px-0 cursor-pointer search-bar-title'])[15]")
	private WebElement ContactJobLevel;

	@FindBy(xpath = "//*[contains(text(),'Role')]")
	private WebElement Rolesection;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[1]")
	private WebElement JobLevelSelectAll;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[2]")
	private WebElement JobBoardMember;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[3]")
	private WebElement Jobclevelexecutive;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[4]")
	private WebElement JobVicepresident;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[5]")
	private WebElement JobDirectors;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[6]")
	private WebElement JobManagers;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[7]")
	private WebElement JobKeyinfluence;

	private String Contact_search_Name1 = ReadDatafromJson("Contact_Name","ContactSearch1");


	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[1]")
	private WebElement SortbyName;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[2]")
	private WebElement SortbyJobTitle;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[3]")
	private WebElement SortbyLevel;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[4]")
	private WebElement SortbyDept;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[5]")
	private WebElement SortbyComp;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[6]")
	private WebElement SortbyLocation;
	@FindBy(xpath = "//*[contains(text(),'Vanessa DaSilva')]")
	private WebElement ContactSearch1;

	@FindBy(xpath = "//*[contains(text(),'Greg Eyrich')]")
	private WebElement ContactSearch2;

	@FindBy(xpath = "//*[contains(text(),'Greg Farrah')]")
	private WebElement ContactSearch3;

	@FindBy(xpath = "//*[contains(text(),'Mark Fasano')]")
	private WebElement ContactSearch4;

	@FindBy(xpath = "//*[contains(text(),'John Flagg')]")
	private WebElement ContactSearch5;

	@FindBy(xpath = "//*[contains(text(), 'Reveal')]")
	private WebElement ContactSearchReveal;

	@FindBy(xpath = "//*[@class='list-inline-item px-4 font-weight-light credit-values border-right']")
	private WebElement UpdatedReveal;

	@FindBy(xpath = "(//*[contains(text(),'Clear')])[2]")
	private WebElement Clearbutton;

	@FindBy(xpath = "//*[contains(text(),'Do Not Save')]")
	private WebElement Donotsavebutton;

	@FindBy(xpath = "(//*[contains(text(),'100 Fastest Growing')])[4]")
	private WebElement FastgrowingContact;

	@FindBy(xpath = "(//*[contains(text(),'Add')])[2]")
	private WebElement Addalltolistbutton;

	@FindBy(xpath = "//*[contains(text(),'Create new contact list')]")
	private WebElement Createnewcontactlist;

	@FindBy(xpath = "//*[contains(text(),' Add to existing contact list:')]")
	private WebElement Addtoexistinglist;

	@FindBy(xpath = "//*[contains(text(),'Create new company list')]")
	private WebElement Createnewcompanylist;

	@FindBy(xpath = "//*[contains(text(),'Add to existing company list:')]")
	private WebElement Addtoexistingcompanylist;

	@FindBy(xpath = "//*[@placeholder='Enter name']")
	private WebElement Entercreatenamelist;

	@FindBy(xpath = "//*[@class='btn btn-primary' and contains(text(),'Save')]")
	private WebElement createnamelistsavebutton;


	@FindBy(xpath = "(//*[contains(text(),'Lists')])[1]")
	private WebElement Listtab;

	@FindBy(xpath = "//a[contains(text(),'SalesIntel')]")
	private WebElement SalesIntelTab;


	@FindBy(xpath = "//*[text()='Contacts']")
	private WebElement ContactsTab;

	@FindBy(xpath = "//*[text()='Companies']")
	private WebElement CompanyTab;
	@FindBy(xpath = "(//*[contains(text(),'Delete')])[2]")
	private WebElement DeletecontactList;

	@FindBy(xpath = "//*[contains(text(),'browse')]")
	private WebElement Browsefile;

	@FindBy(xpath = "//*[contains(text(),'Welcome,')]")
	private WebElement WelcomeTextforLogout;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement Logout;

	public LoginPage() throws Throwable {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginCTA() {
		return loginCTA;
	}
	public WebElement getContactName() {
		return ContactName;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getContactEmail() {
		return contactemail;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getCompanySearchButton() {
		return CompanySearchButton;
	}

	public WebElement getFaq() {
		return Faq;
	}

	public WebElement getLoginTitle() {
		return LoginTitle;
	}

	public WebElement getEmailPlaceholder() {
		return EmailPlaceholder;
	}

	public WebElement getPasswordPlaceholder() {
		return PasswordPlaceholder;
	}

	public WebElement getRememberMe() {
		return RememberMe;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}
	public WebElement getInvalidUsernameResult() {
		return InvalidUsernameResult;
	}
	public WebElement getInvalidUsernamepasswordResult() {
		return InvalidUsernamepasswordResult;
	}
	public WebElement getInvalidpasswordUsernameResult() {
		return InvalidpasswordUsernameResult;
	}
	public WebElement getIndividualsection() {
		return Individualsection;
	}
	public WebElement getContactSearchwithInteger() {
		return ContactSearchwithInteger;
	}
	public WebElement getForgetPasswordEmail() {
		return ForgetPasswordEmail;
	}
	public WebElement getResetPasswordButton() {
		return ResetPasswordButton;
	}
	public WebElement getContactEmailInputbox() {
		return ContactEmailInputbox;
	}
	public WebElement getContactJobLevel() {
		return ContactJobLevel;
	}
	public WebElement getRolesection() {
		return Rolesection;
	}
	public WebElement getJobBoardMember() {
		return JobBoardMember;
	}
	public WebElement getJobclevelexecutive() {
		return Jobclevelexecutive;
	}
	public WebElement getJobVicepresident() {
		return JobVicepresident;
	}
	public WebElement getJobDirectors() {
		return JobDirectors;
	}
	public WebElement getJobManagers() {
		return JobManagers;
	}
	public WebElement getJobLevelSelectAll() {
		return JobLevelSelectAll;
	}
	public WebElement getContactSearch1() {
		return ContactSearch1;
	}
	public WebElement getContactSearch2() {
		return ContactSearch2;
	}
	public WebElement getContactSearch3() {
		return ContactSearch3;
	}
	public WebElement getContactSearch4() {
		return ContactSearch4;
	}
	public WebElement getContactSearch5() {
		return ContactSearch5;
	}
	public WebElement getContactSearchReveal() {
		return ContactSearchReveal;
	}
	public WebElement getUpdatedReveal() {
		return UpdatedReveal;
	}

	public WebElement getClearbutton() {
		return Clearbutton;
	}
	public WebElement getDonotsavebutton() {
		return Donotsavebutton;
	}
	public WebElement getFastgrowingContact() {
		return FastgrowingContact;
	}
	public WebElement getAddalltolistbutton() {
		return Addalltolistbutton;
	}
	public WebElement getCreatenewcontactlist() {
		return Createnewcontactlist;
	}
	public WebElement getEntercreatenamelist() {
		return Entercreatenamelist;
	}
	public WebElement getcreatenamelistsavebutton() {
		return createnamelistsavebutton;
	}
	public WebElement getListtab() {
		return Listtab;
	}
	public WebElement getDeletecontactList() {
		return DeletecontactList;
	}
	public WebElement getContactsTab() {
		return ContactsTab;
	}
	public WebElement getCompanyTab() {
		return CompanyTab;
	}
	public WebElement getAddtoexistinglist() {
		return Addtoexistinglist;
	}

	public WebElement getContactListDropdown() {
		return ContactListDropdown;
	}
	public WebElement getCompanyName() {
		return CompanyName;
	}
	public WebElement getCompanyInput() {
		return CompanyInput;
	}

	public WebElement getCreatenewcompanylist() {
		return Createnewcompanylist;
	}
	public WebElement getAddtoexistingcompanylist() {
		return Addtoexistingcompanylist;
	}
	public WebElement getSortbyName() {
		return SortbyName;
	}
	public WebElement getSortbyJobTitle() {
		return SortbyJobTitle;
	}
	public WebElement getSortbyLevel() {
		return SortbyLevel;
	}
	public WebElement getSortbyDept() {
		return SortbyDept;
	}
	public WebElement getSortbyComp() {
		return SortbyComp;
	}
	public WebElement getSortbyLocation() {
		return SortbyLocation;
	}

	public WebElement getScrolldown() {
		return Scrolldown;
	}

	public WebElement getScrollup() {
		return Scrollup;
	}
	public WebElement getBrowsefile() {
		return Browsefile;
	}
	public WebElement getWelcomeTextforLogout() {
		return WelcomeTextforLogout;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public WebElement getnewContactradiobutton() {
		return newContactradiobutton;
	}
	public WebElement getnewCompanyradiobutton() {
		return newCompanyradiobutton;
	}
	public WebElement getSalesIntelTab() {
		return SalesIntelTab;
	}

	public WebElement getCompanyListDropdown() {
		return CompanyListDropdown;
	}

	public WebElement RequestVerificationButton() {
		return RequestVerificationButton;
	}

	public WebElement RODreqestedInRODtab(){
		return RODreqestedInRODtab;
	}
	public WebElement getRoDTab() {
		return RoDTab;
	}
	public WebElement getnewuniversalContactradiobutton() {
		return newuniversalContactradiobutton;
	}

}
