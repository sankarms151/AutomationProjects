Feature: Leads feature in leaftaps application

@regression
Scenario: Create lead scenario with valid test data
#Given Set the Environment	
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successful
When Click on the crmsfa link
And Click on the leads tab
And Click on the create lead link
Given Enter the company name as TestLeaf
And Enter the first name as Gokul
And Enter the last name as Sekar
And Enter the phone number as 99
When Click on the submit button
Then Retrive and print the lead id

