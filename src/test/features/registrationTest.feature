Feature: Verify user Registration
  As a new user
  I should be able to register and use the app.

  Scenario: Verify user direction to Registration page
    Given I'm on Home page "http://www.next.co.uk"
    When I click on My Account link
    When I click Register Now button
    Then I should on the sig  n uo page with text "Quick Secure Sign Up"