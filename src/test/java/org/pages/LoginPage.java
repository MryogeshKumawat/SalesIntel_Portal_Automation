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
	@FindBy(xpath = "(//span[contains(text(),'Email')])[1]")
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

	@FindBy(xpath = "//span[contains(text(),'Level')]")
	private WebElement ContactJobLevel;

	@FindBy(xpath = "//Label[contains(text(),'Board Members')]")
	private WebElement BoardMemberJobLevelFilter;

	@FindBy(xpath = "(//div[contains(text(),'Board Member')])[1]")
	private WebElement BoardMemberJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'C-level Executive')])[1]")
	private WebElement ClevelExecutiveJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'Vice President')])[1]")
	private WebElement VicePresidentJobLevelInResult;
	@FindBy(xpath = "(//div[contains(text(),'Director')])[1]")
	private WebElement DirectorsJobLevelInResult;
	@FindBy(xpath = "(//div[contains(text(),'Manager')])[1]")
	private WebElement ManagersJobLevelInResult;
	@FindBy(xpath = "(//div[contains(text(),'Key Influencer')])[1]")
	private WebElement KeyInfluencersJobLevelInResult;
	@FindBy(xpath = "//*[contains(text(),'Role')]")
	private WebElement Rolesection;

	@FindBy(xpath = "(//span[contains(text(),'Department')])[1]")
	private WebElement DepartmentFilter;

	@FindBy(xpath = "(//span[contains(text(),'Finance')])[2]")
	private WebElement FinanceDepartmentFilter;

	@FindBy(xpath = "//span[contains(text(),'HR')]")
	private WebElement HrDepartmentFilter;


	@FindBy(xpath = "(//span[contains(text(),'IT')])[1]")
	private WebElement ITDepartmentFilter;

	@FindBy(xpath = "//span[contains(text(),'Legal')]")
	private WebElement LegalDepartmentFilter;

	@FindBy(xpath = "(//span[contains(text(),'Marketing')])[1]")
	private WebElement MarketingDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Marketing')])[1]")
	private WebElement MarketingDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'Legal')])[1]")
	private WebElement LegalDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'HR')])[1]")
	private WebElement HrDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'IT')])[1]")
	private WebElement ITDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'Finance')])[1]")
	private WebElement FinanceDepartmentInResult;

	@FindBy(xpath = "(//span[contains(text(),'Operations')])[1]")
	private WebElement OperationsDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Operations')])[1]")
	private WebElement OperationsDepartmentInResult;

	@FindBy(xpath = "//span[contains(text(),'Procurement')]")
	private WebElement ProcurementDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Procurement')])[1]")
	private WebElement ProcurementDepartmentInResult;

	@FindBy(xpath = "//span[contains(text(),'R&D')]")
	private WebElement RndDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'R&D')])[1]")
	private WebElement RndDepartmentInResult;

	@FindBy(xpath = "(//span[contains(text(),'Sales')])[1]")
	private WebElement SalesDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Sales')])[1]")
	private WebElement SalesDepartmentIn_Result;

	@FindBy(xpath = "//span[contains(text(),'Cross Functional')]")
	private WebElement CrossFunctionalDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Cross Function')])[1]")
	private WebElement CrossFunctionalDepartmentInResult;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[1]")
	private WebElement JobLevelSelectAll;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[2]")
	private WebElement JobBoardMember;

	@FindBy(xpath = "//Label[contains(text(),'C-level Executive')]")
	private WebElement JobclevelexecutiveFilter;

	@FindBy(xpath = "//Label[contains(text(),'Vice Presidents')]")
	private WebElement VicePrecidentsJobLevelFilter;

	@FindBy(xpath = "//Label[contains(text(),'Directors')]")
	private WebElement DirectorsJobLevelFilter;

	@FindBy(xpath = "//Label[contains(text(),'Managers')]")
	private WebElement ManagersJobLevelFilter;
	@FindBy(xpath = "//Label[contains(text(),'Key Influencers')]")
	private WebElement KeyInfluencersJobLevelFilter;

	@FindBy(xpath = "//Span[contains(text(),'Title')]")
	private WebElement TitleFilter;

	@FindBy(xpath = "//textarea[@name='jobTitle']")
	private WebElement TitleTextField;

	@FindBy(xpath = "(//Span[contains(text(),'Location')])[1]")
	private WebElement LocationFilter;

	@FindBy(xpath = "(//div[contains(text(),'States')])[1]")
	private WebElement StateField;

	@FindBy(xpath = "//div[contains(text(),'California')]")
	private WebElement CaliforniaState;

	@FindBy(xpath = "(//Span[contains(text(),'CA')])[1]")
	private WebElement CaliforniaInResult;

	@FindBy(xpath = "(//a[contains(text(),'Zip Code')])[1]")
	private WebElement ZipCodePage;

	@FindBy(xpath = "(//a[contains(text(),'State')])[1]")
	private WebElement StatePage;

	@FindBy(xpath = "//input[@placeholder='e.g. 20001']")
	private WebElement ZipCodeTextField;

	@FindBy(xpath = "(//Select)[2]")
	private WebElement MilesSelectBox;

	@FindBy(xpath = "(//a[contains(text(),'Metro Area')])[1]")
	private WebElement MetroAreaPage;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement MetroAreaTextField;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement NonUsaRadioButton;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement GlobalRadioButton;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement CountryBox;

	@FindBy(xpath = "//span[contains(text(),'Keywords')]")
	private WebElement KeywordsFilter;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement KeywordsInputBox;

	@FindBy(xpath = "(//span[contains(text(),'Industry')])[1]")
	private WebElement IndustryFilter;

	@FindBy(xpath = "//a[contains(text(),'NAICS or SIC')]")
	private WebElement NAICSorSICpage;

	@FindBy(xpath = "//label[contains(text(),'SIC Codes')]")
	private WebElement SICcodeRadioButton;

	@FindBy(xpath = "//span[contains(text(),'Revenue')]")
	private WebElement RevenueFilter;

	@FindBy(xpath = "//span[contains(text(),'Employees / Size')]")
	private WebElement EmployeeSizeFilter;

	@FindBy(xpath = "//input[@placeholder='no min.']")
	private WebElement MinRevenueInputBox;

	@FindBy(xpath = "//input[@placeholder='no minimum']")
	private WebElement MinEmpSizeInputBox;

	@FindBy(xpath = "//input[@placeholder='no max.']")
	private WebElement MaxRevenueInputBox;

	@FindBy(xpath = "//input[@placeholder='no maximum']")
	private WebElement MaxEmpSizeInputBox;

	@FindBy(xpath = "(//div[contains(text(),'Company Revenue:')])[1]/../span")
	private WebElement RevenueInSearchResult;

	@FindBy(xpath = "(//div[contains(text(),'Company Size')]/..)/span")
	private WebElement	EmpSizeInSearchResult;

	@FindBy(xpath = "//div[contains(text(),'Technographics')]")
	private WebElement Technographics;

	@FindBy(xpath = "//span[contains(text(),'Products')]")
	private WebElement ProductFilter;

	@FindBy(xpath = "//span[contains(text(),'Providers')]")
	private WebElement ProviderFilter;

	@FindBy(xpath = "(//label[contains(text(),'Select All')])[3]")
	private WebElement SelectAllCheckBoxForCategories;

	@FindBy(xpath = "//span[contains(text(),'Categories')]")
	private WebElement CategoriesFilter;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement ProductTestBox;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement ProviderTextBox;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement CategoryTextBox;

	@FindBy(xpath = "(//input[@type='checkbox' and @title])[2]//..//..//../div[3]/div[1]/a")
	private WebElement CompanyNameInResult;

	@FindBy(xpath = "//th[contains(text(),'Products')]//..//..//../tbody/tr[2]/td[2]/table/tr/td[2]/div/div")
	private WebElement ProductInResult;

	@FindBy(xpath = "//th[contains(text(),'Products')]//..//..//../tbody/tr[2]/td[2]/table/tr/td[1]")
	private WebElement ProviderInResult;

	@FindBy(xpath = "//th[contains(text(),'Categories')]//..//..//../tbody/tr[2]/td/span[2]")
	private WebElement CategoryInResult;

	@FindBy(xpath = "//div[contains(text(),' There are no technographics matching your search')]")
	private WebElement NoTechnographyIsMatching;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'ALL')])[1]")
	private WebElement ALLButtonInProduct;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'ALL')])[2]")
	private WebElement ALLButtonInProvider;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'ALL')])[3]")
	private WebElement ALLButtonInCategory;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'NONE')])[1]")
	private WebElement NoneButtonInProduct;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'NONE')])[2]")
	private WebElement NoneButtonInProvider;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'NONE')])[3]")
	private WebElement NoneButtonInCategory;

	@FindBy(xpath = "//a[contains(text(),'« Back to search results')]")
	private WebElement BackToSearchResults;

	@FindBy(xpath = "//label[contains(text(),'All')]")
	private WebElement AllButton;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchInputBox;

	@FindBy(xpath = "//a[@id='brand-logo']")
	private WebElement SalesIntelLogo;

	@FindBy(xpath = "//div[contains(text(),'Intent')]")
	private WebElement INTENT;

	@FindBy(xpath = "//span[contains(text(),'Score Threshold')]")
	private WebElement ScoreThresHoldFilter;

	@FindBy(xpath = "//span[contains(text(),'Topic Threshold')]")
	private WebElement TopicThresHoldFilter;

	@FindBy(xpath = "(//span[contains(text(),'Netflix') and contains(text(),'Hulu')])[1]")
	private WebElement TopicThresholdInResult;

	@FindBy(xpath = "//input[@type='range' and @name='score']")
	private WebElement ScoreThresholdMover;

	@FindBy(xpath = "//input[@type='range' and @name='threshold']")
	private WebElement TopicThresholdMover;

	@FindBy(xpath = "(//span[contains(text(),'Topic')])[1]")
	private WebElement TopicFilter;

	@FindBy(xpath = "//span[contains(text(),'Netflix')]")
	private WebElement NetflixTopic;

	@FindBy(xpath = "//span[contains(text(),'Hulu')]")
	private WebElement HuluTopic;

	@FindBy(xpath = "(//span[contains(text(),'Netflix')])[2]")
	private WebElement NetflixTopicInResult;


	@FindBy(xpath = "//input[@placeholder='Enter Industry Name']")
	private WebElement IndustryNameInputBox;

	@FindBy(xpath = "(//div[@class='tbody'])[1]")
	private WebElement FirstSearchedContact;

	@FindBy(xpath = "(//label[contains(text(),' Select All ')])[1]")
	private WebElement SelectAllCheckBox;

	@FindBy(xpath = "//div[@title='Albany, OR']")
	private WebElement AlbanyORMetroArea;
	@FindBy(xpath = "(//div[contains(text(),'Manager')])[1]")
	private WebElement TitleInResult;

	@FindBy(xpath = "//span[contains(text(),'wabdelati@imf.org')]")
	private WebElement EmailInResult;

	@FindBy(xpath = "//span[contains(text(),'Wafa Abdelati')]")
	private WebElement SearchedContact;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[4]")
	private WebElement JobVicepresident;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[5]")
	private WebElement JobDirectors;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[6]")
	private WebElement JobManagers;

	@FindBy(xpath = "//span[contains(text(),'Rankings')]")
	private WebElement RankingFilter;

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

	@FindBy(xpath = "//a[contains(text(),'NONE OF')]")
	private WebElement NoneOfPage;

	@FindBy(xpath = "//textarea[@placeholder='1234, 5678']")
	private WebElement NAICScodeInputBox;

	@FindBy(xpath = "//*[@class='list-inline-item px-4 font-weight-light credit-values border-right']")
	private WebElement UpdatedReveal;

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	private WebElement Clearbutton;

	@FindBy(xpath = "//*[contains(text(),'Do Not Save')]")
	private WebElement Donotsavebutton;

	@FindBy(xpath = "(//*[contains(text(),'100 Fastest Growing')])[4]")
	private WebElement FastgrowingContact;

	@FindBy(xpath = "(//span[contains(text(),'Add')])[3]")
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

	@FindBy(xpath = "(//span[text()='Location'])[1]")
	private WebElement LocationTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Statevalueselection;

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

	public WebElement getBoardMemberJobLevelFilter() {
		return BoardMemberJobLevelFilter;
	}

	public WebElement getBoardMemberJobLevelInResult() {
		return BoardMemberJobLevelInResult;
	}
	public WebElement getClevelExecutiveJobLevelInResult() {
		return ClevelExecutiveJobLevelInResult;
	}

	public WebElement getVicePresidentJobLevelInResult() {
		return VicePresidentJobLevelInResult;
	}
	public WebElement getDirectorsJobLevelInResult() {
		return DirectorsJobLevelInResult;
	}

	public WebElement getManagersJobLevelInResult() {
		return ManagersJobLevelInResult;
	}
	public WebElement getKeyInfluencersJobLevelInResult() {
		return KeyInfluencersJobLevelInResult;
	}

	public WebElement getRolesection() {
		return Rolesection;
	}
	public WebElement getDepartmentFilter(){
		return DepartmentFilter;
	}
	public WebElement getFinanceDepartmentFilter(){
		return FinanceDepartmentFilter;
	}

	public WebElement getHrDepartmentFilter(){
		return HrDepartmentFilter;
	}

	public WebElement getITDepartmentFilter(){
		return ITDepartmentFilter;
	}

	public WebElement getLegalDepartmentFilter(){
		return LegalDepartmentFilter;
	}

	public WebElement getMarketingDepartmentFilter(){
		return MarketingDepartmentFilter;
	}
	public WebElement getMarketingDepartmentInResult(){
		return MarketingDepartmentInResult;
	}
	public WebElement getLegalDepartmentInResult(){
		return LegalDepartmentInResult;
	}
	public WebElement getITDepartmentInResult(){
		return ITDepartmentInResult;
	}

	public WebElement getHrDepartmentInResult(){
		return HrDepartmentInResult;
	}

	public WebElement getFinanceDepartmentInResult(){
		return FinanceDepartmentInResult;
	}

	public WebElement getOperationsDepartmentFilter(){
		return OperationsDepartmentFilter;
	}

	public WebElement getOperationsDepartmentInResult(){
		return OperationsDepartmentInResult;
	}

	public WebElement getProcurementDepartmentFilter(){
		return ProcurementDepartmentFilter;
	}

	public WebElement getProcurementDepartmentInResult(){
		return ProcurementDepartmentInResult;
	}

	public WebElement getRndDepartmentFilter(){
		return RndDepartmentFilter;
	}

	public WebElement getRndDepartmentInResult(){
		return RndDepartmentInResult;
	}

	public WebElement getSalesDepartmentFilter(){
		return SalesDepartmentFilter;
	}

	public WebElement getSalesDepartmentIn_Result(){
		return SalesDepartmentIn_Result;
	}

	public WebElement getCrossFunctionalDepartmentFilter(){
		return CrossFunctionalDepartmentFilter;
	}
	public WebElement getCrossFunctionalDepartmentInResult(){
		return CrossFunctionalDepartmentInResult;
	}

	public WebElement getJobBoardMember() {
		return JobBoardMember;
	}
	public WebElement getJobclevelexecutiveFilter() {
		return JobclevelexecutiveFilter;
	}

	public WebElement getVicePrecidentsJobLevelFilter(){
		return VicePrecidentsJobLevelFilter;
	}

	public WebElement getDirectorsJobLevelFilter(){
		return DirectorsJobLevelFilter;
	}

	public WebElement getManagersJobLevelFilter(){
		return ManagersJobLevelFilter;
	}

	public WebElement getKeyInfluencersJobLevelFilter(){
		return KeyInfluencersJobLevelFilter;
	}
	public WebElement getTitleFilter(){
		return TitleFilter;
	}

	public WebElement getTitleTextField(){
		return TitleTextField;
	}

	public WebElement getLocationFilter(){
		return LocationFilter;
	}

	public WebElement getStateField(){
		return StateField;
	}

	public WebElement getCaliforniaState(){
		return CaliforniaState;
	}

	public WebElement getCaliforniaInResult(){
		return CaliforniaInResult;
	}

	public WebElement getZipCodePage(){
		return ZipCodePage;
	}
	public WebElement getStatePage(){
		return StatePage;
	}

	public WebElement getZipCodeTextField(){
		return ZipCodeTextField;
	}

	public WebElement getMilesSelectBox(){
		return MilesSelectBox;
	}


	public WebElement getMetroAreaPage(){
		return MetroAreaPage;
	}

	public WebElement getMetroAreaTextField(){
		return MetroAreaTextField;
	}

	public WebElement getNonUsaRadioButton(){
		return NonUsaRadioButton;
	}

	public WebElement getGlobalRadioButton(){
		return GlobalRadioButton;
	}
	public WebElement getCountryBox(){
		return CountryBox;
	}

	public WebElement getKeywordsFilter(){
		return KeywordsFilter;
	}

	public WebElement getIndustryFilter(){
		return IndustryFilter;
	}
	public WebElement getNAICSorSICpage(){
		return NAICSorSICpage;
	}

	public WebElement getSICcodeRadioButton(){
		return SICcodeRadioButton;
	}

	public WebElement getRevenueFilter(){
		return RevenueFilter;
	}

	public WebElement getEmployeeSizeFilter(){
		return EmployeeSizeFilter;
	}

	public WebElement getMinRevenueInputBox(){
		return MinRevenueInputBox;
	}

	public WebElement getMinEmpSizeInputBox(){
		return MinEmpSizeInputBox;
	}

	public WebElement getMaxRevenueInputBox(){
		return MaxRevenueInputBox;
	}

	public WebElement getMaxEmpSizeInputBox(){
		return MaxEmpSizeInputBox;
	}



	public WebElement getRevenueInSearchResult(){
		return RevenueInSearchResult;
	}

	public WebElement getEmpSizeInSearchResult(){
		return EmpSizeInSearchResult;
	}

	public WebElement getTechnographics(){
		return Technographics;
	}

	public WebElement getProductFilter(){
		return ProductFilter;
	}

	public WebElement getProviderFilter(){
		return ProviderFilter;
	}

	public WebElement getSelectAllCheckBoxForCategories(){
		return SelectAllCheckBoxForCategories;
	}

	public WebElement getCategoriesFilter(){
		return CategoriesFilter;
	}

	public WebElement getProductTextBox(){
		return ProductTestBox;
	}
	public WebElement getProviderTextBox(){
		return ProviderTextBox;
	}

	public WebElement getCategoryTextBox(){
		return CategoryTextBox;
	}

	public WebElement getCompanyNameInResult(){
		return CompanyNameInResult;
	}

	public WebElement getProductInResult(){
		return ProductInResult;
	}

	public WebElement getProviderInResult(){
		return ProviderInResult;
	}

	public WebElement getCategoryInResult(){
		return CategoryInResult;
	}

	public WebElement getNoTechnographyIsMatching(){
		return NoTechnographyIsMatching;
	}

	public WebElement getALLButtonInProduct(){
		return ALLButtonInProduct;
	}

	public WebElement getALLButtonInProvider(){
		return ALLButtonInProvider;
	}

	public WebElement getALLButtonInCategory(){
		return ALLButtonInCategory;
	}

	public WebElement getNoneButtonInProduct(){
		return NoneButtonInProduct;
	}

	public WebElement getNoneButtonInProvider(){
		return NoneButtonInProvider;
	}

	public WebElement getNoneButtonInCategory(){
		return NoneButtonInCategory;
	}

	public WebElement getBackToSearchResults(){
		return BackToSearchResults;
	}

	public WebElement getAllButton(){
		return AllButton;
	}

	public WebElement getSearchInputBox(){
		return SearchInputBox;
	}

	public WebElement getSalesIntelLogo(){
		return SalesIntelLogo;
	}

	public WebElement getINTENT(){
		return INTENT;
	}

	public WebElement getScoreThresHoldFilter(){
		return ScoreThresHoldFilter;
	}

	public WebElement getTopicThresHoldFilter(){
		return TopicThresHoldFilter;
	}

	public WebElement getTopicThresholdInResult(){
		return TopicThresholdInResult;
	}

	public WebElement ScoreThresholdMover() {
		return ScoreThresholdMover;
	}

	public WebElement TopicThresholdMover() {
		return TopicThresholdMover;
	}

	public WebElement getTopicFilter(){
		return TopicFilter;
	}

	public WebElement getNetflixTopic(){
		return NetflixTopic;
	}

	public WebElement getHuluTopic(){
		return HuluTopic;
	}
	public WebElement getNetflixTopicInResult(){
		return NetflixTopicInResult;
	}


//	@Override
//	public String toString() {
//		return "LoginPage{" +
//				"RevenueInSearchResult=" + RevenueInSearchResult +
//				'}';
//	}


	public WebElement getIndustryNameInputBox(){
		return IndustryNameInputBox;
	}

	public WebElement getFirstSearchedContact(){
		return FirstSearchedContact;
	}

	public WebElement getSelectAllCheckBox(){
		return SelectAllCheckBox;
	}

	public WebElement getKeywordsInputBox(){
		return KeywordsInputBox;
	}


	public WebElement getAlbanyORMetroArea(){
		return AlbanyORMetroArea;
	}

	public WebElement getTitleInResult(){
		return TitleInResult;
	}

	public WebElement getSearchedContact(){
		return SearchedContact;
	}
	public WebElement getEmailInResult(){
		return EmailInResult;
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

	public WebElement getRankingFilter() {
		return RankingFilter;
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

	public WebElement getNoneOfPage(){
		return NoneOfPage;
	}
	public WebElement getNAICScodeInputBox(){
		return NAICScodeInputBox;
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

	public WebElement Statevalueselection() {
		return Statevalueselection;
	}


	public WebElement LocationTab() {
		return LocationTab;
	}


}
