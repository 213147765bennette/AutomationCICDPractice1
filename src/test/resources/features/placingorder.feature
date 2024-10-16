@regression
Feature: Placing order

  Scenario: As a user i want to be able to order a cellphone
	Given User can be able to login with valid credentials
	When user clicks on login link
	And User enter valid "admin" and "admin"
	And User press login button
	Then user is presented with a homepage screen
	And User clicks on the item to order
	And User press Add to cart button
	And User click on ok dialog button
	And User clicks on cart link text
	And User press on Place Order button
	And User fills in "bennette" and "card123" information
	And User press the Purchase button
	And Order is printed out
