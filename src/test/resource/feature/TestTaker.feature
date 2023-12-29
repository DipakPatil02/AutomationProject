Feature: TestTaker Page Functionality

  @TC_TT_001
  Scenario Outline: Validate Option Checkbox button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks On Zoom In button
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
      | dm0321   | eP79n3Hu |
       	

  @TC_TT_002
  Scenario Outline: Validate Next button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks On Next button on TestTaker Page
    And User Clicks On Zoom In button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_003
  Scenario Outline: Validate Return button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks On Next button on TestTaker Page
    And User Clicks on Return button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_004
  Scenario Outline: Validate Review Later button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks On Next button on TestTaker Page
    And User Clicks on Review Later button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_005
  Scenario Outline: Validate ZoomIn button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks On Zoom In button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_006
  Scenario Outline: Validate ZoomOut button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Zoom Out button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_007
  Scenario Outline: Validate RightArrow button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Left Arrow
    And User Clicks on Right Arrow
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
      | dm0321   | eP79n3Hu |

  @TC_TT_008
  Scenario Outline: Validate LeftArrow button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Left Arrow
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
      | dm0321   | eP79n3Hu |

  @TC_TT_009
  Scenario Outline: Validate HideAll button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Hide All button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0010
  Scenario Outline: Validate ShowAll button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Hide All button
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0011
  Scenario Outline: Validate Answer Status Downward Arrow
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks on option
    And User Clicks on Answer Status Downward Arrow
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0012
  Scenario Outline: Validate User Clicks on Any Question Number
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Clicks On Any Question
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0013
  Scenario Outline: Verify Wheather Not Started Questions Should be Displayed in White Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Verify The Not Started Question
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0014
  Scenario Outline: Verify Wheather Review Later Questions Should be Displayed in Cream Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Verify The Review Later Question
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0015
  Scenario Outline: Verify Wheather UnAnswered Questions Should be Displayed in Orange Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Verify The UnAnswered  Question
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0016
  Scenario Outline: Verify Wheather  Answered Questions Should be Displayed InSky blue Colour
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Verify The Answered Question
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
      | dm0321   | eP79n3Hu |

  @TC_TT_0017
  Scenario Outline: Validate Display Answer List
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Give Complete Exam
    And User Clicks on Display Answer List
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
      | dm0321   | eP79n3Hu |
      
      
@TC_TT_0018      
 Scenario Outline: Verify test taker page title
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Verify Test Taker page Title
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
      | dm0321   | eP79n3Hu |
@TC_TT_0019      
Scenario Outline: Verify Examinee number on test taker page
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Checks Examinees number
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
      | dm0321   | eP79n3Hu |      
      
      
      
@TC_TT_0020
 Scenario Outline: Complete Exam
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User Clicks on Go To Exam button
    And User Clicks on Next button
    And User Clicks on GotoTestStartScreenButton
    And User Clicks on TestStartbutton
    And User Verify Test Taker page Title
    And User Checks Examinees number
    And User Clicks on option
		And User Clicks On Next button on TestTaker Page
		And User Clicks on Return button
		And User Clicks on Review Later button
		And User Clicks On Any Question
		And User Verify The Answered Question
		And User Verify The UnAnswered  Question
		And User Verify The Review Later Question
		And User Verify The Not Started Question
    And User Clicks On Zoom In button
    And User Clicks on Zoom Out button
    And User Clicks on Hide All button
    And User Clicks on Show All button
    And User Clicks on Answer Status Downward Arrow
    And User Clicks on Right Arrow
    And User Clicks on Left Arrow
    And User Clicks on Display Answer List
    #And User Give Complete Exam
    And User Clicks on Esc button
    And User Clicks On No button
    And User Clicks on Esc button
    And User Clicks On Yes button
   # And User Clicks on Return To LoginPage
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
    

    Examples: 
      | Username | Password |
      | dm0321   | eP79n3Hu |

