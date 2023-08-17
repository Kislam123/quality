Feature: Validate Walmart search

Scenario Outline: Validate Walmart search

Given user visits Walmart homepage
When user type "<productname>" and click searchicon
Then user should be able to see the expected product

Examples:
|productname|
| LG Oled Tv |