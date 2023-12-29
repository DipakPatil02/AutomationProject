Feature: Check Test Status Monitoring page functionality

  @TC_ATSM_1
  Scenario Outline: Test Status Monitoring Page Visibility
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User checks page visbility
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_2
  Scenario Outline: Verify Venue Selection Dropdown
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Verify the Value in Venue Selection
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_3
  Scenario Outline: Display Answer Status button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Clicks on Display Answer Status
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_4
  Scenario Outline: Update button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Clicks on Display Answer Status
    Then User Clicks on Update button
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_5
  Scenario Outline: Leave button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Clicks on Display Answer Status
    Then User Clicks on Leave button
    Then User Clicks On Leave button Yes In PopUp
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_6
  Scenario Outline: Left button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Clicks on Display Answer Status
    Then User Clicks On Left button
    Then User Clicks On Left button Yes In PopUp
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_7
  Scenario Outline: Verify UI of Test Status Monitoring Page
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Clicks on Display Answer Status
    Then User Checks the UI of the Page
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |

  @TC_ATSM_8
  Scenario Outline: Logout button
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User clicks on the Test status monitoring button
    Then User Clicks on Display Answer Status
    Then Admin Clicks On Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |
