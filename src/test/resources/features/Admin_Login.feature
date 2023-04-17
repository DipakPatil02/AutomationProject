Feature: Login feature for admin on Qa2 environment

  @smoke
  Scenario Outline: Perfrom test with admin login page on QA2 environment
    Given Browser is started
    Then CBT URL is hit
    When User enters username <Username> and password <Password>
    #Then Click on login button
    Then User logged in to super admin module homepage with title "管理画面"
    And I click on admin Logout button

    Examples: 
      | Username                   | Password |
      | admin+JT4600@edulabcbt.com | admin123 |
