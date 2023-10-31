@All
Feature: Login Page Functionality

  @TC_LP_001
  Scenario Outline: Login With Valid Credentials
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |

  @TC_LP_002
  Scenario Outline: Login With InValid Credentials
    Given User is on Login Page
    Then User Enter Invalid Username "<Username>"
    Then User Enters Invalid Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt       | J5       |

  @TC_LP_003
  Scenario Outline: Login With Numeric Credentials
    Given User is on Login Page
    Then User Enter Numeric Username "<Username>" and Numeric Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      |  2673672 |   243263 |

  @TC_LP_004
  Scenario Outline: Login With AlphaNumericCredentials
    Given User is on Login Page
    Then User Enter AlphaNumericUsername Username "<Username>" and AlphaNumericUsername Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt0101   | Qt7sDpx  |

  @TC_LP_005
  Scenario Outline: Login With Blank Credentials
    Given User is on Login Page
    Then User Enter blank Username "<Username>" and Blank Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      |          |          |

  @TC_LP_006_01
  Scenario Outline: Login With Valid Username and Blank Password
    Given User is on Login Page
    Then User Enter Valid username as "<Username>"
    Then User Enters Blank Password as "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt0101   |          |

  @TC_LP_006_02
  Scenario Outline: Login With invalid username and blank password
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt953278 |          |

  @TC_LP_007_1
  Scenario Outline: Login With Blank Username and Valid Password
    Given User is on Login Page
    Then User Enters Blank Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password   |
      |          | J5Qt7sDpxZ |

  @TC_LP_007_2
  Scenario Outline: Login With Valid Uname and Blank Password Field
    Given User is on Login Page
    Then User Enters valid Username "<Username>"
    Then User Enters blank Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password |
      | gt0101   |          |

  @TC_LP_008
  Scenario Outline: Login With Valid Uname and invalid Password Field
    Given User is on Login Page
    Then User Enters valid Username "<Username>"
    Then User Enters invalid Password "<Password>" in Password Field
    Then User Clicks On Login button

    Examples: 
      | Username | Password   |
      | gt0101   | J5Qt7sDpxZ |

  @TC_LP_009
  Scenario Outline: Login With inValid Username and valid Password Field
    Given User is on Login Page
    Then User Enters invalid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button

    Examples: 
      | Username | Password   |
      | gt010124 | J5Qt7sDpxZ |

  @TC_LP_010
  Scenario: Verify Login Page Url
    Given User is on Login Page
    Then Login Page Url
    
 @TC_LP_011
  Scenario Outline: Verify Login Page Title
    Given User is on Login Page
    Then Verify Login Page Title
    
 @TC_LP_012
  Scenario Outline: Validate Eye button 
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On EyeButton
    
    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
     
    
    
    
