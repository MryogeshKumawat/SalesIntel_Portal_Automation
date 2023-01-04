Feature: To validate SalesIntel Tab
  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url


  @First @Sanity
  Scenario: To Validate Search Box with Company Name in SalesIntel Tab
    When Check Search Box is displayed in SalesIntel Tab
    And Click on Search Box in SalesIntel Tab
    And Enter Company Name in the Search Box
    And Click on Search Button in The SalesIntel Tab
    And Click on Companies Tab
    And Validate the Searched Company Name In Search Result

  @First @Sanity
  Scenario: To Validate Search Box with Company Domain in SalesIntel Tab
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Search Box is displayed in SalesIntel Tab
    And Click on Search Box in SalesIntel Tab
    And Enter Company Domain in the Search Box
    And Click on Search Button in The SalesIntel Tab
    And Click on Companies Tab
    And Validate the Searched Company Domain In Search Result

  @First @Sanity
  Scenario: To Validate Recommended Lists in SalesIntel Tab
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Recommended List is displayed in SalesIntel Tab
    And Click on first Recommended List
    Then Validate Search Results for Recommended List


#  @First @Sanity
#  Scenario: To Validate Saved Searches in SalesIntel Tab
#    When Click On Clear Button
#    And Click On Do Not Save Button
#    And Check Saved Searches are displayed in SalesIntel Tab
#    And Click on the First Saved Search
#    Then Validate Search Result for Saved Searches


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options