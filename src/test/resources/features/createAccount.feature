# Autor Oscar Pacheco

  @stories
  Feature: Create a new account
    As a user, I want to create a new account
    @scenario1
    Scenario: Create an account.
      Given I am on the home page
      When I fill register form
      Then I should see the Created account page