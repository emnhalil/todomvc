@TC06 @Regression
Feature: TC_06 User marks a task as complete

  Scenario: TC_06 User marks a task as complete
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    And User clicks the checkbox of the task
    Then User verifies the task has been marked as completed
    And User closes the browser