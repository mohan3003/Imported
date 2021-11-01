Feature:  To validate the login functionality
Background: 
Given The user should be in the login page
Scenario Outline: To validate login with valid user Name and password. 
#Given The user should be in the login page
When The user should enter user name"<email>"and password"<password>"
#When The user should register to the accountThen The user should be able to get into their account

Examples:
|email|password|
|phoebe@gmail.com|buffay@321|


Scenario: To validate login with valid user Name and password
When The user should enter invalid user name and password
|UserName|Password||Postalcode|
|chandler|Bing@123||GU16 7HF|
|justin|foley@123||GU16 9HF|
And The user should register to the account
Then The user should be able to get into their account
