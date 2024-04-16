Feature: To validate search function in snapdeal

  @smoke
  Scenario: To validate search box with product name
    Given user should be in snapdeal home page
    When user should enter the product name in search box
      | Product    | New Product |
      | mac laptop | sanitizer   |
    And user should click search button
    Then user will navigate to product page
