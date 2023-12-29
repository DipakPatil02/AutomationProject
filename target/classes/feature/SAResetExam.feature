    Feature: ResetExam Page Functionality

  @TC_TT_001
  Scenario Outline: Reset Exam button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    When Admin Enter valid Username and Password
      | Username        | Password |
      | admin@oneup.com | admin123 |
    And Admin Clicks On Login button
    And Admin Clicks On Exam Reset
    And Admin Clicks On Examinees Number
    And Admin Enters Examiness Number in Input Field
    And Admin Clicks On Search
    And Admin Clicks On Radio button
    And Admin Clicks on Choice button
    And Admin Clicks on Reset button
    And Admin Clicks on Yes
    And Admin Clicks On Logout button

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
       	