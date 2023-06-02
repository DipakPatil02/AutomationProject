Feature: Testing multi user logins

  @test
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
      | tu0296   | xnQQwP3u |
