Feature: Login Feature
 
  Scenario: User should be able to sign in successfully
    Given I am on shopping site
    When I enter username
    And I enter password
    And I click on Sign in
    Then I should be on accounts page