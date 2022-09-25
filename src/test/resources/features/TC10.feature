@TC10 @Regression
Feature: TC_10 User clears multiple completed tasks

  Scenario: TC_10 User clears multiple completed tasks
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User enters multiple tasks
    And User clicks the checkbox of 3  tasks
    And User clicks the Completed Link to move to the Completed page
    And User clicks the Clear completed button
    Then User verifies that only the completed tasks is removed
    And User closes the browser