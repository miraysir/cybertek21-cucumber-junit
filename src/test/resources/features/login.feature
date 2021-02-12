@1
Feature:Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  @Background: User is already in login page
    Given user is on the login page

@librarian @employee
  Scenario: Login as a librarian
    When user enters librarian username
    And user enter librarian password
    Then user should see dashboard

@student
  Scenario: Login as a student
    When user enters student username
    And user enter student password
    Then user should see dashboard
@admin @employee
    Scenario: Login as admin
      When user enters admin username
      And user enter admin password
      Then user should see dashboard







