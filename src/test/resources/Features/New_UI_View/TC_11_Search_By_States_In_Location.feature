Feature: Validate Search by States in Location

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by States in USA Location
    And Click on Contact Radio Button
    When Verify Location filter is Displayed
    Then Click on Location Tab
    Then Click on State Combobox
    Then Enter the Data in State Combobox
    And Click on Search Button
    Then Check CA for California State in Search Result

  @First @Sanity
  Scenario: To validate Search by Zip Code in USA Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Zip code under USA
    And Enter Zip Code in the text field
#    And Select 100 Miles in the dropdown
    Then Click on Search Button

  @First @Sanity
  Scenario: To validate Search by Metro Areas in USA Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Metro Areas under USA
    And Click on Metro Areas Text Field
    And Enter Albany GA Metro Area
    Then Click on Search Button


  @First @Sanity
  Scenario: To validate Search by Non-USA Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Non USA Radio Button
    And Click on Country Input Box
    And Enter Non USA Country Name
    And Click on Search Button
    Then Check Country in Location in Search Result


