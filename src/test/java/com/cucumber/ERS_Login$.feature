Feature: As a ERS application user, i want to verify the Registration page.          

Scenario: Verify ERS Registration page
Given I Open ERS application
When I enter valid credential
And click on the Sign button
Then I should able to verify the ERS registration page.

Scenario: Login ERS  page verify
Given I Open ERS application
When I enter valid credential
And click on the Sign button