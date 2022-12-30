Feature: Validate Search By Job Title

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

  @First @Smoke @Reg
  Scenario: To validate application Search By Job Title Filter
    When Verify Role Section is displayed
    And Verify Title filter is Displayed
    And Click on Title Filter
    And Enter Title in Title filter
    And Click on Search Button
    Then Check searched title is displayed in Search Result

  @First @Sanity
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options