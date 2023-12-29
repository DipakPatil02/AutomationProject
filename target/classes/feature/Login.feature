@All
Feature: Login Page Functionality
  @TC_LP_001
  Scenario Outline: Login With Valid Credentials
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    When User Enters valid Password "<Password>"
    When User Clicks On Login button
     

    Examples: 
      | Username | Password |
      | dm0101   | eM2wGagP |
  @TC_LP_002
  Scenario Outline: Login With InValid Credentials
    Given User is on Login Page
    When User Enter Invalid Username "<Username>"
    When User Enters Invalid Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt       | J5       |

  @TC_LP_003
  Scenario Outline: Login With Numeric Credentials
    Given User is on Login Page
    When User Enter Numeric Username "<Username>" and Numeric Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      |  2673672 |   243263 |

  @TC_LP_004
  Scenario Outline: Login With AlphaNumericCredentials
    Given User is on Login Page
    When User Enter AlphaNumericUsername Username "<Username>" and AlphaNumericUsername Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      | dm0101   | Qt7sDpx  |

  @TC_LP_005
  Scenario Outline: Login With Blank Credentials
    Given User is on Login Page
    When User Enter blank Username "<Username>" and Blank Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      |          |          |

  @TC_LP_006_01
  Scenario Outline: Login With Valid Username and Blank Password
    Given User is on Login Page
    When User Enter Valid username as "<Username>"
    When User Enters Blank Password as "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      | dm0101   |          |

  @TC_LP_006_02
  Scenario Outline: Login With invalid username and blank password
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    When User Enters valid Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      | dm953278 |          |

  @TC_LP_007_1
  Scenario Outline: Login With Blank Username and Valid Password
    Given User is on Login Page
    When User Enters Blank Username "<Username>"
    When User Enters valid Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password   |
      |          | J5Qt7sDpxZ |

  @TC_LP_007_2
  Scenario Outline: Login With Blank Username and invalid Password Field
    Given User is on Login Page
    When User Enters valid Username "<Username>"
    When User Enters blank Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password |
      |          |   ghjshs |

  @TC_LP_008
  Scenario Outline: Login With Valid Uname and invalid Password Field
    Given User is on Login Page
    When User Enters valid Username "<Username>"
    When User Enters invalid Password "<Password>" in Password Field
    When User Clicks On Login button

    Examples: 
      | Username | Password   |
      | dm0101   | J5Qt7sDpxZ |

  @TC_LP_009
  Scenario Outline: Login With inValid Username and valid Password Field
    Given User is on Login Page
    When User Enters invalid Username "<Username>"
    When User Enters valid Password "<Password>"
    When User Clicks On Login button

    Examples: 
      | Username | Password   |
      | dm010124 | J5Qt7sDpxZ |

  @TC_LP_010
  Scenario: Verify Login Page Url
    Given User is on Login Page
    When Login Page Url
    
 @TC_LP_011
  Scenario Outline: Verify Login Page Title
    Given User is on Login Page
    Then Verify Login Page Title
    
 @TC_LP_012
  Scenario Outline: Validate Eye button 
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    When User Enters valid Password "<Password>"
    When User Clicks On EyeButton
    
    Examples: 
      | Username | Password |
      | dm0101   | eM2wGagP |
  @TC_LP_014
 Scenario Outline: To check already to device message
    Given User is on Login Page
    When User Enter valid Username "<Username>"
   	And User Enters valid Password "<Password>"
   	And User Clicks On Login button
    And User Navigate To New Login Screen
    Given User is on Login Page
    And User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    Then user check error message
    Examples:
      | Username | Password |
      | dm0101   | eM2wGagP |

   @TC_LP_015 
 Scenario Outline: Verify user ID message
    Given User is on Login Page
    Then Verify User ID message
    
     @TC_LP_016 
 Scenario Outline: Verify password message
    Given User is on Login Page
    Then Verify Password message
    
