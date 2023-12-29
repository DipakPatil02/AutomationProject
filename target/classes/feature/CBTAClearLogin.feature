Feature: Clear Login

  Scenario Outline: Clear Login
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Navigate To New Login Screen
    Given User is on Login Page
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then Admin is on admin Screen
    Then Admin Enter valid Username and Password
      | Username                   | Password |
      | admin+JT4206@edulabcbt.com | admin123 |
    Then Admin Clicks On Login button
    Then Admin Clicks On Clear Login
    Then Admin Clicks On Examinees Number
    Then Admin Enters Examiness Number in Input Field
    Then Admin Clicks On Search
    Then Admin Clicks On Radio button
    Then Admin Clicks on Choice button
    Then Admin Clicks on Reset button
    Then Admin Clicks on Yes
    Then Admin Clicks On Logout button
    Then User Navigate To New Login Screen
    Then User Enter valid Username "<Username>"
    Then User Enters valid Password "<Password>"
    Then User Clicks On Login button
    Then User Clicks Username Down Arrow
    Then User Clicks on Logout button
    Then User Clicks on Return To LoginPage

    Examples: 
      | Username | Password |
      | gt0102   | cM7Q4Uvf |
