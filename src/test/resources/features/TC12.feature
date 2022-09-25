@TC12 @Regression
Feature: TC_12 User can`t see completed items in active list

  Scenario: TC_12 User can`t see completed items in active list
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User enters multiple tasks
    And User marks all tasks as completed
    And User clicks the Active Link to move to the Active tasks list
    Then User verifies that the Active list is empty
    And User closes the browser