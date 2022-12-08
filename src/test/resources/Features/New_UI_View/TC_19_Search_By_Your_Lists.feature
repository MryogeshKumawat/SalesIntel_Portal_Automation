Feature: To validate Search by Your Lists Filter

  @First @Sanity
  Scenario: Launch Website
    When Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button


  @First @Sanity
  Scenario: To validate Search By All Company Lists
    When Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Select All Companies List
    And Click on Company Radio Button
    And Click on Search Button
    And Check the search results of Company lists

  @First @Sanity
  Scenario: To validate Search By one Company List
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check One Company list is displayed
    And Select One Company List
    And Click on Company Radio Button
    And Click on Search Button
    And Check the search results of Company lists


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options