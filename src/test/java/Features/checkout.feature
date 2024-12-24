Feature: Checkout 
@PlaceOrder
Scenario Outline: Search , add and checkout the product 

Given User is on the green card landing page
When user searched with short name <Name> and abstract actual name of product
And Added "3" times of the selected product to the cart
Then User proceed to checkout and validate the <Name> items in the checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |
