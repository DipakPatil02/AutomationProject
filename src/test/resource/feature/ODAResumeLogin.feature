   Feature: ResumeLogin Page Functionality

  @TC_TT_001
  Scenario Outline: Validate Resume Login Page 
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
    And User Navigate To New Login Screen
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    When Admin is on admin Screen
    And Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |
    And Admin Clicks On Login button
    And Admin Clicks On Resume Login
    And Admin Clicks On Examinees Number
    And Admin Enters Examiness Number in Input Field
    And Admin Clicks On Search
    And Admin Clicks On Radio button
    And Admin Clicks on Choice button
    And Admin Clicks on Reset button
    And Admin Clicks on Yes
    When User Navigate To New Login Screen
    And User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Resume Test
    And User Clicks on option
    And User Clicks On Next button on TestTaker Page
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
       	