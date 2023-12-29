Feature: Check Super Admin page functionality
@TC_SATSM_1
  Scenario Outline: Check Super Admin Test Status Monitoring
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the logout button

    Examples: 
      | Username        | Password |
      | admin@oneup.com | admin123 |
@TC_SATSM_2
  Scenario Outline: Super Admin Test Status Monitoring: Show Test Status
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the Show test status button
    And user clicks on the logout button

    Examples: 
      | Username        | Password |
      | admin@oneup.com | admin123 |
@TC_SATSM_3
  Scenario Outline: Admin Test Status Monitoring: (Indicate) 表示する
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the Show test status button
    And user clicks on the any indicate button
    And user clicks on the logout button

    Examples: 
      | Username        | Password |
      | admin@oneup.com | admin123 |
@TC_SATSM_4
  Scenario Outline: Super Admin Test Status Monitoring: Update(更新)
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the Show test status button
    And user clicks on the any indicate button
    And user clicks on the update button
    And user clicks on the logout button

    Examples: 
      | Username        | Password |
      | admin@oneup.com | admin123 |
@TC_SATSM_5
  Scenario Outline: Super Admin Test Status Monitoring: Select desired test center
    Given User is on Login Page
    When User Enter valid Username "<Username>"
    And User Enters valid Password "<Password>"
    And User Clicks On Login button
    And User clicks on the Test status monitoring button
    And user clicks on the Show test status button
    And User select center from the dropdown
    And Admin Clicks On Logout button

    Examples: 
      | Username        | Password |
      | admin@oneup.com | admin123 |
