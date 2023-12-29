Feature: Password Reset
@TC_APR_1
Scenario Outline: Password Reset(Yes click)
    
    When Admin is on admin Screen
    And Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |
    And Admin Clicks On Login button
    And Admin Clicks on Reset Password
    And Admin Clicks On Examinee Number
    And Admin Enters Examinee Number in Input Field
    And Admin Clicks On Search
    And Admin Clicks On Radio button
    And Admin Clicks on Choice button
    And Admin Enters New password in the box
    And Admin clicks on reset password btn
    And Admin Clicks on Yes
    And Admin Clicks On Logout button
    #And User Navigate To New Login Screen
    #Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    
    Examples: 
      | Username | Password |
      | dm0324   |  1234567 |
 
 @TC_APR_2     
 Scenario Outline: Password Reset(No click)
    
    When Admin is on admin Screen
    And Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |
    And Admin Clicks On Login button
    And Admin Clicks on Reset Password
    And Admin Clicks On Examinee Number
    And Admin Enters Examinee Number in Input Field
    And Admin Clicks On Search
    And Admin Clicks On Radio button
    And Admin Clicks on Choice button
    And Admin Enters New password in the box
    And Admin clicks on reset password btn
    And Admin Clicks on No btn
    And Admin Clicks On Logout button
    And User Navigate To New Login Screen
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    
    Examples: 
      | Username | Password |
      | dm0324   |  1234567 |   
      
      
       