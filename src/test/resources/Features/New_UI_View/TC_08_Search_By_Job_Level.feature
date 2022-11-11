Feature: Validate Search By Job Level

#  @First @Sanity
#  Scenario: To validate SalesIntel application Valid User Username and Valid Password
#    And Enter Valid Username
#    And Enter Valid Password
#    And Click On Login Button

  @First @Sanity
  Scenario: To validate application Job Level is displayed
    When Click On Clear Button
    And Click On Do Not Save Button
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

































#  @First @Sanity
#  Scenario: To validate application Search By Job Level section contents
#    When Verify Role Section is displayed
#    When Verify Job Level is displayed
#
#  @First @Sanity
#  Scenario: To validate application Search without Job Level
#    Then Click on Search Button

#  @First @Sanity
#  Scenario: To validate application Search by All Job Level
#    When Click On Contact Tab
##    When Clear the Text in First Name Field
##    And Clear the Text in Last Name Field
#    And Enter the Search First Name1
#    And Enter the Search Last Name1
#    Then Click On Job Level
#    When Verify Job Level Select All Option is displayed
#    And Click On Job Level Select All Option
#    Then Click on Search Button
#    And Click On Job Level Select All Option
#
#  @First @Sanity
#  Scenario: To validate application Search by Board Members Job Level
#    When Verify Job Level Board Member Option is displayed
#    And Click On Job Level Board Member Option
#    Then Click on Search Button
#    And Click On Job Level Board Member Option
#
#  @First @Smoke @Reg
#  Scenario: To validate application Search by C-Level Executives Job Level
#    When Verify Job Level C-Level Executive Option is displayed
#    And Click On Job Level C-Level Executive Option
#    Then Click on Search Button
#    And Click On Job Level C-Level Executive Option
#
#  @First @Smoke @Reg
#  Scenario: To validate application Search by Vice Presidents Job Level
#    When Verify Job Level Vice President Option is displayed
#    And Click On Job Level Vice President Option
#    Then Click on Search Button
#    And Click On Job Level Vice President Option
#
#  @First @Smoke @Reg
#  Scenario: To validate application Search by Directors Job Level
#    When Verify Job Level Directors Option is displayed
#    And Click On Job Level Directors Option
#    Then Click on Search Button
#    And Click On Job Level Directors Option
#
#  @First @Smoke @Reg
#  Scenario: To validate application Search by Managers Job Level
#    When Verify Job Level Managers Option is displayed
#    And Click On Job Level Manager Option
#    Then Click on Search Button
#    And Click On Job Level Manager Option
#
#
#  @First @Smoke @Reg
#  Scenario: To validate application Search by Key Influences Job Level
