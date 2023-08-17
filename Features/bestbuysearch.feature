Feature: Validate Bestbuy search

Scenario Outline: Validate Bestbuy search

Given user visit Bestbuy homepage
When user types "<productname>" and click search icon
Then user should be able to visit the expected product

Examples:
|productname|
| Lg oled Tv |
