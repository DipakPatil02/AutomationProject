Feature: Check Test complete page functionality
 Scenario Outline: Validate Complete Exam
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on Display Answer List
    Then User Clicks on End test
    Then User Clicks on Yes in popup
    Then User Checks Submit Check
    Then User Check submit message
    Then User Check Answer sent message
    Examples:
      | Username | Password |
      | gt0104   | k4LzsGJQ |