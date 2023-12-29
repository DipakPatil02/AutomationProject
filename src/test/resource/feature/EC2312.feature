Feature: Auto submit functionality check

 @CBT_EC-2312_001
  Scenario Outline: Validate Auto submission on Test Taker page
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
    When Admin is on admin Screen
    And Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+MT0001@edulabcbt.com | admin123 |
    And Admin Clicks On Login button
    And Admin Clicks On Resume Login
    And Admin Clicks On Examinees Number
    And Admin Enters Examinee1 Number in Input Field
    And Admin Clicks On Search
    And Admin Clicks On Radio button
    And Admin Clicks on Choice button
    And Admin Clicks on Minutes Adjustment
    And Admin enters minutes
    And Admin Clicks on Seconds Adjustment
    And Admin enters seconds
    And Admin Clicks On Confirm Resume Login
    And Admin Clicks on Yes
    #When User Navigate To New Login Screen
    #When User Enter valid Username "<Username>"
    #And User Enters valid Password "<Password>"
    #And User Clicks On Login button
    #And User Clicks on Resume Exam
    #And User Clicks on option
    #And User Clicks On Next button on TestTaker Page
    #And User waits for the timeUp Popup
    #And User Clicks any button
        
     Examples: 
      | Username | Password |
      | dm0451   | f7HA6Dxe |
 
 @CBT_EC-2312_002
  Scenario Outline: Check Exam status for examinee on admin page
    When User Navigate To New Login Screen
    #Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the Show test status button
    And user Checks status for user1
    And user clicks on the logout button

    Examples: 
      | Username                   | Password |
      | admin+MT0001@edulabcbt.com | admin123 |         
      
@CBT_EC-2312_003
  Scenario Outline: Validate Auto submission on Test summary page
    When User Navigate To New Login Screen
    #Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Escape button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    When Admin is on admin Screen
    And Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+MT0001@edulabcbt.com | admin123 |
    And Admin Clicks On Login button
    And Admin Clicks On Resume Login
    And Admin Clicks On Examinees Number
    And Admin Enters Examinee2 Number in Input Field
    And Admin Clicks On Search
    And Admin Clicks On Radio button
    And Admin Clicks on Choice button
    And Admin Clicks on Minutes Adjustment
    And Admin enters minutes
    And Admin Clicks on Seconds Adjustment
    And Admin enters seconds
    And Admin Clicks On Confirm Resume Login
    And Admin Clicks on Yes
    When User Navigate To New Login Screen
    #When User Enter valid Username "<Username>"
    #And User Enters valid Password "<Password>"
    #And User Clicks On Login button
    #And User Clicks on Resume Exam
    #And User Clicks on option
    #And User Clicks On Next button on TestTaker Page
    #And User Clicks on Display Answer List
    #And User checks if the timeout popup is present
    #
        
     Examples: 
      | Username | Password |
      | dm0449   | Zu9h7gFc |
      
@CBT_EC-2312_004
  Scenario Outline: Check Exam status for examinee on admin page
    And Admin is on admin Screen
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the Show test status button
    And user Checks status for user2
    And user clicks on the logout button

    Examples: 
      | Username                   | Password |
      | admin+MT0001@edulabcbt.com | admin123 |     