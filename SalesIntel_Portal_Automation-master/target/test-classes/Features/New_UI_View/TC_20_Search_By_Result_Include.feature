Feature: To validate Search by Results Include Filter

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Results Include Address
    When Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Address CheckBox
    And Click on Contact Radio Button
    And Click on Search Button
    Then Check Whether Results include Address

  @First @Sanity
  Scenario: To validate Search by Results Include Any Phone
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Any Phone CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Any Phone

  @First @Sanity
  Scenario: To validate Search by Results Include Any Direct Phone
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Any Direct Phone CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Any Direct Phone

  @First @Sanity
  Scenario: To validate Search by Results Include Any Mobile Phone
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Any Mobile Phone CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Any Mobile Phone

  @First @Sanity
  Scenario: To validate Search by Results Include Personal Email
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Personal Email CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Personal Email

  @First @Sanity
  Scenario: To validate Search by Results Include LinkedIn Url
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select LinkedIn Url CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include LinkedIn Url

  @First @Sanity
  Scenario: To validate Search by Results Include Title
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Title CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Title


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options