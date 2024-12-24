Feature: Search and add product
@OfferPage
Scenario Outline: Testing 

Given User is on the green card landing page
When user searched with short name <Name> and abstract actual name of product
Then user search for same <Name> short name  on offer page to check if product exists

Examples:
| Name |
| Tom  |
|Tom  |
