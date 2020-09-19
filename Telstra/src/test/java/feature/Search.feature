Feature: Search Functionality for Amazon Mobile Application

 Background: User is Logged in
   Given User navigates to the signin page
   When User submit username and password
   Then User should be logged in
 
 Scenario: Verify Search Functionality
   When User searches for the "<item>"
   Then User Adds the item to the cart
   And  Verifies the details at the Checkout
   
   
