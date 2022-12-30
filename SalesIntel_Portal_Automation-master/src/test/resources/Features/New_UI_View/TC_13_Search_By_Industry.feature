Feature: To validate Search by Industry

  @First @Sanity
  Scenario: Open Application
    When Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To Validate search by Any of Industry Names Filter where Selected All
    When Click on Industry Filter
    And Click on Select All Check Box
    Then Click on Search Button
    And Click on the First Contact in Search Result

  @First @Sanity
  Scenario: To Validate search by Any Of Industry Names Filter where a single Industry is selected
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Industry Filter
    And Click on Industry Name Input box
    And Enter Industry Name
    And Click on Particular Industry
    And Click on Search Button
    And Click on the First Contact in Search Result
    Then Check the Industry in Search Result

  @First @Sanity
  Scenario: To Validate search by None Of Industry Names Filter Where Selected All
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Industry Filter
    And Click on None of Page
    And Click on Select All Check Box
    Then Click on Search Button
    And Click on the First Contact in Search Result

  @First @Sanity
  Scenario: To Validate search by None Of Industry Names Filter Where single Industry is selected
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Industry Filter
    And Click on None of Page
    And Click on Industry Name Input box
    And Enter Industry Name
    And Click on Particular Industry
    And Click on Search Button
    And Click on the First Contact in Search Result


  @First @Sanity
  Scenario: To Validate search by NAICS Codes in Industry Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Industry Filter
    And Click on NAICS or SIC Code page
    And CLick on NAICS Code input box
    And Enter NAICS Code
    And Click on Search Button
    And Click on the First Contact in Search Result
    Then Check Industry for NAICS code in Search Result


  @First @Sanity
  Scenario: To Validate search by SIC Codes in Industry Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Industry Filter
    And Click on NAICS or SIC Code page
    And Click on SIC Radio button
    And CLick on NAICS Code input box
    And Enter SIC Code
    And Click on Search Button
    And Click on the First Contact in Search Result
    Then Check Industry for SIC code in Search Result



  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options