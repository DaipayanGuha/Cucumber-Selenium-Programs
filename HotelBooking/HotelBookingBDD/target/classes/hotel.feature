Feature: Hotel Booking feature
Scenario: User is trying to Book a Hotel with invalid set of details

Given User is accessing Booking page on browser
When user is trying to submit data without entering First name
Then  'First name should not be empty / length be between 5 to 12' alert message should display

When user is trying to submit data without entering Last name
Then  'Last name should not be empty' alert should be displayed

When user is trying to submit data without entering Email ID
Then  'Email ID should not be empty' alert should be displayed

When user is trying to submit data without entering mobile no
Then  'Mobile No. should not be empty' alert should be displayed

When user is trying to submit data without entering Address
Then  'Address should not be empty' alert should be displayed

When user is trying to submit data without entering valid 'city'
Then  'Select your city from the list' alert message should display

When user is trying to submit data without entering valid 'State'
Then  'Select your state from the list' alert message should display



 	When  User is trying to submit request without selecting  valid 'guests'
Then  'Select Number of guest staying from the list' alert message should display
 	 
 	 
 	 When  User is trying to submit request without entring 'Debit Card Number'
 	 Then  'Debit Card Number must not be empty and must have numeric characters only' alert message should display
 	 
 	 When  User is trying to submit request without entring 'CVV'
 	 Then  'CVV must not be empty' alert message should display
 	 
 	 When  User is trying to submit request without entring 'Expiration Month'
 	 Then  'Expiration Month must not be empty and must have numeric characters only' alert message should display
 	 
 	 When  User is trying to submit request without entring 'Expiration Year'
 	 Then  'Expiration Year must not be empty and must have numeric characters only' alert message should display
 	 
 	 Scenario: user is trying to register using valid set of details
 	  Given  User is on RegistrationPage on Borwser
 	  When  User is trying to submit request after entring valid set of information 
 	  Then 'Your Registration with HotelWorld.com has successfully done plz check your registred email addres to activate your booking' alert message should display





