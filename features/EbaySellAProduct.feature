@Sell
Feature: Ebay Sell a product

  @P31
  Scenario Outline: Sell a product using ebay
    Given I am on Ebay Home Page
    When I click on Sell link
    And I click on List an item button
    And I enter the product "<product>" and search
    Then I am navigated to prelist of similar products

    Examples:
    | product |
    | super hero comics goden age |