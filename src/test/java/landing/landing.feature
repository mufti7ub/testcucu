Feature: Go to landing


Background: 
Given User should Accept the popup
And Close popup

@smoke
Scenario: user try to login
Given User should be on the login page
When user enter user name
And user enter password
And click on login
Then Success message displayed

@sanity
Scenario: user try to login
Given User should be on the login page
When user enter user name
And user enter password
And click on login
Then User redirected to dashboard

@Security
Scenario: user try to login
Given User should be on the login page
When user enter user name
And user enter password
And click on login
Then User redirected to dashboard success

@test
Scenario: user try to login
Given User should be on the login page
When user enter user name
And user enter password
And click on login
Then User redirected to dashboard success