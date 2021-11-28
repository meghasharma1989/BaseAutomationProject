Feature: verify groceries section in asda home page
  As a User
  I should be able to use groceries section

  Scenario: Verify asda search direction to products page.

    Given I'm on asda home page "https://www.asda.com/"
    When I click on Groceries section
    When  I click on Fruit, Veg & Salad button
    When I click on Fruit button
    When I click on Apples button
    Then  I should be able to see result page with text "Apples"
