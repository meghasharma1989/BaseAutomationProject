Feature: Verify google search
  As a User
  I should be able to search text in google app.

  Scenario: Verify text search direction in search page
    Given I'm on the search page "http://google.com"
    When I enter text "Test" in search text
    When I click on Search button
    Then I should be able to see result page with text "Test"
