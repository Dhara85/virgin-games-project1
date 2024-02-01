@regression
Feature: Login feature
  In order to check functionality of Homepage page
  As a User
  I have to follow steps to fulfill all the requirements

  Background: User is on homepage
    Given I am on homepage

  Scenario: User should landed successfully to privacy policy page
  When I scroll down to footer
  Then I should be able to see a privacy policy text "Privacy Policy"
  And  I click on privacy policy button
  Then  I should navigate to the "https://www.virgingames.com/privacypolicy" page
  Then  I should get a "PRIVACY POLICY" title




