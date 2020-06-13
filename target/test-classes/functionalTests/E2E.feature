Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End integration
#Scenario: Customer place an order by purchasing an item from search
#
#Given user is on Home Page
#When he search for "dress"
#When choose to buy the first item
#When moves to checkout from mini cart
#When enter personal details on checkout page
#When select same delivery address
#When select payment method as "CheckPayment" payment
#When place the order

Scenario: Customer place an order by purchasing a item from search
	Given user is on Home Page
	When he search for "dress"
	And choose to buy the first item
	And moves to checkout from mini cart
	And enter personal details on checkout page
	And select same delivery address
	And select payment method as "check" payment
	And place the order