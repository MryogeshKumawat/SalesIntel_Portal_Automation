Feature: To validate search by Keywords

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Keywords
    When Click on Keywords Filter
    And Click on Keywords Input box
    And Enter the Keyword
    And Click on Search Button

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options