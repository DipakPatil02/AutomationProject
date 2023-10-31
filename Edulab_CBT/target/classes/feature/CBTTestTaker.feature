Feature: TestTaker Page Functionality

  @TC_TT_001
  Scenario Outline: Validate Option Checkbox button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks On Zoom In button
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

  @TC_TT_002
  Scenario Outline: Validate Next button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks On Next button on TestTaker Page
    Then User Clicks On Zoom In button
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

  @TC_TT_003
  Scenario Outline: Validate Return button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks On Next button on TestTaker Page
    Then User Clicks on Return button
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

  @TC_TT_004
  Scenario Outline: Validate Review Later button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks On Next button on TestTaker Page
    Then User Clicks on Review Later button
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

  @TC_TT_005
  Scenario Outline: Validate ZoomIn button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks On Zoom In button
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

  @TC_TT_006
  Scenario Outline: Validate ZoomOut button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Zoom Out button
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

  @TC_TT_007
  Scenario Outline: Validate RightArrow button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Left Arrow
    Then User Clicks on Right Arrow
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

  @TC_TT_008
  Scenario Outline: Validate LeftArrow button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Left Arrow
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

  @TC_TT_009
  Scenario Outline: Validate HideAll button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Hide All button
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

  @TC_TT_0010
  Scenario Outline: Validate ShowAll button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Hide All button
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

  @TC_TT_0011
  Scenario Outline: Validate Answer Status Downward Arrow
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks on option
    Then User Clicks on Answer Status Downward Arrow
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

  @TC_TT_0012
  Scenario Outline: Validate User Clicks on Any Question Number
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks On Any Question
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

  @TC_TT_0013
  Scenario Outline: Verify Wheather Not Started Questions Should be Displayed in White Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Verify The Not Started Question
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

  @TC_TT_0014
  Scenario Outline: Verify Wheather Review Later Questions Should be Displayed in Cream Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Verify The Review Later Question
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

  @TC_TT_0015
  Scenario Outline: Verify Wheather UnAnswered Questions Should be Displayed in Orange Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Verify The UnAnswered  Question
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

  @TC_TT_0016
  Scenario Outline: Verify Wheather  Answered Questions Should be Displayed InSky blue Colour
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Verify The Answered Question
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

  @TC_TT_0017
  Scenario Outline: Validate Complete Exam
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Give Complete Exam
    Then User Clicks on Display Answer List
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
      
      
@TC_TT_0018
 Scenario Outline: Complete Exam
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks on Go To Exam button
    Then User Clicks on Next button
    Then User Clicks on GotoTestStartScreenButton
    Then User Clicks on TestStartbutton
    Then User Clicks On Zoom In button
    Then User Clicks on Zoom Out button
    Then User Clicks on Hide All button
    Then User Clicks on Show All button
    Then User Clicks on Left Arrow
    Then User Clicks on Right Arrow
    Then User Give Complete Exam
    Then User Clicks on Display Answer List
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
    

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

