Feature: Search and Place The order for products

@placeorder
Scenario Outline: Search Experience for product search in both home and offers page
Given user is on GreenKart Landing page
When user searched with shortform with <Name> and extracted the actual name of product
And Added "3" items of selected product to cart
Then user proceeds to checkout and validate the <Name> items in checkout page
And verify user has ability to enter promocode and place the order

Examples:
|Name|
|Tom|
|Beet|