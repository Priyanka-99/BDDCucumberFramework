@tag
Feature: Login

@tag1
Scenario: Successfully login to application

Given User must be able to open the browser and enter the url of application
And Click on login button
When Enter the valid username
And Enter the valid password
And Click on submit button
And Print the title and URL of the application
Then User must be successfully login to the application