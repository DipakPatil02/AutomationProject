    Feature: ResetExam Page Functionality

  @TC_TT_001
  Scenario Outline: Reset Exam button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    Then User Clicks On Yes button
    Then User Clicks on Return To LoginPage
    Then Admin is on admin Screen
    Then Admin Enter valid Username and Password
      | Username        | Password |
      | admin@oneup.com | admin123 |
    Then Admin Clicks On Login button
    Then Admin Clicks On Exam Reset
    Then Admin Clicks On Examinees Number
    Then Admin Enters Examiness Number in Input Field
    Then Admin Clicks On Search
    Then Admin Clicks On Radio button
    Then Admin Clicks on Choice button
    Then Admin Clicks on Reset button
    Then Admin Clicks on Yes
    Then Admin Clicks On Logout button

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |