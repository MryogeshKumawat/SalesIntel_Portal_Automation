Feature: Validate Search by States in Location

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by States in US Location
    When Verify Location filter is Displayed
    And Click on Location Filter
    And Click on States Filter
    And Click on California State
    And Click on Search Button
    Then Check CA for California State in Search Result

  @First @Sanity
  Scenario: To validate Search by Zip Code in US Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Zip code under USA
    And Enter Zip Code in the text field
    And Select 100 Miles in the dropdown
    Then Click on Search Button

  @First @Sanity
  Scenario: To validate Search by Metro Areas in US Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Metro Areas under USA
    And Click on Metro Areas Text Field
    And Click on Albany GA Metro Area
    Then Click on Search Button


