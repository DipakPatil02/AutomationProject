@All
Feature: TestSummary Page Functionality
 
  @TC_TS_001
  Scenario Outline: Validate Wheather Return To Exam button Working Properly Or Not.
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Display Answer List
    Then User Clicks on Click on Return to Exam button
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

  #@TC_TS_002
  #Scenario Outline: Validate Wheather End Exam button Working Properly Or Not.
    #Given User is on Login Page
    #Then User Enter valid Username "<Username>"
    #Then User Enters valid Password "<Password>"
    #Then User Clicks On Login button
    #Then User Clicks on Go To Exam button
    #Then User Clicks on Next button
    #Then User Clicks on GotoTestStartScreenButton
    #Then User Clicks on TestStartbutton
    #Then User Clicks on option
    #Then User Clicks on Display Answer List
    #Then User Clicks on Click on End Exam button
#
    #Examples: 
      #| Username | Password |
      #| gt0102   | cM7Q4Uvf |

  @TC_TS_003
  Scenario Outline: Verify Wheather Return To Exam button is Displayed.
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Display Answer List
    Then Verify Return to Exam button Is Displayed
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

  @TC_TS_004
  Scenario Outline: Verify Wheather End Exam button is displayed.
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Display Answer List
    Then Verify End Exam button Is Displayed
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

  @TC_TS_005
  Scenario Outline: Validate Wheather User Clicks on Any Random Questions
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Display Answer List
    Then User Clicks on Question No17
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

  @TC_TS_006
  Scenario Outline: Verify TestSummaryPage Title
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Display Answer List
    Then User Verify TestSummary Page Title
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

  @TC_SP_08
  Scenario Outline: Verify Wheather  Answered Questions Should be Displayed InSky blue Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on Display Answer List
    Then User Checks the answered question status
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

  @TC_SP_09
  Scenario Outline: Verify Wheather UnAnswered Questions Should be Displayed in Orange Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on Display Answer List
    Then User checks Unanswered question status
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

  @TC_SP_10
  Scenario Outline: Verify Wheather Review Later Questions Should be Displayed in orange  Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on Display Answer List
    Then User checks Review later question status
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

  @TC_SP_11
  Scenario Outline: Verify Wheather Not Started Questions Should be Displayed in White Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on Display Answer List
    Then User checks Not visited question status
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
      Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
