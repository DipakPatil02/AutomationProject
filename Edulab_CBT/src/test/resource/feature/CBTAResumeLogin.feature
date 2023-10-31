   Feature: ResumeLogin Page Functionality

  @TC_TT_001
  Scenario Outline: Validate Resume Login Page 
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
    Then User Navigate To New Login Screen
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then Validate Error Message 
    Then Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |
    Then Admin Clicks On Login button
    Then Admin Clicks On Resume Login
    Then Admin Clicks On Examinees Number
    Then Admin Enters Examiness Number in Input Field
    Then Admin Clicks On Search
    Then Admin Clicks On Radio button
    Then Admin Clicks on Choice button
    Then Admin Clicks on Reset button
    Then Admin Clicks on Yes
    Then User Navigate To New Login Screen
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Resume Test
    Then User Clicks on option
    Then User Clicks On Next button on TestTaker Page
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    Then User Clicks On Yes button
    Then User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |