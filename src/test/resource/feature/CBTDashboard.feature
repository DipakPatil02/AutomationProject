@All
Feature: Dashboard Page Functionality

@TC_DB_001
Scenario Outline: Validate Click on Go To Exam button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    Then User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
@TC_DB_003
Scenario Outline: Verify Dashboard Page Title
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then Verify Dashboard Page Title 
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage
    
     Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
@TC_DB_004_1
Scenario Outline: Verify Full screen mode using ESC button
 Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    Then User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
@TC_DB_005
Scenario Outline: Validate pop up no button
 Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Esc button
    Then User Clicks On No button
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage
    
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
@TC_DB_006
Scenario Outline: Validate Yes button
 Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    Then User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

@TC_DP_007
Scenario Outline: Verify User Name down arrow is working or not 
 Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage
    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
@TC_DP_008
Scenario Outline: Validate  logout hyperlink is working or not  
 Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |


@TC_DP_010
Scenario Outline: Verify Go to Exam button is Displayed  
 Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then Verify Go To Exam button is Displayed 
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage
    
    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
      

