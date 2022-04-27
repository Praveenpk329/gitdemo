Feature: Search and Place The order for products
@offerspage
Scenario Outline: Search Experience for product search in both home and offers page
Given user is on GreenKart Landing page
When user searched with shortform with <Name> and extracted the actual name of product
Then user searched for <Name> shortform name in offers page 
And to validate that the product exists

Examples:
|Name|
|Tom|
|Beet|