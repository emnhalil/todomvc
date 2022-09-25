@TC11 @Regression
Feature: TC_11 User marks all completed tasks as active

  Scenario: TC_11 User marks all completed tasks as active
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User enters multiple tasks
    And User marks all tasks as completed
    And User clicks the Completed Link to move to the Completed page
    And User clicks the toggle to mark all items
    Then User verifies that all tasks are moved back to Active
    And User closes the browser