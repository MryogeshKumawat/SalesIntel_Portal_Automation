Feature: To validate Search by INTENT

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Topics
    When Check INTENT is displayed
    And Click on Topics
    And Select Netflix Topic
    And Click on Search Button
    Then Check Searched Topic in Search Result

  @First @Sanity
  Scenario: To validate Search by Topics
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check INTENT is displayed
    And Click on Score Threshold Filter
    And Select Minimum Score
