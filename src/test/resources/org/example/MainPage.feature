Feature: Google Search
  These tests will verify the functionality of the Google Search

  Scenario: Valid Google search
    Given I am on the Google search page
    When I search for "Selenium"
    Then the page title should start with "selenium"