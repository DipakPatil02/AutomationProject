Feature: Instruction Page Functionality
@TC_IP_001
Scenario Outline: Validate Next button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks Username Down Arrow
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
       	
      
@TC_IP_002
Scenario Outline: Validate Previous button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on Previous button
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |

@TC_IP_003
Scenario Outline: Validate GotoTestStartScreenButton 
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks Username Down Arrow
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    #And User Clicks on Logout button
    #And User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |


      
@TC_IP_004     
Scenario Outline: Verify InstructionPage Title 
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And Verify Instruction Page Title
    And User Clicks Username Down Arrow
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    
     Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
 

@TC_IP_009      
Scenario Outline: Verify Username dropdown arrow
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    #And User Clicks Username Down Arrow
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    
     Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |     
      
@TC_IP_010
Scenario Outline: Verify Username is correctly shown
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User checks Username on the instruction page
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    
     Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
      
 @TC_IP_005
Scenario Outline: Validate TestStartButton 
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on Esc button
    And User Clicks On Yes button
    
    

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |           
      
      