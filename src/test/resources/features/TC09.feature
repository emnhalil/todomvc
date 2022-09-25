@TC09 @Regression
Feature: TC_09 User makes a completed task as active

  Scenario: TC_09 User makes a completed task as active
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    And User clicks the checkbox of the task
    And User clicks the Completed Link to move to the Completed page
    And User clicks the checkbox again of the task
    Then User should be able to see the task on the Active list
    And User closes the browser