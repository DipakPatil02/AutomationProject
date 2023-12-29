Feature: Check Test complete page functionality
 Scenario Outline: Validate Complete Exam
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on Display Answer List
    And User Clicks on End test
    And User Clicks on Yes in popup
    And User Checks Submit Check
    And User Check submit message
    And User Check Answer sent message
    Examples:
      | Username | Password |
      | dm0323   | bZ5DVnih |
      
      				