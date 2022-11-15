Feature: Validate Search By Contact Email

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

#
#  @First @Sanity
#  Scenario: To validate application Search By Contact Email
#    Then Click on Contact Radio Button
#    When Click on Search Button
##    When Verify Individual section is displayed
#    When Verify Contact Email is displayed
#
#  @First @Sanity
#  Scenario: To validate application Search without Contact Email Address
#    Then Click on Search Button
#
  @First @Sanity
  Scenario: To validate application Search by Invalid Email Address
    Then Click on Contact Email Button
    When Enter Invalid Contact Email Address
    Then Click on Search Button
    And Verify Error Message is displayed When search with Invalid Email Address

  @First @Sanity
  Scenario: To validate application Search by Valid Contact Email Address
    When Click On Clear Button
    And Click on Contact Email Button
    And Enter Contact Email Address
    And Click on Search Button
    And Click on Searched Contact
    Then Check email in Search Result

  @First @Sanity
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options