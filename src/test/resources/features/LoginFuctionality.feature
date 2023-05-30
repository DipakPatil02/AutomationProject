Feature: Testing multi user logins

  @regression
  Scenario Outline: Test login and logout
    Given Browser  is started
    #Then Data is cleared with <clearurl>
    Then CBT URL is hit
    Then Enter username as <Username> and password as <Password> and Click on Login1
    Then Go through instructions
    Then Take Exam

    #Then Logout
    Examples: 
      | Username | Password |
      | dm0006   | V7zghwB8 |
