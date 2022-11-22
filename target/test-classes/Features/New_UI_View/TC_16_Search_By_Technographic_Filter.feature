Feature: To validate Search by Technographics

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Technographics filter in Products with Any
    When Validate TECHNOGRAPHICS is displayed
    And Click on Products Filter
    And Click on Technographic product text box
    And Enter the product name
    And Click on Company Radio Button
    And Click on Search Button
    And Click on company name
    And Click on All
    And Enter the product name in Search textbox
    Then Check the technographic product in Company detail page


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
