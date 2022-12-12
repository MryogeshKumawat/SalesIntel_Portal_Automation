Feature: Validate Search By Job Level

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

  @First @Sanity
  Scenario: To validate application Job Level is displayed
    And Verify Job Level Filter is displayed

  @First @Sanity
  Scenario: To validate application Search by Board Member Job Level Filter
    When Click On Job Level Filter
    And Click on Board Member Job Level Filter
    And Click on Search Button
    Then Check Board Member Job Level in Result

  @First @Sanity
  Scenario: To validate application Search by C-level Executive Job Level Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click On Job Level Filter
    And Click On C-Level Executive Job Level Filter
    And Click on Search Button
    And Check C-level Executive Job level in Result

  @First @Sanity
  Scenario: To validate application Search by Voice Presidents Job Level Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click On Job Level Filter
    And Click On Vice Presidents Job Level Filter
    And Click on Search Button
    And Check Vice Presidents Job level in Result

  @First @Sanity
  Scenario: To validate application Search by Directors Job Level Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click On Job Level Filter
    And Click On Directors Job Level Filter
    And Click on Search Button
    And Check Directors Job level in Result

  @First @Sanity
  Scenario: To validate application Search by Managers Job Level Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click On Job Level Filter
    And Click On Managers Job Level Filter
    And Click on Search Button
    And Check Managers Job level in Result

  @First @Sanity
  Scenario: To validate application Search by Key Influencers Job Level Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click On Job Level Filter
    And Click On Key Influencers Job Level Filter
    And Click on Search Button
    And Check Key Influencers Job level in Result

  @First @Sanity
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options

