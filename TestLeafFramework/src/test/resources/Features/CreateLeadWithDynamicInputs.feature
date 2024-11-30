Feature: Leads feature in leaftaps application

	@createLead @positive
  Scenario Outline: Create lead scenario with valid test data
    #Given Set the Environment
    And Enter the username as 'demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the login button
    Then Verify the login is successful
    When Click on the crmsfa link
    And Click on the leads tab
    And Click on the create lead link
    Given Enter the company name as "<cname>"
    And Enter the first name as "<fname>"
    And Enter the last name as "<lname>"
    And Enter the phone number as "<phno>"
    When Click on the submit button
    Then Retrive and print the lead id and verify the company name as "<cname>" and fist name as "<fname>" and last name as "<lname>"

    Examples: 
      # Provide dynamic input via pipeline , first row represent header and the following row will have data
      | cname    | fname | lname | phno |
      | TestLeaf | Gokul | Sekar |   99 |
      | Qeagle   | Babu  | M     |   98 |
