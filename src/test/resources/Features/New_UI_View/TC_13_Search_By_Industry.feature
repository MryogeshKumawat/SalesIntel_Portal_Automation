Feature: To validate Search by Industry

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To Validate search by Any Of Industry Name Filter
    When Click on Industry Filter
    And Click on Select All Check Box
    Then Click on Search Button

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options