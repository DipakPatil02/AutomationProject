@All
Feature: Dashboard Page Functionality

@TC_DB_001
Scenario Outline: Validate Click on Go To Exam explaination page button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    
    
 	
    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
@TC_DP_002
Scenario Outline: Verify UserName down arrow is Displayed
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Verify Username Down Arrow
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    And User Clicks on Return To LoginPage
    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |      
@TC_DB_003
Scenario Outline: Verify Dashboard Page Title
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And Verify Dashboard Page Title 
    And User Clicks Username Down Arrow
     Then User Clicks on Esc button
    Then User Clicks On Yes button
    And User Clicks on Return To LoginPage
    
     Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
@TC_DB_004_1
Scenario Outline: Verify Full screen mode using ESC button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
@TC_DB_005
Scenario Outline: Validate pop up no button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Esc button
    And User Clicks On No button
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    
    

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
@TC_DB_006
Scenario Outline: Validate Yes button
 Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |

@TC_DP_007
Scenario Outline: Verify User Name down arrow is working or not 
 Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
@TC_DP_008
Scenario Outline: Validate  logout hyperlink is working or not  
 Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |

@TC_DP_09
Scenario Outline: UI functionality check
 		Given User is on Login Page
 		When User Enter valid Username "<Username>" 
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User check the Exam logo
    And User Checks the timer
    And User Checks the number of questions
   And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
        
     Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
@TC_DP_010
Scenario Outline: Verify Go to Exam instruction page button is Displayed  
 Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And Verify Go To Exam button is Displayed 
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    
    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
 @TC_DP_011
 Scenario Outline: Verify User Name is correctly shown    
 		Given User is on Login Page
 		When User Enter valid Username "<Username>" 
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Checks Username
    And User Clicks Username Down Arrow
    And User Clicks on Logout button
    And User Clicks on Return To LoginPage
    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
