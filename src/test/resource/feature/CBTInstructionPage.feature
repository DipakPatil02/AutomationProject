
Feature: Instruction Page Functionality
@TC_IP_001
Scenario Outline: Validate Next button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
      
@TC_IP_002
Scenario Outline: Validate Previous button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on Previous button
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

@TC_IP_003
Scenario Outline: Validate GotoTestStartScreenButton 
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |


      
@TC_IP_004     
Scenario Outline: Verify InstructionPage Title 
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then Verify Instruction Page Title
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage
    
     Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
      
@TC_IP_005
Scenario Outline: Validate TestStartButton 
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on Esc button
    Then User Clicks On Yes button
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
