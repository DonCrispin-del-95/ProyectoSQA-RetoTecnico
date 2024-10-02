Feature: Adding a product to a cart
   To add products to a cart
   you should search product and diferent options
   to add to the cart
   

Scenario: user can use the search option to find products with login
       Given I get into the page and i search a product in the searching bar
        When I click in the product to add a cart
        Then I can see the price of the prodcut


