@All
Feature: TestSummary Page Functionality
 
  @TC_TS_001
  Scenario Outline: Validate Wheather Return To Exam button Working Properly Or Not.
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Clicks on Click on Return to Exam button
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
      | gt0102   | cM7Q4Uvf |

  @TC_TS_002
  Scenario Outline: Validate Wheather End Exam button Working Properly Or Not.
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Clicks on Click on End Exam button
    And User Clicks on Close popUp
    And User Clicks on Esc button
    And User Clicks On Yes button 
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
      | gt0102   | cM7Q4Uvf |

 @TC_TS_005
  Scenario Outline: Validate Wheather User Clicks on Any Random Questions
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Clicks on Question No17
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    And User navigate to new login window

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |     



  @TC_TS_006
  Scenario Outline: Verify TestSummaryPage Title
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Verify TestSummary Page Title
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    And User navigate to new login window

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
 @TC_TS_007
  Scenario Outline: VerifyQuestion status is displayed
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Verify Question Status is displayed
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    And User navigate to new login window

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |      

  @TC_SP_08
  Scenario Outline: Verify Wheather  Answered Questions Should be Displayed InSky blue Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on Display Answer List
    And User Checks the answered question status
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    And User navigate to new login window

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

  @TC_SP_09
  Scenario Outline: Verify Wheather UnAnswered Questions Should be Displayed in Orange Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on Display Answer List
    And User checks Unanswered question status
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    Then Admin Clicks On Logout button
    And User navigate to new login window

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

  @TC_SP_10
  Scenario Outline: Verify Wheather Review Later Questions Should be Displayed in Cream Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on Display Answer List
    And User checks Review later question status
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    And User navigate to new login window

     
      Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

  @TC_SP_11
  Scenario Outline: Verify Wheather Not Started Questions Should be Displayed in White Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on Display Answer List
    And User checks Not visited question status
    And User Clicks on Esc button
    And User Clicks On Yes button
    And User Clicks On Yes button
    And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
    And User navigate to new login window

      Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
      
  @TC_TS_003
  Scenario Outline: Validate if User clicks on No in comfirmation Pop Up.
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Clicks on Click on End Exam button
    And User Clicks On No
    #And User Clicks on Esc button
    #And User Clicks On Yes button
    #And User Clicks On Yes button
    #And User Clicks on Return To LoginPage
    And Admin is on admin Screen
    And Admin Enter valid Username and Password
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
      | gt0102   | cM7Q4Uvf |
      
      
      
@TC_SP_12     
Scenario Outline: Validate Complete Test Summary Page.
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Display Answer List
    And User Clicks on Click on Return to Exam button
    And User Clicks on Display Answer List
    And User Clicks on Question No17
    And User Clicks on Display Answer List
    And User Clicks on Click on End Exam button
    And User Clicks On No
    And User Verify TestSummary Page Title
    And User Verify Question Status is displayed
    And User Checks the answered question status
 		And User checks Unanswered question status
		And User checks Review later question status
		And User checks Not visited question status
    And User Clicks on Esc button
    #And User Clicks On Yes button
    #And User Clicks On Yes button
    #And User Clicks on Return To LoginPage
    #And Admin is on admin Screen
    #And Admin Enter valid Username and Password
      #| Username        | Password |
      #| admin@oneup.com | admin123 |
    #And Admin Clicks On Login button
    #And Admin Clicks On Exam Reset
    #And Admin Clicks On Examinees Number
    #And Admin Enters Examiness Number in Input Field
    #And Admin Clicks On Search
    #And Admin Clicks On Radio button
    #And Admin Clicks on Choice button
    #And Admin Clicks on Reset button
    #And Admin Clicks on Yes
    #And Admin Clicks On Logout button
  
    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |
       	