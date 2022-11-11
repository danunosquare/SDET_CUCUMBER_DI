@Advanced
Feature: Ebay Advanced search Page

  @P23
  Scenario: Ebay Logo on Advanced Page

    Given I am Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay Home page


  @P24
  Scenario: Advanced search an item

    Given I am Ebay Advanced Search Page
    When I advanced search an item
    | keyword   | exclude       | min  | max  |
    | iPhone 11 | refurbished   | 300  | 900  |




