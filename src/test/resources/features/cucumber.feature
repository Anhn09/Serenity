Feature: Search for users in the OrangeHRM system

  Background:
    Given I access access to https://electronic.ec-suite.vn/
    And I select language is English
  Scenario: Verify delete Item on Compare Page is not success
    Given Select Shop By Categories > choose [Watches & Wearable Devices] option
    When At Category Page > Select Apple Branch, Color: White, Price: 0₫ - 10.000.000₫
    Then I should see username in the results list