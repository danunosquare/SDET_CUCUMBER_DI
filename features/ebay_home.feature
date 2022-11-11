@home
Feature: Ebay Home Page scenarios

  @P1
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advance Link
    Then I navigate to advanced Search Page

    @P2 @setCookies
    Scenario: Search items count
      Given I am on Ebay Home Page
      When I search for 'iphone 11'
      Then I validate at least 1000 search items present

  @P3 @setCookies
  Scenario: Search items count with 2 arguments
    Given I am on Ebay Home Page
    When I search for 'pintura' in 'Arte' category
    Then I validate at least 1000 search items present

  @P4 @setCookies
  Scenario Outline: Home Page links

    Given I am on Ebay Home Page
    When I click on '<link>' link
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples:
    | link | url | title |
    | Moda | https://mx.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Ropa |
    | Deportes | https://mx.ebay.com/b/Sporting-Goods/888/bn_1865031 | deportivos |