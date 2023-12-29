Feature: Check Test Status Monitoring page functionality

  @TC_ATSM_1
  Scenario Outline: Test Status Monitoring Page Visibility
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And User checks page visbility
    And Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |

  @TC_ATSM_2
  Scenario Outline: Verify Venue Selection Dropdown
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And User Verify the Value in Venue Selection
    And Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |

  @TC_ATSM_3
  Scenario Outline: Display Answer Status button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And User Clicks on Display Answer Status
    And Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |

  @TC_ATSM_4
  Scenario Outline: Update button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And User Clicks on Display Answer Status
    And User Clicks on Update button
    And Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |

  @TC_ATSM_5
  Scenario Outline: Logout button
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And User Clicks on Display Answer Status
    And Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+KT0001@edulabcbt.com | admin123 |
      
      

